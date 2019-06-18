<%--
  Created by IntelliJ IDEA.
  User: zjs
  Date: 2019/5/7
  Time: 16:45
  To change this template use File | Settings | File Templates.
--%>
<%@ page contentType="text/html;charset=UTF-8" language="java" %>

<html>
<head>
    <title>计算1-10的阶乘</title>
</head>
<body>
<%!
   public int factorial(int n){
        int sum = 1;
        for (int i = 1; i < n; i++) {
            sum = sum*i;
        }
        return sum;
    }
%>
<%
    int result = 1;
    for(int i = 1;i <= 10;i++){
        result = factorial(i);
        out.println(i+"的阶乘为:\t"+result+"<br>");
    }
%>
</body>
</html>
