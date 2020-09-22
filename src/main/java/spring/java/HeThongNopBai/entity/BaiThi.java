package spring.java.HeThongNopBai.entity;

import java.sql.Date;

import javax.persistence.Column;
import javax.persistence.Entity;
import javax.persistence.Id;
import javax.persistence.Table;

@Entity
@Table(name = "baithi")
public class BaiThi {
	private int maSV;
	private int malopHP;
	private int maBN;
	private Date thoigianNop;

	@Id
	@Column(name = "MaSV")
	public int getMaSV() {
		return maSV;
	}

	public void setMaSV(int maSV) {
		this.maSV = maSV;
	}

	@Column(name = "MaLopHP")
	public int getMalopHP() {
		return malopHP;
	}

	public void setMalopHP(int malopHP) {
		this.malopHP = malopHP;
	}

	@Column(name = "MaBN")
	public int getMaBN() {
		return maBN;
	}

	public void setMaBN(int maBN) {
		this.maBN = maBN;
	}

	@Column(name = "ThoiGianNop")

	public Date getThoigianNop() {
		return thoigianNop;
	}

	public void setThoigianNop(Date thoigianNop) {
		this.thoigianNop = thoigianNop;
	}

}
