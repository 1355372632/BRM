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
//    alert('验证成功，添加你自己的代码！');
	$("#form1").submit();
//		function submit(){
//		window.location="index.html";
//		}
    },
    error : function() {
      alert('验证失败！请重试！');
    }
 
}); 