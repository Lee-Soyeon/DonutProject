package com.dwu.donut.controller;

import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.RequestMapping;

@Controller
public class HomeController {
	
	@RequestMapping("index.do")
	public String index() {		
		return "index";
	}
	
}
