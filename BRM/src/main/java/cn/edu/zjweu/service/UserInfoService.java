package cn.edu.zjweu.service;



import org.apache.ibatis.annotations.Delete;
import org.apache.ibatis.annotations.Insert;
import org.apache.ibatis.annotations.Select;
import org.apache.ibatis.annotations.Update;

import cn.edu.zjweu.entity.UserInfo;
/**
 * 
* @ClassName: UserInfoService
* @Description: 用户信息Service
* @author: zerok
* @date: 2018年6月25日 上午11:02:47
*
 */
public interface UserInfoService {
	/**
	 * 
	* @Title: getUserInfo
	* @Description: 根据用户id查询用户
	* @param: @param userid
	* @param: @return 用户信息
	* @return: UserInfo
	* @throws
	 */
	public UserInfo getUserInfo(String userid);

	public boolean addUserInfo(UserInfo userinfo);
	/**
	 * 
	* @Title: editUserInfo
	* @Description: 修改用户信息
	* @param: @param userinfo
	* @param: @return true 修改成功，false 修改失败
	* @return: boolean
	* @throws
	 */
	public boolean editUserInfo(UserInfo userinfo);
	/**
	 * 
	* @Title: delUserInfo
	* @Description: 删除用户
	* @param: @param uInfoID
	* @param: @return
	* @return: boolean
	* @throws
	 */
	public boolean delUserInfo(int uInfoID);
}
