package k.m.demo.service;

import java.io.InputStream;
import java.util.List;

import k.m.demo.model.Colloction;

//收藏夹
public interface ColloctionService {
	//查询
	public List<Colloction> getAllcolloction();//查全部
	public int getColloctionBycID(int cID);//根据cID查
	
	//添加
	public int createColloction(Colloction ccolloction, InputStream fileStream);
	
	//删除
	public int deleteColloction(Colloction dcolloction);
	
	//修改
	public int updateColloction(Colloction ucolloction);
}
