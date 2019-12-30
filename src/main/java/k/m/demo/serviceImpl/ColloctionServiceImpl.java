package k.m.demo.serviceImpl;

import java.io.File;
import java.io.FileOutputStream;
import java.io.InputStream;
import java.io.OutputStream;
import java.util.Date;
import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import k.m.demo.mapper.ColloctionMapper;
import k.m.demo.model.Colloction;
import k.m.demo.service.ColloctionService;

//收藏夹
@Service("colloctionService")
public class ColloctionServiceImpl implements ColloctionService{

	@Autowired
	ColloctionMapper colloctionMapper;
	//查询
	//查全部
	@Override
	public List<Colloction> getAllcolloction() {
		// TODO Auto-generated method stub
		return colloctionMapper.selectAllColloction();
	}
	//根据heID查
	@Override
	public int getColloctionBycID(int cID) {
		// TODO Auto-generated method stub
		Colloction ct = colloctionMapper.selectColloctionBycID(cID);
		int i = 1;
		if(ct==null) {
			i=2;
		}else {
			colloctionMapper.selectColloctionBycID(cID);
		}
		return i;
	}
	
	//添加
	@Override
	public int createColloction(Colloction ccolloction, InputStream fileStream) {
		// TODO Auto-generated method stub
		Colloction ct = colloctionMapper.selectColloctionBycID(ccolloction.getcID());
		String path = "C:\\Users\\zhangyu\\Desktop\\campus_help_backstage\\help_express";
		int i = -1;
		byte[] bs = new byte[1024];
		
		//读取数据的长度
		int len;
		//输出的文件流保存到本地文件
		try {
			File tempFile = new File(path);
			if(!tempFile.exists()) {
				tempFile.mkdirs();
			}
			Date today = new Date();
			String fileName = today.getTime() + ccolloction.getgImage();
			ccolloction.setgImage("/gImage/"+fileName);
			OutputStream os = new FileOutputStream(tempFile.getPath()+File.separator + fileName);
			//开始读取
			while ((len = fileStream.read(bs)) != -1){
				os.write(bs, 0, len);
			}
		} catch (Exception e) {
			// TODO: handle exception
			e.printStackTrace();
			i = -2;
		}
		if((ccolloction.getgImage().equals("")) && (ct==null)) {
			i = -3;
		}else {
			i = colloctionMapper.insertColloction(ccolloction);
		}
		return i;
	}

	//删除
	@Override
	public int deleteColloction(Colloction dcolloction) {
		// TODO Auto-generated method stub
		Colloction ct = colloctionMapper.selectColloctionBycID(dcolloction.getcID());
		int i = 1;
		if(ct != null) {
			colloctionMapper.deleteColloction(dcolloction);
		}else {
			i = 2;
		}
		return i;
	}

	//修改
	@Override
	public int updateColloction(Colloction ucolloction) {
		// TODO Auto-generated method stub
		Colloction ct = colloctionMapper.selectColloctionBycID(ucolloction.getcID());
		int i = 1;
		if(ct != null) {
			colloctionMapper.updateColloction(ucolloction);
		}else {
			i = 2;
		}
		return i;
	}
}
