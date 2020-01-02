package k.m.demo.serviceImpl;

import java.io.File;

import java.io.FileOutputStream;
import java.io.InputStream;
import java.io.OutputStream;
import java.util.ArrayList;
import java.util.Date;
import java.util.List;

import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpSession;

import org.hibernate.validator.constraints.Length;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.boot.web.servlet.server.Session;
import org.springframework.stereotype.Service;
import org.springframework.web.bind.annotation.RequestBody;


import k.m.demo.mapper.UserMapper;
//import k.m.demo.model.SysUser;
import k.m.demo.model.User;
import k.m.demo.service.UserService;
import net.sf.json.JSON;

@Service
public class UserServiceImpl implements UserService{
    @Autowired
    UserMapper userMapper;
//	@Override
//	public List<SysUser> getAllUsers() {
//		// TODO Auto-generated method stub
//		return userMapper.selectAllUsers();
//	}
	//更改密码
	@Override
	public int changepassword(User user) {
		//调用mapper实现注册
//       User u=userMapper.selectUserByName(user.getEmail());
//       User u1=userMapper.selectUserByName(user.getConfirm_password());
//       System.out.println(u);
//	   System.out.println(user.getEmail());
//	   System.out.println(u1);
//	   System.out.println(user.getPassword());
//	   System.out.println(user.getConfirm_password());
       int i=1;
       if(user.getPassword().equals(null)) {
    	   i=2;
       }else if(user.getPassword().length()!=6) {
		   i=3;
	   }else if (!user.getPassword().equals(user.getConfirm_password())) {
		   System.out.println(user.getPassword());
		   System.out.println(user.getConfirm_password());
		  i=4;
	   }else{
//		   System.out.println(u.getEmail());
//		   System.out.println(user.getEmail());
//		   u.getEmail().equals(user.getEmail())
		userMapper.updatepassword(user);
	      i=1;
	      System.out.println(user);
	}
		return i;
	}
	//银行卡绑定
	@Override
	public Object bankcard(User user,HttpSession session) {
//		User u=userMapper.selectUserByName(user.getName());
	String username=(String) session.getAttribute("username");
	    User user0=userMapper.selectUserByName(user.getName());
	    try {
			
		} catch (Exception e) {
			// TODO: handle exception
		}
		System.out.println(username);
		System.out.println(user0);
		if(user.getuBank_card().equals(null)||
				user.getuBank_card().length()!=16&&
				user.getuBank_card().length()!=17&&
				user.getuBank_card().length()!=19) {
			
			return "添加银行卡不符合";
		}else if(user0.getName().equals(username)) {
			System.out.println(user);
			userMapper.updatebankcard(user);
			System.out.println();
			System.out.println(user0);
			
			return "添加成功";
		}else {
			System.out.println(user0.getName().equals(username));
			return "请先登录";
		}
	
	}
	//实名认证
	@Override
	public int user_certification(User user) {
		User user2=userMapper.selectUserByName(user.getName());
		int i=1;
		if(user.getuTureName().equals(null)) {
			i=2;
		}else if (user.getuId_card().length()!=18) {
			i=3;
		}else if (user.getuId_card()==user2.getuId_card()) {
			i=3;
		}else {
			userMapper.updateUserCertification(user);
			i=1;
//			System.out.println(user.getuId_card());
//			System.out.println(user2.getuId_card());
//			System.out.println(user.getuId_card().equals(user2.getuId_card()));
		}
		return i;
	}
	//获取基本的信息到前端
		@Override
		public List<User> basic_message(User user,HttpSession session) {
			String username=(String) session.getAttribute("username");
			User user3=userMapper.selectUserByName(user.getName());
//			Object a="获取成功";
//			Object b="获取失败，请先登录";
			System.out.println(username);
			System.out.println(user.getName());
			System.out.println(user3);
			if(user.getName().equals(user3.getName())) {
				System.out.println(userMapper.selectBasicMessage(user));
				System.out.println(user);
		      return  userMapper.selectBasicMessage(user);
				
			}
			return null;
		
		}


		//登录
		@Override
		public Object loginer(User user, HttpServletRequest request,HttpSession session) {
		   User user5=userMapper.selectUserByName(user.getName());
			System.out.println(user.getName());
			System.out.println(user5);

			
			  if(user.getName().equals(user5.getName())&&user.getPassword().equals(user5.getPassword())){
		            request.getSession().setAttribute("username", user.getName());
		            System.out.println(user);
		            return user.getName()+":你好，欢迎你！";
		        }else {
		        	
		        	System.out.println(user.getName());
		        	
		            return "登录失败";
		        }
		
		}
		//登出
		@Override
		public Object dengchu(User user, HttpSession session) {
			String username=(String) session.getAttribute("username");
			System.out.println(username);
			if(username!=null) {
				session.removeAttribute("username");
				session.invalidate();
				System.out.println(username);
				return "登出成功";
			}else {
				System.out.println(username);
				return "登出失败";
			}
			
		}
		//用户注销
		@Override
		public int user_del(User user) {
			User user2=userMapper.selectUserByName(user.getName());
			int i=1;
			if(user.getName().equals(user2.getName())) {
				userMapper.userdeletebyname(user);
				i=1;
			}else {
				i=2;
			}
		  return i;
		}
		//上传头像
		@Override
		public int photo(User user, InputStream fileStream) {
		    String path="D:\\PhotoHead\\";
		    int i=-1;
		    byte[] bs=new byte[1024];
		    //获取到的数据长度
		    int len;
		    //输出的文件保存的本地
		    try {
				File tempFile=new File(path);
				if(!tempFile.exists()) {
					tempFile.mkdirs();
				}
				Date today=new Date();
				
				String fileName=today.getTime()+user.getuAwatar();
				user.setuAwatar("/posters"+fileName);
				OutputStream os=new FileOutputStream(tempFile.getPath()+File.separator+fileName);
				//开始读取
				while ((len = fileStream.read(bs)) != -1) {
					os.write(bs,0,len);
					
				}
			} catch (Exception e) {
				// TODO: handle exception
				e.printStackTrace();
				i=-2;
			}
		    if(user.getuAwatar().equals("")) {
		    	i=-3;
		    }else {
		    	//调用mapper将头像图片星系存入数据库
		    	
				i=userMapper.updatephoto(user);
			}
			return i;
		}
		//账户安全
		@Override
		public Object safe(User user, HttpSession session) {
			
			try {
				String username=(String) session.getAttribute("username");
				User user3=userMapper.selectUserByName(username);
				if(user3.getEmail()!=null) {
					return "您账户安全为50分";
				}else if (user3.getEmail()!=null&&user3.getuId_card()!=null) {	
					return "您账户安全为60分";
				}else if (user3.getEmail()!=null&&user3.getuId_card()!=null&&user.getuTureName()!=null) {
					return "您账户安全为70分";
				}else {
					return "您账户安全为30分";
				}
			} catch (Exception e) {
				// TODO: handle exception
				return "请先登录";
			}
		
			
		}
		//邮箱绑定
		@Override
		public int email_bang(User user) {
		    User user2=userMapper.selectUserByName(user.getName());
		    int i=1;
			if(user2.getEmail()==null) {
				userMapper.email_bang(user);
				i=1;
			}else {
				i=2;
			}
			return i;
		}
		
		
		
		
}