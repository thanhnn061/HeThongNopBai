package spring.java.HeThongNopBai.dao;

import java.util.List;

import spring.java.HeThongNopBai.model.LopHocPhanInfo;
import spring.java.HeThongNopBai.model.ThongTinInfo;


public interface LopHocPhanDao {
	public List<LopHocPhanInfo> xemLopHP();	
	public List<ThongTinInfo> xemThongTin(int maGV);
	public ThongTinInfo xemThongTinBT(int maLHP);
	public LopHocPhanInfo xemLHP(int maLHP);
	public void updateLHP(LopHocPhanInfo lopHP);
}
