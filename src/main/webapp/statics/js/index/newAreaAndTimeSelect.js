/**
 * 功能：让用户选择地区和时间
 * @param {int}type 判断操作的类型，可选值为0，即查询，或1，即新建记录
 */
function areaAndTimeSelect(type){
    var submitBtnValue; //弹窗中提交按钮显示的内容
    var isLoadRecord;    //是否为查询以往输入记录而提交数据
    if(type==0){
        submitBtnValue = '查询';
        isLoadRecord = true;
    } else{
        submitBtnValue = '新建记录';
        isLoadRecord = false;
    }
    layer.open({
        layer: this,
        title:"请输入时间与地区",
        type: 1,
        area: '300px',
        offset: '100px',
        btnAlign: 'c',
        yes: function (index, layero) {
            layer.close(index);
        },
        content: '<div style="width:200px;margin:20px auto;">' +
        '        <form class="layui-form area-time-select">' +
        '            <div class="layui-form-item">' +
        '                <label class="layui-form-label" style="width: auto">请选择省/直辖市</label>' +
        '                <div class="layui-input-inline">' +
        '                    <select name="provid" id="provid" lay-filter="provid">' +
        '                        <option value="">请选择省/直辖市</option>' +
        '                    </select>' +
        '                </div>' +
        '                <label class="layui-form-label" style="width: auto">请选择市</label>' +
        '                <div class="layui-input-inline">' +
        '                    <select name="cityid" id="cityid" lay-filter="cityid">' +
        '                        <option value="">请选择市</option>' +
        '                    </select>' +
        '                </div>' +
        '                <label class="layui-form-label" style="width: auto">请选择县/区</label>' +
        '                <div class="layui-input-inline">' +
        '                    <select name="areaid" id="areaid" lay-filter="areaid">' +
        '                        <option value="">请选择县/区</option>' +
        '                    </select>' +
        '                </div>' +
        '                <label class="layui-form-label" style="width: auto">请选择年份</label>' +
        '                <div class="layui-input-inline">' +
        '                    <select id="yearid">' +
        '                        <option value="">请选择年份</option>' +
        '                        <option value="2011">2011</option>' +
        '                        <option value="2012">2012</option>' +
        '                        <option value="2013">2013</option>' +
        '                        <option value="2014">2014</option>' +
        '                        <option value="2015">2015</option>' +
        '                        <option value="2016">2016</option>' +
        '                        <option value="2017">2017</option>' +
        '                        <option value="2018">2018</option>' +
        '                    </select>' +
        '                </div>' +
        '                <div class="layui-input-inline">' +
        '                   <button type="button" class="layui-btn" onclick="submitAreaAndTime(layer,'+isLoadRecord+')" style="width: 190px; margin-top: 20px">'+ submitBtnValue +'</button>' +
        '                </div>' +
        '            </div>' +
        '        </form>' +
        '    </div>'
    });

    /**
     * 以下代码是为了实现省市区选择框联动
     */
    var defaults = {
        s1: 'provid',
        s2: 'cityid',
        s3: 'areaid',
        v1: null,
        v2: null,
        v3: null
    };
    var $form;
    var form;
    var $;
    layui.define(['jquery', 'form'], function () {
        $ = layui.jquery;
        form = layui.form;
        $form = $('form');
        treeSelect(defaults);
    });
    function treeSelect(config) {
        config.v1 = config.v1 ? config.v1 : 110000;
        config.v2 = config.v2 ? config.v2 : 110100;
        config.v3 = config.v3 ? config.v3 : 110101;
        config.v4 = config.v4 ? config.v4 : 2011;
        $.each(threeSelectData, function (k, v) {
            appendOptionTo($form.find('select[name=' + config.s1 + ']'), k, v.val, config.v1);
        });
        form.render();
        cityEvent(config);
        areaEvent(config);
        form.on('select(' + config.s1 + ')', function (data) {
            cityEvent(data);
            form.on('select(' + config.s2 + ')', function (data) {
                areaEvent(data);
            });
        });

        function cityEvent(data) {
            $form.find('select[name=' + config.s2 + ']').html("");
            config.v1 = data.value ? data.value : config.v1;
            $.each(threeSelectData, function (k, v) {
                if (v.val == config.v1) {
                    if (v.items) {
                        $.each(v.items, function (kt, vt) {
                            appendOptionTo($form.find('select[name=' + config.s2 + ']'), kt, vt.val, config.v2);
                        });
                    }
                }
            });
            form.render();
            config.v2 = $('select[name=' + config.s2 + ']').val();
            areaEvent(config);
        }
        function areaEvent(data) {
            $form.find('select[name=' + config.s3 + ']').html("");
            config.v2 = data.value ? data.value : config.v2;
            $.each(threeSelectData, function (k, v) {
                if (v.val == config.v1) {
                    if (v.items) {
                        $.each(v.items, function (kt, vt) {
                            if (vt.val == config.v2) {
                                $.each(vt.items, function (ka, va) {
                                    appendOptionTo($form.find('select[name=' + config.s3 + ']'), ka, va, config.v3);
                                });
                            }
                        });
                    }
                }
            });
            form.render();
            form.on('select(' + config.s3 + ')', function (data) { });
        }

        function appendOptionTo($o, k, v, d) {
            var $opt = $("<option>").text(k).val(v);
            if (v == d) { $opt.attr("selected", "selected") }
            $opt.appendTo($o);
        }
    }

}

