package com.kh.spring10integrated.dao;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.jdbc.core.JdbcTemplate;
import org.springframework.stereotype.Repository;

import com.kh.spring10integrated.dto.BoardDto;
import com.kh.spring10integrated.mapper.BoardListMapper;
import com.kh.spring10integrated.mapper.BoardMapper;

@Repository
public class BoardDao {

	@Autowired
	private JdbcTemplate jdbcTemplate;
	
	@Autowired
	private BoardMapper boardMapper;

	@Autowired
	private BoardListMapper boardListMapper;

	//목록
	public List<BoardDto> selectList() {
//		String sql = "select * from board order by board_no desc";
//		return jdbcTemplate.query(sql, boardMapper);
		
		String sql = "select "
							+ "board_no, board_title, board_writer, "
							+ "board_wtime, board_etime, board_readcount "
						+ "from board order by board_no desc";
		return jdbcTemplate.query(sql, boardListMapper);
	}
	//검색
	public List<BoardDto> selectList(String column, String keyword) {
//		String sql = "select * from board "
//						+ "where instr("+column+", ?) > 0 "
//						+ "order by board_no desc";
//		Object[] data = {keyword};
//		return jdbcTemplate.query(sql, boardMapper, data);
		
		String sql = "select "
							+ "board_no, board_title, board_writer, "
							+ "board_wtime, board_etime, board_readcount "
						+ "from board "
						+ "where instr("+column+", ?) > 0 "
						+ "order by board_no desc";
		Object[] data = {keyword};
		return jdbcTemplate.query(sql, boardListMapper, data);
	}
	
	
}




