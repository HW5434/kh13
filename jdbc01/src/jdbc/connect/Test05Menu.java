package jdbc.connect;

import java.util.Scanner;

import org.springframework.jdbc.core.JdbcTemplate;
import org.springframework.jdbc.datasource.DriverManagerDataSource;

public class Test05Menu {
	public static void main(String[] args) {
	
			Scanner sc = new Scanner(System.in);
			String menuNamekr = "ㅋㅋ";
			String menuNameeng = "ㅋㅋ";
			String menuType = "ㅋㅋ";
			int price = 50;
				
		//	입력
		String sql = "insert into menu(menu_no , menu_name_kor , menu_name_eng , menu_type , menu_price)"				
		+ "values(menu_seq.nextval,?,?,?,?)";
		Object[] data = {menuNamekr , menuNameeng , menuType , price};		
		
		DriverManagerDataSource dataSource = new DriverManagerDataSource();
		dataSource.setUsername("kh13"); 
		dataSource.setPassword("kh13"); 
		dataSource.setDriverClassName("oracle.jdbc.OracleDriver"); 
		dataSource.setUrl("jdbc:oracle:thin:@localhost:1521:xe"); 
		
		JdbcTemplate jdbcTemplate = new JdbcTemplate(dataSource);
		
		jdbcTemplate.update(sql, data);
		
		//	출력
		System.out.println("메뉴 등록");
		
	}
}
