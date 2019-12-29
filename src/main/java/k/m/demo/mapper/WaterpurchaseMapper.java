package k.m.demo.mapper;

import java.util.List;

import org.apache.ibatis.annotations.Mapper;

import k.m.demo.model.Water_purchase;

//网上购水
@Mapper
public interface WaterpurchaseMapper {
	//查询
	public List<Water_purchase> selectAllWaterpurchase();//查全部
	public Water_purchase selectWaterpurchaseBywpID(int wpID);//根据wpID查
	
	//添加
	public int insertWaterpurchase(Water_purchase cpurchase);
	
	//删除
	public int deleteWaterpurchase(Water_purchase dpurchase);
	
	//修改
	public int updateWaterpurchase(Water_purchase upurchase);
}
