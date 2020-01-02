package k.m.demo.serviceImpl;

import javax.servlet.http.HttpSession;


import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.boot.env.YamlPropertySourceLoader;
import org.springframework.stereotype.Service;

import k.m.demo.mapper.MessageMapper;
import k.m.demo.model.User;
import k.m.demo.service.MessageService;

@Service
public class MessageServiceImpl implements MessageService{
	@Autowired
	MessageMapper messageMapper;
	
	@Override
	public int message(User user,HttpSession session) {
		//调用mapper进行添加和修改信息
		String username=(String) session.getAttribute("username");
		User u0=messageMapper.selectUserByName(user.getName());
		int i=1;
//		System.out.println(u0.getuSex());
		System.out.println(u0);
//		System.out.println(user.getName());
//		System.out.println(u0.getName()==user.getName());
//		System.out.println(u0.getName()!=null);
//		System.out.println(u0.getName()!=null&&u0.getuSex()==null);
//		System.out.println(u0.getuSex().equals(null));
//		System.out.println(u0!=null&&(u0.getuSex().equals(null)));
//		System.out.println(u0.getName()==user.getName());
	System.out.println(u0!=null&&u0.getuSex()==null);
	System.out.println(u0!=null&&u0.getuSex()!=null);
		if(u0!=null) {
			messageMapper.updateMessage(user);
			System.out.println(user);
			i=1;
		}else {
			i=2;
		}
	
		return i;
	
	}

}
