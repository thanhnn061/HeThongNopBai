package spring.java.HeThongNopBai.model;

public class SinhVienInfo {
	private int maSV;
	private String tenSV;
	public SinhVienInfo(int maSV, String tenSV) {
		super();
		this.maSV = maSV;
		this.tenSV = tenSV;
	}
	public SinhVienInfo() {
		super();
		// TODO Auto-generated constructor stub
	}
	public int getMaSV() {
		return maSV;
	}
	public void setMaSV(int maSV) {
		this.maSV = maSV;
	}
	public String getTenSV() {
		return tenSV;
	}
	public void setTenSV(String tenSV) {
		this.tenSV = tenSV;
	}
	
}
