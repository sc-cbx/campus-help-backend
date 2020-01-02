package k.m.demo.service;

import java.io.InputStream;

import java.util.List;

import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpSession;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;


import k.m.demo.mapper.UserMapper;
//import k.m.demo.model.SysUser;
import k.m.demo.model.User;



public interface UserService {
	
//     public List<SysUser> getAllUsers();
     public int changepassword(User user);//修改密码
     public Object bankcard(User user,HttpSession session);//银行卡绑定
     public int user_certification(User user);//实名注册
     public List<User> basic_message(User user,HttpSession session);//基本信息的查询
     public  Object loginer(User user,HttpServletRequest request,HttpSession session);//登陆
     public Object dengchu(User user ,HttpSession session);//登出
     public int user_del(User user);//删除,注销
     public int photo(User user,InputStream fileStream);//上传头像
     public Object safe(User user,HttpSession session);//信息安全接口
     public int email_bang(User user);//qq邮箱绑定
}