<%--
  Created by IntelliJ IDEA.
  User: Liang
  Date: 2018/3/14
  Time: 8:37
  To change this template use File | Settings | File Templates.
--%>
<%@ page contentType="text/html;charset=UTF-8" language="java" %>
<html>
<head>
    <title>首页</title>
</head>
<body>

<form method="get">
    <input type="button" onclick="location='baseController?param=login'" value="登陆">
    <input type="button" onclick="window.location.href='baseController?param=register'" value="注册">
    <input type="button" onclick="javascript:window.location.href='baseController?param=help'" value="帮助">
</form>
</body>
</html>
