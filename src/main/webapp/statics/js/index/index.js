//JavaScript代码区域
layui.use('element', function () {
    var element = layui.element;

    //存储加载页面前从服务器接受的总表数据
    var form_data;

    /**
     * 生成每个form的具体信息并封装在一个数组中返回
     */
    function generateFormArr() {
        //输入表单的数组
        var formArr = [];

        formArr[0] = {
            partDiv:"A1",
            title:"林地价值计算",
            column: 4,
            row: 11,
            head: ["林地类型", "林地价格（元/hm<sup>2</sup>）", "林地面积（hm<sup>2</sup>）", "价值（元）"],
            tuple_head: ["有林地", "疏林地", "灌木林地", "园林绿化地", "未成林地", "苗圃地", "无立木林地", "宜林地", "林地辅助生产用地"],
            input1: ["A1", "A2", 'A3', 'A4', "A5", "A6", "A7", "A8", "A9"],
            input2: ["B1", "B2", 'B3', 'B4', "B5", "B6", "B7", "B8", "B9"],
            output: ["C1", "C2", 'C3', 'C4', "C5", "C6", "C7", "C8", "C9"],
            end: ['合计', '', 'D1', 'D2'],
            formPic: "A1.png"
        };

        formArr[1] = {
            partDiv:"B1",
            title:"林木存量价值计算",
            input_lable:["林木积蓄", "材种出材率", "材种原木市场单位价格"],
            output_lable:["林木市场价值"],
            input_lable_unit:["m<sup>3</sup>", "%", "元.m<sup>-3</sup>"],
            output_lable_unit:["元"],
            input_name:["M", "f", "Am"],
            output_name:["Le"],
            formPic: "B1.png"
        };

        formArr[2] = {
            partDiv:"B2",
            title:"林木流量价值计算",
            input_lable:["林木生长量", "杉木立木价格"],
            output_lable:["林木流量价值"],
            input_lable_unit:["m<sup>3</sup>", "元.m<sup>-3</sup>"],
            output_lable_unit:["元"],
            input_name:["A", "B"],
            output_name:["C"],
            formPic: "B2.png"
        };

        formArr[3] = {
            partDiv:"C1",
            title:"林产品价值计算",
            column: 4,
            row: 8,
            head: ["林地类型", "林地价格（元/hm<sup>2</sup>）", "林地面积（hm<sup>2</sup>）", "价值（万元）"],
            tuple_head: ["胡柚", "林芝片", "孢子粉", "鲜茶叶", "山茶籽油", "蓝莓"],
            input1: ["A1", "A2", 'A3', 'A4', "A5", "A6"],
            input2: ["B1", "B2", 'B3', 'B4', "B5", "B6"],
            output: ["C1", "C2", 'C3', 'C4', "C5", "C6"],
            end: ['合计', '', '', 'D1'],
            formPic: "C1.png"
        };

        formArr[4] = {
            partDiv:"D1",
            title:"林分年调节水量计算",
            input_lable:["降水量", "林分蒸散量", "地表径流量", "林分面积", "水库建设单位库容投资"],
            output_lable:["林分年调节水量", "林分年调节水量价值"],
            input_lable_unit:["mm.a<sup>-1</sup>", "mm.a<sup>-1</sup>", "mm.a<sup>-1</sup>", "hm<sup>2</sup>", "元.m<sup>-3</sup>"],
            output_lable_unit:["m<sup>3</sup>.a<sup>-1</sup>", "元.a<sup>-1</sup>"],
            input_name:["P", "E", "C", "A", "Ck"],
            output_name:["Gt", "Ut"],
            formPic: "D1.png"
        };

        formArr[5] = {
            partDiv:"D2",
            title:"林分年净化水质价值计算",
            input_lable:["降水量", "林分蒸散量", "地表径流量", "林分面积", "水的净化费用"],
            output_lable:["林分年净化水量", "林分年净化水质价值"],
            input_lable_unit:["mm.a<sup>-1</sup>", "mm.a<sup>-1</sup>", "mm.a<sup>-1</sup>", "hm<sup>2</sup>", "元.t<sup>-1</sup>"],
            output_lable_unit:["m<sup>3</sup>.a<sup>-1</sup>", "元.a<sup>-1</sup>"],
            input_name:["P", "E", "C", "A", "Ck"],
            output_name:['Gt', 'Us'],
            formPic: "D2.png"
        };

        formArr[6] = {
            partDiv:"E1",
            title:"林分年固土量计算",
            input_lable:["挖取运输单位土方费用", "无林地土壤侵蚀模数", "林地土壤侵蚀模数", "林分面积", "林地土壤容重"],
            output_lable:["林分年固土量", "林分年固土价值"],
            input_lable_unit:["元.m<sup>-3</sup>", "t.hm<sup>-2</sup>.a<sup>-1</sup>", "t.hm<sup>-2</sup>.a<sup>-1</sup>", "hm<sup>2</sup>", "t.m<sup>-3</sup>"],
            output_lable_unit:["t.a<sup>-1</sup>", "元.a<sup>-1</sup>"],
            input_name:["Ct", "X2", "X1", "A", "P"],
            output_name:['Gg', 'Ug'],
            formPic: "E1.png"
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
            input_name:["X2", "X1", "A", "N", "P", "K", "M", "C1", "C2", "C3", "R1", "R2", "R3"],
            output_name:['Gf', 'Uf'],
            formPic: "E2.png"
        };

        formArr[8] = {
            partDiv:"F1",
            title:"林分年固碳量计算",
            input_lable:["二氧化碳中碳含量", "林分净生产力", "单位面积林分土壤年固碳量", "林分面积", "固碳价格"],
            output_lable:["综合年固碳量", "林分年固碳价值"],
            input_lable_unit:["%", "mm.a<sup>-1</sup>", "t.hm<sup>-2</sup>.a<sup>-1</sup>", "t.hm<sup>-2</sup>.a<sup>-1</sup>", "hm<sup>2</sup>", "元.t<sup>-1</sup>"],
            output_lable_unit:["t.a<sup>-1</sup>", "元.a<sup>-1</sup>"],
            input_name:["Rt", "Bn", "Ft", "A", "Ct"],
            output_name:['Gt', 'Ut'],
            formPic: "F1.png"
        };

        formArr[9] = {
            partDiv:"F2",
            title:"林分年释氧量计算",
            input_lable:["林分净生产力", "林分面积", "氧气价格"],
            output_lable:["林分年释氧量", "林分年释氧价值"],
            input_lable_unit:["t.hm<sup>-2</sup>.a<sup>-1</sup>", "hm<sup>2</sup>", "元.t<sup>-1</sup>"],
            output_lable_unit:["t.a<sup>-1</sup>", "元.a<sup>-1</sup>"],
            input_name:["Bn", "A", "Cy"],
            output_name:["Gy", "Uy"],
            formPic: "F2.png"
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
            input_name:["B", "N", "P", "K", "A", "C1", "C2", "R1", "R2", "R3"],
            output_name:['Gn', 'Gp', "Gk", 'Un', 'Up', 'Uk', 'Uz'],
            formPic: "G1.png"
        };

        formArr[11] = {
            partDiv:"H1",
            title:"林分年提供负离子计算",
            input_lable:["林分高度", "负离子产生费用", "林分负离子浓度", "林分面积", "负离子寿命"],
            output_lable:["林分年提供负离子个数", "林分年提供负离子价值"],
            input_lable_unit:["m", "元.个<sup>-1</sup>", "个.cm<sup>-3</sup>", "hm<sup>2</sup>", "min"],
            output_lable_unit:["个.a<sup>-1</sup>", "元.a<sup>-1</sup>"],
            input_name:["H", "Kf", "Qf", "A", "L"],
            output_name:['Gf', 'Uf'],
            formPic: "H1.png"
        };

        formArr[12] = {
            partDiv:"H2",
            title:"林分年吸收污染物计算",
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
            input_name:["A", "Ke", "Kd", "Kf", "Qe", "Qd", "Qf"],
            output_name:['Ge', 'Gd', 'Gf', 'Gz', 'Ue', 'Ud', 'Uf', 'Uz'],
            formPic: "H2.png"
        };

        formArr[13] = {
            partDiv:"H3",
            title:"林分年降低噪音价值计算",
            input_lable:["降低噪音费用", "森林面积折合为隔音墙的公里数"],
            output_lable:["林分年降低噪音价值"],
            input_lable_unit:["元.km<sup>-1</sup>", "km"],
            output_lable_unit:["元.a<sup>-1</sup>"],
            input_name:["Kz", "Az"],
            output_name:['Uz'],
            formPic: "H3.png"
        };

        formArr[14] = {
            partDiv:"H4",
            title:"林分年滞尘量计算",
            input_lable:["林分面积", "降尘清理费用", "林分面积年滞尘量"],
            output_lable:["林分年滞尘量", "林分年滞尘价值"],
            input_lable_unit:["hm<sup>2</sup>", "元.kg<sup>-1</sup>", "kg.hm<sup>-2</sup>.a<sup>-1</sup>"],
            output_lable_unit:["kg.a<sup>-1</sup>", "元.a<sup>-1</sup>"],
            input_name:["A", "Kz", "Qz"],
            output_name:['Gz', 'Uz'],
            formPic: "H4.png"
        };

        formArr[15] = {
            partDiv:"I1",
            title:"森林防护价值量计算",
            input_lable:["农作物总价值", "防护林占全区森林面积比", "农作物、牧草产量占总农作物产量比"],
            output_lable:["森林防护价值"],
            input_lable_unit:["元", "%", "%"],
            output_lable_unit:["元"],
            input_name:["Uz", "A", "B"],
            output_name:['Uf'],
            formPic: "I1.png"
        };

        formArr[16] = {
            partDiv:"J1",
            title:"林分年物种保育价值计算",
            input_lable:["单位面积年物种损失的机会成本", "林分面积"],
            output_lable:["林分年物种保育价值"],
            input_lable_unit:["元.hm<sup>-2</sup>.a<sup>-1</sup>", "hm<sup>2</sup>"],
            output_lable_unit:["元.a<sup>-1</sup>"],
            input_name:["Ss", "A"],
            output_name:['Us'],
            formPic: "J1.png"
        };

        formArr[17] = {
            partDiv:"K1",
            title:"森林游憩社会服务价值计算",
            input_lable:["年旅游价值", "旅游价值划分比例"],
            output_lable:["森林资源旅游费用"],
            input_lable_unit:["元", "%"],
            output_lable_unit:["元"],
            input_name:["Uz", "A"],
            output_name:['Us'],
            formPic: "K1.png"
        };

        return formArr;
    }


    /**
     * 对formArr进行筛选，从中挑选出以表格形式输入的公式，如A1, C1
     */
    function selectTableInputFromFormArr(formArr) {
        var tableArr = [];
        for(var i = 0; i < formArr.length; ++i) {
            if(formArr[i].column != null){
                tableArr.push(formArr[i]);
            }
        }
        return tableArr;
    }

    /**
     * 根据formInfo创建表单
     * @param formInfo
     *
     * 每个元素后面的数字表示相对于layui-body所在的层次，0层表示同层次，1表示为其子元素，以此类推
     * 如calculatorDiv2，表示calculatorDiv2元素为layui-body的孙元素
     */
    function createForm1(formInfo){
        var calculatorDiv2 = $("<div class='calculator " + formInfo.partDiv + "'></div>");
        var titleDiv3 = $("<div class=\"site-title\"><fieldset><legend><a name=\"use\">"+formInfo.title+"</a></legend></fieldset></div>");
        var siteTextDiv3 = $("<div class=\"site-text site-block\"></div>");
        var formDiv4 = $("<form class=\"layui-form\"></form>");
        var formItemContainer5 = $("<div class='form-item-container'></div>");
        var buttons5 = $("<br><div class=\"layui-form-item  block-display left-move\">" +
            "<div class=\"layui-input-block\">" +
            "<button id='submitBtn' class=\"layui-btn submit-btn\" lay-submit lay-filter=\"formDemo\">立即提交</button>" +
            "<button id='resetBtn' type=\"reset\" class=\"layui-btn layui-btn-primary\">重置</button>" +
            "<a id='showFormBtn' class='layui-btn showFormBtn' picPath="+formInfo.formPic+">查看公式</a>" +
            "</div></div>");
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
            var input8 = $("<input type=\"text\" name=" + formInfo.input_name[i] + " required lay-verify='required' placeholder='请输入数值' class='layui-input "+ formInfo.input_name[i] + "'>");
            var unitDiv7 = $("<div class=\"layui-form-mid layui-word-aux\">" + formInfo.input_lable_unit[i] + "</div>");
            formItemContainer5.append(tempFormItem6);
            tempFormItem6.append(tempInputlable7);
            tempFormItem6.append(layuiInputInlineDiv7);
            tempFormItem6.append(unitDiv7);
            layuiInputInlineDiv7.append(input8);
        }

        for(var i = 0; i < formInfo.output_lable.length; ++i){
	        var resultDiv = $("<div class='layui-form-item'></div>");
	        var resultInputLable = $("<label class='layui-form-label'>"+ formInfo.output_lable[i] +"</label>");
	        var reslutInputInlineDiv = $("<div class='layui-input-inline'></div>");
	        var resultInput = $("<input id='result' type='text'  disabled='disabled' placeholder='(计算结果)' class='layui-input " + formInfo.output_name[i] + "'/>");
	        var resultUnit = $("<div class='layui-form-mid layui-word-aux'>"+ formInfo.output_lable_unit[i] +"</div>")
	        resultDiv.append(resultInputLable);
	        resultDiv.append(reslutInputInlineDiv);
	        resultDiv.append(resultUnit);
	        reslutInputInlineDiv.append(resultInput);
	        formItemContainer5.append(resultDiv);
        }


        formItemContainer5.append($("<input type=\"hidden\" name=" + formInfo.partDiv + " value=\"\">"));

        // //生成table
        // for(i = 0; i < (formInfo.input_lable.length + formInfo.output_lable.length); ++i) {
        //     var col8 = $("<col width='200'>");
        //     var theadTh9, tbodyTh9;
        //     if(i < formInfo.input_lable.length) {
        //         theadTh9 = $("<th>" + formInfo.input_lable[i] + "/" + formInfo.input_lable_unit[i] + "</th>");
        //         tbodyTh9 = $("<td class=" + formInfo.input_name[i] + ">待输入</td>");
        //     }
        //     else {
        //         theadTh9 = $("<th>" + formInfo.output_lable[i - formInfo.input_lable.length] + "/" + formInfo.output_lable_unit[i - formInfo.input_lable.length] + "</th>");
        //         tbodyTh9 = $("<td class=" + formInfo.output_name[i - formInfo.input_lable.length] + "></td>");
        //     }
        //     colgroup7.append(col8);
        //     theadTr8.append(theadTh9);
        //     tbodyTr8.append(tbodyTh9);
        // }

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


//      var testButton = $("<button id='showForm'>查看公式1</button>");
//      calculatorDiv2.append(testButton);
//      $("#showForm").click(function(){
//      	layer.open({
//				title: '计算公式'
//				,content: "<img src='statics/formPictures/" + formInfo.formPic + "'>"
//			});
//      });

        return calculatorDiv2;
    }


    /**
     * 根据formInfo创建表单，表格类型表单
     * @param formInfo
     *
     * 每个元素后面的数字表示相对于layui-body所在的层次，0层表示同层次，1表示为其子元素，以此类推
     * 如calculatorDiv2，表示calculatorDiv2元素为layui-body的孙元素
     */
    function createForm2(formInfo) {
        var calculatorDiv2 = $("<div class='calculator " + formInfo.partDiv + "'></div>");
        var titleDiv3 = $("<div class=\"site-title\"><fieldset><legend><a name=\"use\">"+formInfo.title+"</a></legend></fieldset></div>");
        var formContainer3 = $("<div class='form-table-container'></div>");
        var layuiForm4 = $("<form class='layui-form'></form>");
        var table3 = $("<table class='layui-table'></table>");
        var thead4 = $("<thead></thead>");
        var tbody4 = $("<tbody></tbody>");
        var tr5 = $("<tr></tr>");
        for(var i = 0; i < formInfo.column; ++i) {
            var th = $("<th>" + formInfo.head[i] + "</th>")
            tr5.append(th);
        }
        thead4.append(tr5);
        for(var j = 0; j < formInfo.row - 2; ++j) {
            tr5 = $("<tr></tr>");
            var td1 = $("<td>" + formInfo.tuple_head[j] + "</td>");
            var td2 = $("<td><input type='text' name=" + formInfo.input1[j] + " class = 'layui-input " + formInfo.input1[j] +"' required lay-verify='required' placeholder='请输入数值'></td>");
            var td3 = $("<td><input type='text' name=" + formInfo.input2[j] + " class = 'layui-input " + formInfo.input2[j] +"' required lay-verify='required' placeholder='请输入数值'></td>");
            //var td4 = $("<td><input type='text' name=" + formInfo.output[j] + " class='layui-input layui-disabled result'></td>");
            var td4 = $("<td class=" + formInfo.output[j] + "></td>");
            tbody4.append(tr5);
            tr5.append(td1);
            tr5.append(td2);
            tr5.append(td3);
            tr5.append(td4);
        }
        table3.append(thead4);
        table3.append(tbody4);
        calculatorDiv2.append(titleDiv3);
        calculatorDiv2.append(formContainer3);
        formContainer3.append(layuiForm4);
        layuiForm4.append(table3);
        tr5 = $("<tr></tr>");
        for(var k = 0; k < formInfo.column; ++k) {
            var td;
            if(formInfo.end[k] == '合计') {
                td = $("<td>" + formInfo.end[k] + "</td>");
            }
            else if(formInfo.end[k] == '') {
                td = $("<td></td>");
            }
            else {
                td = $("<td class=" + formInfo.end[k] + "></td>");
            }
            tr5.append(td);
        }
        tbody4.append(tr5);

        var buttons5 = $("<br><div class=\"layui-form-item  block-display left-move\">" +
            "<div class=\"layui-input-block\">" +
            "<button id='submitBtn' class=\"layui-btn submit-btn\" lay-submit lay-filter=\"formDemo\">立即提交</button>" +
            "<button id='resetBtn' type=\"reset\" class=\"layui-btn layui-btn-primary\">重置</button>" +
            "<a id='showFormBtn' class='layui-btn showFormBtn' picPath="+formInfo.formPic+">查看公式</a>" +
            "</div></div>");
        layuiForm4.append(buttons5);

        //修改说明，testButton已经被放入上方的buttons5元素中，统一规格
        //var testButton = $("<button id='showForm'>查看公式2</button>");
        //calculatorDiv2.append(testButton);

        // $("#showForm").click(function(){
        // 	layer.open({
			// 	title: '计算公式'
			// 	,content: "<img src='statics/formPictures/" + formInfo.formPic + "'>"
			// });
        // });

        return calculatorDiv2;
    }


    /**
     * 根据formArr创建formDiv
     * @param formArr 存储form的数组
     */
    function appendFormToBody(formArr) {
        var $summary_sheet = $(".summary-sheet").eq(0);
        var tableArr = selectTableInputFromFormArr(formArr);
        for(var i = 0; i < formArr.length; ++i) {
            if(tableArr.includes(formArr[i])) {
                $summary_sheet.before(createForm2(formArr[i]));
            }
            else{
                $summary_sheet.before(createForm1(formArr[i]));
            }
        }
    }

    /**
     * 功能：点击展示公式按钮，显示公式图片弹窗
     * @param formPicPath 公式图片路径
     */
    function showForm(){
        //获取到所有的展示图片button
        var showFormBtns = $(".showFormBtn");
        for(var i = 0; i < showFormBtns.length; ++i){
            showFormBtns[i].index = i;
            showFormBtns.eq(i).click(function () {
            	var img = "<img width='800px' src='statics/formPictures/" + showFormBtns.eq(this.index).attr("picPath") + "'>";
            	var winH = window.innerHeight;
            	
            	$("<img />").attr("src", $(img).attr("src")).load(function(){
	            	var imgHeight = this.height;
	            	var offSetY = winH / 2 - imgHeight / 2;
	            	layer.ready(function(){
		                layer.open({
		                	type: 1,
		                	shift: 2,
		                	area: '800px',
		                	offset: offSetY,
		                	moveOut: true,
		                	skin: 'layui-layer-molv',
		                	title: '计算公式',
							content: img
		                });
	            	});            		
            	});
            });
        }
    }
    

    /**
     * 获取所有form，监听submit事件，点击submit按钮提交表单
     *
     */
    function submitForm() {
        var $forms = $(".calculator").find(".layui-form");
        for(var i = 0; i < $forms.length; ++i) {
            submitForm1($forms.eq(i));
        }
    }

    /**
     * 单个表单提交
     * @param $form 要提交的单个表单
     */
    function submitForm1($form){
        var url = "calc/";
        var classArr = $form.parent().parent().attr("class").split(" ");
        url += classArr[1];     //指定提交的servlet
        var options = {
            url: url,
            type: "post",
            dataType: "json",
            beforeSubmit: function (formData, jqForm) {

            },
            success: function (responseText) {
                showDataToForm($form, responseText);
            }
        };
        $form.ajaxForm(options);
    }

    /**
     * 加载界面时，只展示一个div
     * @param index 要展示的calculator对应div的索引
     */
    function showSingleDiv(index) {
        var calculators = $(".calculator");
        var $summarySheet = $(".summary-sheet").eq(0);
        for (var j = 0; j < calculators.length; ++j) {
            if (j == index) {
                calculators.eq(j).removeClass("hidden");
            }
            else {
                calculators.eq(j).addClass("hidden");
            }
        }
        if (index == calculators.length) {
            $summarySheet.removeClass("hidden");
        }
        else {
            $summarySheet.addClass("hidden");
        }
    }


    /**
     * 左侧导航栏切换表单函数
     */
    function switchForm() {
        var $side_navs = $(".side-nav");
        for (var i = 0; i < $side_navs.length; ++i) {
            $side_navs[i].index = i;
            $side_navs.eq(i).click(function () {
                showSingleDiv(this.index);
            });
        }
    }


    /**
     * 将加载出的数据展示到网页上
     * @param data 服务器返回的数据，此处为请求"calc/total"接口返回的list数据，数据中的每一条记录对应到一个form上
     */
    // function showData(data) {
    //     console.log(data);
    //     var $forms = $(".calculator").find(".layui-form");
    //     for(var k = 0; k < data.length; ++k){
    //         showResult($forms.eq(k), data[k]);
    //     }
    // }

    /**
     * 将计算结果展示到网页上
     * @param $form 一个form
     * @Param responseText 一个form对应的数据
     */
    // function showResult($form, responseText){
    //     for(var paramName in responseText){
    //         var value = responseText[paramName];
    //         var same = $form.find("."+paramName);
    //         for(var j = 0; j < same.length; ++j){
    //             same.eq(j).text(value);
    //             same.eq(j).val(value);
    //         }
    //     }
    // }

    /**
     *
     * @Param data 从服务器请求得到的总表中的数据
     */
    // function calculateSubtotal(data){
    //     var subtotal_for_A1B1B2C1 = $("#subtotal_for_A1B1B2C1");
    //     var subtotal_for_D1D2 = $("#subtotal_for_D1D2");
    //     var subtotal_for_E1E2 = $("#subtotal_for_E1E2");
    //     var subtotal_for_F1F2 = $("#subtotal_for_F1F2");
    //     var subtotal_for_G1 = $("#subtotal_for_G1");
    //     var subtotal_for_H1H2H3H4 = $("#subtotal_for_H1H2H3H4");
    //     var subtotal_for_DEFGHIJ = $("#subtotal_for_DEFGHIJ");
    //     var subtotal_for_all = $("#subtotal_for_all");
    //     var subtotal_value_for_A1B1B2C1 = data['B1Le']+data['B2C']+data['C1D1'];
    //     var subtotal_value_for_D1D2 = data['D1Ut']+data['D2Us'];
    //     var subtotal_value_for_E1E2 = data['E1Ut']+data['E2Uf'];
    //     var subtotal_value_for_F1F2 = data['F1Ut']+data['F2Uy'];
    //     var subtotal_value_for_G1 = data['G1Un']+data['G1Up']+data['G1Uk'];
    //     var subtotal_value_for_H1H2H3H4 = data['H1Uf']+data['H2Uz']+data['H3Uz']+data['H4Uz'];
    //     var subtotal_value_for_DEFGHIJ = subtotal_value_for_D1D2 + subtotal_value_for_E1E2 + subtotal_value_for_F1F2 + subtotal_value_for_G1 + subtotal_value_for_H1H2H3H4 + data['I1Uf'] + data['J1Us'];
    //     var subtotal_value_for_all = subtotal_value_for_A1B1B2C1 + subtotal_value_for_DEFGHIJ + data['K1Us'];
    //     subtotal_for_A1B1B2C1.text(subtotal_value_for_A1B1B2C1);
    //     subtotal_for_D1D2.text(subtotal_value_for_D1D2);
    //     subtotal_for_E1E2.text(subtotal_value_for_E1E2);
    //     subtotal_for_F1F2.text(subtotal_value_for_F1F2);
    //     subtotal_for_G1.text(subtotal_value_for_G1);
    //     subtotal_for_H1H2H3H4.text(subtotal_value_for_H1H2H3H4);
    //     subtotal_for_DEFGHIJ.text(subtotal_value_for_DEFGHIJ);
    //     subtotal_for_all.text(subtotal_value_for_all);
    // }

    /**
     * 提交当前界面的基本参数信息，用于从服务器接收数据
     * @param year 年份
     * @param position  位置
     * @param type  种类
     */
    // function infoSubmit(year, position, type) {
    //     var request_data = {
    //         year: year,
    //         position: position,
    //         type: type
    //     };
    //     var options = {
    //         url: "calc/type",
    //         data: request_data,
    //     };
    //     $.ajax(options);
    // }

    /**
     * 请求form中的数据
     * @param year
     * @param position
     * @param type
     */
    // function formDataLoad(year, position, type) {
    //     var request_data = {
    //         year: year,
    //         position: position,
    //         type: type
    //     };
    //     var options = {
    //         url: "calc/total",
    //         data: request_data,
    //         dataType: "json",
    //         success: function (data) {
    //             showData(data);
    //         }
    //     };
    //     $.ajax(options);
    // }

    /**
     * 请求总表数据
     * @param year
     * @param position
     * @param type
     */
    // function summarySheetDataLoad(year, position, type) {
    //     var request_data = {
    //         year: year,
    //         position: position,
    //         type: type
    //     };
    //     var options = {
    //         url: "total",
    //         data: request_data,
    //         dataType: "json",
    //         success: function (data) {
    //             console.log(data);
    //             var summarySheet = $(".summary-sheet").eq(0);
    //             //展示总表数据
    //             showResult(summarySheet, data);
    //             //计算总表中的各项合计
    //             calculateSubtotal(data);
    //         }
    //     };
    //     $.ajax(options);
    // }

    /**
     * 加载data数据并显示在form中
     * @param year
     * @param position
     * @param type
     * @return {*[]}
     */
    // function dataLoad(year, position, type) {
    //     //告诉服务器当前请求基本信息
    //     infoSubmit(year, position, type);
    //     //请求加载表单数据
    //     formDataLoad(year, position, type);
    //     //请求加载总表数据
    //     summarySheetDataLoad(year, position, type);
    //     //修改导航栏中的地理位置和日期
    //     //showPositionAndTime(position, year);
    // }


    /**
     * 更改日期表单重新加载函数
     */
    // function dataReload() {
    //     //更改日期的处理
    //     var $year_select = $("#year-select");
    //     var $year_options = $year_select.find("dd>a");
    //     var $year = $("#year");
    //     var year;
    //     //改变主界面中的日期显示
    //     for (var i = 0; i < $year_options.length; ++i) {
    //         $year_options.eq(i).click(function () {
    //             year = $(this).text();
    //             $year.text(year);
    //             //加载data数据
    //             dataLoad(year, "liangzihu", "forest");
    //         });
    //     }
    // }


    /**
     * 启动函数
     */
    function main() {

        //初始化所有的form对象
        var calculatorArr = generateFormArr();

        //将form展示添加到html中
        appendFormToBody(calculatorArr);

        //监听用户点击展示公式按钮事件
        showForm();

        //将所有从服务器请求的数据加载到form中，初次打开页面默认加载为2011年梁子湖森林数据，加载成功后展示到界面上
        //dataLoad(2011, "liangzihu", "forest");

        //只展示一个div，从0开始
        showSingleDiv(0);

        //左侧导航栏切换form函数
        switchForm();

        //表单提交函数
        submitForm();

        //日期与地区修改函数
        //areaAndTImeSelect();

        // //更改年份时，重新向服务器加载数据并刷新界面
        // dataReload();
    }


    /**
     * 网页加载完成后
     */
    $(function () {

        main();

    });
});



