package k.m.demo.serviceImpl;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import k.m.demo.mapper.SecgoodsaddMapper;
import k.m.demo.model.Secgoods;
import k.m.demo.service.SecgoodsaddService;

@Service
public class SecgoodsaddServiceImpl implements SecgoodsaddService{
	@Autowired
	SecgoodsaddMapper secgoodsaddMapper;
	@Override
	public int secgoodsadd(Secgoods sadd) {
		// TODO Auto-generated method stub
		System.out.println(sadd);
		Secgoods s=secgoodsaddMapper.selectSecgoodsBySecgoods_name(sadd.getSecgoods_name());
		int i=1; 
		if(s==null) {
			secgoodsaddMapper.insertSecgoods(sadd);
			System.out.println(sadd);
		}else {
			i=2;
		}
		return i;
	}
	@Override
	public int secgoodsdelete(Secgoods sdelete) {
		// TODO Auto-generated method stub
		System.out.println(sdelete);
		Secgoods d=secgoodsaddMapper.selectSecgoodsBySecgoods_name(sdelete.getSecgoods_name());
		int del=1; 
		if(d!=null) {
			secgoodsaddMapper.deleteSecgoods(sdelete);
			System.out.println(sdelete);
		}else {
			del=2;
		}
		return del;
	}
	@Override
	public int secgoodsupdate(Secgoods supdate) {
		// TODO Auto-generated method stub
		System.out.println(supdate);
		Secgoods u=secgoodsaddMapper.selectSecgoodsBySecgoods_name(supdate.getSecgoods_name());
		int upd=1; 
		if(u!=null) {
			secgoodsaddMapper.updateSecgoods(supdate);
			System.out.println(supdate);
		}else {
			upd=2;
		}
		return upd;
	}
	
}
