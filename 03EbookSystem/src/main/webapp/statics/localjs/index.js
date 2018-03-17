$(function () {
    $.getJSON("category/getAll",function callBack(data){
        $("select[name='categoryId']").empty();
        $("select[name='categoryId']").append("<option value='all' selected='selected'>全部</option>");
        $categorys=$(data);
        $categorys.each(function (i) {
            $("select[name='categoryId']").append("<option value='"+$categorys[i].id+"'>"+$categorys[i].name+"</option>");
        })
    });

    function getAllEntry(){
        $.getJSON("entry/getAll",function callBack(data){
            $("#datatable tbody").empty();
            $entrys=$(data);
            $entrys.each(function (i) {
                $("#datatable tbody").append(
                    "<tr><td>"+$entrys[i].id+
                    "</td><td>"+$entrys[i].title+
                    "</td><td>"+$entrys[i].summary+
                    "</td><td>"+$entrys[i].uploaduser+
                    "</td><td>"+$entrys[i].createdate+
                    "</td><td><a href='entry/toUpdate?id="+$entrys[i].id+
                    "'>修改</a>&nbsp;&nbsp;<a href='entry/deleteEntry?id="+$entrys[i].id+
                    "'>删除</a></td></tr>");
            })
        });
    };
    getAllEntry();

    $("#search").click(function () {
        // var categoryId=$("select[name='categoryId']>option[selected]").attr("value");这样值恒为all
        var categoryId=$("select[name='categoryId']").val();
        if(categoryId=="all"){
            getAllEntry();
        }else {
            $.getJSON("entry/getEntryByCategoryId","categoryId="+categoryId,function (data) {
                $("#datatable tbody").empty();
                $entrys=$(data);
                $entrys.each(function (i) {
                    $("#datatable tbody").append(
                        "<tr><td>"+$entrys[i].id+
                        "</td><td>"+$entrys[i].title+
                        "</td><td>"+$entrys[i].summary+
                        "</td><td>"+$entrys[i].uploaduser+
                        "</td><td>"+$entrys[i].createdate+
                        "</td><td><a href='entry/toUpdate?id="+$entrys[i].id+
                        "'>修改</a>&nbsp;&nbsp;<a href='entry/deleteEntry?id="+$entrys[i].id+
                        "'>删除</a></td></tr>");
                })
            })
        }

    })

    $("#addEntry").click(function () {
        var categoryId=$("select[name='categoryId']").val();
        alert(categoryId);
        if(categoryId=="all"){
            alert("请先选择要添加图书的类别");
        }else {
            window.location.href="entry/toAdd?categoryId="+categoryId;
        }
    })

})