/**
 * 功能：提交用户选定的地区与时间数据
 * @param: {boolean}isLoadRecord 是否为查询以往输入记录而提交数据，若是，则还需要将数据加载到界面上，否则不需要加载
 */
function submitAreaAndTime(layer, isLoadRecord){
    var province = $("#provid").find("option:selected").text();
    var city = $("#cityid").find("option:selected").text();
    var area = $("#areaid").find("option:selected").text();
    var year = $("#yearid").find("option:selected").val();

    if(province == '请选择省/直辖市' || year == ''){
        alert("请选择有效地区及年份");
    } else{
        //var province_city_area = province + city + area;
        if(isLoadRecord){
            formDataLoad(year, province, city, area, 'forest');
        } else {
            createNewRecord(year,  province, city, area, 'forest');
        }
        layer.close(layer.index);   //关闭弹窗
    }
}


/**
 * 初次进入界面时，自动像服务器请求 9999年，thisIsForTest(position), thisIsForTest(type)
 * 所对应的表，用于让用户进行数据输入计算测试
 * @param year
 * @param position
 * @param type
 */
function applyForCalculateTest() {
    var request_data = {
        year: 9999,
        position: "thisIsForTest",
        type: "thisIsForTest"
    };
    var options = {
        url: "calc/type",
        data: request_data,
        dataType: "json",
        type:'POST'
    };
    $.ajax(options);
}


/**
 * 请求form中的数据
 * @param year
 * @param province
 * @param city
 * @param area
 * @param type
 */
function formDataLoad(year, province, city, area, type) {
    var request_data = {
        year: year,
        position: province + city + area,
        type: type
    };
    var options = {
        url: "calc/total",
        data: request_data,
        dataType: "json",
        //async:false,
        type:'POST',
        beforeSend: function (){
        },
        success: function (data) {
            //todo 加入返回值为空的判断
            appendYearAndAreaInformationToBody(year, province, city, area);
            showData(data);
            summarySheetDataLoad(year, province, city, area, type);
        },
        error: function () {
            alert("error");
        }
    };
    $.ajax(options);
}

/**
 * 新建记录
 * @param year
 * @param province
 * @param city
 * @param area
 * @param type
 */
function createNewRecord(year, province, city, area, type) {
    var request_data = {
        year: year,
        position: province + city + area,
        type: type
    };
    var options = {
        url: "calc/type",
        data: request_data,
        success: function () {
            alert("创建成功");
            //请求成功后给用户提示
            appendYearAndAreaInformationToBody(year, province, city, area);
            //请求成功后刷新界面
            //location.reload(true);
        }
    };
    $.ajax(options);
}

