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
<title>我的空间-章节修改</title>
		<link rel="stylesheet" href="../css/ZR.css" />
		<link rel="stylesheet" href="../css/reg.css" />
		<link rel="stylesheet" href="../css/pCenter.css" />
		<link rel="stylesheet" href="../css/pindex.css" />
		<link rel="stylesheet" href="../css/workedit.css" />
		<link rel="stylesheet" href="../css/iconupload.css" />
		<link rel="stylesheet" href="../css/newbook.css" />
		<link rel="stylesheet" type="text/css" href="../css/bookedit.css" />
		<script type="text/javascript" src="../js/jquery-1.11.0.min.js"></script>
		<script type="text/javascript" src="../js/cropbox.js"></script>
		<script type="text/javascript" src="../js/bookedit.js"></script>
		<style type="text/css">
			.button {
				margin-top: 15px;
				margin-left: 95px;
				display: inline-block;
			}
		</style>
	</head>

	<body>
		<div class="box" id="personalCenter_box">
			<div class="bg" id="reg_bg"></div>
			<div class="top_box">
				<div class="menu_bg" id="reg_menu_bg"></div>
				<div class="top_menu">
					<dl class="menu">
						<dt><a href="../index.html"><span>首页</span></a></dt>
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
									<img src="../img/main/搜索框按钮图标.png" />
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
			<div class="main" id="personalCenter_main">
				<div class="personalCenter_main_left">
					<div class="adminbox">
						<div class="adminpic">
							<img src="../img/login/bg.jpg" />
						</div>
						<div class="adminname fontpart">丸户史明</div>
						<div class="adminlink">
							<a href="admin_infoEdit.html">
								<span class="btn adminset">设置</span>
							</a>
							<a href="../index.html">
								<span class="btn adminout">退出</span>
							</a>
						</div>
					</div>
					<dl class="leftnav">
						<dt>
							<a href="admin_index.html" class="opennav">个人主页</a>
						</dt>
						<dt>
							<a href="admin_mood.html" class="opennav">心情</a>
						</dt>
						<dt>
							<a href="javascript:void(0)" class="opennav">账号管理</a>
							<div class="navsonbox">
								<a href="admin_infoEdit.html">信息设置</a>
								<a href="passwd.html">安全管理</a>
							</div>
						</dt>
						<dt>
							<a href="workedit.html" class="opennav active">投稿管理</a>
						</dt>
					</dl>
				</div>
				<div class="personalCenter_main_right">
					<div class="mainbox">
						<div class="block-name">
							<span>章节修改</span>
						</div>
						<form class="chapedit">
							<div class="chapName">
								<span>章节名：</span><input type="text" id="chapName" />
							</div>
							<span>章节内容:</span>
							<textarea id="chapedit"></textarea>
							<p>
								<input type="button" value="返回" class="button" onclick="window.location.href='bookEdit.html'" />
								<input type="submit" value="确认修改" class="button" />
							</p>
						</form>
					</div>
				</div>
			</div>
			<div class="personalCenter_bottom">
				<div class="footsign">
					<p>
						互联网ICP备案：闽ICP备12004074号-8 闽网文（2015）1788-036号
					</p>
					<p>
						© 2016 本站不提供任何视听上传服务，所有内容均来自用户所提供的公开引用资源
					</p>
				</div>
			</div>
		</div>
	</body>

</html>