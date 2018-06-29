package cn.edu.zjweu.dao.impl;

import java.util.List;

import javax.annotation.Resource;

import org.apache.ibatis.session.SqlSession;
import org.apache.ibatis.session.SqlSessionFactory;
import org.mybatis.spring.support.SqlSessionDaoSupport;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.beans.factory.annotation.Qualifier;
import org.springframework.stereotype.Repository;

import cn.edu.zjweu.dao.CommentDao;
import cn.edu.zjweu.entity.Comment;

@Repository("commentdao")
public class CommentDaoImpl extends SqlSessionDaoSupport implements CommentDao {
	@Autowired
	@Qualifier("sqlSessionFactory")
	public void setSqlSessionFactory(SqlSessionFactory sqlSessionFactory) {
		super.setSqlSessionFactory(sqlSessionFactory);
	}

	@Override
	public List<Comment> getAllComments() {
		SqlSession sqlSession = this.getSqlSession();
		System.out.println("sqlsession地址"+sqlSession);
		List<Comment >list=sqlSession.getMapper(CommentDao.class).getAllComments();
		return list;
	}

	@Override
	public List<Comment> getCommentsByBookId(int bookid) {
		SqlSession sqlSession = this.getSqlSession();
		System.out.println("sqlsession地址"+sqlSession);
		List<Comment >list=sqlSession.getMapper(CommentDao.class).getCommentsByBookId(bookid);
		return list;
	}

	@Override
	public List<Comment> getCommentsByInid(int inid) {
		SqlSession sqlSession = this.getSqlSession();
		System.out.println("sqlsession地址"+sqlSession);
		List<Comment >list=sqlSession.getMapper(CommentDao.class).getCommentsByInid(inid);
		return list;
	}

	@Override
	public boolean addComment(Comment comment) {
		SqlSession sqlSession = this.getSqlSession();
		System.out.println("sqlsession地址"+sqlSession);
		boolean bool=sqlSession.getMapper(CommentDao.class).addComment(comment);
		return bool;
	}

	@Override
	public int getCommentHits() {
		SqlSession sqlSession = this.getSqlSession();
		System.out.println("sqlsession地址"+sqlSession);
		return sqlSession.getMapper(CommentDao.class).getCommentHits();
	}

	@Override
	public int delComment(int commentID) {
		SqlSession sqlSession = this.getSqlSession();
		System.out.println("sqlsession地址"+sqlSession);
		return sqlSession.getMapper(CommentDao.class).delComment(commentID);
	}

}
