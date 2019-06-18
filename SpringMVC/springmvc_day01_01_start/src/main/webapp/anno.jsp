<%--
  Created by IntelliJ IDEA.
  User: zjs
  Date: 2019/6/8
  Time: 21:15
  To change this template use File | Settings | File Templates.
--%>
<%@ page contentType="text/html;charset=UTF-8" language="java" %>
<html>
<head>
    <title>Title</title>
</head>
<body>

@<%--RequestParam--%>
<a href="anno/testRequestParam?name=哈哈">RequestParam</a>

<%--@RequestBody(注意POST请求时有用!!!!)--%>
<form action="anno/testRequestBody" method="post">
    用户名:<input type="text" name="username"><br>
    用户年龄:<input type="text" name="age"><br>
    <input type="submit" value="">
</form>

<%--RequestHeader--%>
<a href="anno/testRequestHeader">RequestHeader</a>
<br>

<%--PathVariable--%>
<a href="anno/testPathVariable/10">testPathVariable</a>


<a href="anno/useCookieValue">绑定 cookie 的值</a>


<%--testModelAttribute--%>
<form action="anno/testModelAttribute" method="post">
    用户名:<input type="text" name="name">
    用户年龄:<input type="text" name="age">
    <input type="submit" value="提交">
</form>

</body>
</html>
