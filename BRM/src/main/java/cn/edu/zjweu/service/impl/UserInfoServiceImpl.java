package cn.edu.zjweu.service.impl;

import javax.annotation.Resource;

import org.springframework.stereotype.Service;

import cn.edu.zjweu.dao.UserInfoDao;
import cn.edu.zjweu.entity.UserInfo;
import cn.edu.zjweu.service.UserInfoService;

@Service("userinfoService")
public class UserInfoServiceImpl implements UserInfoService {
	@Resource
	private UserInfoDao userinfoDao;
	

	public UserInfo getUserInfo(String userid) {
		System.out.println("userinfoservce+"+userid);
		return userinfoDao.getUserInfo(userid);
	}
}
