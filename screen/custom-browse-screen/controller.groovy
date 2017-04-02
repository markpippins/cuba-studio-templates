<%
if (copyright) {
    println '/*'
    println " * ${copyright.replace('\n', '\n * ')}"
    println ' */'
} else {
    print ""
}
%>package ${packageName}

import com.haulmont.cuba.gui.components.AbstractLookup
<%if (classComment) {%>
${packageName}<%}%>
class ${controllerName} extends AbstractLookup {
}