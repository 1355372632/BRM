package cn.edu.zjweu.entity;

import java.sql.Date;

/**
 * 章节实体类
 * @author yin
 *
 */
public class Section {
	private int sectionID;//章节编号 主键 自增 sectionSequence
	private String sectionTitle;//章节名
	private String content;//章节主要内容
	private Date sectionUpdate;//更新时间
	private int bookID;//外键 书籍编号
	public int getSectionID() {
		return sectionID;
	}
	public void setSectionID(int sectionID) {
		this.sectionID = sectionID;
	}
	public String sectionTitle() {
		return sectionTitle();
	}
	public void sectionTitle(String sectionTitle) {
		this.sectionTitle = sectionTitle;
	}
	public String getSectionTitle() {
		return sectionTitle;
	}
	public void setSectionTitle(String sectionTitle) {
		this.sectionTitle = sectionTitle;
	}
	public String getContent() {
		return content;
	}
	public void setContent(String content) {
		this.content = content;
	}
	public Date getSectionUpdate() {
		return sectionUpdate;
	}
	public void setSectionUpdate(Date sectionUpdate) {
		this.sectionUpdate = sectionUpdate;
	}
	public int getBookID() {
		return bookID;
	}
	public void setBookID(int bookID) {
		this.bookID = bookID;
	}
	public Section(int sectionID, String sectionTitle, String content, Date sectionUpdate, int bookID) {
		super();
		this.sectionID = sectionID;
		this.sectionTitle = sectionTitle;
		this.content = content;
		this.sectionUpdate = sectionUpdate;
		this.bookID = bookID;
	}
	public Section() {
		super();
		// TODO Auto-generated constructor stub
	}
	
	
}
