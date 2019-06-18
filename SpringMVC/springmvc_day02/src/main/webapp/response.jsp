<%--
  Created by IntelliJ IDEA.
  User: zjs
  Date: 2019/6/9
  Time: 19:09
  To change this template use File | Settings | File Templates.
--%>
<%@ page contentType="text/html;charset=UTF-8" language="java" %>
<html>
<head>
    <title>Title</title>

    <script src="js/jquery.min.js"></script>
    <script>
        //页面加载，绑定单击事件
        $(function () {
            $("#btn").click(function () {
               // alert("hello btn");
                $.ajax({
                    url:"user/testAjax",
                    contentType:"application/json;charset=UTF-8",
                    data:'{"username":"hehe","password":"123","age":"30"}',
                    dataType:"json",
                    type:"post",
                    success:function (data) {
                        // data服务器端响应的json的数据，进行解析
                        alert(data);
                        alert(data.username);
                        alert(data.password);
                        alert(data.age);

                }
                })
            })
        })
    </script>

</head>
<body>

<a href="user/testString">testString</a>
<a href="user/testVoid">testVoid</a>
<a href="user/testModelAndView">testModelAndView</a>
<br>
<a href="user/testForwardOrRedirect">testForwardOrRedirect</a>
<br><br><br>

<button id="btn">发送ajax请求</button>


</body>
</html>
