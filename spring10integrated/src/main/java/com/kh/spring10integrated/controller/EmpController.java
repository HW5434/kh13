package com.kh.spring10integrated.controller;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.ModelAttribute;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestMapping;

import com.kh.spring10integrated.dao.EmpDao;
import com.kh.spring10integrated.dto.EmpDto;

@Controller
@RequestMapping("/emp")
public class EmpController {
	
	@Autowired
	private EmpDao dao;
	
	
	//@RequestMapping("/insert")
	@GetMapping("/insert") //GET방식 - 일반적인 주소를 이용한 접근
	public String insert() {
		return "/WEB-INF/views/emp/insert1.jsp";
		
	}
	
	//@RequestMapping("/insert")
	@PostMapping("/insert") //POST방식 - Form을 이용한 데이터 전송
	public String insert(@ModelAttribute EmpDto dto) {
		dao.insert(dto);
		//return "/redirect:/emp/insert3";
		return "redirect:insert3";
	}

	@RequestMapping("/insert3")
	public String insert3() {
		return "/WEB-INF/views/emp/insert3.jsp";
	}
	
	
}
