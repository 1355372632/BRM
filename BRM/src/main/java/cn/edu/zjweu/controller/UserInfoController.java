package cn.edu.zjweu.controller;

import java.sql.Date;
import java.util.ArrayList;
import java.util.List;

import javax.annotation.PostConstruct;
import javax.annotation.Resource;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpSession;

import org.springframework.context.annotation.Scope;
import org.springframework.http.HttpRequest;
import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.ModelAttribute;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestParam;
import org.springframework.web.bind.annotation.ResponseBody;

import com.alibaba.fastjson.JSONObject;

import cn.edu.zjweu.dao.UserDao;
import cn.edu.zjweu.entity.Book;
import cn.edu.zjweu.entity.Comment;
import cn.edu.zjweu.entity.UserInfo;
import cn.edu.zjweu.entity.Users;
import cn.edu.zjweu.service.BookService;
import cn.edu.zjweu.service.CommentService;
import cn.edu.zjweu.service.UserService;

@Controller
@RequestMapping("/userInfoController")

public class UserInfoController {
	@Resource
	private UserService userservice;
	@Resource
	private BookService bookservice;
	@Resource
	private CommentService commentservice;

	Users user = null;

	@ModelAttribute
	public void init() {
		user = userservice.getUserById("zerok");
	}

	// 用户在admin_editInfo页面修改信息，
	// 修改完成，跳回个人红心
	@PostMapping("/editInfo")
	public String requestEditInfo(
			
			@RequestParam("sex") String sex,
			@RequestParam("marry") String marry,
			@RequestParam("birthyear") String year,
			@RequestParam("birthmonth") String month, 
			@RequestParam("birthday") String birthday,
			@RequestParam("hobby") String hobby,
			HttpServletRequest request) {
		HttpSession session = request.getSession();
		Date uBirthDay = Date.valueOf(year + "-" + month + "-" + birthday);

		user = (Users) session.getAttribute("user");
		System.out.println(user);
		UserInfo userinfo = user.getUserinfo();
		
	
		userinfo.setuSex(sex);
		userinfo.setuMarry(marry);
		userinfo.setuBirthDay(uBirthDay);
		userinfo.setuHobby(hobby);
		user.setUserinfo(userinfo);

		System.out.println(user.getUserID());
		System.out.println(user);
		
		boolean bool = userservice.editUser(user);
		
		return "personalCenter/admin_index";

	}

	// 进入admin_index页面
	@GetMapping("user")
	public String requestIndex(HttpServletRequest request) {
		HttpSession session = request.getSession();
		session.setAttribute("user", user);
		System.out.println(user);
		return "personalCenter/admin_index";

	}

	// 修改密码
	@PostMapping("/editpwd")
	@ResponseBody
	public JSONObject editpwd(HttpServletRequest request, String upwd1, String upwd2, String upwd3) {
		System.out.println("111111111111111111111111111");
		JSONObject json = new JSONObject();
		boolean bool = false;
		if (upwd1.equals(user.getuPwd())) {
			if (upwd2.equals(upwd3)) {
				user.setuPwd(upwd2);
				System.out.println(user);
				bool = userservice.editUser(user);
				System.out.println(bool);
			}
		}

		json.put("msg", bool);

		return json;

	}

	// 修改邮箱
	@PostMapping("/editemail")
	@ResponseBody
	public JSONObject editemail(HttpServletRequest request, String upwd, String email1, String email2) {
		System.out.println("111111111111111111111111111");
		JSONObject json = new JSONObject();
		boolean bool = false;
		if (upwd.equals(user.getuPwd()) && email1.equals(user.getuEmail())) {// 验证密码,youxiang
			user.setuEmail(email2);
			bool = userservice.editUser(user);
		}

		json.put("msg", bool);

		return json;

	}

	// 管理员查询所有用户
	@RequestMapping("/adminuser")
	public String adminuser(HttpServletRequest request) {
		int offset = 0;
		List<Users> list = userservice.getUser(offset, 10);
		List<Users> userlist = new ArrayList<>();
		for (int i = 0; i < list.size(); i++) {
			userlist.add(userservice.getUserById(list.get(i).getUserID()));
			System.out.println(userlist.get(i));
		}
		request.setAttribute("adminEditUser", userlist);
		return "personalCenter/adminuser";
	}

	// 管理员第一次查询所有书籍，默认是1类型的
	@RequestMapping("/adminbook")
	public String adminbook(HttpServletRequest request) {
		// int offset=0;
		List<Book> list = bookservice.getBooksLimitByBtid(1, 1, 6);//1-6数据
		List<Book> booklist = new ArrayList<>();

		// 最多存取6个
		int j = (list.size() > 6 == true) ? 6 : list.size();
		for (int i = 0; i < j; i++) {
			booklist.add(list.get(i));
			System.out.println(list.get(i));
		}
		System.out.println("addminbook---------");
		request.setAttribute("adminbooklist", booklist);
		request.setAttribute("pagenum", 6);//设置当前页码数
		System.out.println(booklist);
		return "personalCenter/adminbook";
	}
	
	//管理员查询所有书籍
	@RequestMapping("/adminbooklimit/{num}")//并获取当前页码
	public String adminbookLimit(HttpServletRequest request) {
		// int offset=0;
		List<Book> list = bookservice.getBooksLimitByBtid(1, 0, 6);//开始和结束页数
		List<Book> booklist = new ArrayList<>();

		// 最多存取6个
		int j = (list.size() > 6 == true) ? 6 : list.size();
		for (int i = 0; i < j; i++) {
			booklist.add(list.get(i));
			System.out.println(list.get(i));
		}
		System.out.println("addminbook---------");
		request.setAttribute("adminbooklist", booklist);
		System.out.println(booklist);
		return "personalCenter/adminbook";
	}
	
	//获取评论
	@RequestMapping("/adminreview")
	public String adminreview(Model model) {
		List<Comment>list=commentservice.getAllComments();
		model.addAttribute("Allcomment", list);
		return "personalCenter/review";
		
	}
	
	//删除评论
	@RequestMapping("/delcomment/{commentID}")
	public String delcomment(Model model,@PathVariable("commentID") String commentID) {
		int commentid=Integer.parseInt(commentID);
		commentservice.delComment(commentid);
		List<Comment>list=commentservice.getAllComments();
		
		model.addAttribute("Allcomment", list);
		return "personalCenter/review";
		
	}
	
	//删除用户
	@RequestMapping("/deluser/{userID}")
	public String deluser(@PathVariable("userID") String userID) {
		userservice.delUser(userID);
		return "personalCenter/adminuser";
		
	}
	
	//封禁用户，1
	@RequestMapping("/edituserstate/{userID}")
	public String edituserstate(@PathVariable("userID") String userID) {
		UserInfo userinfo=user.getUserinfo();
		userinfo.setuState(1);//
		user.setUserinfo(userinfo);
		userservice.editUser(user);
		
		return "personalCenter/adminuser";
		
	}
	
	//創建新书
	@PostMapping("/newbook")
	public String newbook(HttpServletRequest request) {
		String bookName=request.getParameter("bookName");
		int btid=Integer.parseInt(request.getParameter("type"));
		String desc=request.getParameter("bookdesc");
		//此处插入书籍
		Book book=new  Book(0, btid, bookName, user.getUserinfo().getuName(), desc, createDate, lastRead, endDate, bPicPath, hits, bookState)
			
		bookservice.addBook(book);//插入书籍
		return "personalCenter/workedit";
		
	}
	
}
