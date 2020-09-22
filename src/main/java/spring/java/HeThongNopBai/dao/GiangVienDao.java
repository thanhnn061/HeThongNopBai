package spring.java.HeThongNopBai.dao;

import java.util.List;

import spring.java.HeThongNopBai.entity.GiangVien;
import spring.java.HeThongNopBai.model.GiangVienInfo;

public interface GiangVienDao {
	public List<GiangVienInfo> xemGiangVien();
	public void themgv(GiangVienInfo gv);
	public void xoagiangvien(int maGV);
	public GiangVien findGiangVien(int maGV);
	public void uploadgv(GiangVienInfo gv);
	public GiangVienInfo loadGVTheoMa(int maGV);

}
