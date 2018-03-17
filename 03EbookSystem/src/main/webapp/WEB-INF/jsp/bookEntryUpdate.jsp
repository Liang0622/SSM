<%--
  Created by IntelliJ IDEA.
  User: Vic丶造梦师
  Date: 2018/3/17
  Time: 11:18
  To change this template use File | Settings | File Templates.
--%>
<%@ page contentType="text/html;charset=UTF-8" language="java" %>
<html>
<head>
    <title>电子图书更新页面</title>
</head>
<body onload="checkError();">
<div>
    <form action="updateEntry" method="post">

        <table>
            <thead>
            <tr><td><h2>更新电子图书</h2></td></tr>
            </thead>
            <tbody>
            <tr><td>图书编号</td><td><input name="id" value="${entry.id}" readonly="readonly"></td></tr>
            <tr><td><label for="title">图书名称<span>(*)</span></label></td><td><input name="title" id="title" value="${entry.title}">${titleError}</td></tr>
            <tr><td><label for="summary">图书摘要</label></td><td><textarea name="summary" id="summary">${entry.summary}</textarea></td></tr>
            <tr><td><label for="uploaduser">上传人</label></td><td><input name="uploaduser" id="uploaduser" value="${entry.uploaduser}"></td></tr>
            <tr><td><label for="createdate">上传时间<span>(*)</span></label></td><td><input name="createdate" id="createdate" value="${entry.createdate}">${createdateError}</td></tr>
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
