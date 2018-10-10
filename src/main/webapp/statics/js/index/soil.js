/**
 * 生成每个form的具体信息并封装在一个数组中返回
 * @return {array} formArray 公式信息数组
 */
function generateFormArr() {
    var formArray=[];
    formArray[0]={
        partDiv:"XX",
        title:"基准地价修正法土地资源经济价值",
        input_lable:["某土地基准地价", "土地使用年期修正系数", "土地面积"],
        output_lable:["土地经济价值"],
        input_lable_unit:["元.m<sup>3</sup>", "", "m<sup>2</sup>"],
        output_lable_unit:["元"],
        input_name:[],
        output_name:[]
    };
    formArray[1]={
        partDiv:"XX",
        title:"征地区片价修正法土地经济价值",
        input_lable:["征地区片价", "开垦费标准", "新增费标准","社保费标准","耕作层剥离费标准","土地面积"],
        output_lable:["土地经济价值"],
        input_lable_unit:["元/m<sup>2</sup>", "m<sup>2</sup>", "m<sup>2</sup>","m<sup>2</sup>","m<sup>2</sup>","m<sup>2</sup>"],
        output_lable_unit:["元"],
        input_name:[],
        output_name:[]
    };
    formArray[2]={
        partDiv:"XX",
        title:"成本法土地经济价值",
        input_lable:["土地取得费", "土地开发费", "利息","利润","土地增值收益","土地面积"],
        output_lable:["土地经济价值"],
        input_lable_unit:["元/m<sup>2</sup>", "元/m<sup>2</sup>","","", "元/m<sup>2</sup>","m<sup>2</sup>"],
        output_lable_unit:["元"],
        input_name:[],
        output_name:[]
    };

    formArray[2]={
        partDiv:"XX",
        title:"土地生态服务价值计算模型",
        input_lable:["土地利用类型分布面积", "单位面积生态价值系数"],
        output_lable:["土地生态系统服务总价值"],
        input_lable_unit:["m<sup>2</sup>", ""],
        output_lable_unit:["元"],
        input_name:[],
        output_name:[]
    };
    formArray[3]={
        partDiv:"XX",
        title:"社会保障价值",
        input_lable:["城乡平均收入","常住人口数"],
        output_lable:["土地资源提供的社会保障价值"],
        input_lable_unit:["元", ""],
        output_lable_unit:["元"],
        input_name:[],
        output_name:[]
    };
    return formArray;
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
        var resultInput = $("<input id='result' type='text'  disabled='disabled' placeholder='(计算结果)' class='layui-input'/>");
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
 * 根据formInfo创建表单
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
 * 启动函数
 */
function main() {

    //初始化所有的form对象
    var calculatorArr = generateFormArr();

    //将form展示添加到html中
    appendFormToBody(calculatorArr);

    //只展示一个div，从0开始
    showSingleDiv(0);

    //左侧导航栏切换form函数
    switchForm();
}


/**
 * 网页加载完成后
 */
$(function () {

    main();

});




