package spring.java.HeThongNopBai.entity;

import javax.persistence.Column;
import javax.persistence.Entity;
import javax.persistence.Id;
import javax.persistence.Table;

@Entity
@Table(name = "lophocphan")
public class LopHocPhan {
	private int malopHP;
	private int maGV;
	private int maSV;
	private int maMH;
	private String namHoc;
	private String hocKy;
	private int soBN;
	private String tenLHP;
	private String linknopBai;

	@Id
	@Column(name = "MaLopHP")
	public int getMalopHP() {
		return malopHP;
	}

	public void setMalopHP(int malopHP) {
		this.malopHP = malopHP;
	}

	@Column(name = "MaGV")
	public int getMaGV() {
		return maGV;
	}

	public void setMaGV(int maGV) {
		this.maGV = maGV;
	}

	@Column(name = "MaSV")
	public int getMaSV() {
		return maSV;
	}

	public void setMaSV(int maSV) {
		this.maSV = maSV;
	}

	@Column(name = "MaMH")
	public int getMaMH() {
		return maMH;
	}

	public void setMaMH(int maMH) {
		this.maMH = maMH;
	}

	@Column(name = "NamHoc")
	public String getNamHoc() {
		return namHoc;
	}

	public void setNamHoc(String namHoc) {
		this.namHoc = namHoc;
	}

	@Column(name = "HocKy")
	public String getHocKy() {
		return hocKy;
	}

	public void setHocKy(String hocKy) {
		this.hocKy = hocKy;
	}

	@Column(name = "SoBN")
	public int getSoBN() {
		return soBN;
	}

	public void setSoBN(int soBN) {
		this.soBN = soBN;
	}

	@Column(name = "TenLopHP")
	public String getTenLHP() {
		return tenLHP;
	}

	public void setTenLHP(String tenLHP) {
		this.tenLHP = tenLHP;
	}
	@Column(name = "LinkNopBai")
	public String getLinknopBai() {
		return linknopBai;
	}

	public void setLinknopBai(String linknopBai) {
		this.linknopBai = linknopBai;
	}
	

}
