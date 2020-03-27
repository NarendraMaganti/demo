package com.capgemini.spring.mvc.controller;

import javax.servlet.http.Cookie;
import javax.servlet.http.HttpServlet;
import javax.servlet.http.HttpServletResponse;

import org.springframework.stereotype.Controller;
import org.springframework.ui.ModelMap;
import org.springframework.web.bind.annotation.CookieValue;
import org.springframework.web.bind.annotation.GetMapping;

@Controller
public class CookieController {

	@GetMapping("/cookiePage")
	public String getCookiePage() {
		return "cookiePage";
	}
	@GetMapping("/createCookie")
	public String createCookie(HttpServletResponse resp,ModelMap modelMap) {

		Cookie myCookie = new Cookie("empName","Narendra");
		resp.addCookie(myCookie);
		return "cookiePage";
	}
	@GetMapping("/readCookie")
	public String readCookie(@CookieValue(name="empName") String empName,
			ModelMap modelMap) {
		modelMap.addAttribute("msg", "Cookie value is - "+empName);
		return "cookiePage";
	}


}
