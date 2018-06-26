package cn.edu.zjweu.service.impl;

import java.util.List;

import javax.annotation.Resource;

import org.springframework.stereotype.Service;

import cn.edu.zjweu.dao.SectionDao;
import cn.edu.zjweu.entity.Section;
import cn.edu.zjweu.service.SectionService;
@Service("sectionservice")
public class SectionServiceImpl implements SectionService {

	@Resource
	private SectionDao sectiondao; 
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
		// TODO Auto-generated method stub
		return sectiondao.getAllSectionByBid(bookid);
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
		// TODO Auto-generated method stub
		return sectiondao.addSection(section);
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
		// TODO Auto-generated method stub
		return sectiondao.editSection(section);
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
		// TODO Auto-generated method stub
		return sectiondao.delSection(sectionid);
	}

}
