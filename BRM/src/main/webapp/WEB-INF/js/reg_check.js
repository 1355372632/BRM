$('#mpanel').slideVerify({
    type : 2,   //类型
    vOffset : 5,  //误差量，根据需求自行调整
    vSpace : 5, //间隔
    imgName : ['../img/reg/1.png', '../img/reg/2.png','../img/reg/3.jpg'],
    imgSize : {
      width: '400px',
      height: '200px',
    },
    blockSize : {
      width: '40px',
      height: '40px',
    },
    barSize : {
      width : '400px',
      height : '40px',
    },
    ready : function() {
    },
    success : function() {
//      alert('验证成功，添加你自己的代码！');
    	$.ajax({
			
			url: "user/doreg",
			//请求的url地址
			data: {userID:$("#uid").val(),uPwd:$("#upwd").val(),uEmail:$("#uemail").val(),uName:$("#uname").val(),uType:2},
			type: "post",
			//请求方式
			dataType:"json",
			success: function (data) { 
				if(data.msg==true){
					alert("注册成功！");
					window.location="user/index";
				}else if(data.msg==true){
					alert("注册失败！");
					window.location="user/login";
				}
			}
		});

    },
    error : function() {
      alert('验证失败！请重试！');
    }
 
}); 
$("#uid").blur(function(){
	$.ajax({
		
		url: "user/userCheck",
		//请求的url地址
		data: {uid:$("#uid").val()},
		type: "post",
		//请求方式
		dataType:"json",
		success: function (data) {
			if(data.msg==true){
				$("#span1").html("×");
				$("#span1").css("background-color","red");
			}else if(data.msg==false){
				$("#span1").html("√");
				$("#span1").css("background-color","green");
				}
		},
		error: function () {
			alert("用户名或密码不能为空");
			}
	});
});
$("#upwd").blur(function(){
	if($("#upwd").val()==""){
		$("#span2").html("×");
		$("#span2").css("background-color","red");
	}else{
		$("#span2").html("√");
		$("#span2").css("background-color","green");
		}
})
$("#upwd_check").blur(function(){
	if($("#upwd_check").val()==""||$("#upwd_check").val()!=$("#upwd").val()){
		$("#span3").html("×");
		$("#span3").css("background-color","red");
	}else{
		$("#span3").html("√");
		$("#span3").css("background-color","green");
		}
})
$("#uname").blur(function(){
	if($("#uname").val()==""){
		$("#span4").html("×");
		$("#span4").css("background-color","red");
	}else{
		$("#span4").html("√");
		$("#span4").css("background-color","green");
		}
})
$("#uemail").blur(function(){
	var email= /^([a-zA-Z0-9_\.\-])+\@(([a-zA-Z0-9\-])+\.)+([a-zA-Z0-9]{2,4})+$/;
//	var str = document.getElementById("#uemail").value;
	if($("#uemail").val()==""){
		$("#span5").html("×");
		$("#span5").css("background-color","red");
	}else if(!email.test($("#uemail").val())){
		$("#span5").html("×");
		$("#span5").css("background-color","red");
	} 
	else{
		$("#span5").html("√");
		$("#span5").css("background-color","green");
		}
})