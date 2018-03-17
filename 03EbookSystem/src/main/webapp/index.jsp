<%--
  Created by IntelliJ IDEA.
  User: Vic丶造梦师
  Date: 2018/3/16
  Time: 12:34
  To change this template use File | Settings | File Templates.
--%>
<%@ page contentType="text/html;charset=UTF-8" language="java" isELIgnored="false" %>
<html>
<head>
    <title>首页</title>

    <!-- Bootstrap -->
    <link href="${pageContext.request.contextPath}/statics/css/bootstrap.min.css" rel="stylesheet">
    <!-- Font Awesome -->
    <link href="${pageContext.request.contextPath}/statics/css/font-awesome.min.css" rel="stylesheet">
    <!-- NProgress -->
    <link href="${pageContext.request.contextPath}/statics/css/nprogress.css" rel="stylesheet">
    <!-- iCheck -->
    <link href="${pageContext.request.contextPath}/statics/css/green.css" rel="stylesheet">
    <!-- Datatables -->
    <link href="${pageContext.request.contextPath}/statics/css/dataTables.bootstrap.min.css" rel="stylesheet">
    <link href="${pageContext.request.contextPath}/statics/css/buttons.bootstrap.min.css" rel="stylesheet">
    <link href="${pageContext.request.contextPath}/statics/css/fixedHeader.bootstrap.min.css" rel="stylesheet">
    <link href="${pageContext.request.contextPath}/statics/css/responsive.bootstrap.min.css" rel="stylesheet">

    <!-- Custom Theme Style -->
    <link href="${pageContext.request.contextPath}/statics/css/custom.min.css" rel="stylesheet">
</head>
<body>
<div class="x_panel">
    <div class="x_title">
        <form  method="post">
            <label>图书分类：</label><select name="categoryId"><option value="all" selected="selected">全部</option></select>
            <input type="button" id="search" value="查询"><input type="button" value="新增电子图书" id="addEntry">
        </form>
    </div>
    <div class="x_content">
        <p class="text-muted font-13 m-b-30">
            电子图书列表
        </p>
        <table id="datatable" class="table table-striped table-bordered">
            <thead>
            <tr>
                <th>图书编号</th>
                <th>图书名称</th>
                <th>图书摘要</th>
                <th>上传人</th>
                <th>上传时间</th>
                <th>操作</th>
            </tr>
            </thead>

            <tbody>
            <tr>
                <td>Tiger Nixon</td>
                <td>System Architect</td>
                <td>Edinburgh</td>
                <td>61</td>
                <td>2011/04/25</td>
                <td>$320,800</td>
            </tr>
            <tr>
                <td>Garrett Winters</td>
                <td>Accountant</td>
                <td>Tokyo</td>
                <td>63</td>
                <td>2011/07/25</td>
                <td>$170,750</td>
            </tr>
            </tbody>
        </table>
    </div>
</div>

<!-- jQuery -->
<script src="${pageContext.request.contextPath}/statics/js/jquery.min.js"></script>
<!-- Bootstrap -->
<script src="${pageContext.request.contextPath}/statics/js/bootstrap.min.js"></script>
<!-- FastClick -->
<script src="${pageContext.request.contextPath}/statics/js/fastclick.js"></script>
<!-- NProgress -->
<script src=".${pageContext.request.contextPath}/statics/js/nprogress.js"></script>
<!-- iCheck -->
<script src="${pageContext.request.contextPath}/statics/js/icheck.min.js"></script>
<!-- Datatables -->
<script src="${pageContext.request.contextPath}/statics/js/jquery.dataTables.min.js"></script>
<script src="${pageContext.request.contextPath}/statics/js/dataTables.bootstrap.min.js"></script>
<script src="${pageContext.request.contextPath}/statics/js/dataTables.buttons.min.js"></script>
<script src="${pageContext.request.contextPath}/statics/js/buttons.bootstrap.min.js"></script>
<script src="${pageContext.request.contextPath}/statics/js/buttons.flash.min.js"></script>
<script src="${pageContext.request.contextPath}/statics/js/buttons.html5.min.js"></script>
<script src="${pageContext.request.contextPath}/statics/js/buttons.print.min.js"></script>
<script src="${pageContext.request.contextPath}/statics/js/dataTables.fixedHeader.min.js"></script>
<script src="${pageContext.request.contextPath}/statics/js/dataTables.keyTable.min.js"></script>
<script src="${pageContext.request.contextPath}/statics/js/dataTables.responsive.min.js"></script>
<script src="${pageContext.request.contextPath}/statics/js/responsive.bootstrap.js"></script>
<script src="${pageContext.request.contextPath}/statics/js/jszip.min.js"></script>
<script src="${pageContext.request.contextPath}/statics/js/pdfmake.min.js"></script>
<script src="${pageContext.request.contextPath}/statics/js/vfs_fonts.js"></script>

<!-- Custom Theme Scripts -->
<script src="${pageContext.request.contextPath}/statics/js/custom.min.js"></script>
<script src="${pageContext.request.contextPath}/statics/localjs/index.js"></script>


</body>
</html>
