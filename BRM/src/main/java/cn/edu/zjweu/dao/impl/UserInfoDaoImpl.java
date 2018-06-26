package cn.edu.zjweu.dao.impl;

import org.apache.ibatis.session.SqlSession;
import org.apache.ibatis.session.SqlSessionFactory;
import org.mybatis.spring.support.SqlSessionDaoSupport;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.beans.factory.annotation.Qualifier;
import org.springframework.stereotype.Repository;

import cn.edu.zjweu.dao.UserInfoDao;
import cn.edu.zjweu.entity.UserInfo;
/**
 * 
* @ClassName: UserInfoDaoImpl
* @Description:用户信息接口实现类
* @author: zerok
* @date: 2018年6月26日 上午8:49:36
*
 */
@Repository("userinfodao")
public class UserInfoDaoImpl extends SqlSessionDaoSupport implements UserInfoDao {

	
	@Autowired
	@Qualifier("sqlSessionFactory")//消除歧义，找到指定的bean
	
	public void setSqlSessionFactory(SqlSessionFactory sqlSessionFactory) {
		super.setSqlSessionFactory(sqlSessionFactory);
	}
	/**
	 * 
	* <p>Title: getUserInfo</p>
	* <p>Description: 根据用户id获取用户信息</p>
	* @param userid
	* @return 用户实体
	* @see cn.edu.zjweu.dao.UserInfoDao#getUserInfo(java.lang.String)
	 */
	@Override
	public UserInfo getUserInfo(String userid) {
		SqlSession sqlSession = this.getSqlSession();
		UserInfo uinfo = sqlSession.selectOne("getUserInfo", userid);
		return uinfo;
	}
	/**
	 * 
	* <p>Title: addUserInfo</p>
	* <p>Description: 添加用户信息</p>
	* @param userinfo
	* @return 
	* @see cn.edu.zjweu.dao.UserInfoDao#addUserInfo(cn.edu.zjweu.entity.UserInfo)
	 */
	@Override
	public boolean addUserInfo(UserInfo userinfo) {
		SqlSession sqlSession = this.getSqlSession();
		int flag = sqlSession.insert("addUserInfo", userinfo);
		return flag>0?true:false;
	}
	/**
	 * 
	* <p>Title: editUserInfo</p>
	* <p>Description: 修改用户信息</p>
	* @param userinfo
	* @return
	* @see cn.edu.zjweu.dao.UserInfoDao#editUserInfo(cn.edu.zjweu.entity.UserInfo)
	 */
	@Override
	public boolean editUserInfo(UserInfo userinfo) {
		SqlSession sqlSession = this.getSqlSession();
		System.out.println(userinfo.toString());
		boolean flag = sqlSession.update("editUserInfo", userinfo)>0?true:false;
		return flag;
	}
	/**
	 * 
	* <p>Title: delUserInfo</p>
	* <p>Description: 删除用户信息</p>
	* @param uInfoID
	* @return
	* @see cn.edu.zjweu.dao.UserInfoDao#delUserInfo(int)
	 */
	@Override
	public boolean delUserInfo(int uInfoID) {
		SqlSession sqlSession = this.getSqlSession();
		int flag = sqlSession.update("delUserInfo", uInfoID);
		return flag>0?true:false;
	}
}
