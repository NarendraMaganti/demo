package com.capgemini.springmvc1.controllers;

import javax.servlet.http.HttpServletRequest;

import org.springframework.stereotype.Controller;
import org.springframework.ui.ModelMap;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestMethod;
import org.springframework.web.bind.annotation.RequestParam;
import org.springframework.web.servlet.ModelAndView;
@Controller
public class SpringMvcController {
	@RequestMapping(path = "/hello", method = RequestMethod.GET)
	public ModelAndView displayMessage() {
		ModelAndView modelandview=new ModelAndView();
		modelandview.setViewName("/WEB-INF/views/display-page.jsp");
		return modelandview;
	}
	@RequestMapping(path = "/myForm", method = RequestMethod.GET)
	@GetMapping
	public ModelAndView displayMyForm(ModelAndView modelandview) {
		//modelandview.setViewName("/WEB-INF/views/myForm.jsp");
		modelandview.setViewName("myForm");
		return modelandview;
	}
//	@RequestMapping(method = RequestMethod.POST , path="./submitDetails")
//	@PostMapping("/submitDetails")
//	public String submitDetails(@RequestParam(name = "userName") int userValue, 
//			                  @RequestParam(name = "password") String pswdValue,
//			                   ModelMap modelmap) {
//		modelmap.addAttribute("un", userValue);
//		modelmap.addAttribute("pwd", pswdValue);
//		
//		//return "/WEB-INF/views/userDetails.jsp";
//		return "userDetails";
//		
//	}
//	@PostMapping("/submitDetails2")
//	public String submitDetails2(int userName, String password, ModelMap modelmap) {
//		modelmap.addAttribute("un", userName);
//		modelmap.addAttribute("pwd", password);
//		
//		return "userDetails";
//	}
	@RequestMapping("/submitDetails3")
	public String submitDetails3(UserBean userBean,ModelMap modelmap) {
		modelmap.addAttribute("userbean",userBean);
		return "userDetails2";
		
	}
	
	
	
	
	
	
	
	
	
	
	
	
	
	
	
	
       

}// End of the Controller
