package k.m.demo.mapper;

import java.util.List;

import org.apache.ibatis.annotations.Mapper;

import k.m.demo.model.Help_express;

//快递帮拿
@Mapper
public interface HelpexpressMapper {
	//查询
	public List<Help_express> selectAllHelpexpress();//查全部
	public Help_express selectHelpexpressByheID(int heID);//根据heID查
	
	//添加
	public int insertHelpexpress(Help_express cexpress);
	
	//删除
	public int deleteHelpexpress(Help_express dexpress);
	
	//修改
	public int updateHelpexpress(Help_express uexpress);
}
