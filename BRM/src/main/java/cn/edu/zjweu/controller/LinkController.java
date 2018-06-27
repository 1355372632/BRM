package cn.edu.zjweu.controller;

import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.RequestMapping;

@Controller
@RequestMapping("/link")

// 控制web-inf下连接的跳转
public class LinkController {
	@RequestMapping(value = "/{path}")

	public String skip(@PathVariable("path") String path) {
		System.out.println(path);
		return path;
	}
}
