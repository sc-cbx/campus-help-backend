package k.m.demo.serviceImpl;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import k.m.demo.mapper.HelpbarMapper;
import k.m.demo.model.Helpbar;
import k.m.demo.service.HelpbarService;

@Service
public class HelpbarServiceImpl implements HelpbarService{
	@Autowired
	HelpbarMapper helpbarMapper;
	@Override
	public List<Helpbar> getHelpbarList() {
		// TODO Auto-generated method stub
		return helpbarMapper.selectAllHelpbar();
	}

}
