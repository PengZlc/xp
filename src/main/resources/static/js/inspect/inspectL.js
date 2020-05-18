layui.use(["element", "table", "form", "laydate", "okLayer", "okUtils", "okMock"], function () {
    let table = layui.table;
    let form = layui.form;
    let laydate = layui.laydate;
    let okLayer = layui.okLayer;
    let okUtils = layui.okUtils;
    let okMock = layui.okMock;
    let $ = layui.jquery;

    laydate.render({elem: "#startTime", type: "datetime"});
    laydate.render({elem: "#endTime", type: "datetime"});

    let userTable = table.render({
        elem: '#inspectList',
        url: okMock.api.inspect,
        limit: 20,
        page: true,
        toolbar: true,
        toolbar: "#toolbarTpl",
        size: "sm",
        cols: [[
            /* {type: "checkbox", fixed: "left"},*/
            {title: "操作", width: 100, align: "center", fixed: "right", templet: "#operationTpl"},
            {field: "id", title: "ID", width: 80, sort: true},
            {field: "name", title: "巡检名称", width: 200},
            {field: "grade", title: "级别", width: 80},
            {field: "rate", title: "完成度", width: 80},
            {field: "siteid", title: "巡检区域Id", hide: true ,width: 160},
            {field: "sitename", title: "巡检区域", width: 160},
            {field: "username", title: "巡检人员", width: 160},
            {field: "starttime", title: "开始时间", width: 160},
            {field: "endtime", title: "结束时间", width: 160},
            {field: "requiredstarttime", title: "预计开始时间", width: 160,},
            {field: "requiredendtime", title: "预计结束时间", width: 160}
        ]],
        done: function (res, curr, count) {
            console.info(res, curr, count);
        }
    });
    //初始化巡检区域select
    okUtils.ajax("/inspect/area", "get", null, true).done(function (response) {
        console.log(response);
        $('#siteId').append(new Option('请选择', '-1'));
        $.each(response.info, function (index, item) {
            //option  第一个参数是页面显示的值，第二个参数是传递到后台的值
            $('#siteId').append(new Option(item.placename, item.id));//往下拉菜单里添加元素
        });
        form.render(); //更新全部表单内容
    }).fail(function (error) {
        console.log(error)
    });
    form.on("submit(search)", function (data) {
        userTable.reload({
            where: data.field,
            page: {curr: 1}
        });
        return false;
    });

    table.on("tool(tableFilter)", function (obj) {
        let data = obj.data;
        switch (obj.event) {
            case "edit":
                edit(data);
                break;
            case "del":
                del(data.id);
                break;
        }
    });

    function edit(data) {
        okLayer.open("查看", "/pages/view/inspect", "90%", "90%", function (layero) {
            let iframeWin = window[layero.find("iframe")[0]["name"]];
            iframeWin.initForm(data);
        }, function () {
            userTable.reload();
        })
    }
});