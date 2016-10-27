<%@ taglib prefix="s" uri="/struts-tags" %>
<%--
  Created by IntelliJ IDEA.
  User: Administrator
  Date: 2016/10/27
  Time: 9:15
  To change this template use File | Settings | File Templates.
--%>
<%@ page contentType="text/html;charset=UTF-8" language="java" %>
<html>
<head>
    <title>多文件上传</title>
</head>
<body>
    <s:form action="multiUploadResult" method="post" enctype="multipart/form-data">
        <s:file label="文件1" name="upload"></s:file>
        <s:file label="文件2" name="upload"></s:file>
        <s:file label="文件3" name="upload"></s:file>
        <s:submit></s:submit>
    </s:form>
</body>
</html>
