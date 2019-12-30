package k.m.demo.controller;

import java.io.IOException;
import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;
import org.springframework.web.multipart.MultipartFile;

import k.m.demo.model.Colloction;
import k.m.demo.service.ColloctionService;
import net.sf.json.JSONObject;

//收藏夹
@RestController
@RequestMapping("/campushelp")
public class ColloctionController {
	
	@Autowired
	ColloctionService colloctionService;
	
	//查询
	//查全部
	
	@RequestMapping("/getcolloctionList")
	public List<Colloction> colloction(){
		return null;
	}
	
	//添加
	@RequestMapping("/createcolloction")
	public JSONObject createcolloction(Colloction ccolloction, MultipartFile file) {
		JSONObject result = new JSONObject();
		ccolloction.setgImage(file.getOriginalFilename());
		int i = 0;
		try {
			i = colloctionService.createColloction(ccolloction, file.getInputStream());
		} catch (IOException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		}
		result.put("state", i);
		return result;
	}
	
	//删除
	@RequestMapping("/deletecolloction")
	public JSONObject deletecolloction(Colloction ccolloction) {
		JSONObject result = new JSONObject();
		int i = colloctionService.deleteColloction(ccolloction);
		result.put("state", i);
		return result;
	}
	
	//修改
	@RequestMapping("/updatecolloction")
	public JSONObject updatecolloction(Colloction ccolloction) {
		JSONObject result = new JSONObject();
		int i = colloctionService.updateColloction(ccolloction);
		result.put("state", i);
		return result;
	}	
}
