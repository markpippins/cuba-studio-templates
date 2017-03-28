<%
if (copyright) {
    println '/*'
    println " * ${copyright.replace('\n', '\n * ')}"
    println ' */'
} else {
    print ""
}%>

package ${packageName}

import com.haulmont.cuba.gui.components.*
import ${entity.fqn}

import javax.inject.Inject

<%if (classComment) {%>
${classComment}
<%}%>

public class ${controllerName} extends AbstractEditor<${entity.className}> {
 
    <%if (headerLinkProperty) {%>
    @Inject
    private Link headerLink
    <%}%>

    @Override
    public void postInit() {
        super.postInit();
        <%if (headerLinkProperty) {%>
        if (getUrl()) {
            headerLink.setCaption(getUrlCaption());
            headerLink.setUrl(getUrl());
        }
        <%}%>
    }
    
    <%if (headerLinkProperty) {%>
    private String getUrl() {
      
    }
    
    private String getUrlCaption() {
        
    }
    <%}%>

}