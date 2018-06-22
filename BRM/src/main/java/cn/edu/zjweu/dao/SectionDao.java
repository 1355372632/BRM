package cn.edu.zjweu.dao;

import java.util.List;

import org.apache.ibatis.annotations.Select;

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
	@Select("select * from section")
	public List<Section> getAllSection();
	
	public boolean addSection(Section section);
	
	public boolean editSection(Section section);
	
	public boolean delSection(int sectionid);
}
