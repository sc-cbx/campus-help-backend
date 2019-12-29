package k.m.demo.service;

import java.util.List;

import k.m.demo.model.Water_purchase;

//网上购水
public interface WaterpurchaseService {
	//查询
	public List<Water_purchase> getAllwaterpurchase();//查全部
	public int getWaterpurchaseBywpID(int wpID);//根据wpID查
	
	//添加
	public int createWaterpurchase(Water_purchase cpurchase);
	
	//删除
	public int deleteWaterpurchase(Water_purchase dpurchase);
	
	//修改
	public int updateWaterpurchase(Water_purchase upurchase);
}
