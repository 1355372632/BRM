package cn.edu.zjweu.entity;
/**
 * 书籍类型实体类
 * @author yin
 *
 */
public class BookType {
	private int tID;//主键 书籍类型号
	private String tName;//书籍类型
	public BookType() {
		super();
		// TODO Auto-generated constructor stub
	}
	public BookType(int tID, String tName) {
		super();
		this.tID = tID;
		this.tName = tName;
	}
	public int gettID() {
		return tID;
	}
	public void settID(int tID) {
		this.tID = tID;
	}
	public String gettName() {
		return tName;
	}
	public void settName(String tName) {
		this.tName = tName;
	}
	
	
}
