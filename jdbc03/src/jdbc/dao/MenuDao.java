package jdbc.dao;

import java.util.List;

import org.springframework.jdbc.core.JdbcTemplate;

import jdbc.dto.MenuDto;
import jdbc.mapper.MenuMapper;
import jdbc.util.JdbcHelper;
//menu 테이블에 대한 DB처리(CRUD)를 담당하는 클래스
public class MenuDao {
	//등록
	public void insert(MenuDto dto) {
		JdbcTemplate jdbcTemplate = JdbcHelper.getJdbcTemplate();
		String sql = "insert into menu("
							+ "menu_no, menu_name_kor, menu_name_eng, "
							+ "menu_type, menu_price"
						+ ") "
						+ "values(menu_seq.nextval, ?, ?, ?, ?)";
		Object[] data = {
			dto.getMenuNameKr(), dto.getMenuNameEg(),
			dto.getMenuType(), dto.getMenuPrice()
		};
		jdbcTemplate.update(sql, data);
	}
	//수정
	public boolean update(MenuDto dto) {
		JdbcTemplate jdbcTemplate = JdbcHelper.getJdbcTemplate();
		
		String sql = "update Menu set "
				+ "menu_name_kor=?, menu_name_eng=?, menu_type=?, menu_price=? "
				+ "where menu_no=?";
		Object[] data = {
				dto.getMenuNameKr(),
				dto.getMenuNameEg(),
				dto.getMenuType(),
				dto.getMenuPrice(),
				dto.getMenuNo()
		};
		return jdbcTemplate.update(sql, data) > 0;
		
	}
	//삭제
	public boolean delete(int menuNo) {

		JdbcTemplate jdbcTemplate = JdbcHelper.getJdbcTemplate();
		String sql = "delete menu where menu_no=?";
		Object[] data = {menuNo};
		return jdbcTemplate.update(sql, data) > 0;
	}
	//목록
	public List<MenuDto> selectList(){
		JdbcTemplate jdbcTemplate = JdbcHelper.getJdbcTemplate();
		
		String sql = "select * from menu order by menu_no asc";
//		Object[] data = {};
		MenuMapper mapper = new MenuMapper(); //조회가 완료된 결과를 자바스럽게
		return jdbcTemplate.query(sql, mapper); //구문이 항상 먼저
		
	}
	//상세
	public MenuDto selectOne(int MenuNo) {
		JdbcTemplate jdbcTemplate = JdbcHelper.getJdbcTemplate();
		
		String sql = "select * from menu where menu_no=?";
		Object[] data = {MenuNo};
		MenuMapper mapper = new MenuMapper();
		List<MenuDto> list = jdbcTemplate.query(sql, mapper, data);
		// 한줄로 쓰기 연습
		if(list.isEmpty()) {
			return null;
		}
		else{
			return list.get(0);
		}
		
	}
}
