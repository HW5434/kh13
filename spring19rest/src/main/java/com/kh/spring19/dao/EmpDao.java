package com.kh.spring19.dao;

import java.util.List;

import org.apache.ibatis.session.SqlSession;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Repository;

import com.kh.spring19.dto.EmpDto;

@Repository
public class EmpDao {

	@Autowired
	private SqlSession sqlSession;
	
	//목록조회
	public List<EmpDto> selectList() {
		return sqlSession.selectList("emp.list");
	}

	//사원등록
	public void insert(EmpDto empDto) {
		sqlSession.insert("emp.save", empDto);
	}

	public EmpDto selectOne(int empNo) {
		return sqlSession.selectOne("emp.find", empNo);
	}
}














