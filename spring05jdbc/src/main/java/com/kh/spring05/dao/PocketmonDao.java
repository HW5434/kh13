package com.kh.spring05.dao;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.jdbc.core.JdbcTemplate;
import org.springframework.stereotype.Repository;
import org.springframework.web.bind.annotation.RestController;

import com.kh.spring05.dto.PocketmonDto;
import com.kh.spring05.mapper.PocketmonMapper;

//DAO도 이제부터는 등록을 해야 한다
// - @Repository는 파일이나 데이터베이스와 같이 영속성[영원한 속성]개체를 제어하는 도구
@Repository //등록하고
public class PocketmonDao {

	@Autowired //주세요
	private JdbcTemplate jdbcTemplate;
	
	@Autowired
	private PocketmonMapper mapper;
	//등록
	public void insert(PocketmonDto dto) {
		String sql = "insert into pocketmon("
				+ "pocketmon_no, "
				+ "pocketmon_name, "
				+ "pocketmon_type"
				+ ") values(?, ?, ?)";
		Object[] data = {dto.getPocketmonNo(), dto.getPocketmonName(), dto.getPocketmonType()};
		jdbcTemplate.update(sql, data);
		
	}
	//수정
	public boolean update(PocketmonDto dto) {
		String sql = "update pocketmon "
				+ "set pocketmon_name=?, pocketmon_type=? "
				+ "where pocketmon_no=?";
		Object[] data = {dto.getPocketmonName(), dto.getPocketmonType(), dto.getPocketmonNo()};
		return jdbcTemplate.update(sql, data) > 0;
	}
	//삭제 delete(primary key)
	public boolean delete(int pocketmonNo) {
		String sql = "delete pocketmon where pocketmon_no=?";
		Object[] data = {pocketmonNo};
		return jdbcTemplate.update(sql, data) > 0;
	}
	
	
}
