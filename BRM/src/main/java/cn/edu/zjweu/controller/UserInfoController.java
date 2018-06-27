package cn.edu.zjweu.controller;

import javax.annotation.Resource;

import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestParam;

import cn.edu.zjweu.dao.UserDao;
import cn.edu.zjweu.entity.Users;

@Controller
@RequestMapping("/userInfoController")
public class UserInfoController {
	@Resource
	private  UserDao userdao;
	
	@PostMapping("editInfo")
	public String requestEditInfo(@RequestParam("name") String name) {
		
		return null;
		
	}
	

}
