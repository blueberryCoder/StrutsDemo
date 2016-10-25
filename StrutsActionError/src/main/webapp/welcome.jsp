<%@page contentType="text/html; charset=UTF-8" %>
<%@taglib prefix="s" uri="/struts-tags" %>
<html>
<head>
    <title>Welcome</title>
    <style type="text/css">
        .welcome{
            background-color: #12dd12;
            border: 1px solid #12dd12;
            width: 400px;
            margin-top: 8px;
        }

        .welcome li{
            list-style: none;
        }

    </style>
</head>

<body>
    <s:if test="hasActionMessages()">
        <div class="welcome">
            <s:actionmessage></s:actionmessage>
        </div>
    </s:if>

<h4>
    <s:property value="getText('welcome.hello')"></s:property>
    <s:property value="username"></s:property>
</h4>
</body>
</html>