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
<title>欢迎来到宅人俱乐部，这是自娱自乐的小圈子论坛，希望各位能找到各自的乐趣</title>
		<link rel="stylesheet" href="css/ZR.css" type="text/css" />
		<link rel="stylesheet" href="css/index.css" type="text/css" />
		<link rel="stylesheet" href="css/slider.css" type="text/css" />
		<script type="text/javascript" src="js/jquery-1.11.0.min.js"></script>
		<script type="text/javascript" src="js/topstyle.js"></script>
		<script type="text/javascript" src="js/slider.js"></script>
		<script type="text/javascript">
		</script>
	</head>

	<body>
		<div class="box indexbox">
			<div class="bg"></div>
			<div class="top_box">
				<div class="top_bg"></div>
				<div id="logo"></div>
				<div class="menu_bg"></div>
				<div class="top_menu">
					<dl class="menu">
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
					<dt><a href="lianxi.jsp"><span>联系我们</span></a></dt>
					<dt>
							<a href="personalCenter/admin_index.html"><span>个人中心</span></a>
							<dl class="sub">
								<dt><a href="login.html"><span>登录</span></a></dt>
					<dt><a href="reg.html"><span>注册</span></a></dt>
					</dl>
					</dt>
					</dl>
				</div>
				<div class="search">
					<form id="do-search" action="/in" method="post">
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
			</div>

			<div class="main">
				<div id="mid">
					<div class="a_row">
						<div class="nov_light">
							<div class="trent-slider">
								<div class="t-slide current-t-slide">
									<div class="slide_left">
										<a href="book.html">
											<img src="img/main/cover/ngnl_cover.jpg" />
											<span><b>游戏人生</b></span>
										</a>
									</div>
									<div class="slide_mid">
										<a href="#" class="mid_1">
											<img src="img/main/cover/ngnl_cover.jpg" />
											<span><b>游戏人生</b></span>
										</a>
										<a href="#" class="mid_2">
											<img src="img/main/cover/ngnl_cover.jpg" />
											<span><b>游戏人生</b></span>
										</a>
										<a href="#" class="mid_3">
											<img src="img/main/cover/ngnl_cover.jpg" />
											<span><b>游戏人生</b></span>
										</a>
										<a href="#" class="mid_4">
											<img src="img/main/cover/ngnl_cover.jpg" />
											<span><b>游戏人生</b></span>
										</a>
									</div>
									<div class="slide_right">
										<a href="#" class="mid_4">
											<img src="img/main/cover/ngnl_cover.jpg" />
											<span><b>游戏人生</b></span>
										</a>
									</div>
								</div>
								<div class="t-slide">
									<div class="slide_left">
										<a href="book.html">
											<img src="img/main/cover/001.png" />
											<span><b>萝莉赛高</b></span>
										</a>
									</div>
									<div class="slide_mid">
										<a href="#" class="mid_1">
											<img src="img/main/cover/001.png" />
											<span><b>萝莉赛高</b></span>
										</a>
										<a href="#" class="mid_2">
											<img src="img/main/cover/001.png" />
											<span><b>萝莉赛高</b></span>
										</a>
										<a href="#" class="mid_3">
											<img src="img/main/cover/001.png" />
											<span><b>萝莉赛高</b></span>
										</a>
										<a href="#" class="mid_4">
											<img src="img/main/cover/001.png" />
											<span><b>萝莉赛高</b></span>
										</a>
									</div>
									<div class="slide_right">
										<a href="#" class="mid_4">
											<img src="img/main/cover/001.png" />
											<span><b>萝莉赛高</b></span>
										</a>
									</div>
								</div>
								<!--<div class="t-load-bar">
									<div class="inner-load-bar"></div>
								</div>-->
								<div class="arrow right-arrow">
									<div class="arrow-container">
										<div class="arrow-icon"><i class="fa fa-chevron-right" aria-hidden="true"></i></div>
									</div>
								</div>
								<div class="arrow left-arrow">
									<div class="arrow-container">
										<div class="arrow-icon"><i class="fa fa-chevron-left" aria-hidden="true"></i></div>
									</div>
								</div>
								<div class="t-dots-container">
									<div class="t-slide-dots-wrap">
										<div class="t-slide-dots">
										</div>
									</div>
								</div>
							</div>
						</div>
						<div class="order">
							<div class="title">
								<span>点击榜</span>
							</div>
							<dl>
								<c:forEach var="bh" items="${bookhits}">
								<dt><a href="main/book/${bh.bookID}"><span>${bh.bookName }</span></a></dt>
								</c:forEach>
							</dl>
						</div>
					</div>
					<div class="a_row">
						<div class="nov_online">
							<div class="online_bg"></div>
							<div class="online_contain">
								<div class="title">
									<span><b>※ &nbsp;</b></span>
									<span class="name">网络连载</span>
								</div>
								<dl>
									<dt>
										<div class="online_books">
											<a href="#">
												<img src="img/main/cover/001.png" />
												<p></p>
													<span class="book_title">萝莉的秘密</span>
											</a>
											<span class="author">咸鱼</span>
										</div>
										<div class="online_books">
											<a href="#">
												<img src="img/main/cover/001.png" />
												<p></p>
													<span class="book_title">萝莉的秘密</span>
											</a>
											<span class="author">咸鱼</span>
										</div>
										<div class="online_books">
											<a href="#">
												<img src="img/main/cover/001.png" />
												<p></p>
													<span class="book_title">萝莉的秘密</span>
											</a>
											<span class="author">咸鱼</span>
										</div>
										<div class="online_books">
											<a href="#">
												<img src="img/main/cover/001.png" />
												<p></p>
													<span class="book_title">萝莉的秘密</span>
											</a>
											<span class="author">咸鱼</span>
										</div>
									</dt>
								</dl>
							</div>
						</div>
						<div class="order" id="online_order">
							<div class="title">
								<span>新书榜</span>
							</div>
							<dl>
								<c:forEach var="bh" items="${bookcreat}">
								<dt><a href="main/book/${bh.bookID}"><span>${bh.bookName }</span></a></dt>
								</c:forEach>
							</dl>
						</div>
					</div>
					<div class="a_row">
						<div class="nov_online">
							<div class="online_bg"></div>
							<div class="online_contain">
								<div class="title">
									<span><b>※ &nbsp;</b></span>
									<span class="name">经典名著</span>
								</div>
								<dl>
									<dt>
										<div class="online_books">
											<a href="#">
												<img src="img/main/cover/001.png" />
												<p></p>
													<span class="book_title">萝莉的秘密</span>
											</a>
											<span class="author">咸鱼</span>
										</div>
										<div class="online_books">
											<a href="#">
												<img src="img/main/cover/001.png" />
												<p></p>
													<span class="book_title">萝莉的秘密</span>
											</a>
											<span class="author">咸鱼</span>
										</div>
										<div class="online_books">
											<a href="#">
												<img src="img/main/cover/001.png" />
												<p></p>
													<span class="book_title">萝莉的秘密</span>
											</a>
											<span class="author">咸鱼</span>
										</div>
										<div class="online_books">
											<a href="#">
												<img src="img/main/cover/001.png" />
												<p></p>
													<span class="book_title">萝莉的秘密</span>
											</a>
											<span class="author">咸鱼</span>
										</div>
									</dt>
								</dl>
							</div>
						</div>
						<div class="order" id="online_order">
							<div class="title">
								<span>完结榜</span>
							</div>
							<dl>
								<c:forEach var="bh" items="${bookend}">
								<dt><a href="main/book/${bh.bookID}"><span>${bh.bookName }</span></a></dt>
								</c:forEach>   
							</dl>
						</div>
					</div>
					<div class="a_row">
						<div class="nov_online">
							<div class="online_bg"></div>
							<div class="discussion_contain_left">
								<div class="title">
									<span><b>※ &nbsp;</b></span>
									<span class="name">最新资讯</span>
								</div>
								<div class="discussion">
									<dl>
										<dt><a href="#">震惊！大学宿舍晚上竟然干出这种事...666666</a></dt>
										<dt><a href="#">震惊！大学宿舍晚上竟然干出这种事...666666</a></dt>
										<dt><a href="#">震惊！大学宿舍晚上竟然干出这种事...666666</a></dt>
										<dt><a href="#">震惊！大学宿舍晚上竟然干出这种事...666666</a></dt>
										<dt><a href="#">震惊！大学宿舍晚上竟然干出这种事...666666</a></dt>
										<dt><a href="#">震惊！大学宿舍晚上竟然干出这种事...666666</a></dt>
										<dt><a href="#">震惊！大学宿舍晚上竟然干出这种事...666666</a></dt>
										<dt><a href="#">震惊！大学宿舍晚上竟然干出这种事...666666</a></dt>
										<dt><a href="#">震惊！大学宿舍晚上竟然干出这种事...666666</a></dt>
										<dt><a href="#">震惊！大学宿舍晚上竟然干出这种事...666666</a></dt>
									</dl>
								</div>
							</div>
							<div class="discussion_contain_right">
								<div class="title">
									<span><b>※ &nbsp;</b></span>
									<span class="name">最热讨论</span>
								</div>
								<div class="discussion">
									<dl>
										<dt><a href="#">震惊！大学宿舍晚上竟然干出这种事...666666</a></dt>
										<dt><a href="#">震惊！大学宿舍晚上竟然干出这种事...666666</a></dt>
										<dt><a href="#">震惊！大学宿舍晚上竟然干出这种事...666666</a></dt>
										<dt><a href="#">震惊！大学宿舍晚上竟然干出这种事...666666</a></dt>
										<dt><a href="#">震惊！大学宿舍晚上竟然干出这种事...666666</a></dt>
										<dt><a href="#">震惊！大学宿舍晚上竟然干出这种事...666666</a></dt>
										<dt><a href="#">震惊！大学宿舍晚上竟然干出这种事...666666</a></dt>
										<dt><a href="#">震惊！大学宿舍晚上竟然干出这种事...666666</a></dt>
										<dt><a href="#">震惊！大学宿舍晚上竟然干出这种事...666666</a></dt>
										<dt><a href="#">震惊！大学宿舍晚上竟然干出这种事...666666</a></dt>
									</dl>
								</div>
							</div>
						</div>
						<div class="order" id="online_order">
							<div class="title">
								<span>站长的推荐目录</span>
							</div>
							<dl>
								<dt><a href="#"><span>666</span></a></dt>
								<dt><a href="#"><span>666</span></a></dt>
								<dt><a href="#"><span>666</span></a></dt>
								<dt><a href="#"><span>666</span></a></dt>
								<dt><a href="#"><span>666</span></a></dt>
								<dt><a href="#"><span>666</span></a></dt>
								<dt><a href="#"><span>666</span></a></dt>
								<dt><a href="#"><span>666</span></a></dt>
								<dt><a href="#"><span>666</span></a></dt>
								<dt><a href="#"><span>666</span></a></dt>
							</dl>
						</div>
					</div>
				</div>
			</div>

			<span class="bottom">
				<div class="bottom_bg"></div>
				<div class="bottom_container">
					<dl>
						<dt id="botttom_about">
							<dl>
								<dt><span class="bottom_name">关于</span></dt>
			<dt>
									<span class="bottomText">
										<span><a href="#">666</a></span>
										<span><a href="#">666</a></span>
										<span><a href="#">666</a></span>
									</span>
								</dt>
			<dt>
									<span class="bottomText">
										<span><a href="#">666</a></span>
										<span><a href="#">666</a></span>
										<span><a href="#">666</a></span>
									</span>
								</dt>
			</dl>
			</dt>
			<dt id="botttom_upload">
							<dl>
								<dt><span class="bottom_name">投稿</span></dt>
			<dt>
									<span class="bottomText">
										<span><a href="#">666</a></span>
										<span><a href="#">666</a></span>
										<span><a href="#">666</a></span>
									</span>
								</dt>
			<dt>
									<span class="bottomText">
										<span><a href="#">666</a></span>
										<span><a href="#">666</a></span>
										<span><a href="#">666</a></span>
									</span>
								</dt>
			</dl>
			</dt>
			<dt id="botttom_declare">
							<dl>
								<dt><span class="bottom_name">宅人俱乐部版权所有</span></dt>
			<dt><span class="bottom_name">Copyright © 2005-2018 dmzj.com All Rights Reserved 京ICP备17012542号-2</span></dt>
			</dl>
			</dt>
			</dl>
		</div>
		</div>
		</div>
	</body>

</html>