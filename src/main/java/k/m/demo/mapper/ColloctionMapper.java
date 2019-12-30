package k.m.demo.mapper;

import java.util.List;

import org.apache.ibatis.annotations.Mapper;

import k.m.demo.model.Colloction;

//收藏夹
@Mapper
public interface ColloctionMapper {
	//查询
	public List<Colloction> selectAllColloction();//查全部
	public Colloction selectColloctionBycID(int cID);//根据cID查
	
	//添加
	public int	insertColloction(Colloction ccolloction);
	
	//删除
	public int deleteColloction(Colloction dcolloction);
	
	//修改
	public int updateColloction(Colloction ucolloction);
}
