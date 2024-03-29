package com.kh.spring14.dao;

import java.util.List;

import org.apache.ibatis.session.SqlSession;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Repository;

import com.kh.spring14.dto.PocketmonDto;

@Repository
public class PocketmonDao {
	
	@Autowired
	private SqlSession sqlSession; //mybatis
	
	public List<PocketmonDto> selectList() {
		//return pocketmon 영역의 list라는 구문을 실행해서 나온 결과;
		return sqlSession.selectList("pocketmon.list");
	}
	
	public void insert(PocketmonDto pocketmonDto) {
		sqlSession.insert("pocketmon.add", pocketmonDto);
	}
}
