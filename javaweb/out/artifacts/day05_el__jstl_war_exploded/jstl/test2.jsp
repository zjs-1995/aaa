<%--
  Created by IntelliJ IDEA.
  User: zjs
  Date: 2019/5/7
  Time: 17:09
  To change this template use File | Settings | File Templates.
--%>
<%@ page contentType="text/html;charset=UTF-8" language="java" %>
<%--
题干：请将字符串("张三","张三","李四","王五")存储到四大域(pageContext,request,session,ServletContext)中，
要求最终展示数据的时候,并且在jsp页面中进行展示,字符串的名字在存的时候key统一定义为username
--%>

<html>
<head>
    <title>Title</title>
</head>
<body>
<%
    //存储数据
    pageContext.setAttribute("username", "张三");
    request.setAttribute("username", "张三");
    session.setAttribute("username", "李四");
    application.setAttribute("username", "王五");

%>
    //从域中获取数据
    ${pageScope.username} <br>
    ${requestScope.username} <br>
    ${sessionScope.username} <br>
    ${applicationScope.username} <br>
    ${name}
</body>
</html>
