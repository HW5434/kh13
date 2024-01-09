package jdbc.connect;

import org.springframework.jdbc.core.JdbcTemplate;
import org.springframework.jdbc.datasource.DriverManagerDataSource;

public class Test03데이터변수화 {

	public static void main(String[] args) {

		//목표 : 변수에 저장된 정보를 구문과 합쳐서 실행
		
		//입력
		int pocketmonNo = 99;
		String pocketmonName = "테스트몬";
		String pocketmonType = "테스트";
		
		//처리
		String sql = "insert into pocketmon(pocketmon_no , pocketmon_name , pocketmon_type"
				+ ") "
				+"values('"+pocketmonNo+"' , '"+pocketmonName+"' , '"+pocketmonType+"')";
		
		
		DriverManagerDataSource dataSource = new DriverManagerDataSource();
		dataSource.setUsername("kh13"); 
		dataSource.setPassword("kh13"); 
		dataSource.setDriverClassName("oracle.jdbc.OracleDriver"); 
		dataSource.setUrl("jdbc:oracle:thin:@localhost:1521:xe"); 
		
		JdbcTemplate jdbcTemplate = new JdbcTemplate(dataSource);
		
		//[실행]
		jdbcTemplate.update(sql);
		System.out.println("완료!");
		
	}
}
