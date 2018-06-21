package cn.edu.zjweu.dao.impl;

import java.util.List;
import cn.edu.zjweu.dao.BookDao;
import cn.edu.zjweu.entity.Book;
/**
 * 
* @ClassName: BookDaoImpl
* @Description:书籍接口实现类
* @author: zerok
* @date: 2018年6月21日 上午10:17:31
*
 */

public class BookDaoImpl implements BookDao {

	@Override
	public List<Book> getAllBooks() {
		// TODO Auto-generated method stub
		return null;
	}

	@Override
	public List<Book> getBooksByBtid(int btid) {
		// TODO Auto-generated method stub
		return null;
	}

	@Override
	public List<Book> getBooksByBtid(int btid, int begin, int end) {
		// TODO Auto-generated method stub
		return null;
	}

	@Override
	public boolean addBook(Book book) {
		// TODO Auto-generated method stub
		return false;
	}

	@Override
	public boolean delBook(String bookid) {
		// TODO Auto-generated method stub
		return false;
	}

	@Override
	public boolean editBook(Book book) {
		// TODO Auto-generated method stub
		return false;
	}

	@Override
	public List<Book> getBooksByFuzzyName(String bookName) {
		// TODO Auto-generated method stub
		return null;
	}

	@Override
	public List<Book> getBooksByAuthor(String authorName) {
		// TODO Auto-generated method stub
		return null;
	}

	@Override
	public List<Book> getBooksByAuthor(String authorName, int begin, int end) {
		// TODO Auto-generated method stub
		return null;
	}

	@Override
	public Book getBookByBookID(String bookid) {
		// TODO Auto-generated method stub
		return null;
	}

	@Override
	public int getBookHits() {
		// TODO Auto-generated method stub
		return 0;
	}

}
