package spring.java.HeThongNopBai.controller;

import java.io.File;
import java.util.List;

import javax.servlet.http.HttpSession;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.transaction.annotation.Transactional;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.ModelAttribute;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestMethod;
import org.springframework.web.bind.annotation.RequestParam;
import org.springframework.web.multipart.MultipartFile;

import spring.java.HeThongNopBai.dao.GiangVienDao;
import spring.java.HeThongNopBai.dao.LopHocPhanDao;
import spring.java.HeThongNopBai.dao.MonHocDao;
import spring.java.HeThongNopBai.dao.TaiKhoanDao;
import spring.java.HeThongNopBai.entity.MonHoc;
import spring.java.HeThongNopBai.model.GiangVienInfo;
import spring.java.HeThongNopBai.model.LopHocPhanInfo;
import spring.java.HeThongNopBai.model.MonHocInfo;
import spring.java.HeThongNopBai.model.SinhVienInfo;
import spring.java.HeThongNopBai.model.TaiKhoanInfo;
import spring.java.HeThongNopBai.model.ThongTinInfo;
import spring.java.HeThongNopBai.model.UpLoad;

@Transactional
@Controller
public class HomeController {
	@Autowired
	private MonHocDao monhocDao;
	@Autowired
	private TaiKhoanDao taiKhoanDao;
	@Autowired
	private GiangVienDao giangvienDao;
	@Autowired
	private LopHocPhanDao lophpDao;
	@RequestMapping("/")
	public String login(Model model) {	
		return "login";
	}
	@RequestMapping("/nopbaisv")
	public String index(Model model,HttpSession session) {
		List<MonHocInfo> monhoc= monhocDao.XemMonHoc();
		model.addAttribute("loadmh", monhoc);
		List<GiangVienInfo> giangvien= giangvienDao.xemGiangVien();
		model.addAttribute("loadgv", giangvien);
		List<LopHocPhanInfo> lophocphan= lophpDao.xemLopHP();
		model.addAttribute("loadlophp", lophocphan);
		model.addAttribute("nopBai", new UpLoad());
		return "nopbaisv";
		
	}
	@RequestMapping(value = "/nopbaisv/uploadFile", method = RequestMethod.POST)
	public String uploadFile(UpLoad myFile, Model model,@ModelAttribute("LopHocPhanInfo") LopHocPhanInfo lHP) {
		model.addAttribute("message", "Upload success");
		try {
			MultipartFile multipartFile = myFile.getMultipartFile();
			String fileName = multipartFile.getOriginalFilename();
			LopHocPhanInfo lophocphan = lophpDao.xemLHP(lHP.getMalopHP());
			File file = new File(lophocphan.getLinknopBai(), fileName);
			multipartFile.transferTo(file);
		} catch (Exception e) {
			e.printStackTrace();
			model.addAttribute("message", "Upload failed");
		}
		return "redirect:/nopbaisv";
	}

	public File getFolderUpload() {
	    File folderUpload = new File(System.getProperty("user.home") + "/Uploads");
	    if (!folderUpload.exists()) {
	      folderUpload.mkdirs();
	    }
	    return folderUpload;
	  }
	
	//login
	@RequestMapping(value = "/login", method = RequestMethod.POST)
	public String loginPage(Model model, @RequestParam String userName,
			@RequestParam String passWord, HttpSession session) {
		String request = "";
		TaiKhoanInfo us= taiKhoanDao.checkLogin(userName,passWord);
		if(us !=null) {
			String loai=us.getPhanQuyen();
			if(loai.equals("0")) {
				session.setAttribute("checkUser", us);
				request = "redirect:/admin";	
			}else {
				session.setAttribute("checkUser", us);
				request = "redirect:/nopbaisv";
			}
		}else {
			session.setAttribute("loginF","Tên đăng nhập hoặc mật khẩu sai");
			request="redirect:/";
		}
		return request;
	}
	//logout
		@RequestMapping("/logout")
		public String logout(HttpSession session) {
			session.removeAttribute("checkUser");
			return "redirect:/";
		}
	
}