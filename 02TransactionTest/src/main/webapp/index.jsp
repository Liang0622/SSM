<%--
  Created by IntelliJ IDEA.
  User: Liang
  Date: 2018/3/14
  Time: 10:23
  To change this template use File | Settings | File Templates.
--%>
<%@ page contentType="text/html;charset=UTF-8" language="java" %>
<html>
<head>
    <title>首页</title>
</head>
<body>
<form method="post" action="createClass">
    <table>
        <tr><td colspan="2">学生信息</td></tr>
        <tr><td>学生姓名</td><td><input type="text" name="sname"></td></tr>
        <tr><td>学生编号</td><td><input type="text" name="sid"></td></tr>
        <tr><td colspan="2">教师信息</td></tr>
        <tr><td>教师姓名</td><td><input type="text" name="tname"></td></tr>
        <tr><td>教师编号</td><td><input type="text" name="tid"></td></tr>
        <tr><td>教师年龄</td><td><input type="text" name="age"></td></tr>
        <tr><td colspan="2"><input type="submit" value="组建班级"></td></tr>
    </table>

</form>

</body>
</html>
