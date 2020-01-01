package k.m.demo.mapper;

import java.util.List;

import org.apache.ibatis.annotations.Mapper;

import k.m.demo.model.Secgoods;

@Mapper
public interface SecgoodsMapper {
	public List<Secgoods> selectAllSecgoods();
}
