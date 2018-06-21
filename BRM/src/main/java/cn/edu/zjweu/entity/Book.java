package cn.edu.zjweu.entity;
/**
 * 书籍实体类
 * @author yin
 *
 */

import java.sql.Date;
import java.util.List;

public class Book {
	private int bookID;//type *10000+主键 非自增
	private int bTID;//1,2,3,4,5,6//书籍类型 外键
	private String bookName;//书籍名称
	private String bookAuthor;//书籍作者
	private String bookDesc;//书籍简介
	private Date createDate;//书籍发布时间
	private Date lastRead;//最近阅读时间
	private Date endDate;//未完结为空
	private String bPicPath;//书籍封面路径
	private int hits;//点击量
	private int bookState;//书籍状态0连载，1完结
	
	private List<Section> sections;//获取书籍时获取所有章节列表
	
	
	public List<Section> getSections() {
		return sections;
	}
	public void setSections(List<Section> sections) {
		this.sections = sections;
	}
	public int getBookID() {
		return bookID;
	}
	public void setBookID(int bookID) {
		this.bookID = bookID;
	}
	public int getbTID() {
		return bTID;
	}
	public void setbTID(int bTID) {
		this.bTID = bTID;
	}
	public String getBookName() {
		return bookName;
	}
	public void setBookName(String bookName) {
		this.bookName = bookName;
	}
	public String getBookAuthor() {
		return bookAuthor;
	}
	public void setBookAuthor(String bookAuthor) {
		this.bookAuthor = bookAuthor;
	}
	public String getBookDesc() {
		return bookDesc;
	}
	public void setBookDesc(String bookDesc) {
		this.bookDesc = bookDesc;
	}
	public Date getCreateDate() {
		return createDate;
	}
	public void setCreateDate(Date createDate) {
		this.createDate = createDate;
	}
	public Date getLastRead() {
		return lastRead;
	}
	public void setLastRead(Date lastRead) {
		this.lastRead = lastRead;
	}
	public Date getEndDate() {
		return endDate;
	}
	public void setEndDate(Date endDate) {
		this.endDate = endDate;
	}
	public String getbPicPath() {
		return bPicPath;
	}
	public void setbPicPath(String bPicPath) {
		this.bPicPath = bPicPath;
	}
	public int getHits() {
		return hits;
	}
	public void setHits(int hits) {
		this.hits = hits;
	}
	public int getBookState() {
		return bookState;
	}
	public void setBookState(int bookState) {
		this.bookState = bookState;
	}
	public Book(int bookID, int bTID, String bookName, String bookAuthor, String bookDesc, Date createDate,
			Date lastRead, Date endDate, String bPicPath, int hits, int bookState) {
		super();
		this.bookID = bookID;
		this.bTID = bTID;
		this.bookName = bookName;
		this.bookAuthor = bookAuthor;
		this.bookDesc = bookDesc;
		this.createDate = createDate;
		this.lastRead = lastRead;
		this.endDate = endDate;
		this.bPicPath = bPicPath;
		this.hits = hits;
		this.bookState = bookState;
	}
	public Book() {
		super();
		// TODO Auto-generated constructor stub
	}
	
	
	
	
}
