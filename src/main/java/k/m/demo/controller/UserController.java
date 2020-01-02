package k.m.demo.controller;
import java.io.IOException;


import java.security.PublicKey;
import java.util.List;

import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpSession;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;
import org.springframework.web.multipart.MultipartFile;

import k.m.demo.mapper.UserMapper;

import k.m.demo.model.User;

import k.m.demo.service.UserService;
import net.sf.json.JSONObject;


//JSON格式的数据
//restful风格
@RestController
@RequestMapping("/user")
public class UserController {
	
	@Autowired
	UserService userService;
//	LoginService loginService;
	UserMapper userMapper;
	
//	@RequestMapping("/getAll")
//	public List<SysUser> getAll(){
//		return userService.getAllUsers();
//	}
//	@RequestMapping("/create")
//	public int create() {
//		return 123;
//	}
	//更改密码
	@RequestMapping("changepassword")
	public JSONObject changepassword(@RequestBody User user) {
	     JSONObject result=new JSONObject();
	     int i=userService.changepassword(user);
	     result.put("state", i);
	     return result;
	}
	//添加银行卡
	@RequestMapping("/bank_card")
	public Object bankcard(@RequestBody User user, HttpSession session) {
		return userService.bankcard(user, session);
	}
	//实名认证
	@RequestMapping("/user_certification")
	public JSONObject user_certification(@RequestBody User user) {
		JSONObject result=new JSONObject();
		int i=userService.user_certification(user);
		result.put("state", i);
		return result;
	}
	//登录
	@RequestMapping("/loginer")
	   public Object loginer(@RequestBody User user ,HttpServletRequest request,HttpSession session){
		return userService.loginer(user, request,session);
    }
	//登出
	@RequestMapping("/dengchu")
	   public  Object dengchu( User user,HttpSession session) {
		return userService.dengchu(user, session);
	}

//获取基本用户实名信息
	@RequestMapping("/basic_message")
	public List<User> basic_message(@RequestBody User user,HttpSession session) {
		return userService.basic_message(user,session);
	}
	//用户注销
	@RequestMapping("/user_del")
	public JSONObject user_del(@RequestBody User user) {
	     JSONObject result=new JSONObject();
	     int i=userService.user_del(user);
	     result.put("state", i);
	     return result;
	}
	//更改头像
	@RequestMapping("/photo")
	public JSONObject photo(User user,MultipartFile file) {
		 JSONObject result=new JSONObject();
		int i=0;
		try {
	     i =	userService.photo(user, file.getInputStream());
		} catch (IOException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		}
	    result.put("state", i);
		return result;
	}
	//用户安全评测
	@RequestMapping("safe")
	   public  Object safe( User user,HttpSession session) {
		return userService.safe(user, session);
	} 
	//绑定邮箱
	@RequestMapping("/email_bang")
	public JSONObject email_bang(@RequestBody User user) {
	     JSONObject result=new JSONObject();
	     int i=userService.email_bang(user);
	     result.put("state", i);
	     return result;
	}
	
}

