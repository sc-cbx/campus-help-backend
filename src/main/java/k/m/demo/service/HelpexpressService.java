package k.m.demo.service;

import java.util.List;

import k.m.demo.model.Help_express;

//快递帮拿
public interface HelpexpressService {
	//查询
	public List<Help_express> getAllhelpexpress();//查全部
	public int getHelpexpressByheID(int heID);//根据heID查
	
	//添加
	public int createHelp_express(Help_express cexpress);
	
	//删除
	public int deleteHelp_express(Help_express dexpress);
	
	//修改
	public int updateHelp_express(Help_express uexpress);
}
