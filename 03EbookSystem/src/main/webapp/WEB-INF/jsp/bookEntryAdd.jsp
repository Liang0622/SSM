<%--
  Created by IntelliJ IDEA.
  User: Vic丶造梦师
  Date: 2018/3/16
  Time: 13:33
  To change this template use File | Settings | File Templates.
--%>
<%@ page contentType="text/html;charset=UTF-8" language="java" isELIgnored="false" %>
<html>
<head>
    <title>增加电子图书条目</title>
</head>
<body onload="checkError();">
<div>
    <form action="addEntry" method="post">
        <input name="categoryId" value="${categoryId}" hidden="hidden">
        <table>
            <thead>
            <tr><td><h2>增加电子图书</h2></td></tr>
            </thead>
            <tbody>
            <tr><td><label for="title">图书名称<span>(*)</span></label></td><td><input name="title" id="title">${titleError}</td></tr>
            <tr><td><label for="summary">图书摘要</label></td><td><textarea name="summary" id="summary"></textarea></td></tr>
            <tr><td><label for="uploaduser">上传人</label></td><td><input name="uploaduser" id="uploaduser"></td></tr>
            <tr><td><label for="createdate">上传时间<span>(*)</span></label></td><td><input name="createdate" id="createdate">${createdateError}</td></tr>
            <tr><td colspan="2"><input type="submit" value="提交"><input type="button" value="返回"></td></tr>
            </tbody>
        </table>
    </form>

</div>
<!-- jQuery -->
<script src="${pageContext.request.contextPath}/statics/js/jquery.min.js"></script>
<script typeof="text/javascript">
    function checkError() {
        alert("进入自己的js")
        var titleError=${titleError};
        alert(typeof  titleError);
alert(titleError);
       /* if(titleError!==null||titleError!==undefined||titleError.trim()!==""){
            alert(titleError);
        }*/
        var createdateError=${createdateError};
        alert(typeof createdateError);
        alert(createdateError);
        /*if(reatedateError!==null||reatedateError!==undefined||reatedateError.trim()!==""){
            alert(createdateError);
        }*/
    }
</script>

</body>
</html>
