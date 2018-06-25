package cn.edu.zjweu.dao.impl;

import java.util.List;

import javax.annotation.Resource;

import org.apache.ibatis.session.RowBounds;
import org.apache.ibatis.session.SqlSession;
import org.apache.ibatis.session.SqlSessionFactory;
import org.mybatis.spring.support.SqlSessionDaoSupport;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.beans.factory.annotation.Qualifier;
import org.springframework.stereotype.Repository;

import cn.edu.zjweu.dao.UserDao;
import cn.edu.zjweu.dao.UserInfoDao;
import cn.edu.zjweu.entity.Users;
/**
 * 
* @ClassName: UserDaoImpl
* @Description:用户接口实现类
* @author: zerok
* @date: 2018年6月25日 上午9:27:48
*
 */
@Repository("userdao")
public class UserDaoImpl extends SqlSessionDaoSupport implements UserDao {
	
	@Autowired
	@Qualifier("sqlSessionFactory")//消除歧义，找到指定的bean
	
	public void setSqlSessionFactory(SqlSessionFactory sqlSessionFactory) {
		super.setSqlSessionFactory(sqlSessionFactory);
	}
	@Resource
	private UserInfoDao userinfodao;
	
	@Override
	public List<Users> getUser(int offset, int limit) {
		SqlSession sqlSession = this.getSqlSession();
		RowBounds rowBounds =new RowBounds(offset, limit);
		List<Users> ulist = null;
		ulist=sqlSession.selectList("getUser", rowBounds);
		return ulist;
	}

	@Override
	public boolean addUser(Users users) {
		SqlSession sqlSession = this.getSqlSession();
		boolean flag = (sqlSession.update("addUser", users)>0?true:false)&&(userinfodao.addUserInfo(users.getUserinfo()));
		if(!flag)
			sqlSession.rollback();
		return flag;
	}

	@Override
	public boolean delUser(String userid) {
		SqlSession sqlSession = this.getSqlSession();
		int flag = sqlSession.delete("delUser", userid);
		return flag>0?true:false;
	}

	@Override
	public boolean editUser(Users users) {
		SqlSession sqlSession = this.getSqlSession();
		boolean flag = (sqlSession.update("editUser", users)>0?true:false);
		if(!(userinfodao.editUserInfo(users.getUserinfo())&&flag))
			sqlSession.rollback();
		return flag;
	}

	@Override
	public Users getUserById(String userid) {
		SqlSession sqlSession = this.getSqlSession();
		Users users = sqlSession.selectOne("getUserById", userid);
		users.setUserinfo(userinfodao.getUserInfo(userid));
		return users;
	}

	@Override
	public Users login(Users user) {
		SqlSession sqlSession = this.getSqlSession();
		Users u = null;
		u=sqlSession.selectOne("login",user);
		return u;
	}

}
