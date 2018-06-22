import org.springframework.context.ApplicationContext;
import org.springframework.context.support.ClassPathXmlApplicationContext;

import cn.edu.zjweu.dao.UserInfoDao;
import cn.edu.zjweu.service.UserInfoService;
import cn.edu.zjweu.service.impl.UserInfoServiceImpl;

public class test02 {

public static void main(String[] args) {
	UserInfoService uis = new UserInfoServiceImpl();
	ApplicationContext ctx = new ClassPathXmlApplicationContext("classpath:spring/root-context.xml");
	UserInfoDao idao = (UserInfoDao) ctx.getBean("UserInfoDao");
	System.out.println(idao.getClass());
	System.out.println(uis.getUserInfo("zerok"));
	System.out.println("helloworld");
}
		

}