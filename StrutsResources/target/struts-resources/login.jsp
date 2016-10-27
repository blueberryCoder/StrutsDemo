<%@ taglib prefix="s" uri="/struts-tags" %>
<%--
  Created by IntelliJ IDEA.
  User: Administrator
  Date: 2016/10/27
  Time: 11:17
  To change this template use File | Settings | File Templates.
--%>
<%@ page contentType="text/html;charset=UTF-8" language="java" %>
<html>
<head>
    <title>Login</title>
    <style style="text/css">
        .errors{
            width: 400px;
            background-color: #aa1100;
            text-align: center;
            text-shadow: aliceblue;
            border: #ffd2cc solid 1px;
        }
    </style>
</head>
<body>
<s:if test="hasFieldErrors()">
    <div class="errors">
    <s:property value="getFieldErrors()"></s:property>
    </div>
</s:if>



<s:form action="login">
    <s:textfield name="username" key="global.username"></s:textfield>
    <s:textfield name="password" key="global.password"></s:textfield>
    <s:submit value="提交"></s:submit>
</s:form>
<s:url namespace="/" action="login" var="locale_en">
    <s:param name="request_locale" >en_US</s:param>
</s:url>
<s:url namespace="/" action="login" var="locale_zh">
    <s:param name="request_locale">zh_CN</s:param>
</s:url>

<s:a href="%{locale_en}">English</s:a>
<s:a href="%{locale_zh}">Chinese</s:a>

</body>
</html>
