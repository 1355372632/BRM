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
	/**
	 * 
	* <p>Title: getUserInfo</p>
	* <p>Description: 根据用户id获取用户信息</p>
	* @param userid
	* @return 用户实体
	* @see cn.edu.zjweu.dao.UserInfoDao#getUserInfo(java.lang.String)
	 */
	@Override
	public UserInfo getUserInfo(String userid) {
		return userinfodao.getUserInfo(userid);
	}
	/**
	 * 
	* <p>Title: addUserInfo</p>
	* <p>Description: 添加用户信息</p>
	* @param userinfo
	* @return 
	* @see cn.edu.zjweu.dao.UserInfoDao#addUserInfo(cn.edu.zjweu.entity.UserInfo)
	 */
	@Override
	public boolean addUserInfo(UserInfo userinfo) {
		// TODO Auto-generated method stub
		return userinfodao.addUserInfo(userinfo);
	}
	/**
	 * 
	* <p>Title: editUserInfo</p>
	* <p>Description: 修改用户信息</p>
	* @param userinfo
	* @return
	* @see cn.edu.zjweu.dao.UserInfoDao#editUserInfo(cn.edu.zjweu.entity.UserInfo)
	 */
	@Override
	public boolean editUserInfo(UserInfo userinfo) {
		// TODO Auto-generated method stub
		return userinfodao.editUserInfo(userinfo);
	}
	/**
	 * 
	* <p>Title: delUserInfo</p>
	* <p>Description: 删除用户信息</p>
	* @param uInfoID
	* @return
	* @see cn.edu.zjweu.dao.UserInfoDao#delUserInfo(int)
	 */
	@Override
	public boolean delUserInfo(int uInfoID) {
		// TODO Auto-generated method stub
		return userinfodao.delUserInfo(uInfoID);
	}
}
