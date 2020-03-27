package com.capgemini.springmvc1.controllers;

import javax.servlet.http.Cookie;
import javax.servlet.http.HttpServletResponse;

import org.springframework.stereotype.Controller;
import org.springframework.ui.ModelMap;
import org.springframework.web.bind.annotation.CookieValue;
import org.springframework.web.bind.annotation.GetMapping;

@Controller
public class CookieController {
	@GetMapping("/cookiepage")
	public String getCookiepage() {
		return "cookiePage";
	}
	@GetMapping("/createCookie")
	public String createCookie(HttpServletResponse resp, ModelMap modelmap) {
		Cookie mycookie=new Cookie("empName","Krishna" );
		resp.addCookie(mycookie);
		modelmap.addAttribute("msg","Cookie Created Successfully");
		return "cookiePage";
	}
	
	@GetMapping("/readCookie")
	public String readCookie(@CookieValue(name="empName", required=false) String empName, ModelMap modelmap) {
		modelmap.addAttribute("msg","Cookie value is -"+empName);
		return "cookiePage";
	}
	
	
	
	
	
	
	
	
	
	
}
