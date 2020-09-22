package spring.java.HeThongNopBai.dao.impl;

import java.util.List;

import org.hibernate.Criteria;
import org.hibernate.Session;
import org.hibernate.SessionFactory;
import org.hibernate.criterion.Restrictions;
import org.hibernate.query.Query;
import org.springframework.beans.factory.annotation.Autowired;

import spring.java.HeThongNopBai.dao.SinhVienDao;
import spring.java.HeThongNopBai.entity.GiangVien;
import spring.java.HeThongNopBai.entity.SinhVien;
import spring.java.HeThongNopBai.model.GiangVienInfo;
import spring.java.HeThongNopBai.model.MonHocInfo;
import spring.java.HeThongNopBai.model.SinhVienInfo;

public class SinhVienDaoImpl implements SinhVienDao {
	@Autowired
	private SessionFactory sessionfactory;

	public List<SinhVienInfo> xemSinhVien() {
		Session session = sessionfactory.getCurrentSession();
		String sql = " Select new " + SinhVienInfo.class.getName() + "(m.maSV, m.tenSV)" + " from "
				+ SinhVien.class.getName() + " m ";
		Query query = session.createQuery(sql);
		return query.list();

	}
	public void themsv(SinhVienInfo sv) {
		Session session = sessionfactory.getCurrentSession();
		SinhVien sinhvien = new SinhVien();
		sinhvien.setMaSV(sv.getMaSV());
		sinhvien.setTenSV(sv.getTenSV());
		session.persist(sinhvien);

	}
	public SinhVien findSinhVien(int maSV) {
		Session session = sessionfactory.getCurrentSession();
		Criteria crit = session.createCriteria(SinhVien.class);
		crit.add(Restrictions.eq("maSV", maSV));
		return (SinhVien) crit.uniqueResult();
	}
	public void xoasinhvien(int maSV) {
		SinhVien sinhvien = this.findSinhVien(maSV);
		if (sinhvien != null) {
			this.sessionfactory.getCurrentSession().delete(sinhvien);
		}
	}
}