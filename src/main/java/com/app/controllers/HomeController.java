package com.app.controllers;

import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.RequestMapping;

@Controller
public class HomeController {
	
	@RequestMapping(value="/")
	public String getHome(){
		
		return "index";
		
	}
	
	@RequestMapping(value="/portfolio")
	public String getPortfolio(){
		
		return "portfolio-single";
		
	}

}
