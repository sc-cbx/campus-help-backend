package k.m.demo.mapper;

import java.util.List;

import org.apache.ibatis.annotations.Mapper;

import k.m.demo.model.SysUser;
@Mapper
public interface UserMapper {
    
	List<SysUser> selectAllUsers();
	
//	public cohelpUser selectUserByChUId(Integer chUId);//selectUserByChUId 通过取件码去查询cohelpUser
//	public int insertcohUser(cohelpUser user);
	


}
