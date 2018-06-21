package cn.edu.zjweu.dao;

import java.util.List;

import cn.edu.zjweu.entity.Comment;

/**
 * 
* @ClassName: CommentDao
* @Description:评论接口
* @author: zerok
* @date: 2018年6月21日 上午10:33:59
*
 */
public interface CommentDao {
	public List<Comment> getAllComments();//获取所有评论
	
	public List<Comment> getCommentsByBookId(String bookid);//查询书籍类型下所有评论
	
	public List<Comment> getCommentsByInid(String inid);//查询评论下二次评论
	
	public boolean addComment(Comment comment);//添加评论
	
	public int getCommentHits();//获取评论点击量
}
