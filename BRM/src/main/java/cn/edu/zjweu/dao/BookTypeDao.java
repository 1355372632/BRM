package cn.edu.zjweu.dao;

import java.util.List;

import org.apache.ibatis.annotations.Select;

import cn.edu.zjweu.entity.BookType;

/**
 * 
* @ClassName: BookTypeDao
* @Description:书籍类型接口类
* @author: zerok
* @date: 2018年6月22日 下午4:37:47
*
 */
public interface BookTypeDao {
	@Select("select * from booktype")
	public List<BookType> getAllType(); //获取所有书籍类型
}
