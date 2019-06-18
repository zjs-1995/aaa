<%--
  Created by IntelliJ IDEA.
  User: zjs
  Date: 2019/6/8
  Time: 18:46
  To change this template use File | Settings | File Templates.
--%>
<%@ page contentType="text/html;charset=UTF-8" language="java" %>
<html>
<head>
    <title>Title</title>
</head>
<body>

<h3>入门程序</h3>
<%--

<a href="user/hello">入门程序</a>

--%>
<%--

<a href="user/saveAccount">保存账户,get请求</a>
<br>

<form action="user/saveAccount" method="post">
    <input type="submit" value="保存账户,post请求">
</form>

--%>

<a href="user/saveAccount?username=heihei&&password=12345">RequestMapping注解</a>
</body>
</html>
