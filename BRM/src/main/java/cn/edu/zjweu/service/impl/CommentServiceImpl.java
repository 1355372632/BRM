package cn.edu.zjweu.service.impl;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.beans.factory.annotation.Qualifier;
import org.springframework.stereotype.Service;

import cn.edu.zjweu.dao.CommentDao;
import cn.edu.zjweu.entity.Comment;
import cn.edu.zjweu.service.CommentService;

@Service("commentservice")
public class CommentServiceImpl implements CommentService {

	@Autowired
	@Qualifier("commentdao")
	private CommentDao commentdao;

	@Override
	public List<Comment> getAllComments() {

		return commentdao.getAllComments();
	}

	@Override
	public List<Comment> getCommentsByBookId(int bookid) {
		// TODO Auto-generated method stub
		return commentdao.getCommentsByBookId(bookid);
	}

	@Override
	public List<Comment> getCommentsByInid(int inid) {

		return commentdao.getCommentsByInid(inid);
	}

	@Override
	public boolean addComment(Comment comment) {
		// TODO Auto-generated method stub
		return commentdao.addComment(comment);
	}

	@Override
	public int getCommentHits() {
		// TODO Auto-generated method stub
		return commentdao.getCommentHits();
	}

	@Override
	public int delComment(int commentID) {
		// TODO Auto-generated method stub
		return commentdao.delComment(commentID);
	}

}
