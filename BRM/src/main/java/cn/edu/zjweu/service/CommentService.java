package cn.edu.zjweu.service;

import java.util.List;

import cn.edu.zjweu.entity.Comment;

public interface CommentService {
public List<Comment> getAllComments();//获取所有评论
	
	public List<Comment> getCommentsByBookId(int bookid);//查询书籍类型下所有评论
	
	public List<Comment> getCommentsByInid(int inid);//查询评论下二次评论
	
	public boolean addComment(Comment comment);//添加评论
	
	public int getCommentHits();//获取评论点击量
}
