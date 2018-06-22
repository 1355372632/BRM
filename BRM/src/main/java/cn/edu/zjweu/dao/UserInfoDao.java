package cn.edu.zjweu.dao;

import org.apache.ibatis.annotations.Param;
import org.apache.ibatis.annotations.Select;

import cn.edu.zjweu.entity.UserInfo;

public interface UserInfoDao {
	public UserInfo getUserInfo(String userid);//根据用户id查询用户
}
