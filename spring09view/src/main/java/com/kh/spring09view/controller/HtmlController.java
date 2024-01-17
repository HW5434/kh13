package com.kh.spring09view.controller;

import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.RequestMapping;

@Controller
public class HtmlController {

	@RequestMapping("/heading")
	public String heading() {
		return "/WEB-INF/views/heading.jsp";
	}
	
	@RequestMapping("/image")
	public String image() {
		return "/WEB-INF/views/image.jsp";
	}
	
	@RequestMapping("/snslogin")
	public String snslogin() {
		return "/WEB-INF/views/snslogin.jsp";
	}
	
	
	
	
	
	
	
}
