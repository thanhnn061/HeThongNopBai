package spring.java.HeThongNopBai.dao;

import javax.transaction.Transactional;

import spring.java.HeThongNopBai.model.TaiKhoanInfo;



@Transactional
public interface TaiKhoanDao {
	public TaiKhoanInfo checkLogin(String id,String passWord);

}
