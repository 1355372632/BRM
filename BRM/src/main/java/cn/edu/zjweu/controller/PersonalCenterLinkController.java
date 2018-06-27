package cn.edu.zjweu.controller;

import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.RequestMapping;
@Controller
@RequestMapping("/personalCenterLink")
public class PersonalCenterLinkController {


	// 控制web-inf/personalCenter下连接的跳转
		@RequestMapping(value = "/{path}")
		public String skip(@PathVariable("path") String path) {
			System.out.println(path);
			String Path = "personalCenter/" + path;
			return Path;
		}

}