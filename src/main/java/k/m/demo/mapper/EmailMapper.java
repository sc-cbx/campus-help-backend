package k.m.demo.mapper;

import org.apache.ibatis.annotations.Mapper;

import k.m.demo.model.User;

@Mapper
public interface EmailMapper {
	//通过名字查qq邮箱
	public User selectByName(String uEmail);
}