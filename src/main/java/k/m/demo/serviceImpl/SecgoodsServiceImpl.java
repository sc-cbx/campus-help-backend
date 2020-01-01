package k.m.demo.serviceImpl;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import k.m.demo.mapper.SecgoodsMapper;
import k.m.demo.model.Secgoods;
import k.m.demo.service.SecgoodsService;

@Service
public class SecgoodsServiceImpl implements SecgoodsService{
	@Autowired
	SecgoodsMapper secgoodsMapper;

	@Override
	public List<Secgoods> getSecgoodsList() {
		// TODO Auto-generated method stub
		return secgoodsMapper.selectAllSecgoods();
	}
	
}
