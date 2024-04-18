package com.kh.spring19.dao;

import java.util.List;

import org.apache.ibatis.session.SqlSession;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Repository;

import com.kh.spring19.dto.StudentDto;

@Repository
public class StudentDao {

	@Autowired
	private SqlSession sqlSession;
	
	public List<StudentDto> selectList(){
		return sqlSession.selectList("student.list");
	}
	
}
