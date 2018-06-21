package cn.edu.zjweu.entity;

import java.sql.Date;

/**
 * 评论表
 * @author yin
 *
 */
public class Comment {
	private int commentID; 
	private String userID; 
	private Date commentDate;
	private String content;
	private int INID;
	private int bookID;
	private int cReported;
	private int hits;
	public int getCommentID() {
		return commentID;
	}
	public void setCommentID(int commentID) {
		this.commentID = commentID;
	}
	public String getUserID() {
		return userID;
	}
	public void setUserID(String userID) {
		this.userID = userID;
	}
	public Date getCommentDate() {
		return commentDate;
	}
	public void setCommentDate(Date commentDate) {
		this.commentDate = commentDate;
	}
	public String getContent() {
		return content;
	}
	public void setContent(String content) {
		this.content = content;
	}
	public int getINID() {
		return INID;
	}
	public void setINID(int iNID) {
		INID = iNID;
	}
	public int getBookID() {
		return bookID;
	}
	public void setBookID(int bookID) {
		this.bookID = bookID;
	}
	public int getcReported() {
		return cReported;
	}
	public void setcReported(int cReported) {
		this.cReported = cReported;
	}
	public int getHits() {
		return hits;
	}
	public void setHits(int hits) {
		this.hits = hits;
	}
	public Comment(int commentID, String userID, Date commentDate, String content, int iNID, int bookID, int cReported,
			int hits) {
		super();
		this.commentID = commentID;
		this.userID = userID;
		this.commentDate = commentDate;
		this.content = content;
		INID = iNID;
		this.bookID = bookID;
		this.cReported = cReported;
		this.hits = hits;
	}
	public Comment() {
		super();
		// TODO Auto-generated constructor stub
	}
	
	
	
	
}
