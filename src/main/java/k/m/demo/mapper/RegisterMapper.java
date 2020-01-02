package k.m.demo.mapper;

import org.apache.ibatis.annotations.Mapper;

import k.m.demo.model.User;


@Mapper
public interface RegisterMapper {
	public User selectUserByName(String name);//通过名字查全部
	public int insertUser(User user);//插入用户信息
	public int updateTime(User user);
	
	

}