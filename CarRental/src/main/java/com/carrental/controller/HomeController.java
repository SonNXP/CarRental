package com.carrental.controller;

import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestMethod;

@Controller
@RequestMapping(value = { "/"})
public class HomeController {

	@RequestMapping(method = RequestMethod.GET)
	public String home() {
		return "index";
	}
	
	@RequestMapping(value = { "/home", "/homepage",  "/bestoffers", "/blog", "/aboutus", "/contact"}, method = RequestMethod.GET)
	public String homeRedirect() {
		return "redirect:/";
	}

}
