package cn.edu.zjweu.controller;

import java.util.ArrayList;
import java.util.List;

import javax.annotation.Resource;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpSession;

import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.RequestMapping;

import cn.edu.zjweu.dao.BookDao;
import cn.edu.zjweu.entity.Book;
import cn.edu.zjweu.entity.Users;
@Controller
@RequestMapping("/personalCenterLink")
public class PersonalCenterLinkController {
@Resource
private BookDao bookdao;

	// 控制web-inf/personalCenter下连接的跳转
		@RequestMapping(value = "/{path}")
		public String skip(@PathVariable("path") String path,HttpServletRequest request) {
			HttpSession session=request.getSession();
			/*当链接是投稿管理时进行拦截
			 * 自定义跳转页面
			 * 
			 * */
			if(path.equals("admin-workedit")||path.equals("workedit")) {
				Users user=(Users)session.getAttribute("user");//得到全局变量，用户的登陆信息
				if(user.getuType()==1||user.getuType()==0) {//管理员
					//查询所有书籍
					System.out.println(user);
					List <Book>list=bookdao.getBooksByAuthor(user.getUserinfo().getuName(), 0, 6);
					request.setAttribute("userBooks", list);//返回获取书籍list
					return "personalCenter/admin-workedit" ;
				}else if(user.getuType()==2) {//用户
					System.out.println(user);
					List <Book>list=bookdao.getBooksByAuthor(user.getUserinfo().getuName(), 0, 6);
					request.setAttribute("userBooks", list);
					return "personalCenter/workedit" ;
				}
				
			}else if (path.equals("suggest")||path.equals("adminuser")||path.equals("adminbook")||path.equals("review")) {
				/**
				 * 当管理员点即时拦截，
				 * 并在此处获得内容
				 */
				if(path.equals("suggest")) {//获取推荐榜单
					List<Book>list=bookdao.getBooksByHits();
					List<Book> booklist=new ArrayList<>();
					//最多存取13个
					int j=(list.size()>12==true)?12:list.size();
					for(int i=0;i<j;i++) {
						booklist.add(list.get(i));
						System.out.println(list.get(i));
					}
					request.setAttribute("bangdan", booklist);
					
				}else if(path.equals("adminuser")) {//获取管理用户
					return "redirect:/userInfoController/adminuser";
				}else if(path.equals("adminbook")) {//获取书籍
					return "redirect:/userInfoController/adminbook";
				}else if(path.equals("review")) {//获取评论
					return "redirect:/userInfoController/adminreview";
					
				}
				
			}
			
			
			System.out.println(path);
			
			String Path = "personalCenter/" + path;//其他页面
			return Path;
		}

}