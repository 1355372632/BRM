package cn.edu.zjweu.dao;

import java.util.List;

import cn.edu.zjweu.entity.User;

/**
 * 
* @ClassName: UserDao
* @Description:用户接口类
* @author: zerok
* @date: 2018年6月21日 下午2:41:26
*
 */
public interface UserDao {

	public List<User> getAllUser();
	
	public List<User> getUser(int begin,int end);
	
	public boolean addUser(User user);
	
	public boolean delUserByUid(String userid);
	
	public boolean editUser(User user);
	
	public User getUserById(String userid);
	
	public boolean login(User user);
}
