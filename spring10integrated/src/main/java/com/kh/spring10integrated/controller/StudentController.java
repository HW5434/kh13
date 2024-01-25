package com.kh.spring10integrated.controller;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.ModelAttribute;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestParam;

import com.kh.spring10integrated.dao.StudentDao;
import com.kh.spring10integrated.dto.StudentDto;


@Controller
@RequestMapping("/student")
public class StudentController {
	@Autowired
	private StudentDao studentDao;  
	
	@GetMapping("/add")
	public String add() {
		return "/WEB-INF/views/student/add.jsp";
	}
		
	@PostMapping("/add")
	public String add(@ModelAttribute StudentDto studentDto) {
		studentDao.insert(studentDto);
		return "redirect:addFinish";
	}
	
	@RequestMapping("/addFinish")
	public String addFinish() {
		return "/WEB-INF/views/student/addFinish.jsp";
	}
		
	
	@RequestMapping("/list")
	public String list(@RequestParam String column, 
							@RequestParam String keyword, 
							Model model) {
		boolean isSearch = column != null && keyword != null;
		List<StudentDto> list;
		if(isSearch) {
			list = studentDao.selectList(column, keyword);
		}
		else {
			list = studentDao.selectList();
 		}
		model.addAttribute("list", list);
		return "/WEB-INF/views/student/list.jsp";
	}
	
	
	
	
	//@RequestMapping("/detail")
	
	
	//@RequestMapping("/edit")
	
	
	//@RequestMapping("/delete")
	
	
}
