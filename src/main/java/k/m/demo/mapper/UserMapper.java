package k.m.demo.mapper;

import java.util.List;

import org.apache.ibatis.annotations.Mapper;

import k.m.demo.model.SysUser;
import k.m.demo.model.cohelpUser;
import k.m.demo.model.waterUser;
@Mapper
public interface UserMapper {
    
	List<SysUser> selectAllUsers();
	
	//快递帮拿
	public cohelpUser selectUserByChUId(Integer chUId);//selectUserByChUId 通过取件码去查询cohelpUser
	public int insertUser(cohelpUser user);
	
	//网上购水
	public waterUser selectUserByName(String name);
	public int insertUser(waterUser user);

}
