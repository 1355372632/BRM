package cn.edu.zjweu.service;

import java.util.List;

import cn.edu.zjweu.entity.Book;

public interface BookService {

	public List<Book> getBooksByHits();//获取所有书籍并根据点击量Hits 降序排列
	
	public List<Book> getBooksByCreateDate();//获取所有书籍并根据最近发布时间createDate 升序排列
	
	public List<Book> getBooksByEndDate();//获取所有书籍并根据完结时间ENDDATE 升序排列
	
	
	public List<Book> getBooksByBtid(int btid);//根据书籍类型查询
	
	
	public List<Book> getBooksLimitByBtid( int btid, int begin, int end);//根据书籍类型查询并分页查询
	
	
	public boolean addBook(Book book);//添加书籍	
	

	public boolean delBook(int  bookid);//删除书籍	
	
	
	public boolean editBook(Book book);//编辑书籍,修改书籍简介，完结日期，封面路径，是否完结
	
	 
	public List<Book> getBooksByFuzzyName( String bookName, int begin, int end);//根据模糊书名查询,fenye

	
	
	public List<Book> getBooksByAuthor(String authorName,int a,int b);//根据作者查询书籍，并进行分页查询
	
	
	public Book getBookByBookID(int bookid);	//根据书籍编号查询
	
	
	
	public int getBookHits(int bookID);//查询书籍点击量
}
