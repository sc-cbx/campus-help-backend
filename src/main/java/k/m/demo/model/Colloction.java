package k.m.demo.model;

public class Colloction {
	private int cID;//编号
	private int gID;//商品编号
	private String gName;//商品名称
	private float gPrice;//商品价格
	private String gImage;//商品图片
	 
	public int getcID() {
		return cID;
	}
	public void setcID(int cID) {
		this.cID = cID;
	}
	public int getgID() {
		return gID;
	}
	public void setgID(int gID) {
		this.gID = gID;
	}
	public String getgName() {
		return gName;
	}
	public void setgName(String gName) {
		this.gName = gName;
	}
	public float getgPrice() {
		return gPrice;
	}
	public void setgPrice(float gPrice) {
		this.gPrice = gPrice;
	}
	public String getgImage() {
		return gImage;
	}
	public void setgImage(String gImage) {
		this.gImage = gImage;
	}
	
	@Override
	public String toString() {
		return "Colloction [cID=" + cID + ", gID=" + gID + ", gName=" + gName + ", gPrice=" + gPrice + ", gImage="
				+ gImage + "]";
	}
}
