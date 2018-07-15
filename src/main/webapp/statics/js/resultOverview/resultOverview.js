/**
 * 接受从服务器返回的往年结果概览数据
 * @returns {*}
 */
function loadInfo(){
    var resultoverviewInfo;
    return resultoverviewInfo;
}

/**
 * 将每一组信息创建对应的td
 * @param infoRow resultOverviewInfo中每一行信息
 */
function createRow(infoRow){

}

/**
 * 将接收到的数据展示在界面上
 */
function appendRowToBody() {
    var resultOverviewInfo = loadInfo();
    var table = $(".layui-table").eq(0);
}

/**
 * 点击查看按钮，查看详细信息
 */
function look(){

}


function main(){

    appendRowToBody();

    look();
}


$(function() {
    main();
});