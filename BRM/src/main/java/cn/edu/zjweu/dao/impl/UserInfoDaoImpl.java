package cn.edu.zjweu.dao.impl;

import org.apache.ibatis.session.SqlSession;
import org.apache.ibatis.session.SqlSessionFactory;
import org.mybatis.spring.support.SqlSessionDaoSupport;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.beans.factory.annotation.Qualifier;
import org.springframework.stereotype.Repository;

import cn.edu.zjweu.dao.UserInfoDao;
import cn.edu.zjweu.entity.UserInfo;

@Repository("UserInfoDao")
public class UserInfoDaoImpl extends SqlSessionDaoSupport implements UserInfoDao {

	
	@Autowired
	@Qualifier("sqlSessionFactory")
	public void setSqlSessionFactory(SqlSessionFactory sqlSessionFactory) {
		super.setSqlSessionFactory(sqlSessionFactory);
	}
	
	@Override
	public UserInfo getUserInfo(String userid) {
		System.out.println("userinfoservce+"+userid);
		SqlSession sqlSession = this.getSqlSession();
		UserInfo uinfo = sqlSession.selectOne("getUserInfo", userid);
		return uinfo;
	}
}
