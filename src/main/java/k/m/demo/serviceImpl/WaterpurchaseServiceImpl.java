package k.m.demo.serviceImpl;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import k.m.demo.mapper.WaterpurchaseMapper;
import k.m.demo.model.Water_purchase;
import k.m.demo.service.WaterpurchaseService;

//网上购水
@Service("waterpurchaseService")
public class WaterpurchaseServiceImpl implements WaterpurchaseService{

	@Autowired
	WaterpurchaseMapper waterpurchaseMapper;

	//查询
	//查全部
	@Override
	public List<Water_purchase> getAllwaterpurchase() {
		// TODO Auto-generated method stub
		return waterpurchaseMapper.selectAllWaterpurchase();
	}
	//根据wpID查
	@Override
	public int getWaterpurchaseBywpID(int wpID) {
		// TODO Auto-generated method stub
		Water_purchase wp = waterpurchaseMapper.selectWaterpurchaseBywpID(wpID);
		int i = 1;
		if(wp==null) {
			i=2;
		}else {
			waterpurchaseMapper.selectWaterpurchaseBywpID(wpID);
		}
		return i;
	}

	//添加
	@Override
	public int createWaterpurchase(Water_purchase cpurchase) {
		// TODO Auto-generated method stub
		Water_purchase wp = waterpurchaseMapper.selectWaterpurchaseBywpID(cpurchase.getWpID());
		int add = 1;
		if(wp==null) {
			waterpurchaseMapper.insertWaterpurchase(cpurchase);
		}else {
			add=2;
		}
		return add;
	}

	//删除
	@Override
	public int deleteWaterpurchase(Water_purchase dpurchase) {
		// TODO Auto-generated method stub
		Water_purchase wp = waterpurchaseMapper.selectWaterpurchaseBywpID(dpurchase.getWpID());
		int del = 1;
		if(wp != null) {
			waterpurchaseMapper.deleteWaterpurchase(dpurchase);
		}else {
			del=2;
		}
		return del;
	}

	//修改
	@Override
	public int updateWaterpurchase(Water_purchase upurchase) {
		// TODO Auto-generated method stub
		Water_purchase wp = waterpurchaseMapper.selectWaterpurchaseBywpID(upurchase.getWpID());
		int upd = 1;
		if(wp != null) {
			waterpurchaseMapper.updateWaterpurchase(upurchase);
		}else {
			upd=2;
		}
		return upd;
	}
	
	
}
