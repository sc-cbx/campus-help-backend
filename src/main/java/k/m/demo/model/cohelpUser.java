package k.m.demo.model;

public class cohelpUser {
	int chUId;
	String name; // 取件姓名
	String telephone; //电话号码
	String site; //送达地址
	String courier_name; //快递名称
	String take_num; //取件码
	String take_site; //取件地址
	Double weight;//重量

	public int getChUId() {
		return chUId;
	}
	public void setChUId(int chUId) {
		this.chUId = chUId;
	}
	public String getName() {
		return name;
	}
	public void setName(String name) {
		this.name = name;
	}
	public String getTelephone() {
		return telephone;
	}
	public void setTelephone(String telephone) {
		this.telephone = telephone;
	}
	public String getSite() {
		return site;
	}
	public void setSite(String site) {
		this.site = site;
	}
	public String getCourier_name() {
		return courier_name;
	}
	public void setCourier_name(String courier_name) {
		this.courier_name = courier_name;
	}
	public String getTake_num() {
		return take_num;
	}
	public void setTake_num(String take_num) {
		this.take_num = take_num;
	}
	public String getTake_site() {
		return take_site;
	}
	public void setTake_site(String take_site) {
		this.take_site = take_site;
	}
	public Double getWeight() {
		return weight;
	}
	public void setWeight(Double weight) {
		this.weight = weight;
	}
	
}
