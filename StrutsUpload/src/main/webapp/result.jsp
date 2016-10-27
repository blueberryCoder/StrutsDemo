<%@ taglib prefix="s" uri="/struts-tags" %>
<%--
  Created by IntelliJ IDEA.
  User: Administrator
  Date: 2016/10/26
  Time: 16:14
  To change this template use File | Settings | File Templates.
--%>
<%@ page contentType="text/html;charset=UTF-8" language="java" %>
<html>
<head>
    <title>Result</title>
</head>
<body>
<h1>Struts 2 &lt;s:file&gt; file upload example </h1>

<h1>File Name: <s:property value="fileUploadFileName"/></h1>
<h1> Content Type <s:property value="fileUploadContentType"></s:property></h1>
<h1> File <s:property value="fileUpload"></s:property></h1>
</body>
</html>
