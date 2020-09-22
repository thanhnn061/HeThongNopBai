package spring.java.HeThongNopBai.entity;

import javax.persistence.Column;
import javax.persistence.Entity;
import javax.persistence.Id;
import javax.persistence.Table;

@Entity
@Table(name="monhoc")
public class MonHoc {
	private int maMH;
	private String tenMH;
	@Id
	@Column(name="MaMH")
	public int getMaMH() {
		return maMH;
	}
	public void setMaMH(int maMH) {
		this.maMH = maMH;
	}
	@Column(name="TenMH")
	public String getTenMH() {
		return tenMH;
	}
	
	public void setTenMH(String tenMH) {
		this.tenMH = tenMH;
	}
	
	

	
	
	

}
