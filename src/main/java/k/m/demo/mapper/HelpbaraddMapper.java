package k.m.demo.mapper;

import org.apache.ibatis.annotations.Mapper;

import k.m.demo.model.Helpbar;

@Mapper
public interface HelpbaraddMapper {
	public Helpbar selectHelpbarByHelp_name(String help_name);
	public int insertHelpbar(Helpbar hadd);
	public int deleteHelpbar(Helpbar hdelete);
	public int updateHelpbar(Helpbar hupdate);
}
