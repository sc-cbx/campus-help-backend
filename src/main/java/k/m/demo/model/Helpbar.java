package k.m.demo.model;

import java.util.Date;

public class Helpbar {
	private int help_id;//互助贴吧编号
	private String help_name;//求助事情
	private String help_content;//求助描述
	private String help_requirement;//求助要求
	private String help_contact;//详情联系
	private String help_replay;//回复
	private Date help_time;//发布时间
	public int getHelp_id() {
		return help_id;
	}
	public void setHelp_id(int help_id) {
		this.help_id = help_id;
	}
	public String getHelp_name() {
		return help_name;
	}
	public void setHelp_name(String help_name) {
		this.help_name = help_name;
	}
	public String getHelp_content() {
		return help_content;
	}
	public void setHelp_content(String help_content) {
		this.help_content = help_content;
	}
	public String getHelp_requirement() {
		return help_requirement;
	}
	public void setHelp_requirement(String help_requirement) {
		this.help_requirement = help_requirement;
	}
	public String getHelp_contact() {
		return help_contact;
	}
	public void setHelp_contact(String help_contact) {
		this.help_contact = help_contact;
	}
	public String getHelp_replay() {
		return help_replay;
	}
	public void setHelp_replay(String help_replay) {
		this.help_replay = help_replay;
	}
	public Date getHelp_time() {
		return help_time;
	}
	public void setHelp_time(Date help_time) {
		this.help_time = help_time;
	}
	@Override
	public String toString() {
		return "Helpbar [help_id=" + help_id + ", help_name=" + help_name + ", help_content=" + help_content
				+ ", help_requirement=" + help_requirement + ", help_contact=" + help_contact + ", help_replay="
				+ help_replay + ", help_time=" + help_time + "]";
	}
	
}
