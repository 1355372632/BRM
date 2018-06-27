package cn.edu.zjweu.controller;

import java.util.HashMap;
import java.util.Map;

import javax.annotation.Resource;
import javax.servlet.http.HttpServletRequest;

import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.ModelAttribute;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.ResponseBody;

import com.alibaba.fastjson.JSONObject;

import cn.edu.zjweu.dao.UserDao;
import cn.edu.zjweu.entity.Users;

@Controller
@RequestMapping("/user")
public class UserController { 
	@Resource // 注入bean，相当于new一个对象
	private UserDao userdao;
	
	@ModelAttribute
	public void xyz(Model model){
		Users user = null;
		model.addAttribute("user",user);
		
	}
	@GetMapping("/{path}")
	public String login(@PathVariable("path") String path ){
		return path;
	}

	@RequestMapping("/dologin")
	@ResponseBody //必须加入的注解
	public JSONObject  dologin(String userID,String uPwd,HttpServletRequest request) {
		JSONObject json = new JSONObject();
		Users u = new Users();
		u.setUserID(userID);
		u.setuPwd(uPwd);
	    System.out.println(u.toString());
		Users user = userdao.login(u);
		if(user!=null)
			json.put("msg", true); 
		else	
			json.put("msg", false); 

	    return json;  
	}
	@RequestMapping("/userCheck")
	@ResponseBody //必须加入的注解
	public JSONObject  userCheck(String uid,HttpServletRequest request) {
		JSONObject json = new JSONObject();
		System.out.println(uid);
		Users user = userdao.getUserById(uid);
				if(user!=null)
			json.put("msg", true); 
		else	
			json.put("msg", false); 

	    return json;  
	}
	
	@RequestMapping("/doreg")
	@ResponseBody //必须加入的注解
	public JSONObject  userCheck(Users user,HttpServletRequest request) {
		JSONObject json = new JSONObject();
		boolean flag = userdao.addUser(user);
		if(flag)
			json.put("msg", true); 
		else	
			json.put("msg", false); 

	    return json;  
	}
}
