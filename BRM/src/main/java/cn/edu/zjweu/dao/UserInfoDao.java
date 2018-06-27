package cn.edu.zjweu.dao;

import java.sql.Date;

import org.apache.ibatis.annotations.Delete;
import org.apache.ibatis.annotations.Insert;
import org.apache.ibatis.annotations.Param;
import org.apache.ibatis.annotations.Select;
import org.apache.ibatis.annotations.Update;

import cn.edu.zjweu.entity.UserInfo;
/**
 * 
* @ClassName: UserInfoDao
* @Description:用户信息接口
* @author: zerok
* @date: 2018年6月26日 上午8:48:35
*
 */
public interface UserInfoDao {
	/**
	 * 
	* @Title: getUserInfo
	* @Description: 根据用户id查询用户
	* @param: @param userid
	* @param: @return 用户信息
	* @return: UserInfo
	* @throws
	 */
	@Select("select * from userinfo where userid=#{userID}")
	public UserInfo getUserInfo(String userid);
	/**
	 * 
	* @Title: addUserInfo
	* @Description: 添加用户信息
	* @param: @param userinfo
	* @param: @return
	* @return: boolean
	* @throws
	 */
	@Insert("insert into userinfo(uInfoId,userId,uName,uState,uPicPath,uDesc,uSex,uMarry,uBirthDay,uHobby) values(userinfosequence.nextval,#{userID},#{uName},#{uState},#{uPicPath},#{uDesc},#{uSex},#{uMarry},#{uBirthDay},#{uHobby}) ")
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
	@Update("update  userinfo set uName=#{uName},uState=#{uState},uPicPath=#{uPicPath},uDesc=#{uDesc},uSex=#{uSex},uMarry=#{uMarry},uBirthDay=#{uBirthDay},uHobby=#{uHobby} where userid=#{userid}")
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
	@Delete("delete from Userinfo where uinfoid =#{uinfoid}")
	public boolean delUserInfo(int uInfoID);
}
