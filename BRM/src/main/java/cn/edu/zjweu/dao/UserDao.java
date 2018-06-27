package cn.edu.zjweu.dao;

import java.util.List;

import org.apache.ibatis.annotations.Delete;
import org.apache.ibatis.annotations.Insert;
import org.apache.ibatis.annotations.Select;
import org.apache.ibatis.annotations.Update;

import cn.edu.zjweu.entity.Users;

/**
 * 
* @ClassName: UserDao
* @Description:用户接口类
* @author: zerok
* @date: 2018年6月21日 下午2:41:26
*
 */
public interface UserDao {
//	@Select("select * from user")
//	public List<User> getAllUser();
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
	@Select("select * from users")
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
	@Insert("insert into users(userID,uPwd,uemail,uType) values(#{userID},#{uPwd},#{uEmail},2)")
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
	@Delete("delete from users where userid=#{userID}")
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
	@Update("update users set upwd=#{uPwd},uemail=#{uEmail},utype=#{uType} where userid=#{userID}")
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
	@Select("select * from users where userid=#{userID}")
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
	@Select("select * from users where userid=#{userID} and upwd=#{uPwd}")
	public Users login(Users user);
}
