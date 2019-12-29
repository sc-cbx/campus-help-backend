package k.m.demo.serviceImpl;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import k.m.demo.mapper.HelpexpressMapper;
import k.m.demo.model.Help_express;
import k.m.demo.service.HelpexpressService;

//快递帮拿
@Service("helpexpressService")
public class HelpexpressServiceImpl implements HelpexpressService{

	@Autowired
	HelpexpressMapper helpexpressMapper;

	//查询
	//查全部
	@Override
	public List<Help_express> getAllhelpexpress() {
		// TODO Auto-generated method stub
		return helpexpressMapper.selectAllHelpexpress();
	}
	//根据heID查
	@Override
	public int getHelpexpressByheID(int heID) {
		// TODO Auto-generated method stub
		Help_express he = helpexpressMapper.selectHelpexpressByheID(heID);
		int i = 1;
		if(he==null) {
			i=2;
		}else {
			helpexpressMapper.selectHelpexpressByheID(heID);
		}
		return i;
	}
	
	//添加
	@Override
	public int createHelp_express(Help_express cexpress) {
		// TODO Auto-generated method stub
		Help_express he = helpexpressMapper.selectHelpexpressByheID(cexpress.getHeID());
		int add = 1;
		if(he==null) {
			helpexpressMapper.insertHelpexpress(cexpress);
		}else {
			add=2;
		}
		return add;
	}
	
	//删除
	@Override
	public int deleteHelp_express(Help_express dexpress) {
		// TODO Auto-generated method stub
		Help_express he = helpexpressMapper.selectHelpexpressByheID(dexpress.getHeID());
		int del = 1;
		if(he != null) {
			helpexpressMapper.deleteHelpexpress(dexpress);
		}else {
			del=2;
		}
		return del;
	}	
	
	//修改
	@Override
	public int updateHelp_express(Help_express uexpress) {
		// TODO Auto-generated method stub
		Help_express he = helpexpressMapper.selectHelpexpressByheID(uexpress.getHeID());
		int upd = 1;
		if(he != null) {
			helpexpressMapper.updateHelpexpress(uexpress);
		}else {
			upd=2;
		}
		return upd;
	}
}
