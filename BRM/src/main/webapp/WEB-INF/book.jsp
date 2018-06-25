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
<title>书籍简介</title>
		<link rel="stylesheet" href="css/main.css" />
		<link rel="stylesheet" href="css/booklook.css" />
		<script type="text/javascript" src="js/jquery-1.11.0.min.js"></script>
		<script type="text/javascript" src="js/clickEvent.js"></script>
	</head>

	<body>
		<div class="box bookbox">
			<div class="bg bookbg"></div>
			<div class="topbox booktop">
				<div class="menubox bookmenu">
					<div class="menubg bookmenubg"></div>
					<div class="menu">
						<dl>
							<dt><a href="index.html"><span>首页</span></a></dt>
							<dt>
							<a href="#"><span>轻小说</span></a>
						</dt>
						<dt>
							<a href="#"><span>网络小说</span></a>
						</dt>
						<dt>
							<a href="#"><span>文学作品</span></a>
						</dt>
						<dt>
							<a href="personalCenter/admin_index.html"><span>个人中心</span></a>
							<dl class="sub">
								<dt><a href="#"><span>登录</span></a></dt>
						<dt><a href="#"><span>注册</span></a></dt>
						</dl>
						</dt>
						</dl>
					</div>
					<div class="search">
						<form id="do-search" method="post" action="">
							<input type="text" class="searchText" placeholder="有什么想找的？试试看吧" />
							<a href="javascript:document.getElementById('do-search').submit()" class="serchlog">
								<img src="img/main/搜索框按钮图标.png" />
							</a>
						</form>
					</div>
				</div>
			</div>
			<div class="main bookmain">
				<div class="book-information">
					<div class="book-img">
						<img src="img/main/cover/ngnl_cover.jpg" />
					</div>
					<div class="book-info">
						<h1>
								<span>游戏人生</span>
								<span class="bookauthor"><a href="#">榎宫祐</a>著</span>
							</h1>
						<span class="book-desc">游戏兄妹闯荡异世界</span>
						<div class="bookbtn">
							<input class="book-btn book-read" type="button" value="点击阅读" />
							<input class="book-btn book-download" type="button" value="下载" />
						</div>
					</div>
				</div>
				<div class="readsec">
					<dl>
						<dt><a class="dec" href="javascript:">目录</a></dt>
						<dt><a class="rev" href="javascript:">作品讨论</a></dt>
					</dl>
				</div>
				<div class="derectory">
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
				<div class="review">
					<dl class="revnav">
						<dt><a href="javascript:">全部(666)</a><a class="sendrev" href="new_review.html">我要发帖</a></dt>
					</dl>
					<dl class="rev-text">
						<dt class="review-post">
							<div class="usericon">
								<img src="img/login/bg.jpg" />
							</div>
							<div class="revpart" >
								<a class="username" href="javascript:">丸户史明</a>&nbsp;<span>发表了帖子</span>
								<div class="textpost">
									<a class="answer" href="review.html">
										所以说一直就很喜欢志鸟村这种平淡中装逼的好书，但对于作者的短小无力我也是比较无奈的，像这种20来张的幼苗真的看了比没看还要闹心啊，有没有同类好书推荐一下，偏门一点的，比较火的基本都看过了。
									</a>
								</div>
								<p></p>
								<div class="flo">
									<span class="date">2018-05-24 18:20:59</span>
									<a class="answer" href="review.html"><span>10条回复</span></a>
								</div>
								<div class="todo">
									<a class="report" href="javascript:"><span>举报</span></a>
									<a class="collect" href="javascript:"><span>收藏</span></a>
								</div>
							</div>
						</dt>
						<dt class="review-post">
							<div class="usericon">
								<img src="img/login/bg.jpg" />
							</div>
							<div class="revpart" >
								<a class="username" href="javascript:">丸户史明</a>&nbsp;<span>发表了帖子</span>
								<div class="textpost">
									<a class="answer" href="javascript:">
									所以说一直就很喜欢志鸟村这种平淡中装逼的好书，但对于作者的短小无力我也是比较无奈的，像这种20来张的幼苗真的看了比没看还要闹心啊，有没有同类好书推荐一下，偏门一点的，比较火的基本都看过了。
								</a>
								</div>
								<p></p>
								<div class="flo">
									<span class="date">2018-05-24 18:20:59</span>
									<a class="answer" href="javascript:"><span>10条回复</span></a>
								</div>
								<div class="todo">
									<a class="report" href="javascript:"><span>举报</span></a>
									<a class="collect" href="javascript:"><span>收藏</span></a>
								</div>
							</div>
						</dt>
					</dl>
				</div>
			</div>
		</div>
	</body>

</html>