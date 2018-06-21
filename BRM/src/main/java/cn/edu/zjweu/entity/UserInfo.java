package cn.edu.zjweu.entity;

import java.sql.Date;

/**
 * 用户详细信息实体类
 * 
 * @author yin
 *
 */
public class UserInfo{
	private int uInfoID;//用户编号 主键 自增UserinfoSequence
	private String userID;//用户名（数字和字母）外键
	private String uName;//昵称
	private int uState;//0正常1封禁
	private String uPicPath;//头像图片路径
	private String uDesc;//个人简介
	private String uSex;//性别
	private String uMarry;//婚姻
	private Date uBirthDay;//生日
	private String uHobby;//兴趣爱好
	
	
	
	
	public UserInfo() {
		super();
		// TODO Auto-generated constructor stub
	}
	
	public String getuMarry() {
		return uMarry;
	}

	public void setuMarry(String uMarry) {
		this.uMarry = uMarry;
	}

	public Date getuBirthDay() {
		return uBirthDay;
	}

	public void setuBirthDay(Date uBirthDay) {
		this.uBirthDay = uBirthDay;
	}

	public String getuHobby() {
		return uHobby;
	}

	public void setuHobby(String uHobby) {
		this.uHobby = uHobby;
	}

	public int getuInfoID() {
		return uInfoID;
	}
	public void setuInfoID(int uInfoID) {
		this.uInfoID = uInfoID;
	}
	public String getUserID() {
		return userID;
	}
	public void setUserID(String userID) {
		this.userID = userID;
	}
	public String getuName() {
		return uName;
	}
	public void setuName(String uName) {
		this.uName = uName;
	}
	public int getuState() {
		return uState;
	}
	public void setuState(int uState) {
		this.uState = uState;
	}
	public String getuPicPath() {
		return uPicPath;
	}
	public void setuPicPath(String uPicPath) {
		this.uPicPath = uPicPath;
	}
	public String getuDesc() {
		return uDesc;
	}
	public void setuDesc(String uDesc) {
		this.uDesc = uDesc;
	}
	public String getuSex() {
		return uSex;
	}
	public void setuSex(String uSex) {
		this.uSex = uSex;
	}

	public UserInfo(int uInfoID, String userID, String uName, int uState, String uPicPath, String uDesc, String uSex,
			String uMarry, Date uBirthDay, String uHobby) {
		super();
		this.uInfoID = uInfoID;
		this.userID = userID;
		this.uName = uName;
		this.uState = uState;
		this.uPicPath = uPicPath;
		this.uDesc = uDesc;
		this.uSex = uSex;
		this.uMarry = uMarry;
		this.uBirthDay = uBirthDay;
		this.uHobby = uHobby;
	}
	
	
	
}
