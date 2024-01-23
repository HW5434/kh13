package com.kh.spring10integrated.controller;

import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.ModelAttribute;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestMapping;

import com.kh.spring10integrated.dto.MemberDto;

@Controller
@RequestMapping("/member")
public class MemberController {
	
	@GetMapping("/join")
	public String join() {
		return "/WEB-INF/views/member/join.jsp"; 
	}
	
	@PostMapping("/join")
	public String join(@ModelAttribute MemberDto dto) {
		return "redirect:finish";
	}
	
	@RequestMapping("/joinFinish")
	public String joinFinish() {
		return "/WEB-INF/views/member/finish.jsp";
	}
}
