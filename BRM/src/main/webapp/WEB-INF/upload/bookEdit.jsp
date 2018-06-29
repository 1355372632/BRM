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
<title>我的空间-书籍修改</title>
		<link rel="stylesheet" href="css/ZR.css" />
		<link rel="stylesheet" href="css/reg.css" />
		<link rel="stylesheet" href="css/pCenter.css" />
		<link rel="stylesheet" href="css/pindex.css" />
		<link rel="stylesheet" href="css/workedit.css" />
		<link rel="stylesheet" href="css/iconupload.css" />
		<link rel="stylesheet" href="css/newbook.css" />
		<link rel="stylesheet" type="text/css" href="../css/bookedit.css"/>
		<script type="text/javascript" src="js/jquery-1.11.0.min.js"></script>
		<script type="text/javascript" src="js/cropbox.js"></script>
		<script type="text/javascript" src="js/bookedit.js"></script>
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
				<<div class="reg_title">
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
							<img src="img/login/bg.jpg" />
						</div>
						<div class="adminname fontpart">${user.userinfo.uName }</div>
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
								<a href="personalCenterLink/admin_infoEdit">信息设置</a>
								<a href="personalCenterLink/passwd" style="color: hotpink;">安全管理</a>
							</div>
						</dt>
						<dt>
							<a href="personalCenterLink/workedit" class="opennav">投稿管理</a>
						</dt>
					</dl>
				</div>
				<div class="personalCenter_main_right">
					<div class="mainbox">
						<div class="admintop">
							<div class="admintopname">
								bookName
							</div>
							<div class="admintopmsg">
							</div>
						</div>
						<div class="admintitle infotitle">
							<span>封面修改</span>
						</div>
						<div class="admininfo workinfo">
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
									<input type="button" id="btnZoomIn" class="Btnsty_peyton" value="+">
									<input type="button" id="btnZoomOut" class="Btnsty_peyton" value="-">
								</div>
								<div class="cropped"></div>
								<input type="button" class="booksubmit" value="确认封面" onclick="this.form.submit()" />
							</div>
							<div class="intro-edit">
								<div class="block-name">
									<span>简介修改</span>
								</div>
								<div class="intro-form">
									<form class="introform">
										<p>
											<textarea class="introedit"></textarea>
										</p>
										<input type="submit" value="确认修改" class="button" />
									</form>
								</div>
							</div>
							<div class="chap-edit">
								<div class="block-name">
									<span>章节修改</span>
								</div>
								<div class="chap-list">
									<h3>正文</h3>
									<dl>
										<dt data-rid="1">
												<a href="read.html">第一章</a>
											</dt>
										<dt data-rid="2">
												<a href="javascript:">第二章</a>
											</dt>
										<dt data-rid="3">
												<a href="javascript:">第三章</a>
											</dt>
										<dt data-rid="4">
												<a href="javascript:">第四章</a>
											</dt>
										<dt data-rid="5">
												<a href="javascript:">第五章</a>
											</dt>
										<dt data-rid="6">
												<a href="javascript:">第六章</a>
											</dt>
										<dt data-rid="7">
												<a href="javascript:">第七章</a>
											</dt>
										<dt data-rid="8">
												<a href="javascript:">第八章</a>
											</dt>
									</dl>
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