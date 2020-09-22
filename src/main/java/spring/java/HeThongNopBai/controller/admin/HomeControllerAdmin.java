package spring.java.HeThongNopBai.controller.admin;

import java.io.File;
import java.util.List;

import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpSession;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.transaction.annotation.Transactional;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.ModelAttribute;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestMethod;

import spring.java.HeThongNopBai.dao.GiangVienDao;
import spring.java.HeThongNopBai.dao.LopHocPhanDao;
import spring.java.HeThongNopBai.dao.MonHocDao;
import spring.java.HeThongNopBai.dao.SinhVienDao;
import spring.java.HeThongNopBai.dao.TaiKhoanDao;
import spring.java.HeThongNopBai.model.GiangVienInfo;
import spring.java.HeThongNopBai.model.LopHocPhanInfo;
import spring.java.HeThongNopBai.model.MonHocInfo;
import spring.java.HeThongNopBai.model.SinhVienInfo;
import spring.java.HeThongNopBai.model.TaiKhoanInfo;
import spring.java.HeThongNopBai.model.ThongTinInfo;

@Transactional
@Controller
public class HomeControllerAdmin {
	@Autowired
	private GiangVienDao giangvienDao;
	@Autowired
	private MonHocDao monhocDao;
	@Autowired
	private LopHocPhanDao lophocphanDao;
	@Autowired
	private SinhVienDao sinhvienDao;
	@Autowired
	private TaiKhoanDao taikhoanDao;

	@RequestMapping("/admin")
	public String index(Model model) {
		List<GiangVienInfo> giangvien = giangvienDao.xemGiangVien();
		model.addAttribute("loadgv", giangvien);
		return "admin/index";
	}

	// xem môn học
	@RequestMapping("/admin/mh")
	public String monhoc(Model model) {
		List<MonHocInfo> monhoc = monhocDao.XemMonHoc();
		model.addAttribute("loadmh", monhoc);
		return "admin/monhoc";
	}

	// thêm môn học
	@RequestMapping(value = "/admin/themmh/add", method = RequestMethod.POST)
	public String themmh(Model model, HttpServletRequest request, @ModelAttribute("monHocInfo") MonHocInfo mh) {
		MonHocInfo monhoc = new MonHocInfo(mh.getMaMH(), mh.getTenMH());
		monhocDao.themmh(monhoc);
		return "redirect:/admin/mh";
	}

	@RequestMapping(value = "/admin/themmh")
	public String themmonhoc(Model model) {
		MonHocInfo monHocInfo = new MonHocInfo();
		model.addAttribute("monHocInfo", monHocInfo);

		return "admin/themmh";
	}

	// xóa môn học
	@RequestMapping(value = "/admin/xoamonhoc")
	public String deleteMonHoc(Model model, HttpServletRequest request, HttpSession session) {
		int maMH = Integer.parseInt(request.getParameter("maMH"));
		monhocDao.xoamonhoc(maMH);
		return "redirect:/admin/mh";

	}

	// sửa môn học
	@RequestMapping(value = "/admin/suamh/{maMH}")
	public String suamonhoc(@PathVariable("maMH") int maMH, Model model, HttpServletRequest request,
			@ModelAttribute("suaMonHoc") MonHocInfo suamonHoc) {
		MonHocInfo monHocInfo = monhocDao.loadMHTheoMa(maMH);
		model.addAttribute("suamonhoc", monHocInfo);

		return "admin/suamh";
	}

	@RequestMapping(value = "/admin/suamh/hoanthanh/{maMH}")
	public String suaMHHoanThanh(@PathVariable("maMH") int maMH, Model model, HttpServletRequest request,
			@ModelAttribute("suaMonHoc") MonHocInfo suamonHoc) {
		MonHocInfo monhoc = new MonHocInfo(suamonHoc.getMaMH(), suamonHoc.getTenMH());
		monhocDao.uploadmh(monhoc);
		return "redirect:/admin/suamh";
	}

	// xem bài
	@RequestMapping("/admin/xembai")
	public String xembai(Model model, HttpServletRequest request, HttpSession session) {
		int magv = Integer.parseInt(request.getParameter("magv"));
		List<ThongTinInfo> lophocphan = lophocphanDao.xemThongTin(magv);
		model.addAttribute("loadlhp", lophocphan);
		return "admin/xembai";
	}