/**
 * 将加载出的数据展示到网页上
 * @param data 服务器返回的数据，此处为请求"calc/total"接口返回的list数据，数据中的每一条记录对应到一个form上
 */
function showData(data) {
    console.log(data);
    var $forms = $(".calculator").find(".layui-form");
    for(var k = 0; k < data.length; ++k){
        showDataToForm($forms.eq(k), data[k]);
    }
}

/**
 * 用户在新建记录或者查询记录成功时，在界面顶部展示当前记录的时间和位置信息
 * @param year
 * @param province
 * @param city
 * @param area
 */
function appendYearAndAreaInformationToBody(year, province, city, area) {
    $(".position-nav").remove();
    var yearAndAreaInformation = $(
        "        <div class=\"position-nav\">" +
        "            <span class=\"layui-breadcrumb\" style='visibility: visible'>" +
        "              <a href=\"javascript:;\">"+year+"</a><span> &nbsp;&nbsp;-&nbsp;&nbsp; </span>" +
        "              <a href=\"javascript:;\">"+province+"</a><span> &nbsp;&nbsp;-&nbsp;&nbsp; </span>" +
        "              <a href=\"javascript:;\">"+city+"</a><span> &nbsp;&nbsp;-&nbsp;&nbsp; </span>" +
        "              <a href=\"javascript:;\">"+area+"</a>" +
        "            </span>" +
        "        </div>");
    $(".layui-body").prepend(yearAndAreaInformation);
}

/**
 * 请求总表数据
 * @param year
 * @param province
 * @param city
 * @param area
 * @param type
 */
function summarySheetDataLoad(year, province, city, area, type) {
    var request_data = {
        year: year,
        position: province + city + area,
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
    var subtotal_value_for_A1B1B2C1 = data['B1Le']+data['B2C']+data['C1D1'];
    var subtotal_value_for_D1D2 = data['D1Ut']+data['D2Us'];
    var subtotal_value_for_E1E2 = data['E1Ut']+data['E2Uf'];
    var subtotal_value_for_F1F2 = data['F1Ut']+data['F2Uy'];
    var subtotal_value_for_G1 = data['G1Un']+data['G1Up']+data['G1Uk'];
    var subtotal_value_for_H1H2H3H4 = data['H1Uf']+data['H2Uz']+data['H3Uz']+data['H4Uz'];
    var subtotal_value_for_DEFGHIJ = subtotal_value_for_D1D2 + subtotal_value_for_E1E2 + subtotal_value_for_F1F2 + subtotal_value_for_G1 + subtotal_value_for_H1H2H3H4 + data['I1Uf'] + data['J1Us'];
    var subtotal_value_for_all = subtotal_value_for_A1B1B2C1 + subtotal_value_for_DEFGHIJ + data['K1Us'];
    subtotal_for_A1B1B2C1.text(subtotal_value_for_A1B1B2C1);
    subtotal_for_D1D2.text(subtotal_value_for_D1D2);
    subtotal_for_E1E2.text(subtotal_value_for_E1E2);
    subtotal_for_F1F2.text(subtotal_value_for_F1F2);
    subtotal_for_G1.text(subtotal_value_for_G1);
    subtotal_for_H1H2H3H4.text(subtotal_value_for_H1H2H3H4);
    subtotal_for_DEFGHIJ.text(subtotal_value_for_DEFGHIJ);
    subtotal_for_all.text(subtotal_value_for_all);
}

/**
 * 功能：新建记录
 */
function newRecord(){
    var recordQueryBtn = $("#record-establish-btn");
    recordQueryBtn.click(function () {
        areaAndTimeSelect(1);
    });
}

/**
 * 功能：查询以往记录
 */
function queryRecord(){
    var recordQueryBtn = $("#record-query-btn");
    recordQueryBtn.click(function () {
        areaAndTimeSelect(0);
    });
}

/**
 * 启动函数
 */
function main() {
    //直接像服务器请求一个记录，让用户进行输入测试
    applyForCalculateTest();

    //检测用户新建记录
    newRecord();

    //检测用户查询记录
    queryRecord();
}

main();