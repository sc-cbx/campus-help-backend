package k.m.demo.controller;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

import k.m.demo.model.Water_purchase;
import k.m.demo.service.WaterpurchaseService;
import net.sf.json.JSONObject;

//网上购水
@RestController
@RequestMapping("/campushelp")
public class WaterpurchaseController {
	
	@Autowired
	WaterpurchaseService waterpurchaseService;
	
	//查询
	//查全部
	@RequestMapping("/getwater_purchaseList")
	public List<Water_purchase> water_purchases(){
		return waterpurchaseService.getAllwaterpurchase();
	}
	
	//添加
	@RequestMapping("/createwater_purchase")
	public JSONObject createwater_purchase(Water_purchase cpurchase) {
		JSONObject result = new JSONObject();
		int add = waterpurchaseService.createWaterpurchase(cpurchase);
		result.put("state", add);
		return result;
	}
	
	//删除
	@RequestMapping("/deletewater_purchase")
	public JSONObject deletewater_purchase(Water_purchase dpurchase) {
		JSONObject result = new JSONObject();
		int del = waterpurchaseService.deleteWaterpurchase(dpurchase);
		result.put("state", del);
		return result;
	}
	
	//修改
	@RequestMapping("/updatewater_purchase")
	public JSONObject updatewater_purchase(Water_purchase upurchase) {
		JSONObject result = new JSONObject();
		int upd = waterpurchaseService.updateWaterpurchase(upurchase);
		result.put("state", upd);
		return result;
	}
}
