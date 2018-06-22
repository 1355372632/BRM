$(function() {
	$(".submit").click(function() {
		$("#mpanel").css("visibility", "visible");
		setTimeout(mpanelHide, 10000);
	});

	function mpanelHide() {
		$("#mpanel").css("visibility", "hidden");
	};
	
	$(".iconsubmit").click(function() {
		$(".iconform").submit();
	});

	$(".dec").click(function() {
		$(".dec").css("color", "red");
		$(".dec").css("border-bottom", "red solid 3px");
		$(".rev").css("color", "black");
		$(".rev").css("border-bottom", "none");
		$(".derectory").css("visibility", "visible");
		$(".derectory").css("z-index", "99");
		$(".review").css("visibility", "hidden");
		$(".review").css("z-index", "1");
	});
	$(".rev").click(function() {
		$(".dec").css("color", "black");
		$(".dec").css("border-bottom", "none");
		$(".rev").css("color", "red");
		$(".rev").css("border-bottom", "red solid 3px");
		$(".review").css("visibility", "visible");
		$(".review").css("z-index", "99");
		$(".derectory").css("visibility", "hidden");
		$(".derectory").css("z-index", "1");
	});

	if($(".revtitle").val() != "") {
		$(".revtitle").attr("placeholder", "");
	}
	if($(".commit").val() != "") {
		$(".commit").attr("placeholder", "");
	}
	$('.toTop').on('click', function() {
		if($(window).scrollTop() == 0) return;
		$('.fix-tool-left').css({
			'_top': 'auto'
		});
		$("html,body").animate({
			scrollTop: 0
		}, 1000);
	});
})