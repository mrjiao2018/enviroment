//JavaScript代码区域
layui.use('element', function () {
    var element = layui.element;

    //存储加载页面前从服务器接受的总表数据
    var form_data;


    /**
     * 生成每个form的具体信息并封装在一个数组中返回
     */
    function generateFormArr() {

        var formArr = [];
        //todo finish A1
        formArr[0] = {
            partDiv:"A1",
            title:"林地价值计算",
            input_lable:["林木积蓄", "材种出材率", "材种原木市场单位价格"],
            output_lable:["林木市场价值"],
            input_lable_unit:["m<sup>3</sup>", "%", "元.m<sup>-3</sup>"],
            output_lable_unit:["元"],
            input_name:["M", "f", "Am"]
        };

        formArr[1] = {
            partDiv:"B1",
            title:"林木存量价值计算",
            input_lable:["林木积蓄", "材种出材率", "材种原木市场单位价格"],
            output_lable:["林木市场价值"],
            input_lable_unit:["m<sup>3</sup>", "%", "元.m<sup>-3</sup>"],
            output_lable_unit:["元"],
            input_name:["M", "f", "Am"]
        };

        formArr[2] = {
            partDiv:"B2",
            title:"林木流量价值计算",
            input_lable:["林木生长量", "杉木立木价格"],
            output_lable:["林木流量价值"],
            input_lable_unit:["m<sup>3</sup>", "元.m<sup>-3</sup>"],
            output_lable_unit:["元"],
            input_name:["A", "B"]
        };

        //todo finish C1
        formArr[3] = {
            partDiv:"C1",
            title:"林木流量价值计算",
            input_lable:["林木生长量", "杉木立木价格"],
            output_lable:["林木流量价值"],
            input_lable_unit:["m<sup>3</sup>", "元.m<sup>-3</sup>"],
            output_lable_unit:["元"],
            input_name:["A"]
        };

        formArr[4] = {
            partDiv:"D1",
            title:"林分年调节水量计算",
            input_lable:["降水量", "林分蒸散量", "地表径流量", "林分面积", "水库建设单位库容投资"],
            output_lable:["林分年调节水量", "林分年调节水量价值"],
            input_lable_unit:["mm.a<sup>-1</sup>", "mm.a<sup>-1</sup>", "mm.a<sup>-1</sup>", "hm<sup>2</sup>", "元.m<sup>-3</sup>"],
            output_lable_unit:["m<sup>3</sup>.a<sup>-1</sup>", "元.a<sup>-1</sup>"],
            input_name:["P", "E", "C", "A", "Ck"]
        };

        formArr[5] = {
            partDiv:"D2",
            title:"净化水质功能计算",
            input_lable:["降水量", "林分蒸散量", "地表径流量", "林分面积", "水的净化费用"],
            output_lable:["林分年净化水量", "林分年净化水质价值"],
            input_lable_unit:["mm.a<sup>-1</sup>", "mm.a<sup>-1</sup>", "mm.a<sup>-1</sup>", "hm<sup>2</sup>", "元.t<sup>-1</sup>"],
            output_lable_unit:["m<sup>3</sup>.a<sup>-1</sup>", "元.a<sup>-1</sup>"],
            input_name:["P", "E", "C", "A", "Ck"]
        };

        formArr[6] = {
            partDiv:"E1",
            title:"林分年固土量计算",
            input_lable:["挖取运输单位土方费用", "无林地土壤侵蚀模数", "林地土壤侵蚀模数", "林分面积", "林地土壤容重"],
            output_lable:["林分年净化水量", "林分年净化水质价值"],
            input_lable_unit:["元.m<sup>-3</sup>", "t.hm<sup>-2</sup>.a<sup>-1</sup>", "t.hm<sup>-2</sup>.a<sup>-1</sup>", "hm<sup>2</sup>", "t.m<sup>-3</sup>"],
            output_lable_unit:["t.a<sup>-1</sup>", "元.a<sup>-1</sup>"],
            input_name:["Ct", "X2", "X1", "A", "P"]
        };

        formArr[7] = {
            partDiv:"E2",
            title:"林分年保肥量计算",
            input_lable:[
                "无林地土壤侵蚀模数",
                "林地土壤侵蚀模数",
                "林分面积",
                "土壤含氮量",
                "土壤含磷量",
                "土壤含钾量",
                "土壤有机质含量",
                "磷酸二铵化肥价格",
                "氯化钾价格",
                "有机质价格",
                "磷酸二铵化肥含氮量",
                "磷酸二铵化肥含磷量",
                "氯化钾化肥含钾量"
            ],
            output_lable:["林分年保肥量", "林分年保肥价值"],
            input_lable_unit:[
                "t.hm<sup>-2</sup>.a<sup>-1</sup>",
                "t.hm<sup>-2</sup>.a<sup>-1</sup>",
                "hm<sup>2</sup>",
                "%",
                "%",
                "%",
                "%",
                "元.t<sup>-1</sup>",
                "元.t<sup>-1</sup>",
                "元.t<sup>-1</sup>",
                "%",
                "%",
                "%"
            ],
            output_lable_unit:["t.a<sup>-1</sup>", "元.a<sup>-1</sup>"],
            input_name:["X2", "X1", "A", "N", "P", "K", "M", "C1", "C2", "C3", "R1", "R2", "R3"]
        };

        formArr[8] = {
            partDiv:"F1",
            title:"林分年固碳量计算",
            input_lable:["二氧化碳中碳含量", "林分净生产力", "单位面积林分土壤年固碳量", "林分面积", "固碳价格"],
            output_lable:["植被年固碳量", "土壤年固碳量", "综合年固碳量", "林分年固碳价值"],
            input_lable_unit:["%", "mm.a<sup>-1</sup>", "t.hm<sup>-2</sup>.a<sup>-1</sup>", "t.hm<sup>-2</sup>.a<sup>-1</sup>", "hm<sup>2</sup>", "元.t<sup>-1</sup>"],
            output_lable_unit:["t.a<sup>-1</sup>", "t.a<sup>-1</sup>", "t.a<sup>-1</sup>", "元.a<sup>-1</sup>"],
            input_name:["Rt", "Bn", "Ft", "A", "Ct"]
        };

        formArr[9] = {
            partDiv:"F2",
            title:"林分年释氧量计算",
            input_lable:["林分净生产力", "林分面积", "氧气价格"],
            output_lable:["林分年释氧量", "林分年释氧价值"],
            input_lable_unit:["t.hm<sup>-2</sup>.a<sup>-1</sup>", "hm<sup>2</sup>", "元.t<sup>-1</sup>"],
            output_lable_unit:["t.a<sup>-1</sup>", "元.a<sup>-1</sup>"],
            input_name:["Bn", "A", "Cy"]
        };

        formArr[10] = {
            partDiv:"G1",
            title:"林分年营养物质积累量计算",
            input_lable:[
                "林分净生产力",
                "林木含氮量",
                "林木含磷量",
                "林木含钾量",
                "林分面积",
                "磷酸二铵化肥价格",
                "氯化钾价格",
                "磷酸二铵化肥含氮量",
                "磷酸二铵化肥含磷量",
                "氯化钾化肥含钾量"
            ],
            output_lable:[
                "林分年固氮量",
                "林分年固磷量",
                "林分年固钾量",
                "林分年固氮价值",
                "林分年固磷价值",
                "林分年固钾价值",
                "林分年营养物质积累价值"
            ],
            input_lable_unit:[
                "t.hm<sup>-2</sup>.a<sup>-1</sup>",
                "%",
                "%",
                "%",
                "hm<sup>2</sup>",
                "元.t<sup>-1</sup>",
                "元.t<sup>-1</sup>",
                "%",
                "%",
                "%"
            ],
            output_lable_unit:[
                "t.a<sup>-1</sup>",
                "t.a<sup>-1</sup>",
                "t.a<sup>-1</sup>",
                "元.a<sup>-1</sup>",
                "元.a<sup>-1</sup>",
                "元.a<sup>-1</sup>",
                "元.a<sup>-1</sup>"
            ],
            input_name:["Bn", "Ny", "Np", "Nk", "A", "C1", "C2", "R1", "R2", "R3"]
        };

        formArr[11] = {
            partDiv:"H1",
            title:"提供负离子计算",
            input_lable:["林分高度", "负离子产生费用", "林分负离子浓度", "林分面积", "负离子寿命"],
            output_lable:["林分年提供负离子个数", "林分年提供负离子价值"],
            input_lable_unit:["m", "元.个<sup>-1</sup>", "个.cm<sup>-3</sup>", "hm<sup>2</sup>", "min"],
            output_lable_unit:["个.a<sup>-1</sup>", "元.a<sup>-1</sup>"],
            input_name:["H", "Kf", "Qf", "A", "L"]
        };

        formArr[12] = {
            partDiv:"H2",
            title:"林分年吸收二氧化硫计算",
            input_lable:[
                "林分面积",
                "二氧化硫治理费用",
                "氮氧化物治理费用",
                "氟化物治理费用",
                "林分面积吸收二氧化硫量",
                "林分面积吸收氮氧化物量",
                "林分面积吸收氟化物量"
            ],
            output_lable:[
                "二氧化硫吸收量",
                "氮氧化物吸收量",
                "氟化物吸收量",
                "污染物总吸收量",
                "林分吸收二氧化硫价值",
                "林分吸收氮氧化物价值",
                "林分吸收氟化物价值",
                "林分吸收污染物总价值"
            ],
            input_lable_unit:[
                "hm<sup>2</sup>",
                "元.kg<sup>-1</sup>",
                "元.kg<sup>-1</sup>",
                "元.kg<sup>-1</sup>",
                "kg.hm<sup>-2</sup>.a<sup>-1</sup>",
                "kg.hm<sup>-2</sup>.a<sup>-1</sup>",
                "kg.hm<sup>-2</sup>.a<sup>-1</sup>"
            ],
            output_lable_unit:[
                "kg.a<sup>-1</sup>",
                "kg.a<sup>-1</sup>",
                "kg.a<sup>-1</sup>",
                "kg.a<sup>-1</sup>",
                "元.a<sup>-1</sup>",
                "元.a<sup>-1</sup>",
                "元.a<sup>-1</sup>",
                "元.a<sup>-1</sup>"
            ],
            input_name:["A", "Ke", "Kd", "Kf", "Qe", "Qd", "Qf"]
        };

        formArr[13] = {
            partDiv:"H3",
            title:"降低噪音价值计算",
            input_lable:["降低噪音费用", "森林面积折合为隔音墙的公里数"],
            output_lable:["林分年降低噪音价值"],
            input_lable_unit:["元.km<sup>-1</sup>", "km"],
            output_lable_unit:["元.a<sup>-1</sup>"],
            input_name:["Kz", "Az"]
        };

        formArr[14] = {
            partDiv:"H4",
            title:"滞尘功能计算",
            input_lable:["林分面积", "降尘清理费用", "林分面积年滞尘量"],
            output_lable:["林分年滞尘量", "林分年滞尘价值"],
            input_lable_unit:["hm<sup>2</sup>", "元.kg<sup>-1</sup>", "kg.hm<sup>-2</sup>.a<sup>-1</sup>"],
            output_lable_unit:["kg.a<sup>-1</sup>", "元.a<sup>-1</sup>"],
            input_name:["A", "Kz", "Qz"]
        };

        formArr[15] = {
            partDiv:"I1",
            title:"森林防护价值量计算",
            input_lable:["农作物总价值", "防护林占全区森林面积比", "农作物、牧草产量占总农作物产量比"],
            output_lable:["森林防护价值"],
            input_lable_unit:["元", "%", "%"],
            output_lable_unit:["元"],
            input_name:["Uz", "A", "B"]
        };

        formArr[16] = {
            partDiv:"J1",
            title:"生物多样新保护价值量计算",
            input_lable:["单位面积年物种损失的机会成本", "林分面积"],
            output_lable:["林分年物种保育价值"],
            input_lable_unit:["元.hm<sup>-2</sup>.a<sup>-1</sup>", "hm<sup>2</sup>"],
            output_lable_unit:["元.a<sup>-1</sup>"],
            input_name:["Ss", "A"]
        };

        formArr[17] = {
            partDiv:"K1",
            title:"森林游憩价值计算",
            input_lable:["年旅游价值", "旅游价值划分比例"],
            output_lable:["森林资源旅游费用"],
            input_lable_unit:["元", "%"],
            output_lable_unit:["元"],
            input_name:["Uz", "A"]
        };

        return formArr;
    }


    /**
     * 根据formInfo创建表单
     * @param formInfo
     *
     * 每个元素后面的数字表示相对于layui-body所在的层次，0层表示同层次，1表示为其子元素，以此类推
     * 如calculatorDiv2，表示calculatorDiv2元素为layui-body的孙元素
     */
    function createForm(formInfo){
        var calculatorDiv2 = $("<div class='calculator " + formInfo.partDiv + "'></div>");
        var titleDiv3 = $("<div class=\"site-title\"><fieldset><legend><a name=\"use\">"+formInfo.title+"</a></legend></fieldset></div>");
        var siteTextDiv3 = $("<div class=\"site-text site-block\"></div>");
        var formDiv4 = $("<form class=\"layui-form\"></form>");
        var formItemContainer5 = $("<div class='form-item-container'></div>");
        var buttons5 = $("<div class=\"layui-form-item  block-display left-move\"><div class=\"layui-input-block\"><button class=\"layui-btn submit-btn\" lay-submit lay-filter=\"formDemo\">立即提交</button><button type=\"reset\" class=\"layui-btn layui-btn-primary\">重置</button></div></div>");
        var tableContainer5 = $("<div class=\"layui-form-item block-display left-move\"></div>");
        var table6 = $("<table class=\"layui-table\"></table>");
        var colgroup7 = $("<colgroup></colgroup>");
        var thead7 = $("<thead></thead>");
        var tbody7 = $("<tbody></tbody>");
        var theadTr8 = $("<tr></tr>");
        var tbodyTr8 = $("<tr></tr>");

        //生成formItem
        for(var i = 0; i < formInfo.input_lable.length; ++i) {
            var tempFormItem6 = $("<div class=\"layui-form-item\"></div>");
            var tempInputlable7 = $("<label class=\"layui-form-label\">" + formInfo.input_lable[i] + "</label>");
            var layuiInputInlineDiv7 = $("<div class=\"layui-input-inline\"></div>");
            var input8 = $("<input type=\"text\" name=" + formInfo.input_name[i] + " required lay-verify=\"required\" placeholder=\"请输入数值\" class=\"layui-input\">");
            var unitDiv7 = $("<div class=\"layui-form-mid layui-word-aux\">" + formInfo.input_lable_unit[i] + "</div>");
            formItemContainer5.append(tempFormItem6);
            tempFormItem6.append(tempInputlable7);
            tempFormItem6.append(layuiInputInlineDiv7);
            tempFormItem6.append(unitDiv7);
            layuiInputInlineDiv7.append(input8);
        }
        formItemContainer5.append($("<input type=\"text\" name=" + formInfo.partDiv + " class='hidden' value=\"\">"));

        //生成table
        for(i = 0; i < (formInfo.input_lable.length + formInfo.output_lable.length); ++i) {
            var col8 = $("<col width=\"200\">");
            var theadTh9, tbodyTh9;
            if(i < formInfo.input_lable.length) {
                theadTh9 = $("<th>" + formInfo.input_lable[i] + "/" + formInfo.input_lable_unit[i] + "</th>");
                tbodyTh9 = $("<td>待输入</td>");
            }
            else {
                theadTh9 = $("<th>" + formInfo.output_lable[i - formInfo.input_lable.length] + "/" + formInfo.output_lable_unit[i - formInfo.input_lable.length] + "</th>");
                tbodyTh9 = $("<td></td>");
            }
            colgroup7.append(col8);
            theadTr8.append(theadTh9);
            tbodyTr8.append(tbodyTh9);
        }

        calculatorDiv2.append(titleDiv3);
        calculatorDiv2.append(siteTextDiv3);
        siteTextDiv3.append(formDiv4);
        formDiv4.append(formItemContainer5);
        formDiv4.append(buttons5);
        formDiv4.append(tableContainer5);
        tableContainer5.append(table6);
        table6.append(colgroup7);
        table6.append(thead7);
        table6.append(tbody7);
        thead7.append(theadTr8);
        tbody7.append(tbodyTr8);

        return calculatorDiv2;
    }

    function appendFormToBody(formArr) {
        var layui_body = $(".layui-body").eq(0);
        for(var i = 0; i < formArr.length; ++i) {
            layui_body.append(createForm(formArr[i]));
        }
    }


    /**
     * 表单提交函数
     * @param $form
     */
    function submitForm($form) {
        var $tds = $form.find("td");
        var options = {
            url: "/servlet/CalcServlet",
            type: "post",
            dataType: "json",
            beforeSubmit: function (formData, form) {
                console.log(formData);
                console.log(form);
                for (var i = 0; i < formData.length; ++i) {
                    $tds[i].innerHTML = formData[i].value;
                }
            },
            success: function (responseText) {
                console.log(responseText);
                $tds[$tds.length - 1].innerHTML = responseText.result;
            }
        };
        $form.ajaxForm(options)
    }


    /**
     * 加载界面时，只展示一个div
     * @param calcDivArr
     * @param $summarySheet
     * @param index
     */
    function showSingleDiv(calcDivArr, $summarySheet, index) {
        for (var j = 0; j < calcDivArr.length; ++j) {
            if (j == index) {
                calcDivArr[j].removeClass("hidden");
            }
            else {
                calcDivArr[j].addClass("hidden");
            }
        }
        if (index == calcDivArr.length) {
            $summarySheet.removeClass("hidden");
        }
        else {
            $summarySheet.addClass("hidden");
        }
    }


    /**
     * 左侧导航栏切换表单函数
     * @param calcDivArr
     * @param $summarySheet
     */
    function switchForm(calcDivArr, $summarySheet) {
        var $side_navs = $(".side-nav");
        for (var i = 0; i < $side_navs.length; ++i) {
            $side_navs[i].index = i;
            $side_navs.eq(i).click(function () {
                showSingleDiv(calcDivArr, $summarySheet, this.index);
            });
        }
    }


    /**
     * todo 将加载出的总表数据展示到网页上
     * @param data
     * @param calculatorArr
     * @param $summarySheet
     */
    function showData(data, calculatorArr, $summarySheet) {

    }


    /**
     * 加载data数据并显示在form中
     * @param year
     * @param calculatorArr
     * @param $summarySheet
     */
    function dataLoad(year, calculatorArr, $summarySheet) {
        var request_data = {
            year: year,
            position: "liangzilake",
            type: "forest"
        };
        var options = {
            url: "",
            data: JSON.stringify(request_data),
            dataType: "json",
            success: function (data) {
                showData(data, calculatorArr, $summarySheet);
                alert("年份切换成功");
            }
        };
        $.ajax(options);
    }


    /**
     * 更改日期表单重新加载函数
     * @param calculatorArr
     * @param $summarySheet
     */
    function dataReload(calculatorArr, $summarySheet) {
        //更改日期的处理
        var $year_select = $("#year-select");
        var $year_options = $year_select.find("dd>a");
        var $year = $("#year");
        var year;
        //改变主界面中的日期显示
        for (var i = 0; i < $year_options.length; ++i) {
            $year_options.eq(i).click(function () {
                year = $(this).text();
                $year.text(year);
                // $year_select.find("#year-selected").text(year);
                //加载data数据并显示在form中
                dataLoad(year, calculatorArr, $summarySheet);
            });
        }
    }


    /**
     * 启动函数
     */
    function main() {

        //获取所有的form对象
        var calculatorArr = generateFormArr();

        //将form展示添加到html中
        appendFormToBody(calculatorArr);

        //将所有从服务器请求的数据加载到form中
        //dataLoad();

        //只展示一个div
        //showSingleDiv();

        //左侧导航栏切换form函数
        //switchForm();

        //表单提交函数
        //submitForm();

        //更改年份时，重新想服务器加载数据并刷新界面
        //dataReload();
    }

    /**
     * 加载网页前向服务器申请数据
     */
    // $(window).load(function () {
    //     var request_data = {
    //         year: 2011,
    //         position: "liangzilake",
    //         type: "forest"
    //     };
    //     //todo finish the url
    //     var options = {
    //         url:"/servlet/RecordServlet",
    //         method:"post",
    //         data:request_data,
    //          dataType:"json",
    //          success:function (data) {
    //             form_data = data;
    //             console.log(data);
    //         }
    //     };
    //     $.ajax(options);
    // });


    /**
     * 网页加载完成后
     */
    $(function () {

        main();

        // //获取所有form所在的div对象
        // var calcDivArr = [];
        // var $calculatorDivs = $(".calculator");
        // var $specificCalcDivs = $calculatorDivs.children();
        // for (var i = 0; i < $specificCalcDivs.length; ++i) {
        //     var $specificCalcDiv = $specificCalcDivs.eq(i);
        //     calcDivArr.push($specificCalcDiv);
        //     var $specificCalcForm = $specificCalcDiv.find("form").eq(0);
        //     calculatorArr.push($specificCalcForm);
        // }
        //
        //
        // //获取总表
        // var $summarySheet = $(".summary-sheet").eq(0);
        //
        //
        // //获取日期
        // var year = $("#year").text();
        //
        //
        // //todo 加载界面时，将所有数据加载到表单中
        // //dataLoad(year, calculatorArr, $summarySheet);
        //
        //
        // //在加载界面时，只展示第一个calcDiv，隐藏其余div及总表
        // //showSingleDiv(calcDivArr, $summarySheet, 0);
        //
        //
        // //左侧导航栏切换表单函数
        // switchForm(calcDivArr, $summarySheet);
        //
        //
        // //提交表单
        // for (var k = 0; k < calculatorArr.length; ++k) {
        //     //calculatorArr[k].find(".submit-btn").eq(0).click(submitForm(calculatorArr[k]));
        //     submitForm(calculatorArr[k]);
        // }

    });
});




