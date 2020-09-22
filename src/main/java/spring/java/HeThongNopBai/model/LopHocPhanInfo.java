package spring.java.HeThongNopBai.model;

public class LopHocPhanInfo {
	private int malopHP;
	private int maGV;
	private int maSV;
	private int maMH;
	private String namHoc;
	private String hocKy;
	private int soBN;
	private String tenLHP;
	private String linknopBai;
	public LopHocPhanInfo(int malopHP, int maGV, int maSV, int maMH, String namHoc, String hocKy, int soBN,
			String tenLHP, String linknopBai) {
		super();
		this.malopHP = malopHP;
		this.maGV = maGV;
		this.maSV = maSV;
		this.maMH = maMH;
		this.namHoc = namHoc;
		this.hocKy = hocKy;
		this.soBN = soBN;
		this.tenLHP = tenLHP;
		this.linknopBai = linknopBai;
	}
	public LopHocPhanInfo() {
		super();
		// TODO Auto-generated constructor stub
	}
	public int getMalopHP() {
		return malopHP;
	}
	public void setMalopHP(int malopHP) {
		this.malopHP = malopHP;
	}
	public int getMaGV() {
		return maGV;
	}
	public void setMaGV(int maGV) {
		this.maGV = maGV;
	}
	public int getMaSV() {
		return maSV;
	}
	public void setMaSV(int maSV) {
		this.maSV = maSV;
	}
	public int getMaMH() {
		return maMH;
	}
	public void setMaMH(int maMH) {
		this.maMH = maMH;
	}
	public String getNamHoc() {
		return namHoc;
	}
	public void setNamHoc(String namHoc) {
		this.namHoc = namHoc;
	}
	public String getHocKy() {
		return hocKy;
	}
	public void setHocKy(String hocKy) {
		this.hocKy = hocKy;
	}
	public int getSoBN() {
		return soBN;
	}
	public void setSoBN(int soBN) {
		this.soBN = soBN;
	}
	public String getTenLHP() {
		return tenLHP;
	}
	public void setTenLHP(String tenLHP) {
		this.tenLHP = tenLHP;
	}
	public String getLinknopBai() {
		return linknopBai;
	}
	public void setLinknopBai(String linknopBai) {
		this.linknopBai = linknopBai;
	}
	

}
