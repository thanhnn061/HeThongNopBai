package spring.java.HeThongNopBai.dao.impl;

import java.util.List;

import org.hibernate.Criteria;
import org.hibernate.Session;
import org.hibernate.SessionFactory;
import org.hibernate.criterion.Restrictions;
import org.hibernate.query.Query;
import org.springframework.beans.factory.annotation.Autowired;

import spring.java.HeThongNopBai.dao.MonHocDao;
import spring.java.HeThongNopBai.entity.GiangVien;
import spring.java.HeThongNopBai.entity.MonHoc;
import spring.java.HeThongNopBai.model.GiangVienInfo;
import spring.java.HeThongNopBai.model.MonHocInfo;

public class MonHocDaoImpl implements MonHocDao {
	@Autowired
	private SessionFactory sessionfactory;

	public List<MonHocInfo> XemMonHoc() {
		Session session = sessionfactory.getCurrentSession();
		String sql = " Select new " + MonHocInfo.class.getName() + "(m.maMH, m.tenMH)" + " from "
				+ MonHoc.class.getName() + " m ";
		Query query = session.createQuery(sql);
		return query.list();

	}

	public void themmh(MonHocInfo mh) {
		Session session = sessionfactory.getCurrentSession();
		MonHoc monhoc = new MonHoc();
		monhoc.setMaMH(mh.getMaMH());
		monhoc.setTenMH(mh.getTenMH());
		session.persist(monhoc);

	}

	public MonHoc findMonHoc(int maMH) {
		Session session = sessionfactory.getCurrentSession();
		Criteria crit = session.createCriteria(MonHoc.class);
		crit.add(Restrictions.eq("maMH", maMH));
		return (MonHoc) crit.uniqueResult();
	}
	public void xoamonhoc(int maMH) {
		MonHoc monhoc = this.findMonHoc(maMH);
		if (monhoc != null) {
			this.sessionfactory.getCurrentSession().delete(monhoc);
		}
	}	
	public void uploadmh(MonHocInfo mh) {
		Session session = sessionfactory.getCurrentSession();
		MonHoc monhoc = new MonHoc();
		monhoc.setMaMH(mh.getMaMH());
		monhoc.setTenMH(mh.getTenMH());
		session.update(monhoc);
		
	}
	@Override
	public MonHocInfo loadMHTheoMa(int maMH) {
		Session session = sessionfactory.getCurrentSession();
		String sql = " select new  " + MonHocInfo.class.getName()
				+ " (m.maMH, m.tenMH) "
				+ " from " + MonHoc.class.getName() + " m " + " where m.maMH=: maMH  ";
		Query query = session.createQuery(sql);
		query.setParameter("maMH", maMH);
		return (MonHocInfo) query.uniqueResult();
		
	}
}
