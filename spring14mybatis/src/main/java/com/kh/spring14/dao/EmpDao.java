package com.kh.spring14.dao;

import java.util.List;

import org.apache.ibatis.session.SqlSession;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Repository;

import com.kh.spring14.dto.EmpDto;

@Repository
public class EmpDao {
	
	@Autowired
	private SqlSession sqlSession;
	
	//등록
	public void insert(EmpDto empDto) {
		sqlSession.insert("emp.add", empDto);
	}
	
	//목록
	public List<EmpDto> selectList(){
		return sqlSession.selectList("emp.list");
	}
	
	//상세
	public EmpDto selectOne(int empNo) {
		return sqlSession.selectOne("emp.find", empNo);
	}
	
	//수정
	public boolean update(EmpDto empDto) {
		return sqlSession.update("emp.edit", empDto) > 0;
	}
	
	//삭제
	public boolean delete(int empNo) {
		return sqlSession.delete("emp.remove", empNo) > 0;
	}
}
