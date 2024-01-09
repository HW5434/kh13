package jdbc.connect;

import java.util.Scanner;

import org.springframework.jdbc.core.JdbcTemplate;
import org.springframework.jdbc.datasource.DriverManagerDataSource;

public class Test02JDBC연결연습 {
	public static void main(String[] args) {
		DriverManagerDataSource dataSource = new DriverManagerDataSource();
		dataSource.setUsername("kh13"); 
		dataSource.setPassword("kh13"); 
		dataSource.setDriverClassName("oracle.jdbc.OracleDriver"); 
		dataSource.setUrl("jdbc:oracle:thin:@localhost:1521:xe"); 
		
		String abc = "insert into book("
				+ "book_id, book_title, book_author, book_publication_date, book_price, book_publisher, book_page_count, book_genre"
				+ ") "
				+ "values(50,'자바신공','열혈강사','2023-10-01',5,'wikidocs','199','Education')";
		
		
		JdbcTemplate jdbcTemplate = new JdbcTemplate(dataSource);
		
		jdbcTemplate.update(abc);
		System.out.println("완료!");
		
		
	}
}
