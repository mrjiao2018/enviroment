function summarySheetDataLoad(year, position, type) {
    var request_data = {
        year: year,
//      position: province + city + area,
		position: position,
        type: type
    };
    var options = {
        url: "total",
        data: request_data,
        dataType: "json",
        success: function (data) {
            console.log(data);
            var summarySheet = $(".summary-sheet").eq(0);
            //展示总表数据
            showDataToForm(summarySheet, data);
            //计算总表中的各项合计
            calculateSubtotal(data);
        }
    };
    $.ajax(options);
    $(".recordTitle").text(year + " " + position + " " + "地区自然资源量化价值表");
}

/**
 * 将计算结果展示到网页上，表单和总表通用
 * @param $form 一个form
 * @Param responseText 一个form对应的数据
 */
function showDataToForm($form, responseText){
    for(var paramName in responseText){
        var value = responseText[paramName];
        var same = $form.find("."+paramName);
        for(var j = 0; j < same.length; ++j){
            same.eq(j).text(value);
            same.eq(j).val(value);
        }
    }
}

/**
 *
 * @Param data 从服务器请求得到的总表中的数据
 */
function calculateSubtotal(data){
    var subtotal_for_A1B1B2C1 = $("#subtotal_for_A1B1B2C1");
    var subtotal_for_D1D2 = $("#subtotal_for_D1D2");
    var subtotal_for_E1E2 = $("#subtotal_for_E1E2");
    var subtotal_for_F1F2 = $("#subtotal_for_F1F2");
    var subtotal_for_G1 = $("#subtotal_for_G1");
    var subtotal_for_H1H2H3H4 = $("#subtotal_for_H1H2H3H4");
    var subtotal_for_DEFGHIJ = $("#subtotal_for_DEFGHIJ");
    var subtotal_for_all = $("#subtotal_for_all");
    var subtotal_value_for_A1B1B2C1 = parseFloat(data['B1Le']+data['B2C']+data['C1D1']).toFixed(2);
    var subtotal_value_for_D1D2 = parseFloat(data['D1Ut']+data['D2Us']).toFixed(2);
    var subtotal_value_for_E1E2 = parseFloat(data['E1Ut']+data['E2Uf']).toFixed(2);
    var subtotal_value_for_F1F2 = parseFloat(data['F1Ut']+data['F2Uy']).toFixed(2);
    var subtotal_value_for_G1 = parseFloat(data['G1Un']+data['G1Up']+data['G1Uk']).toFixed(2);
    var subtotal_value_for_H1H2H3H4 = parseFloat(data['H1Uf']+data['H2Uz']+data['H3Uz']+data['H4Uz']).toFixed(2);
    var subtotal_value_for_DEFGHIJ = (parseFloat(subtotal_value_for_D1D2)
        + parseFloat(subtotal_value_for_E1E2)
        + parseFloat(subtotal_value_for_F1F2)
        + parseFloat(subtotal_value_for_G1)
        + parseFloat(subtotal_value_for_H1H2H3H4)
        + parseFloat(data['I1Uf'])
        + parseFloat(data['J1Us'])).toFixed(2);
    var subtotal_value_for_all = (parseFloat(subtotal_value_for_A1B1B2C1)
        + parseFloat(subtotal_value_for_DEFGHIJ)
        + parseFloat(data['K1Us'])).toFixed(2);
    subtotal_for_A1B1B2C1.text(subtotal_value_for_A1B1B2C1);
    subtotal_for_D1D2.text(subtotal_value_for_D1D2);
    subtotal_for_E1E2.text(subtotal_value_for_E1E2);
    subtotal_for_F1F2.text(subtotal_value_for_F1F2);
    subtotal_for_G1.text(subtotal_value_for_G1);
    subtotal_for_H1H2H3H4.text(subtotal_value_for_H1H2H3H4);
    subtotal_for_DEFGHIJ.text(subtotal_value_for_DEFGHIJ);
    subtotal_for_all.text(subtotal_value_for_all);
}

function main() {
	var date = sessionStorage.getItem("year");
	var position = sessionStorage.getItem("position");
	var type = sessionStorage.getItem("type");
    summarySheetDataLoad(date, position, type);
}

/**
 * 网页加载完成后
 */
$(function () {

    main();

});