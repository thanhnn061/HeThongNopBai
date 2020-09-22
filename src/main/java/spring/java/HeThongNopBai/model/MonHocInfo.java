package spring.java.HeThongNopBai.model;

public class MonHocInfo {
	private int maMH;
	private String tenMH;
	public MonHocInfo(int maMH, String tenMH) {
		super();
		this.maMH = maMH;
		this.tenMH = tenMH;
	}
	public MonHocInfo() {
		super();
		// TODO Auto-generated constructor stub
	}
	public int getMaMH() {
		return maMH;
	}
	public void setMaMH(int maMH) {
		this.maMH = maMH;
	}
	public String getTenMH() {
		return tenMH;
	}
	public void setTenMH(String tenMH) {
		this.tenMH = tenMH;
	}
}
