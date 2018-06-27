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
<title>第${sid}章 ${book.sections[sid].sectionTitle}</title>
		<link rel="stylesheet" href="css/main.css" />
		<link rel="stylesheet" href="css/booklook.css" />
		<link rel="stylesheet" href="css/read.css" />
		<script type="text/javascript" src="js/jquery-1.11.0.min.js"></script>
		<script type="text/javascript" src="js/clickEvent.js"></script>
	</head>

	<body>
	<c:if test="${sid<0||sid>=book.sections.size()}" >
		<jsp:forward page="../main/book/${book.bookID}"></jsp:forward>
	</c:if>
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
							<!--<dl class="sub">
								<dt><a href="#" title="站长小推荐"><span>站长小推荐</span></a></dt>
							<dt><a href="#" title="动画化相关"><span>动画化相关</span></a></dt>
							<dt><a href="#" title="经典回忆录"><span>经典回忆录</span></a></dt>
						</dl>-->
						</dt>
						<dt>
							<a href="light.jsp"><span>网络小说</span></a>
							<!--<dl class="sub">
								<dt><a href="#" title="站长小推荐"><span>站长小推荐</span></a></dt>
						<dt><a href="#" title="连载进行时"><span>连载进行时</span></a></dt>
						<dt><a href="#" title="完结回忆录"><span>完结回忆录</span></a></dt>
						</dl>-->
						</dt>
						<dt>
							<a href="literature.jsp"><span>文学作品</span></a>
							<!--<dl class="sub">
								<dt><a href="#" title="文艺故事会"><span>文艺故事会</span></a></dt>
						<dt><a href="#" title="哲学讨论组"><span>哲学讨论组</span></a></dt>
						<dt><a href="#" title="人物传奇史"><span>人物传奇史</span></a></dt>
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
						<dt><a href="lianxi.jsp"><span>联系我们</span></a></dt>
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
			<a href="javascript:" class="toTop">
				<span>︽</span>
				<span>TOP</span>
			</a>
			<div class="main bookmain readmain">
				<h1 class="chapname">第${sid+1}章  ${book.sections[sid].sectionTitle}</h1>
				<div class="readsec">
					<a href="main/read/${sid-1}" class="btn prevbtn">上一章</a>
					<a href="main/book/${book.bookID }" class="btn returndec">目录</a>
					<a href="main/read/${sid+1}" class="btn nextbtn">下一章</a>
				</div>
				<div class="content">
					<p>${book.sections[sid].content}
					</p>
				</div>
				<div class="readsec">
					<a href="main/read/${sid-1}" class="btn prevbtn">上一章</a>
					<a href="main/book/${book.bookID }" class="btn returndec">目录</a>
					<a href="main/read/${sid+1}" class="btn nextbtn">下一章</a>
				</div>
				</div>
			</div>
		</div>
	</body>

</html>