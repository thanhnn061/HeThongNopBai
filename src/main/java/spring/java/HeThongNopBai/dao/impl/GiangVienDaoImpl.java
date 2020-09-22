package spring.java.HeThongNopBai.dao.impl;

import java.util.List;

import org.hibernate.Criteria;
import org.hibernate.Session;
import org.hibernate.SessionFactory;
import org.hibernate.criterion.Restrictions;
import org.hibernate.query.Query;
import org.springframework.beans.factory.annotation.Autowired;

import spring.java.HeThongNopBai.dao.GiangVienDao;
import spring.java.HeThongNopBai.entity.GiangVien;
import spring.java.HeThongNopBai.entity.MonHoc;
import spring.java.HeThongNopBai.model.GiangVienInfo;
import spring.java.HeThongNopBai.model.MonHocInfo;

public class GiangVienDaoImpl implements GiangVienDao {
	@Autowired
	private SessionFactory sessionfactory;

	public List<GiangVienInfo> xemGiangVien() {
		Session session = sessionfactory.getCurrentSession();
		String sql = " Select new " + GiangVienInfo.class.getName() + "(g.maGV, g.tenGV)" + " from "
				+ GiangVien.class.getName() + " g ";
		Query query = session.createQuery(sql);
		return query.list();

	}

	public void themgv(GiangVienInfo gv) {
		Session session = sessionfactory.getCurrentSession();
		GiangVien giangvien = new GiangVien();
		giangvien.setMaGV(gv.getMaGV());
		giangvien.setTenGV(gv.getTenGV());
		session.persist(giangvien);

	}

	public void xoagiangvien(int maGV) {
		GiangVien giangvien = this.findGiangVien(maGV);
		if (giangvien != null) {
			this.sessionfactory.getCurrentSession().delete(giangvien);
		}

	}

	public GiangVien findGiangVien(int maGV) {
		Session session = sessionfactory.getCurrentSession();
		Criteria crit = session.createCriteria(GiangVien.class);
		crit.add(Restrictions.eq("maGV", maGV));
		return (GiangVien) crit.uniqueResult();
	}
	public void uploadgv(GiangVienInfo gv) {
		Session session = sessionfactory.getCurrentSession();
		GiangVien giangvien = new GiangVien();
		giangvien.setMaGV(gv.getMaGV());
		giangvien.setTenGV(gv.getTenGV());
		session.update(giangvien);
		
	}
	@Override
	public GiangVienInfo loadGVTheoMa(int maGV) {
		Session session = sessionfactory.getCurrentSession();
		String sql = " select new  " + GiangVienInfo.class.getName()
				+ " (g.maGV, g.tenGV) "
				+ " from " + GiangVien.class.getName() + " g " + " where g.maGV=: maGV  ";
		Query query = session.createQuery(sql);
		query.setParameter("maGV", maGV);
		return (GiangVienInfo) query.uniqueResult();
	}
}
