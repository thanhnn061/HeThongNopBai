package spring.java.HeThongNopBai.controller;

import javax.servlet.http.HttpSession;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestMethod;
import org.springframework.web.bind.annotation.RequestParam;

import spring.java.HeThongNopBai.dao.TaiKhoanDao;
import spring.java.HeThongNopBai.model.TaiKhoanInfo;


@Controller
public class HomeController {
	@Autowired
	private TaiKhoanDao taiKhoanDao;
	@RequestMapping("/")
	public String index() {
		return "login";
	}
	@RequestMapping("/logintc")
	public String index2() {
		return "giangvienqlb";
	}
	@RequestMapping(value = "/login", method = RequestMethod.POST)
	public String loginPage(Model model, @RequestParam String userName,
			@RequestParam String passWord, HttpSession session) {
		String request = "";
		TaiKhoanInfo us= taiKhoanDao.checkLogin(userName,passWord);
		if(us !=null) {
//			session.setAttribute("loginF","dn thành công");
			request = "redirect:/logintc";
		}else {
//			session.setAttribute("loginF","dn ko thành công");
			request = "redirect:/";
		}
//		if(us !=null) {
//			String loai=us.getLoai();
//			if(loai.equals("0")) {
//				session.setAttribute("checkUser", us);
//				request = "redirect:/admin/hang";	
//			} else {
//				session.setAttribute("checkUser",us);
//				request = "redirect:/";
//			}
//		}
//		else {
//			session.setAttribute("loginF","TÃªn Ä‘Äƒng nháº­p vÃ  máº­t kháº©u sai");
//			request="redirect:/";
//		}
//		session.removeAttribute("cart");
		return request;
	}

}