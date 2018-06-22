package cn.edu.zjweu.service;

import org.apache.ibatis.annotations.Param;
import org.apache.ibatis.annotations.Select;

import cn.edu.zjweu.entity.UserInfo;

public interface UserInfoMapper {
	@Select("select * from userinfo where userid=#{userid}")
	public UserInfo getUserInfo(@Param("userid") String userid);//根据用户id查询用户
}
