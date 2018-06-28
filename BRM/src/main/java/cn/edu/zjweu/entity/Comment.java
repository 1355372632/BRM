package cn.edu.zjweu.entity;

import java.sql.Date;
import java.util.List;

/**
 * 评论表
 * @author yin
 *
 */
public class Comment {
	private int commentID; //评论编号
	private String userID; //评论用户
	private Date commentDate;//评论时间
	private String content;//评论内容
	private int INID;//父评论编号  外键
	private int bookID;//书籍id外键
	private int cReported;//被举报次数
	private int hits;//点击量
	private List<Comment> comment;//存放子评论
	private Users cUser;
	/**
	 * 获取子评论
	 * @return list
	 */
	public List<Comment> getComment() {
		return comment;
	}
	/**
	 * 存放子评论
	 * @param comment
	 */
	public void setComment(List<Comment> comment) {
		this.comment = comment;
	}
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
	public Users getcUser() {
		return cUser;
	}
	public void setcUser(Users cUser) {
		this.cUser = cUser;
	}
	@Override
	public String toString() {
		return "Comment [commentID=" + commentID + ", userID=" + userID + ", commentDate=" + commentDate + ", content="
				+ content + ", INID=" + INID + ", bookID=" + bookID + ", cReported=" + cReported + ", hits=" + hits
				+ ", comment=" + comment + ", cUser=" + cUser + "]";
	}

	
	
	
}
