package spring.java.HeThongNopBai.entity;

import javax.persistence.Column;
import javax.persistence.Entity;
import javax.persistence.Id;
import javax.persistence.Table;

@Entity
@Table(name="giangvien")
public class GiangVien {
	private int maGV;
	private String tenGV;
	@Id
	@Column(name="MaGV")
	public int getMaGV() {
		return maGV;
	}
	public void setMaGV(int maGV) {
		this.maGV = maGV;
	}
	@Column(name="TenGV")
	public String getTenGV() {
		return tenGV;
	}
	public void setTenGV(String tenGV) {
		this.tenGV = tenGV;
	}
	
	

}
