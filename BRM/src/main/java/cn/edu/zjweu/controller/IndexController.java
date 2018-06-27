package cn.edu.zjweu.controller;

import java.io.BufferedInputStream;
import java.io.BufferedOutputStream;
import java.io.BufferedWriter;
import java.io.File;
import java.io.FileInputStream;
import java.io.FileOutputStream;
import java.io.IOException;
import java.io.InputStream;
import java.io.OutputStreamWriter;
import java.net.URLEncoder;
import java.util.ArrayList;
import java.util.List;

import javax.annotation.Resource;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;

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
	@RequestMapping("download/{bookid}")
	public String download(@PathVariable int bookid,HttpServletRequest request,HttpServletResponse response){
		Book book= bookservice.getBookByBookID(bookid);
		book.setSections(sectionservice.getAllSectionByBid(bookid));
		
		try {
			createBookFile(book,request);
			down(book,request,response);
		} catch (Exception e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		}
		return "index";
		
	}
	
	public void createBookFile(Book book,HttpServletRequest request) {
		//创建文件
		String filename = book.getBookName()+".txt";//
		String path = request.getServletContext().getRealPath("/txt/");
		File file = new File(path); 
		if (!file.exists()) {
			file.mkdirs();
		}
		File txt = new File(file, filename);//在指定文件夹创建文件
		if (!txt.exists()) {
			try {
				txt.createNewFile();
				System.out.println();
			} catch (IOException e) {
				// TODO Auto-generated catch block
				e.printStackTrace();
			}
		}

		try {
			BufferedWriter bufferedWriter = new BufferedWriter(new OutputStreamWriter(new FileOutputStream(txt, false)));
			bufferedWriter.write("");//清空文件
			bufferedWriter = new BufferedWriter(new OutputStreamWriter(new FileOutputStream(txt, true))); // 追加
			/* bufferedWriter.write("jj"); */
			bufferedWriter.write("    "+book.getBookName());
			bufferedWriter.newLine();
			bufferedWriter.write("      "+"作者："+book.getBookAuthor());
			bufferedWriter.newLine();
			bufferedWriter.write("  简介："+book.getBookDesc());
			bufferedWriter.newLine();
			for(int i=0;i<book.getSections().size();i++){				
				bufferedWriter.write("第"+(i+1)+"章"+book.getSections().get(i).getSectionTitle());
				bufferedWriter.newLine();
				bufferedWriter.write("  "+book.getSections().get(i).getContent());
				bufferedWriter.newLine();
			}
			// 调用方法，将文本内容写如
			bufferedWriter.close();
			System.out.println("写入成功");
		} catch (IOException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		}
//		file.transferTo(new File(path + File.separator + filename));
System.out.println(file.getAbsolutePath());
	
	}
	public void down(Book book,HttpServletRequest request,HttpServletResponse response) throws Exception{
        //模拟文件，myfile.txt为需要下载的文件
        String fileName = request.getServletContext().getRealPath("/txt")+"/"+book.getBookName()+".txt";//
        //获取输入流
        InputStream bis = new BufferedInputStream(new FileInputStream(new File(fileName)));
        //假如以中文名下载的话
        String filename = book.getBookName()+".txt";
        //转码，免得文件名中文乱码
        filename = URLEncoder.encode(filename,"UTF-8");
        //设置文件下载头
        response.addHeader("Content-Disposition", "attachment;filename=" + filename);  
        //1.设置文件ContentType类型，这样设置，会自动判断下载文件类型  
        response.setContentType("multipart/form-data"); 
        BufferedOutputStream out = new BufferedOutputStream(response.getOutputStream());
        int len = 0;
        while((len = bis.read()) != -1){
            out.write(len);
            out.flush();
        }
        out.close();
    }

}
