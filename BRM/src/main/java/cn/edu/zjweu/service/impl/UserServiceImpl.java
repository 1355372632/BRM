package cn.edu.zjweu.service.impl;

import java.util.List;

import javax.annotation.Resource;

import org.springframework.stereotype.Repository;

import cn.edu.zjweu.dao.UserDao;
import cn.edu.zjweu.entity.Users;
import cn.edu.zjweu.service.UserService;
@Repository("userservice")
public class UserServiceImpl implements UserService {
	@Resource
	private UserDao userdao; 
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
		// TODO Auto-generated method stub
		return userdao.getUser(offset, limit);
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
		// TODO Auto-generated method stub
		return userdao.addUser(users);
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
		// TODO Auto-generated method stub
		return userdao.delUser(userid);
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
		// TODO Auto-generated method stub
		return userdao.editUser(users);
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
		// TODO Auto-generated method stub
		return userdao.getUserById(userid);
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
		// TODO Auto-generated method stub
		return userdao.login(user);
	}

}
