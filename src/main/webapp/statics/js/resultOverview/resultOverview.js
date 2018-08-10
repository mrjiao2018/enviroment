
/**
 * @method drawRoomList() 根据查找条件加载会议室列表
 * @param {reqData} 传入会议室查找条件
 * @return {}
 */
function drawMemberList(reqData) {
    layui.use('table', function() {
        var table = layui.table;
        table.render({
            elem: '#tbResultOverview',
            url: './memberList.json',
            where: reqData,
            page: true,
            loading:true,
            limits: [10, 15, 20],
            limit: 10,
            id: 'tbResultOverview',
            cellMinWidth: 160,
            cols: [
                [
                    {
                        field: 'index',
                        title: '序号',
                        align: "center"
                    },
                    {
                        field: 'date',
                        title: '日期',
                        align: "center"
                    },
                    {
                        field: 'position',
                        title: '地点',
                        align: 'center'
                    },
                    {
                        field: 'inputTime',
                        title: '输入日期',
                        align: 'center'
                    },
                    {
                        title: '操作',
                        align: "center",
                        toolbar: '#query'
                    }
                ]
            ]
        });

        table.on('tool(recordManager)', function(obj) {
            var data = obj.data;
            if(obj.event === "querySpecificRecord") {//编辑成员信息
                //todo 向后台发请求
                alert("编辑成员信息");

            }
        });

        $('.demoTable .layui-btn').on('click', function() {
            var type = $(this).data('type');
            active[type] ? active[type].call(this) : '';
        });
    });
}


/**
 * @method pageLoad() 页面加载函数，包括各种初始化
 * @param {}
 * @return {}
 */
function pageLoad() {

    drawMemberList();

}

jQuery(document).ready(pageLoad);