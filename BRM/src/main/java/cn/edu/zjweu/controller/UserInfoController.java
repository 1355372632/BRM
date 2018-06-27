package cn.edu.zjweu.controller;

import java.sql.Date;

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
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestParam;

import cn.edu.zjweu.dao.UserDao;
import cn.edu.zjweu.entity.UserInfo;
import cn.edu.zjweu.entity.Users;

@Controller
@RequestMapping("/userInfoController")

public class UserInfoController {
	@Resource
	private UserDao userdao;
	Users user = null;

	@ModelAttribute
	public void init() {
		user = userdao.getUserById("zerok");
	}

	//用户在admin_editInfo页面修改信息，
	//修改完成，跳回个人红心
	@PostMapping("editInfo")
	public String requestEditInfo(
			@RequestParam("name") String name,
			@RequestParam("sex") String sex,
			@RequestParam("marry" ) String marry,
			@RequestParam("birthyear") String year,
			@RequestParam("birthmonth") String month,
			@RequestParam("birthday") String birthday,
			@RequestParam("hobby") String hobby,
			HttpServletRequest request
			) {
		HttpSession session=request.getSession();
		Date uBirthDay=Date.valueOf(year+"-"+month+"-"+birthday);
		
		user=(Users) session.getAttribute("user");
		UserInfo userinfo=new UserInfo();
		userinfo.setuName(name);
		userinfo.setuSex(sex);
		userinfo.setuMarry(marry);
		userinfo.setuBirthDay(uBirthDay);
		userinfo.setuHobby(hobby);
		user.setUserinfo(userinfo);
		
		System.out.println(user.getUserID());
		System.out.println(user);
		boolean bool=userdao.editUser(user);
		return "personalCenter/admin_index";

	}

	
	//进入admin_index页面
	@GetMapping("user")
	public String requestIndex(HttpServletRequest request) {
		HttpSession session=request.getSession();
		session.setAttribute("user", user);
		return "personalCenter/admin_index";

	}
}
