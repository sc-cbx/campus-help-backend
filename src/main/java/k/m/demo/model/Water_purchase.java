package k.m.demo.model;

public class Water_purchase {
	private int wpID;//编号
	private int uID;//用户编号
	private String wpName;//联系人姓名
	private int wp_num;//数量
	private String dormitory;//寝室
	private String telephone;//联系方式
	public int getWpID() {
		return wpID;
	}
	public void setWpID(int wpID) {
		this.wpID = wpID;
	}
	public int getuID() {
		return uID;
	}
	public void setuID(int uID) {
		this.uID = uID;
	}
	public String getWpName() {
		return wpName;
	}
	public void setWpName(String wpName) {
		this.wpName = wpName;
	}
	public int getWp_num() {
		return wp_num;
	}
	public void setWp_num(int wp_num) {
		this.wp_num = wp_num;
	}
	public String getDormitory() {
		return dormitory;
	}
	public void setDormitory(String dormitory) {
		this.dormitory = dormitory;
	}
	public String getTelephone() {
		return telephone;
	}
	public void setTelephone(String telephone) {
		this.telephone = telephone;
	}
	@Override
	public String toString() {
		return "Water_purchase [wpID=" + wpID + ", uID=" + uID + ", wpName=" + wpName + ", wp_num=" + wp_num
				+ ", dormitory=" + dormitory + ", telephone=" + telephone + "]";
	}
	

}
