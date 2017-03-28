<%
if (copyright) {
    println '/*'
    println " * ${copyright.replace('\n', '\n * ')}"
    println ' */'
} else {
    print ""
}
%>package ${packageName};

import com.haulmont.cuba.gui.components.AbstractEditor;
import ${entity.fqn};
<%if (classComment) {%>
${classComment}<%}%>

public class ${controllerName} extends AbstractEditor<${entity.className}> {
    <%if (headerLinkProperty) {%>
        private String getURL() {
        }
        
        private String getURLCaption() {
        }
    <%}%>

    @Override
    public void postInit() {
        super.postInit();
    <%if (headerLinkProperty) {%>
        if (getUrl()) {
            headerLink.setCaption(getUrlCaption());
            headerLink.setUrl(getUrl().toURL());
        }
    <%}%>

    }
}