package k.m.demo.controller;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

import k.m.demo.model.Secgoods;
import k.m.demo.service.SecgoodsService;

@RestController
@RequestMapping("/secgoods")
public class SecgoodsController {
	@Autowired
	SecgoodsService secgoodsService;
	@RequestMapping("/getList")
	public List<Secgoods> getList(){
		return secgoodsService.getSecgoodsList();
	}
}
