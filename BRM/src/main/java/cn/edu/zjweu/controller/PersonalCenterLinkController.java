package cn.edu.zjweu.controller;

import javax.annotation.Resource;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpSession;

import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.RequestMapping;

import cn.edu.zjweu.entity.Users;
@Controller
@RequestMapping("/personalCenterLink")
public class PersonalCenterLinkController {

	//
	// 控制web-inf/personalCenter下连接的跳转
		@RequestMapping(value = "/{path}")
		public String skip(@PathVariable("path") String path,HttpServletRequest request) {
			HttpSession session=request.getSession();
			if(path.equals("admin-workedit")||path.equals("workedit")) {
				Users user=(Users)session.getAttribute("user");
				if(user.getuType()==1||user.getuType()==0) {//管理员
					
					return "personalCenter/admin-workedit" ;
				}else if(user.getuType()==2) {//用户
					return "personalCenter/workedit" ;
				}
			}
			System.out.println(path);
			
			String Path = "personalCenter/" + path;//其他页面
			return Path;
		}

}