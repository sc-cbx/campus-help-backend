package k.m.demo.model;

import java.math.BigDecimal;
import java.util.Date;

public class Secgoods {
	private int secgoods_id;//编号
	private String secgoods_type;//类别
	private String secgoods_name;//名称
	private BigDecimal secgoods_price;//原价
	private int secgoods_num;//库存
	private BigDecimal secgoods_newprice;//转价
	private String secgoods_phone;//联系方式
	private String secgoods_introduction;//简介
	private String secgoods_content;//宝贝介绍
	private String secgoods_comment;//评论
	private String secgoods_poster;//图片
	private Date secgoods_date;//发布时间
	public int getSecgoods_id() {
		return secgoods_id;
	}
	public void setSecgoods_id(int secgoods_id) {
		this.secgoods_id = secgoods_id;
	}
	public String getSecgoods_type() {
		return secgoods_type;
	}
	public void setSecgoods_type(String secgoods_type) {
		this.secgoods_type = secgoods_type;
	}
	public String getSecgoods_name() {
		return secgoods_name;
	}
	public void setSecgoods_name(String secgoods_name) {
		this.secgoods_name = secgoods_name;
	}
	public BigDecimal getSecgoods_price() {
		return secgoods_price;
	}
	public void setSecgoods_price(BigDecimal secgoods_price) {
		this.secgoods_price = secgoods_price;
	}
	public int getSecgoods_num() {
		return secgoods_num;
	}
	public void setSecgoods_num(int secgoods_num) {
		this.secgoods_num = secgoods_num;
	}
	public BigDecimal getSecgoods_newprice() {
		return secgoods_newprice;
	}
	public void setSecgoods_newprice(BigDecimal secgoods_newprice) {
		this.secgoods_newprice = secgoods_newprice;
	}
	public String getSecgoods_phone() {
		return secgoods_phone;
	}
	public void setSecgoods_phone(String secgoods_phone) {
		this.secgoods_phone = secgoods_phone;
	}
	public String getSecgoods_introduction() {
		return secgoods_introduction;
	}
	public void setSecgoods_introduction(String secgoods_introduction) {
		this.secgoods_introduction = secgoods_introduction;
	}
	public String getSecgoods_content() {
		return secgoods_content;
	}
	public void setSecgoods_content(String secgoods_content) {
		this.secgoods_content = secgoods_content;
	}
	public String getSecgoods_comment() {
		return secgoods_comment;
	}
	public void setSecgoods_comment(String secgoods_comment) {
		this.secgoods_comment = secgoods_comment;
	}
	public String getSecgoods_poster() {
		return secgoods_poster;
	}
	public void setSecgoods_poster(String secgoods_poster) {
		this.secgoods_poster = secgoods_poster;
	}
	public Date getSecgoods_date() {
		return secgoods_date;
	}
	public void setSecgoods_date(Date secgoods_date) {
		this.secgoods_date = secgoods_date;
	}
	@Override
	public String toString() {
		return "Secgoods [secgoods_id=" + secgoods_id + ", secgoods_type=" + secgoods_type + ", secgoods_name="
				+ secgoods_name + ", secgoods_price=" + secgoods_price + ", secgoods_num=" + secgoods_num
				+ ", secgoods_newprice=" + secgoods_newprice + ", secgoods_phone=" + secgoods_phone
				+ ", secgoods_introduction=" + secgoods_introduction + ", secgoods_content=" + secgoods_content
				+ ", secgoods_comment=" + secgoods_comment + ", secgoods_poster=" + secgoods_poster + ", secgoods_date="
				+ secgoods_date + "]";
	}
	
	
}
