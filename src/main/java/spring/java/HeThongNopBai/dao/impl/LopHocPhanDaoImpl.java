package spring.java.HeThongNopBai.dao.impl;

import java.util.List;

import org.hibernate.Session;
import org.hibernate.SessionFactory;
import org.hibernate.query.Query;
import org.springframework.beans.factory.annotation.Autowired;

import spring.java.HeThongNopBai.dao.LopHocPhanDao;
import spring.java.HeThongNopBai.entity.LopHocPhan;
import spring.java.HeThongNopBai.entity.MonHoc;
import spring.java.HeThongNopBai.model.LopHocPhanInfo;
import spring.java.HeThongNopBai.model.ThongTinInfo;

public class LopHocPhanDaoImpl implements LopHocPhanDao {
	@Autowired
	private SessionFactory sessionfactory;

	public List<LopHocPhanInfo> xemLopHP() {
		Session session = sessionfactory.getCurrentSession();
		String sql = " Select new " + LopHocPhanInfo.class.getName()
				+ "(l.malopHP, l.maGV, l.maSV, l.maMH, l.namHoc, l.hocKy,l.soBN, l.tenLHP, l.linknopBai)" + " from "
				+ LopHocPhan.class.getName() + " l ";
		Query query = session.createQuery(sql);
		return query.list();

	}
	public List<ThongTinInfo> xemThongTin(int maGV){
		Session session = sessionfactory.getCurrentSession();
		String sql = " select new  " + ThongTinInfo.class.getName()
				+ " (l.malopHP, l.maGV, l.maSV, l.maMH, l.namHoc, l.hocKy, l.soBN, l.tenLHP, m.tenMH) " 
				+ " from " + LopHocPhan.class.getName() + " l " + "LEFT JOIN " + MonHoc.class.getName() + " m "
				+ "ON l.maMH=m.maMH where l.maGV=: magiangvien" ;
		Query query = session.createQuery(sql);
		query.setParameter("magiangvien", maGV);
		return query.list();
		
	}
	public ThongTinInfo xemThongTinBT(int maLHP) {
		Session session = sessionfactory.getCurrentSession();
		String sql = " select new  " + ThongTinInfo.class.getName()
				+ " (l.malopHP, l.maGV, l.maSV, l.maMH, l.namHoc, l.hocKy, l.soBN, l.tenLHP, m.tenMH) " 
				+ " from " + LopHocPhan.class.getName() + " l " + "LEFT JOIN " + MonHoc.class.getName() + " m "
				+ "ON l.maMH=m.maMH where l.malopHP=: maLHP" ;
		Query query = session.createQuery(sql);
		query.setParameter("maLHP", maLHP);
		return (ThongTinInfo)query.uniqueResult();
	}
	public void updateLHP(LopHocPhanInfo lopHP) {
		Session session = sessionfactory.getCurrentSession();
		LopHocPhan lhp = new LopHocPhan();
		lhp.setMaMH(lopHP.getMaMH());
		lhp.setMalopHP(lopHP.getMalopHP());
		lhp.setMaSV(lopHP.getMaSV());
		lhp.setMaGV(lopHP.getMaGV());
		lhp.setNamHoc(lopHP.getNamHoc());
		lhp.setHocKy(lopHP.getHocKy());
		lhp.setSoBN(lopHP.getSoBN());
		lhp.setTenLHP(lopHP.getTenLHP());
		lhp.setLinknopBai(lopHP.getLinknopBai());
		session.update(lhp);
	}
	public LopHocPhanInfo xemLHP(int maLHP) {
		Session session = sessionfactory.getCurrentSession();
		String sql = " Select new " + LopHocPhanInfo.class.getName()
				+ "(l.malopHP, l.maGV, l.maSV, l.maMH, l.namHoc, l.hocKy,l.soBN, l.tenLHP, l.linknopBai)" + " from "
				+ LopHocPhan.class.getName() + " l "+ "where l.malopHP=: maLHP" ;
		Query query = session.createQuery(sql);
		query.setParameter("maLHP", maLHP);
		return (LopHocPhanInfo)query.uniqueResult();
	}
}