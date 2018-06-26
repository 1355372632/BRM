package cn.edu.zjweu.service;

import java.util.List;

import org.apache.ibatis.annotations.Delete;
import org.apache.ibatis.annotations.Insert;
import org.apache.ibatis.annotations.Select;
import org.apache.ibatis.annotations.Update;

import cn.edu.zjweu.entity.Section;

/**
 * 
* @ClassName: SectionService
* @Description:章节Service
* @author: zerok
* @date: 2018年6月25日 下午5:14:10
*
 */
public interface SectionService {
	/**
	 * 
	* @Title: getAllSection
	* @Description: 根据书籍id获取所有章节
	* @param: @return 书籍所有章节
	* @return: List<Section>
	* @throws
	 */
	public List<Section> getAllSectionByBid(int bookid);
	/**
	 * 
	* @Title: addSection
	* @Description: 添加章节
	* @param: @param section
	* @param: @return true 添加成功，false 添加失败
	* @return: boolean
	* @throws
	 */
	public boolean addSection(Section section);
	/**
	 * 
	* @Title: editSection
	* @Description: 修改章节
	* @param: @param section
	* @param: @return true 修改成功，false 修改失败
	* @return: boolean
	* @throws
	 */
	public boolean editSection(Section section);
	/**
	 * 
	* @Title: delSection
	* @Description: 删除章节
	* @param: @param sectionid
	* @param: @return true 删除成功，false 删除失败
	* @return: boolean
	* @throws
	 */
	public boolean delSection(int sectionid);
}
