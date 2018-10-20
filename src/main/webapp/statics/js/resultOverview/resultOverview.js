
/**
 * @method drawResultList() 根据查找条件加载会议室列表
 * @param {data} 传入表格数据
 * @return {}
 */
function drawResultList(data) {
    layui.use('table', function() {
        var table = layui.table;
        table.render({
            elem: '#tbResultOverview',
//          url: './total/types',
//          where: reqData,
			data: data,
//			page: {
//				limit: 15,
//				layout: ['count', 'prev', 'page', 'next','skip', 'scroll']
//			},
			loading:true,
            id: 'tbResultOverview',
            cellMinWidth: 160,
            cols: [
                [
                    {
                    	type: 'numbers',
                        title: '序号',
                        align: "center",
                        width: 100
                    },
                    {
                        field: 'date',
                        title: '日期',
                        align: "center",
                        width: 100
                    },
                    {
                        field: 'position',
                        title: '地点',
                        align: 'center',
                        width: 280
                    },
                    {
                        field: 'inputDate',
                        title: '输入日期',
                        align: 'center',
                        sort: true
                    },
                    {
                        field: 'type',
                        title: '资源种类',
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

	$.ajax({
		type:"get",
		url:"total/types",
		async:true,
		success: function(data){
			drawResultList(data);
		}
	});

}

jQuery(document).ready(pageLoad);