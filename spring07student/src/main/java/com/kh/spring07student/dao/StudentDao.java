package com.kh.spring07student.dao;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.jdbc.core.JdbcTemplate;
import org.springframework.stereotype.Repository;

import com.kh.spring07student.dto.StudentDto;
import com.kh.spring07student.mapper.StudentMapper;

@Repository
public class StudentDao {
	
	@Autowired
	private JdbcTemplate jdbcTemplate;
	@Autowired
	private StudentMapper mapper;
	
	//등록
	
	public void insert(StudentDto dto) {
		String sql ="insert into student"
				+ "("
				+ "student_id, "
				+ "name, "
				+ "korean_score, "
				+ "math_score, "
				+ "english_score"
				+ ") values(student_seq.nextval, ?, ?, ?, ?)";
		Object[] data = {
				dto.getStudentName(), 
				dto.getKoreanScore(), 
				dto.getMathScore(), 
				dto.getEnglishScore()
				};
		jdbcTemplate.update(sql, data);
	}
	
	public boolean update(StudentDto dto) {
		String sql = "update student set "
				+ "name = ?, korean_score = ?, math_score = ?, english_score = ? "
				+ "where student_id = ?";
		Object[] data = {dto.getStudentName(), dto.getKoreanScore(), dto.getMathScore(), dto.getEnglishScore(), dto.getStudentId()};
		return jdbcTemplate.update(sql, data) > 0;
	}
	
//	public boolean delete(int studentId) {
//		String sql = "delete student where student_id = ? > 0";
//		Object[] data = {};
////		if
//	}
	
}

