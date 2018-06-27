package cn.edu.zjweu.controller;

import javax.annotation.Resource;

import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.ModelAttribute;
import org.springframework.web.bind.annotation.RequestMapping;

import cn.edu.zjweu.dao.BookDao;
import cn.edu.zjweu.dao.UserDao;
import cn.edu.zjweu.entity.Users;

@Controller
@RequestMapping("/main")
public class IndexController {
	@Resource // 注入bean，相当于new一个对象
	private UserDao userdao;
	@Resource
	private BookDao bookdao;
	/**
	 * 
	* @Title: init
	* @Description: 用于存放属性
	* @param: @param model
	* @return: void
	* @throws
	 */
	@ModelAttribute
	public void init(Model model){
		Users user = null;
		model.addAttribute("user",user);
		
	}
	/**
	 * 
	* @Title: Index
	* @Description: 预跳转
	* @param: @return
	* @return: String
	* @throws
	 */
	public String Index(){
		return "index";
	}
}
