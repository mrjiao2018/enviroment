$(function () {
    var options = {
        url: "",
        type: "post",
        dataType: "json",
        beforeSubmit: function (formData) {
            console.log("提前前，提交数据为：" + formData);
        },
        success: function (responseText) {
            console.log("提前后，响应数据为：" + responseText);
        }
    };

    var form = $(".calculator").find(".layui-form").eq(0);
    console.log(form);
    form.ajaxForm(options);
});