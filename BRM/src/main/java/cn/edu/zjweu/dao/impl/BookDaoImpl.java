package cn.edu.zjweu.dao.impl;

import java.util.List;

import org.apache.ibatis.session.RowBounds;
import org.apache.ibatis.session.SqlSession;
import org.apache.ibatis.session.SqlSessionFactory;
import org.mybatis.spring.support.SqlSessionDaoSupport;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.beans.factory.annotation.Qualifier;
import org.springframework.stereotype.Repository;

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
@Repository("bookdao")
public class BookDaoImpl  extends  SqlSessionDaoSupport implements BookDao {
	@Autowired
	@Qualifier("sqlSessionFactory")
	public void setSqlSessionFactory(SqlSessionFactory sqlSessionFactory) {
		super.setSqlSessionFactory(sqlSessionFactory);
	}
	
	@Override
	public List<Book> getAllBooks() {
		SqlSession sqlSession = this.getSqlSession();
		System.out.println("sqlsession地址"+sqlSession);
		List <Book> list=sqlSession.getMapper(BookDao.class).getAllBooks();
		return list;
	}

	@Override
	public List<Book> getBooksByBtid(int btid) {
		SqlSession sqlSession = this.getSqlSession();
		System.out.println("sqlsession地址"+sqlSession);
		List <Book> list=sqlSession.getMapper(BookDao.class).getBooksByBtid(btid);
		return list;
	}

	@Override
	public List<Book> getBooksLimitByBtid(int bTid, int begin, int end) {
		SqlSession sqlSession = this.getSqlSession();
		System.out.println("sqlsession地址"+sqlSession);
		
		List <Book> list=sqlSession.getMapper(BookDao.class).getBooksLimitByBtid(bTid,begin,end);
		return list;
	}

	@Override
	public boolean addBook(Book book) {
		SqlSession sqlSession = this.getSqlSession();
		System.out.println("sqlsession地址"+sqlSession);
		boolean bool=sqlSession.getMapper(BookDao.class).addBook(book);
		return bool;
	}

	@Override
	public boolean delBook(String bookid) {
		SqlSession sqlSession = this.getSqlSession();
		System.out.println("sqlsession地址"+sqlSession);
		boolean bool=(sqlSession.delete("delBook", bookid)==1)?true:false;
		System.out.println(bool);
		return bool;
	}

	/*
	 * (non-Javadoc)
	 * @see cn.edu.zjweu.dao.BookDao#editBook(cn.edu.zjweu.entity.Book)
	 * 此处可能会出现问题，因为没有写传入参数类型
	 */
	@Override
	public boolean editBook(Book book) {
		SqlSession sqlSession = this.getSqlSession();
		System.out.println("sqlsession地址"+sqlSession);
		boolean bool=sqlSession.getMapper(BookDao.class).editBook(book);
		return bool;
	}

	@Override
	public List<Book> getBooksByFuzzyName(String bookName,int begin,int end) {
		String name="%"+bookName+"%";
		System.out.println(name);
		SqlSession sqlSession = this.getSqlSession();
		System.out.println("sqlsession地址"+sqlSession);
		List <Book> list=sqlSession.getMapper(BookDao.class).getBooksByFuzzyName(name, begin, end);
		return list;
	}



	@Override
	public List<Book> getBooksByAuthor(String authorName, int offset, int limit) {
		SqlSession sqlSession = this.getSqlSession();
		System.out.println("sqlsession地址"+sqlSession);
		List <Book> list=sqlSession.selectList("getBooksByAuthor", authorName, new RowBounds(offset, limit));
		return list;
	}

	@Override
	public Book getBookByBookID(int bookid) {
		SqlSession sqlSession = this.getSqlSession();
		System.out.println("sqlsession地址"+sqlSession);
		Book book=sqlSession.getMapper(BookDao.class).getBookByBookID(bookid);
		return book;
	}

	@Override
	public int getBookHits(int bookID) {
		SqlSession sqlSession = this.getSqlSession();
		System.out.println("sqlsession地址"+sqlSession);
		System.out.println(bookID);
	//	int hits=sqlSession.getMapper(BookDao.class).getBookHits(bookID);
		int hits=sqlSession.selectOne("getBookHits", bookID);
		return hits;
	}

	/**
	 * 查询所有书籍
	 */


}
