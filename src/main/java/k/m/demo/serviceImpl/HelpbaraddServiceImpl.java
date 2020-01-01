package k.m.demo.serviceImpl;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;
import k.m.demo.mapper.HelpbaraddMapper;
import k.m.demo.model.Helpbar;
import k.m.demo.service.HelpbaraddService;


@Service
public class HelpbaraddServiceImpl implements HelpbaraddService{
	@Autowired
	HelpbaraddMapper helpbaraddMapper;
	@Override
	public int helpbaradd(Helpbar hadd) {
		// TODO Auto-generated method stub
		System.out.println(hadd);
		Helpbar s=helpbaraddMapper.selectHelpbarByHelp_name(hadd.getHelp_name());
		int i=1; 
		if(s==null) {
			helpbaraddMapper.insertHelpbar(hadd);
			System.out.println(hadd);
		}else {
			i=2;
		}
		return i;
	}
	@Override
	public int helpbardelete(Helpbar hdelete) {
		// TODO Auto-generated method stub
		System.out.println(hdelete);
		Helpbar d=helpbaraddMapper.selectHelpbarByHelp_name(hdelete.getHelp_name());
		int del=1; 
		if(d!=null) {
			helpbaraddMapper.deleteHelpbar(hdelete);
			System.out.println(hdelete);
		}else {
			del=2;
		}
		return del;
	}
	@Override
	public int helpbarupdate(Helpbar hupdate) {
		// TODO Auto-generated method stub
		System.out.println(hupdate);
		Helpbar u=helpbaraddMapper.selectHelpbarByHelp_name(hupdate.getHelp_name());
		int upd=1; 
		if(u!=null) {
			helpbaraddMapper.updateHelpbar(hupdate);
			System.out.println(hupdate);
		}else {
			upd=2;
		}
		return upd;
	} 
}
