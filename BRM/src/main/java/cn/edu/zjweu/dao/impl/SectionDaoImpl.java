package cn.edu.zjweu.dao.impl;

import java.util.ArrayList;
import java.util.List;

import org.apache.ibatis.session.SqlSession;
import org.apache.ibatis.session.SqlSessionFactory;
import org.mybatis.spring.support.SqlSessionDaoSupport;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.beans.factory.annotation.Qualifier;
import org.springframework.stereotype.Repository;

import cn.edu.zjweu.dao.SectionDao;
import cn.edu.zjweu.entity.Section;
@Repository("sectiondao")
public class SectionDaoImpl extends SqlSessionDaoSupport implements SectionDao {
	
	@Autowired
	@Qualifier("sqlSessionFactory")//消除歧义，找到指定的bean
	
	public void setSqlSessionFactory(SqlSessionFactory sqlSessionFactory) {
		super.setSqlSessionFactory(sqlSessionFactory);
	}
	/**
	 * 
	* <p>Title: addSection</p>
	* <p>Description: 添加章节</p>
	* @param section
	* @return  true 添加成功，false 添加失败
	* @see cn.edu.zjweu.dao.SectionDao#addSection(cn.edu.zjweu.entity.Section)
	 */
	@Override
	public boolean addSection(Section section) {
		SqlSession sqlSession = this.getSqlSession();
		int flag=sqlSession.insert("addSection", section);
		return flag>0?true:false;
	}
	/**
	 * 
	* <p>Title: editSection</p>
	* <p>Description: 修改章节</p>
	* @param section
	* @return true 修改成功，false 修改失败
	* @see cn.edu.zjweu.dao.SectionDao#editSection(cn.edu.zjweu.entity.Section)
	 */
	@Override
	public boolean editSection(Section section) {
		SqlSession sqlSession = this.getSqlSession();
		int flag=sqlSession.update("editSection", section);
		return flag>0?true:false;
	}
	/**
	 * 
	* <p>Title: delSection</p>
	* <p>Description: 删除章节</p>
	* @param sectionid
	* @return true 删除成功，false 删除失败
	* @see cn.edu.zjweu.dao.SectionDao#delSection(int)
	 */
	@Override
	public boolean delSection(int sectionid) {
		SqlSession sqlSession = this.getSqlSession();
		int flag = sqlSession.delete("delSection", sectionid);
		return flag>0?true:false;
	}
	/**
	 * 
	* <p>Title: getAllSectionByBid</p>
	* <p>Description: 根据书籍id获取所有章节</p>
	* @param bookid
	* @return 书籍所有章节
	* @see cn.edu.zjweu.dao.SectionDao#getAllSectionByBid(int)
	 */
	@Override
	public List<Section> getAllSectionByBid(int bookid) {
		SqlSession sqlSession = this.getSqlSession();
		List<Section> slist = sqlSession.selectList("getAllSectionByBid", bookid);
		return slist;
	}

}
