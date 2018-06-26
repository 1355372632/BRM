package cn.edu.zjweu.dao.impl;

import java.util.List;

import org.apache.ibatis.session.SqlSession;
import org.apache.ibatis.session.SqlSessionFactory;
import org.mybatis.spring.support.SqlSessionDaoSupport;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.beans.factory.annotation.Qualifier;
import org.springframework.stereotype.Repository;

import cn.edu.zjweu.dao.BookTypeDao;
import cn.edu.zjweu.entity.BookType;


@Repository("booktypedao")
public class BookTypeDaoImpl extends SqlSessionDaoSupport implements BookTypeDao {
	
	@Autowired
	@Qualifier("sqlSessionFactory")//消除歧义，找到指定的bean
	
	public void setSqlSessionFactory(SqlSessionFactory sqlSessionFactory) {
		super.setSqlSessionFactory(sqlSessionFactory);
	}
	


	@Override
	public List<BookType> getAllType() {
		SqlSession sqlSession = this.getSqlSession();
		List<BookType> btList = sqlSession.selectList("getAllType");
		return btList;
	}

}
