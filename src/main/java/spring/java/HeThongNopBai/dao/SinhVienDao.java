package spring.java.HeThongNopBai.dao;

import java.util.List;
import spring.java.HeThongNopBai.entity.SinhVien;
import spring.java.HeThongNopBai.model.SinhVienInfo;

public interface SinhVienDao {
	public List<SinhVienInfo> xemSinhVien();
	public void themsv(SinhVienInfo sv);
	public SinhVien findSinhVien(int maSV);
	public void xoasinhvien(int maSV);

}
