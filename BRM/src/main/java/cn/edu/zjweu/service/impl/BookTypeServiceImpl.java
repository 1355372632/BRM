package cn.edu.zjweu.service.impl;

import java.util.List;

import javax.annotation.Resource;

import org.springframework.stereotype.Service;

import cn.edu.zjweu.dao.BookTypeDao;
import cn.edu.zjweu.entity.BookType;
import cn.edu.zjweu.service.BookTypeService;

@Service("booktypeservice")
public class BookTypeServiceImpl implements BookTypeService {
	@Resource
	private BookTypeDao booktypedao;

	@Override
	public List<BookType> getAllType() {
		// TODO Auto-generated method stub
		return booktypedao.getAllType();
	}

}
