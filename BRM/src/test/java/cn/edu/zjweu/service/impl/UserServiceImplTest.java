package cn.edu.zjweu.service.impl;

import static org.junit.Assert.assertNotNull;
import static org.junit.Assert.assertNull;
import static org.junit.Assert.assertTrue;

import java.util.List;

import javax.annotation.Resource;

import org.junit.Before;
import org.junit.Test;
import org.springframework.context.ApplicationContext;
import org.springframework.context.support.ClassPathXmlApplicationContext;

import cn.edu.zjweu.entity.UserInfo;
import cn.edu.zjweu.entity.Users;
import cn.edu.zjweu.service.UserInfoService;
import cn.edu.zjweu.service.UserService;

public class UserServiceImplTest {
	@Resource
	private UserService userservice=null;
	@Resource UserInfoService userinfoservice =null;
	@Before
	public void init()  {
		 ApplicationContext ctx = new
				 ClassPathXmlApplicationContext("classpath:spring/root-context.xml");
		 			userservice = (UserService) ctx.getBean("userservice");
				 System.out.println(userservice.getClass());
//		 ApplicationContext ctx = new
//				 ClassPathXmlApplicationContext("classpath:spring/root-context.xml");
//		 			userinfoservice = (UserInfoService) ctx.getBean("userinfoservice");
//				 System.out.println(userinfoservice.getClass());
	}

	@Test
	public void testGetUser() {
		List<Users> ulist = userservice.getUser(0, 5);
		System.out.println(ulist.toString());
		assertNotNull(ulist);
	}

	@Test
	public void testAddUser() {
		Users u = new Users("lin", "111", "111111", 2);
		u.setUserinfo(new UserInfo(0, u.getUserID(), "1111", 2, "sss", "afa", "男", "已婚",java.sql.Date.valueOf("1997-07-25"), "sadasd"));
		System.out.println(u.toString());
		boolean flag=userservice.addUser(u);
		assertTrue(flag);
	}

	@Test
	public void testDelUser() {
		boolean flag=userservice.delUser("lin");
		assertTrue(flag);
	}

	@Test
	public void testEditUser() {
		
	}

	@Test
	public void testGetUserById() {
		Users u = userservice.getUserById("1s11");
		System.out.println(u.toString());
		assertNull(u);
	}

	@Test
	public void testLogin() {
		Users u = new Users();
		u.setUserID("zerok");
		u.setuPwd("zerok");
		Users user=userservice.login(u);
		assertNotNull(user);
	}

}
