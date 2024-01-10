package jdbc.select2;

import java.util.List;

import org.springframework.jdbc.core.JdbcTemplate;

import jdbc.select.MenuDto;
import jdbc.select.MenuMapper;
import jdbc.utill.JdbcHelper;
 
public class Test03항목검색 {
	public static void main(String[] args) {
		//메뉴를 검색하는데...
		//원하는 항목만 지정해서 검색하고 싶다면?
		
		//근본 값
		String column = "menu_name_kor"; //검색할 항목 이름
		String keyword = "아메"; // 검색할 항목에 대한 키워드
		
		JdbcTemplate jdbcTemplate = JdbcHelper.getJdbcTemplate();
		MenuMapper mapper = new MenuMapper(); //조회결과 처리객체
		
		// - 위치 홀더는 데이터 자리에 사용하는 것(자료형에 맞게 따옴표 등 처리)
		//String sql = "select * from menu where 'menu_name_kor' like '아메' || '%'";		
		//String sql = "select * from menu where "+column+" like ? || '%'"; //홀더1
		
		String sql = "select * from menu where instr("+column+" , ?) > 0";
		Object[] data = {keyword};
		
		List<MenuDto> list = jdbcTemplate.query(sql, mapper, data);
		if(list.isEmpty()) {
			System.out.println("검색 결과가 없습니다");
		}
		else {
			for(MenuDto dto : list) {
				System.out.println("[");
				System.out.println(dto.getMenuType());
			}
		}
	}
}
