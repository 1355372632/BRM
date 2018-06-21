package cn.edu.zjweu.dao;

import java.util.List;

import cn.edu.zjweu.entity.Book;

/**
 * 
* @ClassName: BookDao
* @Description:书籍接口类
* @author: zerok
* @date: 2018年6月21日 上午10:04:57
*
 */
public interface BookDao {
	
	public List<Book> getAllBooks();//获取所有书籍并根据点击量Hits 降序排列
	
	public List<Book> getBooksByBtid(int btid);//根据书籍类型查询
	
	public List<Book> getBooksByBtid(int btid,int begin,int end);//根据书籍类型查询并分页查询
	
	public boolean addBook(Book book);//编辑书籍	
	
	public boolean delBook(String bookid);//删除书籍	
	
	public boolean editBook(Book book);//编辑书籍
	
	public List<Book> getBooksByFuzzyName(String bookName);//根据模糊书名查询
	
	public List<Book> getBooksByAuthor(String authorName);//根据作者查询书籍
	
	public List<Book> getBooksByAuthor(String authorName,int begin,int end);//根据作者查询书籍，并进行分页查询
	
	public Book getBookByBookID(String bookid);	//根据书籍编号查询
	
	public int getBookHits();//查询书籍点击量
	
	
}
