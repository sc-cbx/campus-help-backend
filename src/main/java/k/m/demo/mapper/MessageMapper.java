package k.m.demo.mapper;

import org.apache.ibatis.annotations.Mapper;

import k.m.demo.model.User;

@Mapper
public interface MessageMapper {
	public User selectUserByName(String name);//通过名字查全部
	public int insertMessage(User user);//插入基本信息
	public int updateMessage(User user);//修改基本信息

}
