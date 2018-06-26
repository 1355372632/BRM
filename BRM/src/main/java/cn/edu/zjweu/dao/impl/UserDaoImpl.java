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
	/**
	 * 
	* <p>Title: getUser</p>
	* <p>Description: 获取用户并分页</p>
	* @param offset 当前页数
	* @param limit 最大数据量
	* @return
	* @see cn.edu.zjweu.dao.UserDao#getUser(int, int)
	 */
	@Override
	public List<Users> getUser(int offset, int limit) {
		SqlSession sqlSession = this.getSqlSession();
		RowBounds rowBounds =new RowBounds(offset, limit);
		List<Users> ulist = null;
		ulist=sqlSession.selectList("getUser", rowBounds);
		return ulist;
	}
	/**
	 * 
	* <p>Title: addUser</p>
	* <p>Description: 添加用户</p>
	* @param users
	* @return
	* @see cn.edu.zjweu.dao.UserDao#addUser(cn.edu.zjweu.entity.Users)
	 */
	@Override
	public boolean addUser(Users users) {
		SqlSession sqlSession = this.getSqlSession();
		boolean flag = (sqlSession.update("addUser", users)>0?true:false)&&(userinfodao.addUserInfo(users.getUserinfo()));
		if(!flag)
			sqlSession.rollback();
		return flag;
	}
	/**
	 * 
	* <p>Title: delUser</p>
	* <p>Description: 删除用户</p>
	* @param userid 用户ID
	* @return
	* @see cn.edu.zjweu.dao.UserDao#delUser(java.lang.String)
	 */
	@Override
	public boolean delUser(String userid) {
		SqlSession sqlSession = this.getSqlSession();
		int flag = sqlSession.delete("delUser", userid);
		return flag>0?true:false;
	}
	/**
	 * 
	* <p>Title: editUser</p>
	* <p>Description: 编辑用户</p>
	* @param users
	* @return
	* @see cn.edu.zjweu.dao.UserDao#editUser(cn.edu.zjweu.entity.Users)
	 */
	@Override
	public boolean editUser(Users users) {
		SqlSession sqlSession = this.getSqlSession();
		boolean flag = (sqlSession.update("editUser", users)>0?true:false);
		if(!(userinfodao.editUserInfo(users.getUserinfo())&&flag))
			sqlSession.rollback();
		return flag;
	}
	/**
	 * 
	* <p>Title: getUserById</p>
	* <p>Description: 通过id查找用户</p>
	* @param userid
	* @return
	* @see cn.edu.zjweu.dao.UserDao#getUserById(java.lang.String)
	 */
	@Override
	public Users getUserById(String userid) {
		SqlSession sqlSession = this.getSqlSession();
		Users users = sqlSession.selectOne("getUserById", userid);
		users.setUserinfo(userinfodao.getUserInfo(userid));
		return users;
	}
	/**
	 * 
	* <p>Title: login</p>
	* <p>Description: 用户登录</p>
	* @param user
	* @return
	* @see cn.edu.zjweu.dao.UserDao#login(cn.edu.zjweu.entity.Users)
	 */
	@Override
	public Users login(Users user) {
		SqlSession sqlSession = this.getSqlSession();
		Users u = null;
		u=sqlSession.selectOne("login",user);
		return u;
	}

}
