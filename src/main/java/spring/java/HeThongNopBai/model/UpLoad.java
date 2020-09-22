package spring.java.HeThongNopBai.model;

import java.io.Serializable;

import org.springframework.web.multipart.MultipartFile;

public class UpLoad implements Serializable {
	private static final long serialVersionUID = 1L;
	private MultipartFile multipartFile;
	private String namHoc;
	private String hocKy;
	private int maGV;
	private int maMH;
	private int malopHP;

	public MultipartFile getMultipartFile() {
		return multipartFile;
	}

	public void setMultipartFile(MultipartFile multipartFile) {
		this.multipartFile = multipartFile;
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

	public int getMaGV() {
		return maGV;
	}

	public void setMaGV(int maGV) {
		this.maGV = maGV;
	}

	public int getMaMH() {
		return maMH;
	}

	public void setMaMH(int maMH) {
		this.maMH = maMH;
	}

	public int getMalopHP() {
		return malopHP;
	}

	public void setMalopHP(int malopHP) {
		this.malopHP = malopHP;
	}
	
}
