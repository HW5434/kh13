package com.kh.spring07student.controller;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.ModelAttribute;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

import com.kh.spring07student.dao.StudentDao;
import com.kh.spring07student.dto.StudentDto;

@RestController
@RequestMapping("/student")
public class StudentController {
	
	@Autowired
	private StudentDao dao;
	
	@RequestMapping("/insert")
	public String insert(@ModelAttribute StudentDto dto) {
		dao.insert(dto);
		return "점수 등록 완료";
	}
	
	@RequestMapping("/edit")
	public String edit(@ModelAttribute StudentDto dto) {
		if(dao.update(dto)) {
			return "점수 수정 완료";
		}
		else {
			return "점수를 찾을 수 없습니다.";
		}
	}
		
		

}
