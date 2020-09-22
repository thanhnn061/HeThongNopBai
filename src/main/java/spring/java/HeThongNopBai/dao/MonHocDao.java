package spring.java.HeThongNopBai.dao;

import java.util.List;

import spring.java.HeThongNopBai.entity.GiangVien;
import spring.java.HeThongNopBai.entity.MonHoc;
import spring.java.HeThongNopBai.model.GiangVienInfo;
import spring.java.HeThongNopBai.model.MonHocInfo;

public interface MonHocDao {
	public List<MonHocInfo> XemMonHoc();
	public void themmh(MonHocInfo mh);
	public void xoamonhoc(int maMH);
	public void uploadmh(MonHocInfo mh);
	public MonHocInfo loadMHTheoMa(int maMH);
	public MonHoc findMonHoc(int maMH);
}
