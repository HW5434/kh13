package com.kh.spring10integrated.dao;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.jdbc.core.JdbcTemplate;
import org.springframework.stereotype.Repository;

import com.kh.spring10integrated.dto.MenuDto;
import com.kh.spring10integrated.mapper.MenuMapper;
import com.kh.spring10integrated.mapper.StatMapper;
import com.kh.spring10integrated.vo.PageVO;
import com.kh.spring10integrated.vo.StatVO;

@Repository
public class MenuDao {
	
	@Autowired 
	private JdbcTemplate jdbcTemplate;
	
	@Autowired
	private MenuMapper mapper;
	
	public void insert(MenuDto dto) {
		String sql = "insert into menu("
				+ "menu_no, "
				+ "menu_name_kor, "
				+ "menu_name_eng, "
				+ "menu_type, "
				+ "menu_price) "
				+ "values(menu_seq.nextval, ?, ?, ?, ?)";
		Object[] data = {dto.getMenuNameKor(), dto.getMenuNameEng(), 
				dto.getMenuType(), dto.getPrice()};
		jdbcTemplate.update(sql, data);
	};
	
	public boolean update(MenuDto dto) {
		String sql = "update menu set "
				+ "menu_name_kor=?, menu_name_eng=?, "
				+ "menu_type=?, menu_price=? "
				+ "where menu_no=?";
		Object[] data = {dto.getMenuNameKor(), dto.getMenuNameEng(), 
				dto.getMenuType(), dto.getPrice(), dto.getMenuNo()}; 
		return jdbcTemplate.update(sql, data) > 0;
		
	}
	
	public boolean delete(int menuNo) {
		String sql = "delete menu where menu_no=?";
		Object[] data = {menuNo};
		return jdbcTemplate.update(sql, data) > 0;
	}
	
	public List<MenuDto> selectList() {
		String sql = "select * from menu order by menu_no asc";
		return jdbcTemplate.query(sql, mapper);
	}
	
	public List<MenuDto> selectList(String column, String keyword) {
		String sql = "select * from menu "
				//+ "where instr("+column+", ?) > 0"
				+ "where instr(upper("+column+"), upper(?)) > 0"
				+ "order by "+column+" asc, menu_no asc";
		Object[] data = {keyword};
		return jdbcTemplate.query(sql, mapper, data);
		
	}
	
	
	public MenuDto selectOne(int menuNo) {
		String sql = "select * from menu where menu_no = ?";
		Object[] data = {menuNo};
		List<MenuDto> list = jdbcTemplate.query(sql, mapper, data);
		return list.isEmpty() ? null : list.get(0);
	}
	
	//통합 페이징 만들기
	public List<MenuDto> selectListByPaging(PageVO vo) {
		if(vo.isSearch()){
			String sql = "select * from ("
						+ "select rownum rn, TMP.* from ("
							+ "select "
							+ "menu_no, menu_name_kor, menu_name_eng, "
							+ "menu_type, menu_price "
							+ "from menu "
							+ "where instr("+vo.getColumn()+", ?) > 0 "
							+ "order by menu_no desc"
						+ ")TMP"
						+ ") where rn between ? and ?";
			Object[] data = {
					vo.getKeyword(),
					vo.getBeginRow(),
					vo.getEndRow()
			};
			return jdbcTemplate.query(sql, mapper, data);
		}
		else {
			String sql = "select * from ("
					+ "select rownum rn, TMP.* from ("
						+ "select "
						+ "menu_no, menu_name_kor, menu_name_eng, "
						+ "menu_type, menu_price "
						+ "from menu order by menu_no desc"
					+ ")TMP"
					+ ") where rn between ? and ?";
			Object[] data = {vo.getBeginRow(),vo.getEndRow()};
			return jdbcTemplate.query(sql, mapper, data);
		}
	}
	
	//카운트
		public int count(PageVO pageVO) {
			if(pageVO.isSearch()) {//검색
				String sql = "select count(*) from menu "
								+ "where instr("+pageVO.getColumn()+", ?) > 0";
				Object[] data = {pageVO.getKeyword()};
				return jdbcTemplate.queryForObject(sql, int.class, data);
			}
			else {//목록
				String sql = "select count(*) from menu";
				return jdbcTemplate.queryForObject(sql, int.class);
		}
	}

	
	@Autowired
	private StatMapper statMapper;
	public List<StatVO> statByType(){
		String sql = "select menu_type 항목,count(*)개수 "
				+ "from menu group by menu_type "
				+ "order by 개수 desc, menu_type asc"; 
		return jdbcTemplate.query(sql, statMapper);
	}
	
}
