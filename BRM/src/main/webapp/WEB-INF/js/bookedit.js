$(window).load(function() {
	var options =
	{
		thumbBox: '.thumbBox',
		spinner: '.spinner',
		imgSrc: '../img/login/bg.jpg'
	}
	var cropper = $('.imageBox').cropbox(options);
	$('#upload-file').on('change', function(){
		var reader = new FileReader();
		reader.onload = function(e) {
			options.imgSrc = e.target.result;
			cropper = $('.imageBox').cropbox(options);
		}
		reader.readAsDataURL(this.files[0]);
	});
	$(".thumbBox").mouseup(function(){
		cut();
	});
	$('.cropped').html('');
	var cover = "../img/login/bg.jpg";
	$('.cropped').append('<img src="'+cover+'" align="absmiddle" id="bookcover"  style="width:200px;height:250px;margin-top:0px;box-shadow:0px 0px 12px #7E7E7E;"><p id="tip">拖动截取新封面</p>');
	$('#tip').css("color","black");
	function cut(){
		var img = cropper.getDataURL();
		$('#bookcover').attr("src",img);
		$('#tip').html("预览");
	};
	$('#btnZoomIn').on('click', function(){
		cropper.zoomIn();
	})
	$('#btnZoomOut').on('click', function(){
		cropper.zoomOut();
	})
});