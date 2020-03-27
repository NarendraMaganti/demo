package com.capgemini.spring.mvc.controller;

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
		ModelAndView modelAndView = new ModelAndView();
		modelAndView.setViewName("/WEB-INF/views/display-page.jsp");
		return modelAndView;
	}
	@RequestMapping(path="/myform", method = RequestMethod.GET)
	@GetMapping
	public ModelAndView displayMyForm(ModelAndView modelAndView) {
		modelAndView.setViewName("/WEB-INF/views/myform.jsp");
		return modelAndView;		
	}
	@RequestMapping(method = RequestMethod.POST , path ="./submitDetails")
	@PostMapping("./submitDetails")
	public String submitDetails(@RequestParam(name="userId") int userIdVal,
			@RequestParam(name = "password") String passwordVal,
			ModelMap modelMap) {

		modelMap.addAttribute("userId",userIdVal );
		modelMap.addAttribute("pwd",passwordVal );

		return "userDetails";
	}
	@PostMapping("/submitDetails2")
	public String submitDetails2(@RequestParam(name="userId") int userIdVal,
			@RequestParam(name = "password") String passwordVal,
			ModelMap modelMap) {
		modelMap.addAttribute("userId",userIdVal );
		modelMap.addAttribute("pwd",passwordVal );
		return "userDetails";
	}
	
	

}
