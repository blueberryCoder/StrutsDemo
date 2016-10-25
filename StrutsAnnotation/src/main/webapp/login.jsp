<%--
  Created by IntelliJ IDEA.
  User: Administrator
  Date: 2016/10/25
  Time: 11:29
  To change this template use File | Settings | File Templates.
--%>
<%@ page contentType="text/html;charset=UTF-8" language="java" %>
<%@taglib prefix="s" uri="/struts-tags" %>
<html>
<head>
    <title>Login</title>
</head>
<body>
    <s:debug></s:debug>
    <h1>Struts 2 注解示例</h1>
    <s:form action="/User/Welcome">
        <s:textfield name="username" label="用户名"></s:textfield>
        <s:textfield name="password" label="密码"></s:textfield>
        <s:submit value="提交"></s:submit>
    </s:form>
</body>
</html>
