package cn.edu.zjweu.dao;

import java.util.List;

import org.apache.ibatis.annotations.Delete;
import org.apache.ibatis.annotations.Insert;
import org.apache.ibatis.annotations.Select;
import org.apache.ibatis.annotations.Update;

import cn.edu.zjweu.entity.Section;
/**
 * 
* @ClassName: SectionDao
* @Description:Section接口类
* @author: zerok
* @date: 2018年6月21日 下午2:27:19
*
 */
public interface SectionDao {
	/**
	 * 
	* @Title: getAllSection
	* @Description: 根据书籍id获取所有章节
	* @param: @return 书籍所有章节
	* @return: List<Section>
	* @throws
	 */
	@Select("select * from section where bookid=#{bookid} order by sectionid")
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
	@Insert("insert into section(SECTIONID,SECTIONTITLE,CONTENT,SECTIONUPDATE,BOOKID) values(sectionSequence.Nextval,#{SECTIONTITLE},#{CONTENT},sysdate,#{BOOKID})")
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
	@Update("update section set SECTIONTITLE=#{SECTIONTITLE},CONTENT=#{CONTENT},LASTUPDATE=sysdate where SECTIONID=#{SECTIONID}")
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
	@Delete("delete from section where SECTIONID=#{SECTIONID}")
	public boolean delSection(int sectionid);
}
