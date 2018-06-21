package cn.edu.zjweu.entity;
/**
 * 用户实体类
 * @author yin
 *
 */
public class User {
	private String userID;//用户id
	private String uPwd;//密码
	private String uEmail;//用户邮箱
	private int uType;//用户类型：0最高权限管理员，1管理员，2用户（注册成功）
	
	private UserInfo userinfo;//获取用户时，同时获取用户的详细信息
	
	public User() {
		super();
		// TODO Auto-generated constructor stub
	}
	public User(String userID, String uPwd, String uEmail, int uType) {
		super();
		this.userID = userID;
		this.uPwd = uPwd;
		this.uEmail = uEmail;
		this.uType = uType;
	}
	public String getUserID() {
		return userID;
	}
	public void setUserID(String userID) {
		this.userID = userID;
	}
	public String getuPwd() {
		return uPwd;
	}
	public void setuPwd(String uPwd) {
		this.uPwd = uPwd;
	}
	public String getuEmail() {
		return uEmail;
	}
	public void setuEmail(String uEmail) {
		this.uEmail = uEmail;
	}
	public int getuType() {
		return uType;
	}
	public void setuType(int uType) {
		this.uType = uType;
	}
	public UserInfo getUserinfo() {
		return userinfo;
	}
	public void setUserinfo(UserInfo userinfo) {
		this.userinfo = userinfo;
	}
	
	
}
