<%--
  Created by IntelliJ IDEA.
  User: Administrator
  Date: 2016/10/26
  Time: 11:16
  To change this template use File | Settings | File Templates.
--%>
<%@ page contentType="text/html;charset=UTF-8" language="java" %>
<%@taglib prefix="s" uri="/struts-tags" %>
<html>
<head>
    <title>AddCustomer</title>
</head>
<body>

    <h1 style="align-content: center">请输入姓名</h1>

    <s:form action="showCustomer">
        <s:textfield label="姓名" name="name" ></s:textfield>
        <s:textfield label="年龄" name="age"></s:textfield>
        <s:submit></s:submit>
    </s:form>
</body>
</html>
