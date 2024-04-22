package com.kh.spring19.dao;

import java.util.List;

import org.apache.ibatis.session.SqlSession;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.ResponseEntity;
import org.springframework.stereotype.Repository;

import com.kh.spring19.dto.MenuDto;
import com.kh.spring19.dto.StudentDto;

import io.swagger.v3.oas.annotations.Operation;
import io.swagger.v3.oas.annotations.media.Content;
import io.swagger.v3.oas.annotations.media.ExampleObject;
import io.swagger.v3.oas.annotations.media.Schema;
import io.swagger.v3.oas.annotations.responses.ApiResponse;

@Repository
public class MenuDao {
	
	@Autowired
	private SqlSession sqlSession;

	//목록
	public List<MenuDto> selectList() {
		return sqlSession.selectList("menu.list");
	}
	//[목록] 상세조회
	public MenuDto selectOne(int menuNo) {
		return sqlSession.selectOne("menu.find", menuNo);
	}

	//[등록] 시퀀스
	public int sequence() {
		return sqlSession.selectOne("menu.sequence");
	}
	//등록
	public void insert(MenuDto menuDto) {
		sqlSession.insert("menu.save", menuDto);
	}
	
	//삭제
	public boolean delete(int menuNo) {
		return sqlSession.delete("menu.delete", menuNo) > 0;
	}
	
	//수정 [editAll]
	public boolean editAll(MenuDto menuDto) {
		return sqlSession.update("menu.editAll", menuDto) > 0;
	}
	//수정 [editUnit]
	public boolean editUnit(MenuDto menuDto) {
		return sqlSession.update("menu.editUnit", menuDto) > 0;
	}
}
