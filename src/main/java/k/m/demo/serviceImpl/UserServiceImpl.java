
package k.m.demo.serviceImpl;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;
import k.m.demo.mapper.UserMapper;
import k.m.demo.model.SysUser;
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
	
	
}
