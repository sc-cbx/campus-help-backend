package k.m.demo.controller;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

import k.m.demo.model.Help_express;
import k.m.demo.service.HelpexpressService;
import net.sf.json.JSONObject;

//快递帮拿
@RestController
@RequestMapping("/campushelp")
public class HelpexpressController {
	
	@Autowired
	HelpexpressService helpexpressService;
	
	//查询
	//查全部
	@RequestMapping("/gethelp_expressList")
	public List<Help_express> help_express(){
		return helpexpressService.getAllhelpexpress();
	}
	
	//添加
	@RequestMapping("/createhelp_express")
	public JSONObject createhelp_express(Help_express cexpress) {
		JSONObject result = new JSONObject();
		int add = helpexpressService.createHelp_express(cexpress);
		result.put("state", add);
		return result;
	}
	
	//删除
	@RequestMapping("/deletehelp_express")
	public JSONObject deletehelp_express(Help_express dexpress) {
		JSONObject result = new JSONObject();
		int del = helpexpressService.deleteHelp_express(dexpress);
		result.put("state", del);
		return result;
	}
	//修改
	@RequestMapping("/updatehelp_express")
	public JSONObject updatehelp_express(Help_express uexpress) {
		JSONObject result = new JSONObject();
		int upd = helpexpressService.updateHelp_express(uexpress);
		result.put("state", upd);
		return result;
	}
	
	
	
	
	
	
	
	
	
	
	
	
	
	
	
	
	
	
	
}
