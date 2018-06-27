<%@ page language="java" contentType="text/html; charset=UTF-8"
	pageEncoding="UTF-8" isELIgnored="false"%>
<%@taglib uri="http://java.sun.com/jsp/jstl/core" prefix="c"%>
<%@ taglib uri="http://www.springframework.org/tags" prefix="spring" %>
<%
	String path = request.getContextPath();
	String basePath = request.getScheme() + "://" + request.getServerName() + ":" + request.getServerPort()
			+ path + "/";
%>
<!DOCTYPE html PUBLIC "-//W3C//DTD HTML 4.01 Transitional//EN" "http://www.w3.org/TR/html4/loose.dtd">
<html>
<head>
<meta http-equiv="Content-Type" content="text/html; charset=UTF-8">
<base href="<%=basePath%>">
<title>注册</title>
		<link rel="stylesheet" href="css/ZR.css" />
		<link rel="stylesheet" href="css/reg.css"/>
		<link rel="stylesheet" href="css/verify.css" />
		<script type="text/javascript" src="js/jquery-1.11.0.min.js" ></script>
		<script type="text/javascript" src="js/verify.js" ></script>
		<script type="text/javascript" src="js/clickEvent.js" ></script>
		<script type="text/javascript" src="js/reg_check.js" ></script>
		<script type="text/javascript">
			$(function(){
				$("#reg_submit").click(function(){
					if($("#span1").html()==$("#span2").html()&&$("#span2").html()== $("#span3").html()&&$("#span3").html()== $("#span5").html()){
						$("#mpanel").css("visibility","visible");
						setTimeout(mpanelHide,10000);	
					}else
						alert("请重新确认注册信息！")
				});
				
				function mpanelHide(){
					$("#mpanel").css("visibility","hidden");
				}

			})
		</script>
	</head>

	<body>
		<div class="box" id="reg_box">
			<div class="bg" id="reg_bg"></div>
			<div class="top_box">
				<div class="menu_bg" id="reg_menu_bg"></div>
				<div class="top_menu">
					<dl class="menu">
						<dt><a href="index.html"><span>首页</span></a></dt>
						<dt>
							<a href="#"><span>轻小说</span></a>
							<!--<dl class="sub">
								<dt><a href="#"><span>站长小推荐</span></a></dt>
						<dt><a href="#"><span>动画化相关</span></a></dt>
						<dt><a href="#"><span>经典回忆录</span></a></dt>
					</dl>-->
					</dt>
					<dt>
							<a href="#"><span>网络小说</span></a>
							<!--<dl class="sub">
								<dt><a href="#"><span>站长小推荐</span></a></dt>
					<dt><a href="#"><span>连载进行时</span></a></dt>
					<dt><a href="#"><span>完结回忆录</span></a></dt>
					</dl>-->
					</dt>
					<dt>
							<a href="#"><span>文学作品</span></a>
							<!--<dl class="sub">
								<dt><a href="#"><span>文艺故事会</span></a></dt>
					<dt><a href="#"><span>哲学讨论组</span></a></dt>
					<dt><a href="#"><span>人物传奇史</span></a></dt>
					</dl>-->
					</dt>
					<!--<dt>
							<a href="#"><span>综合讨论</span></a>
							<dl class="sub">
								<dt><a href="#"><span>相关资讯</span></a></dt>
					<dt><a href="#"><span>热门话题</span></a></dt>
					<dt><a href="#"><span>阅读随笔</span></a></dt>
					<dt><a href="#"><span>创作之家</span></a></dt>
					</dl>
					</dt>
					<dt><a href="#"><span>站长随笔</span></a></dt>-->
					<dt><a href="#"><span>联系我们</span></a></dt>
					<dt>
							<a href="#"><span>个人中心</span></a>
							<dl class="sub">
								<dt><a href="#"><span>登录</span></a></dt>
					<dt><a href="#"><span>注册</span></a></dt>
					</dl>
					</dt>
					</dl>
				</div>
				<div class="search">
					<table>
						<tr>
							<td id="search_text">
								<input type="text" value=" 有什么想找的，试试看吧" id="searchText" height="30px" size="15" />
							</td>
							<td id="search_img">
								<a href="#">
									<img src="img/main/搜索框按钮图标.png" />
								</a>
							</td>
						</tr>
					</table>
				</div>
				<div class="reg_title">
					<div class="reg_title_bg"></div>
					<div class="reg_title_contain">
						<span>个人中心</span>
						<br />
						<span id="title_2">user</span>
					</div>
				</div>
			</div>
			<div class="reg_main">
				<div class="main_contain" id="reg_main_contain">
					<div class="line">
						<p>
							<span>注册</span>
						</p>
					</div>
					<div class="input_text" id="reg_text">
						<form  method="post" id="form1">
							<span class="text_title">用户名</span>
							<input class="form_text" type="text" size="30" id="uid" /><span class="sign" id="span1" style="padding:0px 8px;border-radius:50%;color:white"></span>
							<br />
							<span class="text_title">密码</span>
							<input class="form_text" type="text" size="30" id="upwd" /><span class="sign" id="span2" style="padding:0px 8px;border-radius:50%;color:white"></span>
							<br />
							<span class="text_title">确认密码</span>
							<input class="form_text" type="text" size="30" id="upwd_check" /><span class="sign" id="span3" style="padding:0px 8px;border-radius:50%;color:white"></span>
							<br />
							<!-- <span class="text_title">昵称</span>
							<input class="form_text" type="text" size="30" id="uname" /><span class="sign" id="span4" style="padding:0px 8px;border-radius:50%;color:white"></span>
							<br /> -->
							<span class="text_title">邮箱</span>
							<input class="form_text" type="text" size="30" id="uemail" /><span class="sign" id="span5" style="padding:0px 8px;border-radius:50%;color:white"></span>
							<br />
							<input type="button" class="submit" id="reg_submit" value="注册" />
						</form>
					</div>
					<div class="input_img" id="reg_img"></div>
					<div class="input_welcome" id="reg_welcome">
						<span>欢迎来到宅人俱乐部</span>
						<p>
							<span>希望你能在此收获一些乐趣</span>
						</p>
						<span>找到自己的圈子</span>
					</div>
					<div class="check" id="reg_check">
						<div id="mpanel" ></div>
						<script type="text/javascript" src="js/reg_check.js" ></script>
					</div>
				</div>
			</div>
			<div class="bottom" id="reg_bottom">
				<div class="bottom_bg"></div>
				<span>Copyright © 2005-2018 dmzj.com All Rights Reserved 京ICP备17012542号-2</span>
			</div>
		</div>
	</body>

</html>