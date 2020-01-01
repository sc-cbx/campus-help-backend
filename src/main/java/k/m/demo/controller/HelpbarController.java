package k.m.demo.controller;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

import k.m.demo.model.Helpbar;
import k.m.demo.service.HelpbarService;

@RestController
@RequestMapping("/helpbar")
public class HelpbarController {
	@Autowired
	HelpbarService helpbarService;
	@RequestMapping("/getList")
	public List<Helpbar> getList(){
		return helpbarService.getHelpbarList();
	}
}
