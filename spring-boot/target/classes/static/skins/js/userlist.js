$(function () {
        $.ajax({
            type: "get",
            dataType: "json",
            contentType: "application/json;charset=utf-8",
            url: path+"/getAll",
            success: function (data) {
            	var str='';
            	console.info(data[0].id);
                if (data.length>0) {
                    for (i in data) {
                        str += "<tr>" +
                            "<td align='center'>" + data[i].id + "</td>" +
                            "<td align='center'>" + data[i].name + "</td>" +
                            "<td align='center'>" + data[i].age + "</td>" +
                            "<td align='center'>" + data[i].password + "</td>" +
                            "</tr>";
                    }
                	// $("#userlist").html(str);
                	 $("#userlist")[0].innerHTML=str;
                }
            },
            error: function () {
                alert("查询失败")
            }
        });
});