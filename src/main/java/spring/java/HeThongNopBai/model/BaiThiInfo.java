package spring.java.HeThongNopBai.model;

public class BaiThiInfo {
	private String maSV;
	private String malopHP;
	private String maBN;
	private String thoigianNop;
	private String lopHP;
	public BaiThiInfo(String maSV, String malopHP, String maBN, String thoigianNop, String lopHP) {
		super();
		this.maSV = maSV;
		this.malopHP = malopHP;
		this.maBN = maBN;
		this.thoigianNop = thoigianNop;
		this.lopHP = lopHP;
	}
	public BaiThiInfo() {
		super();
		// TODO Auto-generated constructor stub
	}
	public String getMaSV() {
		return maSV;
	}
	public void setMaSV(String maSV) {
		this.maSV = maSV;
	}
	public String getMalopHP() {
		return malopHP;
	}
	public void setMalopHP(String malopHP) {
		this.malopHP = malopHP;
	}
	public String getMaBN() {
		return maBN;
	}
	public void setMaBN(String maBN) {
		this.maBN = maBN;
	}
	public String getThoigianNop() {
		return thoigianNop;
	}
	public void setThoigianNop(String thoigianNop) {
		this.thoigianNop = thoigianNop;
	}
	public String getLopHP() {
		return lopHP;
	}
	public void setLopHP(String lopHP) {
		this.lopHP = lopHP;
	}
	

}
