<%--
  Created by IntelliJ IDEA.
  User: zjs
  Date: 2019/6/9
  Time: 19:06
  To change this template use File | Settings | File Templates.
--%>
<%@ page contentType="text/html;charset=UTF-8" language="java" %>
<html>
<head>
    <title>Title</title>
</head>
<body>

<h3>SpringMvc文件上传</h3>
<form action="user/fileupload" method="post" enctype="multipart/form-data">
    选择文件:<input type="file" name="upload" /><br>
    <input type="submit" value="上传"/>
</form>



</body>
</html>
