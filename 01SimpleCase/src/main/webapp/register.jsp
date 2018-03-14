<%@ page contentType="text/html;charset=UTF-8" language="java" %>
<html>
<head>
    <title>注册页面</title>
</head>
<body>
<form action="user/register" method="post">
    <table border="1">
        <tr><td>用户名</td><td><input name="userName" type="text"></td></tr>
        <tr><td>密码</td><td><input type="text" name="password"></td></tr>
        <tr><td colspan="2"><input type="submit" value="注册"></td></tr>
    </table>
</form>
</body>
</html>
