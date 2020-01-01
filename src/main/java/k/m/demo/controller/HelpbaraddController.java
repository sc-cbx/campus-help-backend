package k.m.demo.controller;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

import k.m.demo.model.Helpbar;
import k.m.demo.model.Secgoods;
import k.m.demo.service.HelpbaraddService;
import k.m.demo.service.SecgoodsaddService;
import net.sf.json.JSONObject;

@RestController
@RequestMapping("/helpbar")
public class HelpbaraddController {
	@Autowired
	HelpbaraddService helpbaraddService;
//	增加
	@RequestMapping("/helpbaradd")
	public JSONObject helpbaradd(@RequestBody Helpbar hadd) {
		JSONObject result=new JSONObject();
		int i=helpbaraddService.helpbaradd(hadd);
		result.put("state", i);
		return result;
	}
//	删除
	@RequestMapping("/helpbardelete")
	public JSONObject helpbardelete(@RequestBody Helpbar hdelete) {
		JSONObject result=new JSONObject();
		int del=helpbaraddService.helpbardelete(hdelete);
		result.put("state", del);
		return result;
	}
//修改
	@RequestMapping("/helpbarupdate")
	public JSONObject helpbarupdate(@RequestBody Helpbar hupdate) {
		JSONObject result=new JSONObject();
		int upd=helpbaraddService.helpbarupdate(hupdate);
		result.put("state", upd);
		return result;
	}
}
