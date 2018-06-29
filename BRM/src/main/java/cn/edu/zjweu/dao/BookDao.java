package cn.edu.zjweu.dao;

import java.util.List;

import org.apache.ibatis.annotations.Insert;
import org.apache.ibatis.annotations.Param;
import org.apache.ibatis.annotations.Select;
import org.apache.ibatis.annotations.Update;
import org.apache.ibatis.session.RowBounds;

import cn.edu.zjweu.entity.Book;

/**
 * 
* @ClassName: BookDao
* @Description:书籍接口类
* @author: zerok
* @date: 2018年6月21日 上午10:04:57
*
 */
public interface BookDao {
	
	@Select("select * from Book order by hits desc")
	public List<Book> getBooksByHits();//获取所有书籍并根据点击量Hits 降序排列
	
	@Select("select * from Book order by createDate asc")
	public List<Book> getBooksByCreateDate();//获取所有书籍并根据最近发布时间createDate 升序排列
	
	@Select("select * from Book where enddate is not null order by endDate asc")
	public List<Book> getBooksByEndDate();//获取所有书籍并根据完结时间ENDDATE 升序排列
	
	@Select("select * from Book where bTID=#{bTID}")
	public List<Book> getBooksByBtid(int btid);//根据书籍类型查询
	
	@Select("select * from (select book.*,rownum rn from book where bTID=#{bTID} order by bookid) where  rn between #{begin} and #{end}")
	public List<Book> getBooksLimitByBtid(@Param("bTID") int btid,@Param("begin") int begin,@Param("end") int end);//根据书籍类型查询并分页查询
	
	@Insert("insert into Book values(bookid.nextval,#{bTID},#{bookName},#{bookAuthor},#{bookDesc},#{createDate},#{lastRead},#{endDate},#{bPicPath},#{hits},#{bookState})")
	public boolean addBook(Book book);//添加书籍	
	
	@Select("delete from Book where bookID=#{bookID}")
	public boolean delBook(int  bookid);//删除书籍	
	
	@Update("update Book set bookDesc=#{bookDesc},endDate=#{endDate},bPicPath=#{bPicPath},bookState=#{bookState} where bookId=#{bookID}")
	public boolean editBook(Book book);//编辑书籍,修改书籍简介，完结日期，封面路径，是否完结
	
	  @Select("select * from (select book.*,rownum rn from book where bookName like #{bookName} order by bookid) where  rn between #{begin} and #{end}")
	public List<Book> getBooksByFuzzyName(@Param("bookName") String bookName,@Param("begin") int begin, @Param("end") int end);//根据模糊书名查询,fenye

	
	@Select("select * from Book where bookAuthor=#{bookAuthor} ")
	public List<Book> getBooksByAuthor(String authorName,int a,int b);//根据作者查询书籍，并进行分页查询
	
	@Select("select * from Book where bookID=#{bookID}")
	public Book getBookByBookID(int bookid);	//根据书籍编号查询
	
	
	@Select("select Book.hits from Book where bookID=#{bookID}")
	public int getBookHits(int bookID);//查询书籍点击量
	
	
}
