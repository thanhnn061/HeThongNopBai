package spring.java.HeThongNopBai.dao.impl;

import org.hibernate.Session;
import org.hibernate.SessionFactory;
import org.hibernate.query.Query;
import org.springframework.beans.factory.annotation.Autowired;

import spring.java.HeThongNopBai.dao.TaiKhoanDao;
import spring.java.HeThongNopBai.entity.TaiKhoan;
import spring.java.HeThongNopBai.model.TaiKhoanInfo;


public class TaiKhoanDaoImpl implements TaiKhoanDao {
	@Autowired
	private SessionFactory sessionfactory;
	public TaiKhoanInfo checkLogin(String id,String passWord) {
		Session se = this.sessionfactory.getCurrentSession();

		String sql = " Select new " + TaiKhoanInfo.class.getName()
				+ "(t.id, t.user, t.matKhau, t.phanQuyen)" + " from "
				+ TaiKhoan.class.getName() + " t "+" where ID =: id and MatKhau =: pw";

		Query query = se.createQuery(sql);
		query.setParameter("id", id);
		query.setParameter("pw",passWord);
		return (TaiKhoanInfo) query.uniqueResult();
	}

}
