package com.kh.spring07student.controller;

import java.text.DecimalFormat;
import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.ModelAttribute;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestParam;
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
	@RequestMapping("/list")
	public String list(
			@RequestParam(required = false) String column,
			@RequestParam(required = false) String keyword) {
		boolean isSearch = column != null && keyword != null;
		List<StudentDto> list = isSearch ? dao.selectList(column, keyword) : dao.selectList();
		
		StringBuffer buffer = new StringBuffer();
		for(StudentDto dto : list) {
			buffer.append("[");
			buffer.append(dto.getStudentId());
			buffer.append("]");
			buffer.append(dto.getStudentName());
			buffer.append(" - ");
			buffer.append("국어-"+dto.getKoreanScore());
			buffer.append(",수학-"+dto.getMathScore());
			buffer.append(",영어-"+dto.getEnglishScore());
			buffer.append(" (");
			buffer.append(")");
			buffer.append("<br>");
		}
		return buffer.toString();
	}
	@RequestMapping("/detail")
	public String detail(@RequestParam int studentId) {
		StudentDto dto = dao.selectOne(studentId);
		DecimalFormat fmt = new DecimalFormat("#,##0.00");
		if(dto != null) {
			StringBuffer buffer = new StringBuffer();
			buffer.append("학생번호 - " + dto.getStudentId() + "<br>");
			buffer.append("학생명 - " + dto.getStudentName() + "<br>");
			buffer.append("국어점수 - " + dto.getKoreanScore() + "점<br>");
			buffer.append("수학점수 - " + dto.getMathScore() + "점<br>");
			buffer.append("영어점수 - " + dto.getEnglishScore() + "점<br>");
			return buffer.toString();
		}
		else {
			return "존재하지 않는 학생 번호";
		}
		

	}
}
