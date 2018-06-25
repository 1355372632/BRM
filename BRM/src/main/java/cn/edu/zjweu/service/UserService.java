package cn.edu.zjweu.service;

import java.util.List;


import cn.edu.zjweu.entity.Users;
/**
 * 
* @ClassName: UserService
* @Description:用户Service
* @author: zerok
* @date: 2018年6月25日 上午11:02:35
*
 */
public interface UserService {
	/**
	 * 
	* @Title: getUser
	* @Description: 分页查询所有用户
	* @param: @param offset 当前页
	* @param: @param limit 限制数量
	* @param: @return 用户集合
	* @return: List<User>
	* @throws
	 */
	public List<Users> getUser(int offset,int limit);
	/**
	 * 
	* @Title: addUser
	* @Description: 添加用户
	* @param: @param user
	* @param: @return true 添加成功，false 添加失败
	* @return: boolean
	* @throws
	 */
	public boolean addUser(Users users);
	/**
	 * 
	* @Title: delUser
	* @Description: 删除用户
	* @param: @param userid 用户id
	* @param: @return true 删除成功，false 删除失败
	* @return: boolean
	* @throws
	 */
	public boolean delUser(String userid);
	/**
	 * 
	* @Title: editUser
	* @Description: 修改用户信息
	* @param: @param user
	* @param: @return true 修改成功，false 修改失败
	* @return: boolean
	* @throws
	 */
	public boolean editUser(Users users);
	/**
	 * 
	* @Title: getUserById
	* @Description: 根据Id查询用户
	* @param: @param userid
	* @param: @return 用户实体
	* @return: User
	* @throws
	 */
	public Users getUserById(String userid);
	/**
	 * 
	* @Title: login
	* @Description: 用户登录
	* @param: @param user
	* @param: @return 用户实体 登录成功，null 登录失败
	* @return: User
	* @throws
	 */
	public Users login(Users user);
}
