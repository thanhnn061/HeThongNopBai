package spring.java.HeThongNopBai.dao;

import java.util.List;

import javax.transaction.Transactional;

import spring.java.HeThongNopBai.entity.GiangVien;
import spring.java.HeThongNopBai.entity.TaiKhoan;
import spring.java.HeThongNopBai.model.GiangVienInfo;
import spring.java.HeThongNopBai.model.TaiKhoanInfo;



@Transactional
public interface TaiKhoanDao {
	public TaiKhoanInfo checkLogin(String id,String passWord);
	public List <TaiKhoanInfo> xemTaiKhoan();


}
