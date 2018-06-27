package cn.edu.zjweu.controller;

import java.util.ArrayList;
import java.util.List;

import javax.annotation.Resource;

import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.ModelAttribute;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.SessionAttributes;

import cn.edu.zjweu.entity.Book;
import cn.edu.zjweu.entity.Section;
import cn.edu.zjweu.entity.Users;
import cn.edu.zjweu.service.BookService;
import cn.edu.zjweu.service.SectionService;
import cn.edu.zjweu.service.UserService;

@Controller
@RequestMapping("/main")
@SessionAttributes("book")
public class IndexController {
	@Resource // 注入bean，相当于new一个对象
	private UserService userservice;
	@Resource
	private BookService bookservice;
	@Resource
	private SectionService sectionservice;
	
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
		List<Book> blist = new ArrayList<Book>();
		blist = bookservice.getBooksByHits();
		model.addAttribute("bookhits",blist);//点击榜
		blist = bookservice.getBooksByCreateDate();
		for(Book b: blist){
			System.out.println(b.getBookName()+""+b.getCreateDate());
		}
		model.addAttribute("bookcreat",blist);//新书榜
		blist = bookservice.getBooksByEndDate();
		for(Book b: blist){
			System.out.println(b.getBookName()+""+b.getEndDate());
		}
		model.addAttribute("bookend",blist);//完结榜
	}
	/**
	 * 
	* @Title: Index
	* @Description: 预跳转
	* @param: @return
	* @return: String
	* @throws
	 */
	@RequestMapping("index")
	public String Index(Model model){
		return "index";
	}
	@RequestMapping("book/{bookid}")
	public String book(@PathVariable int  bookid,Model model){
		Book book = bookservice.getBookByBookID(bookid);
		book.setSections(sectionservice.getAllSectionByBid(bookid));
		for(Section s:book.getSections())
		System.out.println(s.getSectionTitle());
		
		model.addAttribute("book",book);
		return "book";
	}
	@RequestMapping("read/{sid}")
	public String read(@PathVariable int  sid,Model model){
		model.addAttribute("sid", sid);
		return "read";
		
	}
}
