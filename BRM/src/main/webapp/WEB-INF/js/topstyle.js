$(function() {
	var t = setTimeout(changeTopBg, 2000);

	function changeTopBg() {
		$(".top_bg").css("opacity", 0.6);
	}
	
	$(".top_box").mouseover(function() {
		$(".top_bg").css("opacity", 0.9);
	});
	$(".top_box").mouseout(function() {
		$(".top_bg").css("opacity", 0.6);
	});
})