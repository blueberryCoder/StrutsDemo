<%@page contentType="text/html; charset=UTF-8"%>
<%@taglib prefix="s" uri="/struts-tags" %>
<html>
<head>
    <title>Login</title>
    <style type="text/css">
        .errors{
            background-color: #ffcccc;
            border:1px solid #ffcccc ;
            width: 400px;
            margin-top: 8px;
        }

        .errors li{
            list-style: none;
        }

    </style>
</head>
<body>

<%request.setCharacterEncoding("UTF-8");
    response.setCharacterEncoding("UTF-8");
%>
    <s:if test="hasActionErrors()">
        <div class="errors">
            <s:actionerror></s:actionerror>
        </div>
    </s:if>

    <s:form action="/user/validateUser">
        <s:textfield key="global.username" name="username"></s:textfield>
        <s:password key="global.password" name="password"></s:password>
        <s:submit key="global.submit" name="submit"></s:submit>
    </s:form>

</body>
</html>