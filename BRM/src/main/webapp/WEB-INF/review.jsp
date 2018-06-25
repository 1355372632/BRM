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
<title>评论区</title>
		<link rel="stylesheet" href="css/main.css" />
		<link rel="stylesheet" href="css/booklook.css" />
		<link rel="stylesheet" href="css/review-page.css" />
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
							<!--<dl class="sub">
								<dt><a href="#" title="站长小推荐"><span>站长小推荐</span></a></dt>
							<dt><a href="#" title="动画化相关"><span>动画化相关</span></a></dt>
							<dt><a href="#" title="经典回忆录"><span>经典回忆录</span></a></dt>
						</dl>-->
						</dt>
						<dt>
							<a href="#"><span>网络小说</span></a>
							<!--<dl class="sub">
								<dt><a href="#" title="站长小推荐"><span>站长小推荐</span></a></dt>
						<dt><a href="#" title="连载进行时"><span>连载进行时</span></a></dt>
						<dt><a href="#" title="完结回忆录"><span>完结回忆录</span></a></dt>
						</dl>-->
						</dt>
						<dt>
							<a href="#"><span>文学作品</span></a>
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
						<dt><a href="#"><span>联系我们</span></a></dt>
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
			<div class="main reviewmain">
				<div class="review-page">
					<dl class="rev-text">
						<dt class="review-post">
								<div class="usericon fl">
									<img src="img/login/bg.jpg" />
								</div>
								<div class="revpart" >
									<dl>
										<dt>
											<a class="username" href="javascript:">丸户史明</a>&nbsp;<span>发表了帖子</span>
											<div class="textpost">
												<span class="answer" href="javascript:">
												所以说一直就很喜欢志鸟村这种平淡中装逼的好书，但对于作者的短小无力我也是比较无奈的，像这种20来张的幼苗真的看了比没看还要闹心啊，有没有同类好书推荐一下，偏门一点的，比较火的基本都看过了。
												</span>
											</div>
											<p>
												<div class="flo">
													<span class="date">2018-05-24 18:20:59</span>
													<a class="answer" href="javascript:"><span>10条回复</span></a>
												</div>
												<div class="todo">
													<a class="report" href="javascript:"><span>举报</span></a>
													<a class="collect" href="javascript:"><span>收藏</span></a>
												</div>
											</p>
										</dt>
					</dl>
				</div>
				</dt>
				<dt class="review-post">
								<div class="usericon fl">
									<img src="img/login/bg.jpg" />
								</div>
								<div class="revpart" >
									<dl>
										<dt>
											<a class="username" href="javascript:">丸户史明</a>&nbsp;<span>发表了帖子</span>
											<div class="textpost">
												<span class="answer" href="javascript:">
												所以说一直就很喜欢志鸟村这种平淡中装逼的好书，但对于作者的短小无力我也是比较无奈的，像这种20来张的幼苗真的看了比没看还要闹心啊，有没有同类好书推荐一下，偏门一点的，比较火的基本都看过了。
												</span>
											</div>
											<p>
												<div class="flo">
													<span class="date">2018-05-24 18:20:59</span>
													<a class="answer" href="javascript:"><span>10条回复</span></a>
												</div>
												<div class="todo">
													<a class="report" href="javascript:"><span>举报</span></a>
													<a class="collect" href="javascript:"><span>收藏</span></a>
												</div>
											</p>
										</dt>
				</dl>
			</div>
			</dt>
			</dl>
			<div class="write-review">
				<form class="revform" action="" method="post">
					<div class="myinfo">
						<div class="icon">
							<a href="javascript:"><img src="img/login/bg.jpg" /></a>
						</div>
						<div class="name">
							<a href="javascript:"><b>丸户史明</b></a>
						</div>
					</div>
					<textarea class="commit" placeholder="请输入回复内容"></textarea>
					<div class="btn">
						<input id="submit" type="button" value="发表回复" onclick="this.form.submit()" />
					</div>
				</form>
			</div>
		</div>
		</div>
		</div>
	</body>

</html>