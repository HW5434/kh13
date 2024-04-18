package com.kh.spring19.restcontroller;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.CrossOrigin;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

import com.kh.spring19.dao.StudentDao;
import com.kh.spring19.dto.StudentDto;

@CrossOrigin
@RestController
@RequestMapping("/student")
public class StudentRestController {

	@Autowired
	private StudentDao studentDao;
	
	@GetMapping("/")
	public List<StudentDto> list() {
		return studentDao.selectList();
	}
	
//	@PostMapping("/")
//	public StudentDto insert() {
//		
//	}
	
}
