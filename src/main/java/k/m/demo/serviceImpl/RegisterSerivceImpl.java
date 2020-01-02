package k.m.demo.serviceImpl;

import org.springframework.beans.factory.annotation.Autowired;


import org.springframework.stereotype.Service;

import k.m.demo.mapper.RegisterMapper;
import k.m.demo.model.User;
import k.m.demo.service.RegisterService;
@Service
public class RegisterSerivceImpl implements RegisterService {
	@Autowired
	RegisterMapper registerMapper;

	
	@Override
	public int register(User user) {
		//调用mapper实现注册
		System.out.println(user);
		User u0=registerMapper.selectUserByName(user.getName());
		int i=1;
		if(u0==null) {
			registerMapper.insertUser(user);
//		    registerMapper.updateTime(user);
			System.out.println(user);
		}else {
			i=2;
		}
		return i;
	}
	
	

}
