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
		
	@Override
	public List<Users> getUser(int offset, int limit) {
		// TODO Auto-generated method stub
		return userdao.getUser(offset, limit);
	}

	@Override
	public boolean addUser(Users users) {
		// TODO Auto-generated method stub
		return userdao.addUser(users);
	}

	@Override
	public boolean delUser(String userid) {
		// TODO Auto-generated method stub
		return userdao.delUser(userid);
	}

	@Override
	public boolean editUser(Users users) {
		// TODO Auto-generated method stub
		return userdao.editUser(users);
	}

	@Override
	public Users getUserById(String userid) {
		// TODO Auto-generated method stub
		return userdao.getUserById(userid);
	}

	@Override
	public Users login(Users user) {
		// TODO Auto-generated method stub
		return userdao.login(user);
	}

}
