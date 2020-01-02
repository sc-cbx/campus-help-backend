package k.m.demo.controller;

import javax.servlet.http.HttpServletRequest;



import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.boot.jackson.JsonObjectDeserializer;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;
import org.springframework.web.servlet.ModelAndView;

import k.m.demo.model.User;

import k.m.demo.service.RegisterService;
import net.sf.json.JSONObject;

@RestController
@RequestMapping("/user")

public class RegisterController {
	@Autowired
	RegisterService registerService;
	
	
	@RequestMapping("/register")
	
	public JSONObject register(@RequestBody User user) {
		//用来装返回值
		JSONObject result =new JSONObject();
		
		//调用service层
		int i=registerService.register(user);
				result.put("state",i );
		return result;
		
		}
	
	
	
	
	
	}