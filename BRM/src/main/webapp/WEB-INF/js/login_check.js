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

/*      window.location="user/index";*/
    	
    	$.ajax({
			
			url: "http://localhost:8080/BRM/user/dologin",
			//请求的url地址
			data: {userID:$("#userID").val(),uPwd:$("#uPwd").val()},
			type: "post",
			//请求方式
			dataType:"json",
			success: function (data) { 
				if(data.msg==true){
					alert("登录成功！");
					window.location="user/index";
				}else if(data.msg==false){
					alert("用户名或密码错误，请重新输入！")
					window.location = 'user/login';
				}
			}
		});

    },
    error : function() {
      alert('验证失败！请重试！');
    }
 
}); 