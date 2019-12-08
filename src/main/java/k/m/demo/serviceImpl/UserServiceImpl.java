
package k.m.demo.serviceImpl;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import k.m.demo.mapper.UserMapper;
import k.m.demo.model.SysUser;
import k.m.demo.model.cohelpUser;
import k.m.demo.model.waterUser;
import k.m.demo.service.UserService;

@Service
public class UserServiceImpl implements UserService{
	@Autowired
	UserMapper userMapper;
	@Override
	public List<SysUser> getAllUsers() {
		// TODO Auto-generated method stub
		return userMapper.selectAllUsers();
	}
	
//	快递帮拿
	@Autowired
	UserMapper userMapper1;
	
	@Override
	public int courier_help(cohelpUser user) {
		// TODO Auto-generated method stub
		//调用mapper实现创建任务
		cohelpUser chu0 = userMapper1.selectUserByChUId(user.getChUId());
		int i = -1;
		if(chu0==null) {
			i = userMapper1.insertUser(user);
		}else {
			i = 2;
		}
		return i;
	}
	
//	网上购水
	@Override
	public int online_buy_water(waterUser user) {
		// TODO Auto-generated method stub
		return 0;
	}
	
}
