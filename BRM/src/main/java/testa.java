import cn.edu.zjweu.dao.UserInfoDao;
import cn.edu.zjweu.dao.impl.UserInfoDaoImpl;

public class testa {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		UserInfoDao uid = new UserInfoDaoImpl();
		System.out.println(uid.getUserInfo("zerok"));
	}

}
