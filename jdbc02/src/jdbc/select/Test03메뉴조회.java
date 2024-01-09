package jdbc.select;
import java.util.List;
import java.util.Scanner;

import org.springframework.jdbc.core.JdbcTemplate;

import jdbc.utill.JdbcHelper;

public class Test03메뉴조회 {
	public static void main(String[] args) {
		
		String keyword = "1";
		
		JdbcTemplate jdbcTemplate = JdbcHelper.getJdbcTemplate();
		
		String sql = "select * from menu order by menu_no asc"; //여기에 뭔가 있네 
		Object[] data = {keyword};
		MenuMapper mapper = new MenuMapper();
		
		List<MenuDto> list = jdbcTemplate.query(sql, mapper,data);
		//List<MenuDto> list = jdbcTemplate.query(sql, mapper, data); //데이터는 마지막에
		System.out.println("테스트 [사이즈] : " + list.size());

			//이쪽을 이해해야함
			for(MenuDto dto : list) {
				System.out.println(dto.getMenuNo());
				System.out.println(" : ");
				System.out.println(dto.getMenuNameKr());
		}
	}
}

//to String 이 하는것
