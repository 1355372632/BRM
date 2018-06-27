package cn.edu.zjweu.controller;

import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.RequestMapping;

@Controller
@RequestMapping("/uploadLink")
public class UploadLinkController {

	// 控制web-inf/personalCenter下连接的跳转

	@RequestMapping(value = "/{path}")
	public String skip(@PathVariable("path") String path) {
		String Path = "upload/" + path;
		return Path;

	}
}
