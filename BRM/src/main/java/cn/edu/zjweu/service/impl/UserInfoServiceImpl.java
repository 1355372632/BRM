package cn.edu.zjweu.service.impl;


import javax.annotation.Resource;

import org.springframework.stereotype.Service;
import org.springframework.transaction.annotation.Transactional;

import cn.edu.zjweu.dao.UserInfoDao;
import cn.edu.zjweu.dao.impl.UserInfoDaoImpl;
import cn.edu.zjweu.entity.UserInfo;
import cn.edu.zjweu.service.UserInfoService;

@Service("userinfoservice")
@Transactional
public class UserInfoServiceImpl implements UserInfoService {
	@Resource
	private UserInfoDao userinfodao;
	
	@Override
	public UserInfo getUserInfo(String userid) {
		return userinfodao.getUserInfo(userid);
	}

	@Override
	public boolean addUserInfo(UserInfo userinfo) {
		// TODO Auto-generated method stub
		return userinfodao.addUserInfo(userinfo);
	}

	@Override
	public boolean editUserInfo(UserInfo userinfo) {
		// TODO Auto-generated method stub
		return userinfodao.editUserInfo(userinfo);
	}

	@Override
	public boolean delUserInfo(int uInfoID) {
		// TODO Auto-generated method stub
		return userinfodao.delUserInfo(uInfoID);
	}
}
