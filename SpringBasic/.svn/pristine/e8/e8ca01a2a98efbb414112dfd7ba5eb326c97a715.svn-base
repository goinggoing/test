package login.controller;

import javax.servlet.http.HttpSession;

import org.slf4j.Logger;
import org.slf4j.LoggerFactory;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestMethod;

import login.dto.Login;
import login.service.face.LoginService;

@Controller
public class LoginController {

	@Autowired private LoginService loginService;
	
	private static final Logger logger = LoggerFactory.getLogger(LoginController.class);
	
	@RequestMapping(value="/login/main")
	public void main() { }
	
	@RequestMapping(value="/login/join", method=RequestMethod.GET)
	public void join() { }

	@RequestMapping(value="/login/join", method=RequestMethod.POST)
	public String joinProcess(Login login) { 
		
		logger.info(login.toString());
		
		//회원가입 처리
		loginService.join(login);		
		
		return "redirect:/login/main";
	}
	
	@RequestMapping(value="/login/login", method=RequestMethod.GET)
	public void login() { }

	@RequestMapping(value="/login/login", method=RequestMethod.POST)
	public String loginProcess(Login login, HttpSession session) { 
		
		logger.info(login.toString());
		
		//아이디, 패스워드 DB 조회
		boolean isLogin = loginService.login(login); //true-인증 성공
		
		//결과에 따른 세션처리
		if(isLogin) {
			session.setAttribute("login", isLogin);
			session.setAttribute("loginid", login.getId());
		}
		
		return "redirect:/login/main";
	}
	
	@RequestMapping(value="/login/logout")
	public String logout(HttpSession session) {
		
		session.invalidate();
		
		return "redirect:/login/main";
		
	}
	
	@RequestMapping(value="/login/mypage")
	public void mypage(HttpSession session, Model model) {
		
		String id = (String) session.getAttribute("loginid");
		
		Login info = loginService.info(id);
		
		model.addAttribute("info", info);
		
	}
}














