package k.m.demo.controller;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

import k.m.demo.model.Secgoods;
import k.m.demo.service.SecgoodsaddService;
import net.sf.json.JSONObject;

@RestController
@RequestMapping("/secgoods")
public class SecgoodsaddController {
	@Autowired
	SecgoodsaddService secgoodsaddService;
//	增加
	@RequestMapping("/secgoodsadd")
	public JSONObject secgoodsadd(@RequestBody Secgoods sadd) {
		JSONObject result=new JSONObject();
		int i=secgoodsaddService.secgoodsadd(sadd);
		result.put("state", i);
		return result;
	}
//	删除
	@RequestMapping("/secgoodsdelete")
	public JSONObject secgoodsdelete(@RequestBody Secgoods sdelete) {
		JSONObject result=new JSONObject();
		int del=secgoodsaddService.secgoodsdelete(sdelete);
		result.put("state", del);
		return result;
	}
//修改
	@RequestMapping("/secgoodsupdate")
	public JSONObject secgoodsupdate(@RequestBody Secgoods supdate) {
		JSONObject result=new JSONObject();
		int upd=secgoodsaddService.secgoodsupdate(supdate);
		result.put("state", upd);
		return result;
	}
}
