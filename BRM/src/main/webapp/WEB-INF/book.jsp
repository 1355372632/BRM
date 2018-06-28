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
							<a href="light.jsp"><span>轻小说</span></a>
						</dt>
						<dt>
							<a href="web.jsp"><span>网络小说</span></a>
						</dt>
						<dt>
							<a href="literature.jsp"><span>文学作品</span></a>
						</dt>
						<dt>
							<a href="personalCenter/admin_index.html"><span>个人中心</span></a>
							<dl class="sub">
								<dt><a href="login.jsp"><span>登录</span></a></dt>
						<dt><a href="reg.jsp"><span>注册</span></a></dt>
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
								<span>${book.bookName}</span>
								<span class="bookauthor"><a href="#">${book.bookAuthor}</a>著</span>
							</h1>
						<span class="book-desc">${book.bookDesc}</span>
						<div class="bookbtn">
							<input class="book-btn book-read" type="button" value="点击阅读" onclick="location.href='main/read/0'"/>
							<input class="book-btn book-download" type="button" value="下载" onclick="location.href='main/download/${book.bookID}'"/>
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
						<c:forEach var="section" items="${book.sections}" varStatus="vs">
						<dt data-rid="${vs.index}">
								<a href="main/read/${vs.index}">第${vs.index+1}章  ${section.sectionTitle}</a>
							</dt>
						</c:forEach>
					</dl>
				</div>
				<div class="review">
					<dl class="revnav">
						<dt><a href="javascript:">全部(666)</a><a class="sendrev" href="new_review.html">我要发帖</a></dt>
					</dl>
					<dl class="rev-text">
					<c:forEach var="c" items="${comment}" varStatus="vs">
						<dt class="review-post">
							<div class="usericon">
								<img src="img/login/bg.jpg" />
							</div>
							<div class="revpart" >
								<a class="username" href="javascript:">${c.cUser.userinfo.uName }</a>&nbsp;<span>发表了帖子</span>
								<div class="textpost">
									<a class="answer" href="main/review/${vs.index}">
										${c.content }										
									</a>
								</div>
								<p></p>
								<div class="flo">
									<span class="date">${c.commentDate }</span>
									<a class="answer" href="review.html"><span>${c.comment.size()}条回复</span></a>
								</div>
								<div class="todo">
									<a class="report" href="javascript:"><span>举报</span></a>
									<a class="collect" href="javascript:"><span>收藏</span></a>
								</div>
							</div>
						</dt>
						</c:forEach>
					</dl>
				</div>
			</div>
		</div>
	</body>

</html>