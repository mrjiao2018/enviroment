/**
 * 功能：让用户选择地区和时间
 */
function areaAndTimeSelect(){
    layer.open({
        title:"请输入时间与地区",
        type: 1,
        content: '<div style="height: 500px;width: 600px"></div>'
    });
}

/**
 * 功能：提交用户选定的地区与时间数据
 * @param: {boolean}isLoadRecord 是否为查询以往输入记录而提交数据，若是，则还需要将数据加载到界面上，否则不需要加载
 */
function submitAreaAndTime(isLoadRecord){

}

/**
 * 功能：将从服务器加载的以往输入的数据展示在界面上
 */
function showRecord(){

}

/**
 * 功能：新建记录
 */
function newRecord(){
    var recordQueryBtn = $("#record-establish-btn");
    recordQueryBtn.click(function () {
        layui.use('layer', function(){
            var layer = layui.layer;
            areaAndTimeSelect();
        });
    });
}

/**
 * 功能：查询以往记录
 */
function queryRecord(){
    var recordQueryBtn = $("#record-query-btn");
    recordQueryBtn.click(function () {
        layui.use('layer', function(){
            var layer = layui.layer;
            areaAndTimeSelect();
        });
    });
}

function main() {
    newRecord();
    queryRecord();
}

main();