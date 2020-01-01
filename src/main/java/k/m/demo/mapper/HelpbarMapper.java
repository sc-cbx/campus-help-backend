package k.m.demo.mapper;

import java.util.List;

import org.apache.ibatis.annotations.Mapper;

import k.m.demo.model.Helpbar;

@Mapper
public interface HelpbarMapper {
	public List<Helpbar> selectAllHelpbar();
}
