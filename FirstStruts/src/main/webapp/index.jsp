<%@page contentType="text/html; charset=UTF-8" %>
<%@ taglib prefix="s"  uri="/struts-tags" %>
<html>
<body>


<s:a action="/hello">blueberry</s:a>

<s:form action="/hello">
    <s:textfield value="blueberry" name="name" label="姓名"/>
    <s:submit/>
</s:form>


</body>
</html>
