package co.company.spring1.users.controller;

import javax.servlet.http.HttpSession;

import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PostMapping;

@Controller
public class LoginController {

	@GetMapping("/login") //로그인 페이지로 이동
	public String loginForm() {
		return "user/login";
	}
	
	@PostMapping("/login") //로그인 처리
	public String login(HttpSession session) {
		//로그인 처리
		session.setAttribute("loginId","user");
		return "redirect:/empSelect";
	}
	@GetMapping("/logout")
	public String logout(HttpSession session) {
		session.invalidate();
		return "user/login";
	}
}
