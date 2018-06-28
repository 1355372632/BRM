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
import cn.edu.zjweu.entity.UserInfo;
import cn.edu.zjweu.entity.Users;
/**
 * 
* @ClassName: UserController
* @Description:用户控制器
* @author: zerok
* @date: 2018年6月27日 上午8:57:36
*
 */
@Controller
@RequestMapping("/user")
public class UserController { 
	@Resource // 注入bean，相当于new一个对象
	private UserDao userdao;

	/**
	 * 
	* @Title: path
	* @Description: 根据路径名跳转各个页面
	* @param: @param path
	* @param: @return
	* @return: String
	* @throws
	 */
	@GetMapping("/{path}")
	public String path(@PathVariable("path") String path ){
		return path;
	}
	/**
	 * 
	* @Title: dologin
	* @Description:  登录操作
	* @param: @param userID
	* @param: @param uPwd
	* @param: @param request
	* @param: @return
	* @return: JSONObject
	* @throws
	 */
	@RequestMapping("/dologin")
	@ResponseBody //必须加入的注解
	public JSONObject  dologin(String userID,String uPwd,HttpServletRequest request,Model model) {
		JSONObject json = new JSONObject();
		Users u = new Users();
		u.setUserID(userID);
		u.setuPwd(uPwd);
	    System.out.println(u.toString());
		Users user = userdao.login(u);
		if(user!=null){
			json.put("msg", true);
			model.addAttribute("user",user);
		
		} 
		else	
			json.put("msg", false); 

	    return json;  
	}
	/**
	 * 
	* @Title: userCheck
	* @Description: 检查用户是否存在
	* @param: @param uid
	* @param: @param request
	* @param: @return true 存在，false 不存在
	* @return: JSONObject
	* @throws
	 */
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
	/**
	 * 
	* @Title: doreg
	* @Description: 注册操作
	* @param: @param user
	* @param: @param request
	* @param: @return
	* @return: JSONObject
	* @throws
	 */
	@RequestMapping("/doreg")
	@ResponseBody //必须加入的注解
	public JSONObject  doreg(Users user,String uName,HttpServletRequest request,Model model) {
		JSONObject json = new JSONObject();
		UserInfo ui =new UserInfo(0,user.getUserID(),uName,2,"img\725814.png","暂无描述","男","未婚",java.sql.Date.valueOf("1990-01-01"),"暂无");
		ui.setuName(uName);
		ui.setUserID(user.getUserID());
		user.setUserinfo(ui);
		System.out.println(user.toString());
		boolean flag = userdao.addUser(user);
		if(flag){
			json.put("msg", true);
			model.addAttribute("user", user);
		} 
		else	
			json.put("msg", false); 

	    return json;  
	}
}
