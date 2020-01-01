package k.m.demo.mapper;

import org.apache.ibatis.annotations.Mapper;

import k.m.demo.model.Secgoods;

@Mapper
public interface SecgoodsaddMapper {
	public Secgoods selectSecgoodsBySecgoods_name(String secgoods_name);
	public int insertSecgoods(Secgoods sadd);
	public int deleteSecgoods(Secgoods sdelete);
	public int updateSecgoods(Secgoods supdate);
}
