<%@ taglib prefix="s" uri="/struts-tags" %>
<%--
  Created by IntelliJ IDEA.
  User: Administrator
  Date: 2016/10/27
  Time: 9:26
  To change this template use File | Settings | File Templates.
--%>
<%@ page contentType="text/html;charset=UTF-8" language="java" %>
<html>
<head>
    <title>MultiUploadResult</title>
</head>
<body>
    <h1>文件名 <s:property value="uploadFileNames"></s:property></h1>
    <script type="text/javascript">
        var fileNames = <s:property value="uploadFileNames"></s:property>

        for(var i=0;i<fileNames.length;i++)
        {
            innerHTML.write(fileNames[i])
        }
    </script>


    <s:iterator value="uploads" var="file">
        <s:property value="#file.name"></s:property>
        <br/>
    </s:iterator>
</body>
</html>
