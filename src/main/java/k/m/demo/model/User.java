package k.m.demo.model;

import java.util.Date;

public class User {
	private int Uid;
	private String name;
	private String email;
	private String password;
	private String confirm_password;
	private String uSex;
	private Date uBirth;
	private String uAddress;
	private String uStatus;
	private String uOther_message;
	private String uAwatar;
	private Date uRegTime;
	private String checkvode;
	private String uBank_card;
	private String uTureName;
	private String uId_card;
	private Date uRenZhengTime;
	
	public Date getuRenZhengTime() {
		return uRenZhengTime;
	}
	public void setuRenZhengTime(Date uRenZhengTime) {
		this.uRenZhengTime = uRenZhengTime;
	}
	public String getuTureName() {
		return uTureName;
	}
	public void setuTureName(String uTureName) {
		this.uTureName = uTureName;
	}
	public String getuId_card() {
		return uId_card;
	}
	public void setuId_card(String uId_card) {
		this.uId_card = uId_card;
	}
	public String getuBank_card() {
		return uBank_card;
	}
	public void setuBank_card(String uBank_card) {
		this.uBank_card = uBank_card;
	}
	public String getCheckvode() {
		return checkvode;
	}
	public void setCheckvode(String checkvode) {
		this.checkvode = checkvode;
	}
	public int getUid() {
		return Uid;
	}
	public void setUid(int uid) {
		Uid = uid;
	}
	public String getName() {
		return name;
	}
	public void setName(String name) {
		this.name = name;
	}
	public String getEmail() {
		return email;
	}
	public void setEmail(String email) {
		this.email = email;
	}
	public String getPassword() {
		return password;
	}
	public void setPassword(String password) {
		this.password = password;
	}
	public String getConfirm_password() {
		return confirm_password;
	}
	public void setConfirm_password(String confirm_password) {
		this.confirm_password = confirm_password;
	}
	public String getuSex() {
		return uSex;
	}
	public void setuSex(String uSex) {
		this.uSex = uSex;
	}
	public Date getuBirth() {
		return uBirth;
	}
	public void setuBirth(Date uBirth) {
		this.uBirth = uBirth;
	}
	public String getuAddress() {
		return uAddress;
	}
	public void setuAddress(String uAddress) {
		this.uAddress = uAddress;
	}
	public String getuStatus() {
		return uStatus;
	}
	public void setuStatus(String uStatus) {
		this.uStatus = uStatus;
	}
	public String getuOther_message() {
		return uOther_message;
	}
	public void setuOther_message(String uOther_message) {
		this.uOther_message = uOther_message;
	}
	public String getuAwatar() {
		return uAwatar;
	}
	public void setuAwatar(String uAwatar) {
		this.uAwatar = uAwatar;
	}
	public Date getuRegTime() {
		return uRegTime;
	}
	public void setuRegTime(Date uRegTime) {
		this.uRegTime = uRegTime;
	}
	@Override
	public String toString() {
		return "User [Uid=" + Uid + ", name=" + name + ", email=" + email + ", password=" + password
				+ ", confirm_password=" + confirm_password + ", uSex=" + uSex + ", uBirth=" + uBirth + ", uAddress="
				+ uAddress + ", uStatus=" + uStatus + ", uOther_message=" + uOther_message + ", uAwatar=" + uAwatar
				+ ", uRegTime=" + uRegTime + ", checkvode=" + checkvode + ", uBank_card=" + uBank_card + ", uTureName="
				+ uTureName + ", uId_card=" + uId_card + ", uRenZhengTimeDate=" + uRenZhengTime + "]";
	}



	
	

	}
