package spring.java.HeThongNopBai.model;

public class GiangVienInfo {
	private int maGV;
	private String tenGV;
	public GiangVienInfo(int maGV, String tenGV) {
		super();
		this.maGV = maGV;
		this.tenGV = tenGV;
	}
	public GiangVienInfo() {
		super();
		// TODO Auto-generated constructor stub
	}
	public int getMaGV() {
		return maGV;
	}
	public void setMaGV(int maGV) {
		this.maGV = maGV;
	}
	public String getTenGV() {
		return tenGV;
	}
	public void setTenGV(String tenGV) {
		this.tenGV = tenGV;
	}
	
	
	

}
