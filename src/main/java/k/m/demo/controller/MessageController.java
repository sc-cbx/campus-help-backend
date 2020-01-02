package k.m.demo.controller;

import java.lang.ProcessBuilder.Redirect;

import javax.servlet.http.HttpSession;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

import k.m.demo.model.User;
import k.m.demo.service.MessageService;
import net.sf.json.JSONObject;

@RestController
@RequestMapping("/user")
public class MessageController {
	@Autowired
	MessageService messageService;


	
	@RequestMapping("/message")
	public JSONObject message(@RequestBody User user,HttpSession session) {
		JSONObject result=new JSONObject();
		
		//调用service层
		int i=messageService.message(user,session);
		result.put("state", i);
		return result;
	}
    
}
