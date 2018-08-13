/**
 * 为导航栏加载地理位置数据
 * @type {{s1: string, s2: string, s3: string, v1: null, v2: null, v3: null}}
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







/**
 * 加载地理位置的json数据信息并展示到网页上方的导航栏中
 */
function loadGeoJson(){
    //获得展开栏div
    var provinceSelect = $("#province-select");
    var citySelect = $("#city-select");
    var positionSelect = $("#position-select");

    //请求json数据
    var options = {
        url:"http://localhost:8080/statics/json/geoJson.json",
        dataType:"json",
        success: function (data) {
            //请求成功后将data数据加载到展开栏中
            for(var province in data){
                var provinceDom = $("<dd><a href='javascript:;'>"+province+"</a></dd>");
                provinceSelect.append(provinceDom);
            }
        },
        error:function () {
            console.log("请求json数据失败");
        }
    };

    $.ajax(options);
}

/**
 * 修改导航栏中地区和时间数据展示
 * @param position 地区，当前默认指定为湖北省武汉市下属的区
 * @param year  年份
 */
function showPositionAndTime(position, year){
    var provinceSpan = $("#province-text");
    var citySpan = $("#city-text");
    var positionSpan = $("#position-text");
    var yearSpan = $("#year-text");
    provinceSpan.text("湖北省");
    citySpan.text("武汉市");
    positionSpan.text(position);
    yearSpan.text(year);
}