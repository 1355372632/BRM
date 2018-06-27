package cn.edu.zjweu.service.impl;

import java.util.List;

import javax.annotation.Resource;

import org.springframework.stereotype.Service;

import cn.edu.zjweu.dao.BookDao;
import cn.edu.zjweu.entity.Book;
import cn.edu.zjweu.service.BookService;

@Service(value = "bookservice")
public class BookServiceImpl implements BookService {
	@Resource
	private BookDao bookdao;



	@Override
	public List<Book> getBooksByBtid(int btid) {

		return bookdao.getBooksByBtid(btid);
	}

	@Override
	public List<Book> getBooksLimitByBtid(int btid, int begin, int end) {

		return bookdao.getBooksLimitByBtid(btid, begin, end);
	}

	@Override
	public boolean addBook(Book book) {

		return bookdao.addBook(book);
	}

	@Override
	public boolean delBook(int bookid) {
	
		return bookdao.delBook(bookid);
	}

	@Override
	public boolean editBook(Book book) {

		return bookdao.editBook(book);
	}

	@Override
	public List<Book> getBooksByFuzzyName(String bookName, int begin, int end) {

		return bookdao.getBooksByFuzzyName(bookName, begin, end);
	}

	@Override
	public List<Book> getBooksByAuthor(String authorName, int a, int b) {

		return bookdao.getBooksByAuthor(authorName, a, b);
	}

	@Override
	public Book getBookByBookID(int bookid) {

		return bookdao.getBookByBookID(bookid);
	}

	@Override
	public int getBookHits(int bookID) {
		
		return bookdao.getBookHits(bookID);
	}

	@Override
	public List<Book> getBooksByHits() {
		// TODO Auto-generated method stub
		return bookdao.getBooksByHits();
	}

	@Override
	public List<Book> getBooksByCreateDate() {
		// TODO Auto-generated method stub
		return bookdao.getBooksByCreateDate();
	}

	@Override
	public List<Book> getBooksByEndDate() {
		// TODO Auto-generated method stub
		return bookdao.getBooksByEndDate();
	}

}
