package spring.java.HeThongNopBai.model;

public class TaiKhoanInfo {
	private String id;
	private String user;
	private String matKhau;
	private String phanQuyen;
	public TaiKhoanInfo(String id, String user, String matKhau, String phanQuyen) {
		super();
		this.id = id;
		this.user = user;
		this.matKhau = matKhau;
		this.phanQuyen = phanQuyen;
	}
	public TaiKhoanInfo() {
		super();
		// TODO Auto-generated constructor stub
	}
	public String getId() {
		return id;
	}
	public void setId(String id) {
		this.id = id;
	}
	public String getUser() {
		return user;
	}
	public void setUser(String user) {
		this.user = user;
	}
	public String getMatKhau() {
		return matKhau;
	}
	public void setMatKhau(String matKhau) {
		this.matKhau = matKhau;
	}
	public String getPhanQuyen() {
		return phanQuyen;
	}
	public void setPhanQuyen(String phanQuyen) {
		this.phanQuyen = phanQuyen;
	}
	

}
