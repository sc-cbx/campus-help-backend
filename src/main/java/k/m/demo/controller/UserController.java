package k.m.demo.controller;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;
//JSON格式
//RESTful风格

import k.m.demo.model.SysUser;
import k.m.demo.model.cohelpUser;
import k.m.demo.model.waterUser;
import k.m.demo.service.UserService;
import net.sf.json.JSONObject;

@RestController
@RequestMapping("/user")
public class UserController {
	@Autowired
	UserService userService;
	@RequestMapping("/getAll")
	public List<SysUser> getAll(){
		return userService.getAllUsers();
	}
	@RequestMapping("/create")
	public int create(){
		return 0;
	}
	
//	快递帮拿
	@Autowired
	UserService userService1;
	
	@RequestMapping("/courier_help")
	public JSONObject courier_help(@RequestBody cohelpUser user) {
		JSONObject result = new JSONObject();
		
		//调用Service层
		int i = userService1.courier_help(user);
		result.put("state", i);
		
		return result;
	}
	
//	网上购水
	@Autowired
	UserService userService2;
	
	@RequestMapping("/online_buy_water")
	public JSONObject online_buy_water(@RequestBody waterUser user) {
		JSONObject result = new JSONObject();
		
		int i = userService2.online_buy_water(user);
		result.put("state", i);
		
		return result;
	}
}
