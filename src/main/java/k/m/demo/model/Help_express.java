package k.m.demo.model;

public class Help_express {
	private int heID;//编号
	private int uID;//用户编号
	private String pickup_name;//取件名称
	private String exName;//快递名称
	private String receive_site;//送达地址
	private String telephone;//联系方式
	private String pickup_site;//取件地点
	private String pickup_num;//取件码
	public int getHeID() {
		return heID;
	}
	public void setHeID(int heID) {
		this.heID = heID;
	}
	public int getuID() {
		return uID;
	}
	public void setuID(int uID) {
		this.uID = uID;
	}
	public String getPickup_name() {
		return pickup_name;
	}
	public void setPickup_name(String pickup_name) {
		this.pickup_name = pickup_name;
	}
	public String getExName() {
		return exName;
	}
	public void setExName(String exName) {
		this.exName = exName;
	}
	public String getReceive_site() {
		return receive_site;
	}
	public void setReceive_site(String receive_site) {
		this.receive_site = receive_site;
	}
	public String getTelephone() {
		return telephone;
	}
	public void setTelephone(String telephone) {
		this.telephone = telephone;
	}
	public String getPickup_site() {
		return pickup_site;
	}
	public void setPickup_site(String pickup_site) {
		this.pickup_site = pickup_site;
	}
	public String getPickup_num() {
		return pickup_num;
	}
	public void setPickup_num(String pickup_num) {
		this.pickup_num = pickup_num;
	}
	
	@Override
	public String toString() {
		return "Help_express [heID=" + heID + ", uID=" + uID + ", pickup_name=" + pickup_name + ", exName=" + exName
				+ ", receive_site=" + receive_site + ", telephone=" + telephone + ", pickup_site=" + pickup_site
				+ ", pickup_num=" + pickup_num + "]";
	}
}
