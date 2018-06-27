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
<title>账号管理-信息设置-上传头像</title>
		<link rel="stylesheet" href="css/ZR.css" />
		<link rel="stylesheet" href="css/reg.css" />
		<link rel="stylesheet" href="css/pCenter.css" />
		<link rel="stylesheet" href="css/pindex.css" />
		<link rel="stylesheet" href="css/mood.css" />
		<link rel="stylesheet" href="css/iconupload.css" type="text/css" />
		<link rel="stylesheet" href="css/admin_edit.css" />
		<script type="text/javascript" src="js/jquery-1.11.0.min.js" ></script>
		<script type="text/javascript" src="js/cropbox.js"></script>
		<script type="text/javascript" src="js/iconwin.js" ></script>
		<script type="text/javascript" src="js/clickEvent.js" ></script>
	</head>
	<body>
		<div class="box" id="personalCenter_box">
		<div class="bg" id="reg_bg"></div>
		<div class="top_box">
			<div class="menu_bg" id="reg_menu_bg"></div>
			<div class="top_menu">
				<dl class="menu">
					<dt>
						<a href="link/index"><span>首页</span></a>
					</dt>
					<dt>
						<a href="link/light"><span>轻小说</span></a>

					</dt>
					<dt>
						<a href="link/web"><span>网络小说</span></a>
					</dt>
					<dt>
						<a href="link/literature"><span>文学作品</span></a>
						
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
					<dt>
						<a href="#"><span>联系我们</span></a>
					</dt>
					<dt>
						<a href="#"><span>个人中心</span></a>
						<dl class="sub">
							<dt>
								<a href="link/login"><span>登录</span></a>
							</dt>
							<dt>
								<a href="link/reg"><span>注册</span></a>
							</dt>
						</dl>
					</dt>
				</dl>
			</div>
				<div class="search">
					<form id="do-search" method="post" action="searchResult.jsp">
						<table>
							<tr>
								<td id="search_text">
									<input type="text" placeholder="有什么想找的，试试看吧" id="searchText" height="30px" size="15" />
								</td>
								<td id="search_img">
									<a href="javascript:document.getElementById('do-search').submit()">
										<img src="img/main/搜索框按钮图标.png" />
									</a>
								</td>
							</tr>
						</table>
					</form>
				</div>
				<div class="reg_title">
					<div class="reg_title_bg"></div>
					<div class="reg_title_contain">
						<span>个人中心</span>
						<br />
						<span id="title_2">${user.userinfo.uName }</span>
					</div>
				</div>
			</div>
			<div class="main" id="personalCenter_main">
				<div class="personalCenter_main_left">
					<div class="adminbox">
						<div class="adminpic">
							<img src="img/login/bg.jpg" />
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
							<a href="personalCenterLink/admin_index" class="opennav">个人主页</a>
						</dt>
						<dt>
							<a href="personalCenterLink/admin_mood" class="opennav">心情</a>
						</dt>
						<dt>
							<a href="javascript:void(0)" class="opennav active">账号管理</a>
							<div class="navsonbox">
								<a href="personalCenterLinkadmin_infoEdit" style="color: hotpink;">信息设置</a>
								<a href="personalCenterLink/passwd">安全管理</a>
							</div>
						</dt>
						<dt>
							<a href="personalCenterLink/workedit" class="opennav">投稿管理</a>
						</dt>
					</dl>
				</div>
				<div class="personalCenter_main_right edit_main">
					<div class="mainbox mood_main">
						<div class="admintitle spacetitle">
							<span>信息设置</span>
						</div>
						<div class="onebox">
							<div class="admintitle edit_sec">
								<a href="personalCenterLink/admin_infoEdit">基本信息</a>
								<a href="personalCenterLink/iconUpload" class="active">上传头像</a>
							</div>
							<div class="iconmake">
								<div class="container">
								  <div class="imageBox">
									<div class="thumbBox"></div>
									<div class="spinner" style="display: none">Loading...</div>
								  </div>
								  <div class="action"> 
									<div class="new-contentarea tc"> 
										<a href="javascript:void(0)" class="upload-img">
											<span>上传图像</span>
									 	</a>
									  <input type="file" class="" name="upload-file" id="upload-file" />
									</div>
									<input type="button" id="btnCrop"  class="Btnsty_peyton" value="裁切">
									<input type="button" id="btnZoomIn" class="Btnsty_peyton" value="+"  >
									<input type="button" id="btnZoomOut" class="Btnsty_peyton" value="-" >
								  </div>
								  <form class="iconform" method="post">
								  	<div class="cropped"></div>
								  </form>
								  <input type="button" class="iconsubmit" value="提交" />
								</div>
							</div> 
						</div>
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