	// thêm giảng viên
	@RequestMapping(value = "/admin/themgv/add", method = RequestMethod.POST)
	public String themgv(Model model, HttpServletRequest request, @ModelAttribute("giangVienInfo") GiangVienInfo gv) {
		GiangVienInfo giangvien = new GiangVienInfo(gv.getMaGV(), gv.getTenGV());
		giangvienDao.themgv(giangvien);
		return "redirect:/admin";
	}

	@RequestMapping(value = "/admin/themgv")
	public String themgiangvien(Model model) {
		GiangVienInfo giangVienInfo = new GiangVienInfo();
		model.addAttribute("giangVienInfo", giangVienInfo);

		return "admin/themgv";
	}

	// sửa giảng viên
	@RequestMapping(value = "/admin/suagv/{maGV}")
	public String suagiangvien(@PathVariable("maGV") int maGV, Model model, HttpServletRequest request,
			@ModelAttribute("suaGiangVien") GiangVienInfo suagiangVien) {

		GiangVienInfo giangVienInfo = giangvienDao.loadGVTheoMa(maGV);
		model.addAttribute("suagiangvien", giangVienInfo);

		return "admin/suagv";
	}

	@RequestMapping(value = "/admin/suagv/hoanthanh/{maGV}")
	public String suaGVHoanThanh(@PathVariable("maGV") int maGV, Model model, HttpServletRequest request,
			@ModelAttribute("suaGiangVien") GiangVienInfo suagiangVien) {
		GiangVienInfo giangvien = new GiangVienInfo(suagiangVien.getMaGV(), suagiangVien.getTenGV());
		giangvienDao.uploadgv(giangvien);
		return "redirect:/admin";
	}

	// xóa giảng viên
	@RequestMapping(value = "/admin/xoagiangvien")
	public String deleteGiangVien(Model model, HttpServletRequest request, HttpSession session) {
		int maGV = Integer.parseInt(request.getParameter("maGV"));
		giangvienDao.xoagiangvien(maGV);
		return "redirect:/admin";

	}

	// quản lý sinh viên
	@RequestMapping(value = "/admin/qlsv")
	public String qlsv(Model model) {
		List<SinhVienInfo> sinhvien = sinhvienDao.xemSinhVien();
		model.addAttribute("loadsinhvien", sinhvien);
		return "/admin/quanlysinhvien";
	}

	// thêm sinh viên
	@RequestMapping(value = "/admin/themsv/add", method = RequestMethod.POST)
	public String themsv(Model model, HttpServletRequest request, @ModelAttribute("sinhVienInfo") SinhVienInfo sv) {
		SinhVienInfo sinhvien = new SinhVienInfo(sv.getMaSV(), sv.getTenSV());
		sinhvienDao.themsv(sinhvien);
		return "redirect:/admin/qlsv";
	}

	@RequestMapping(value = "/admin/themsv")
	public String themsinhvien(Model model) {
		SinhVienInfo sinhVienInfo = new SinhVienInfo();
		model.addAttribute("sinhVienInfo", sinhVienInfo);
		return "admin/themsv";
	}
	// xóa sinh viên
	@RequestMapping(value = "/admin/xoasinhvien")
	public String deleteSinhVien(Model model, HttpServletRequest request, HttpSession session) {
		int maSV = Integer.parseInt(request.getParameter("maSV"));
		sinhvienDao.xoasinhvien(maSV);
		return "redirect:/admin/qlsv";

	}
	// quản lý tài khoản
	@RequestMapping(value = "/admin/qltk")
	public String qltk(Model model) {
		List<TaiKhoanInfo> taikhoan = taikhoanDao.xemTaiKhoan();
		model.addAttribute("loadtaikhoan", taikhoan);
		return "/admin/quanlytaikhoan";

	}
	@RequestMapping(value = "/admin/xembai/{maLHP}")
	public String taoThuMucNopBai(@PathVariable("maLHP") int maLHP, Model model, HttpServletRequest request) {
		ThongTinInfo lophocphan = lophocphanDao.xemThongTinBT(maLHP);
		File dir = new File("D:KiemTra/"+lophocphan.getTenLHP());
		if (dir.mkdir()) {
			LopHocPhanInfo lhpi=new LopHocPhanInfo(lophocphan.getMalopHP(),lophocphan.getMaGV(),lophocphan.getMaSV(),lophocphan.getMaMH(),lophocphan.getNamHoc(),lophocphan.getHocKy(),lophocphan.getSoBN(),lophocphan.getTenLHP(),dir.getAbsolutePath());
			lophocphanDao.updateLHP(lhpi);
		}
		return "redirect:/admin";

	}
	
}