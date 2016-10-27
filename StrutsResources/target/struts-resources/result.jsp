<%@ taglib prefix="s" uri="/struts-tags" %>
<%--
  Created by IntelliJ IDEA.
  User: Administrator
  Date: 2016/10/27
  Time: 11:25
  To change this template use File | Settings | File Templates.
--%>
<%@ page contentType="text/html;charset=UTF-8" language="java" %>
<html>
<head>
    <title>Result</title>
</head>
<body>
<p>
    <s:if test="hasFieldErrors()">
        <s:property value="getFieldErrors()"></s:property>
    </s:if>
    <s:else>
            用户名:<s:property value="username"></s:property>
    </s:else>

</p>
</body>
</html>
