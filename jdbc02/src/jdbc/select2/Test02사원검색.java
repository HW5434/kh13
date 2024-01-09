package jdbc.select2;

import java.util.List;
import java.util.Scanner;

import org.springframework.jdbc.core.JdbcTemplate;

import jdbc.select.EmpDto;
import jdbc.select.EmpMapper;
import jdbc.utill.JdbcHelper;

public class Test02사원검색 {
	public static void main(String[] args) {
		
		//데이터 준비
		Scanner sc = new Scanner(System.in);
		String keyword = sc.next();
		
		//처리
		JdbcTemplate jdbcTemplate = JdbcHelper.getJdbcTemplate();
		String sql = "select * from emp where emp_name like ? || '%'";
		Object[] data = {keyword};
		EmpMapper mapper = new EmpMapper();
		
		List<EmpDto> list = jdbcTemplate.query(sql, mapper, data);
		
		System.out.println("조회 결과 : " + list.size());
		for(EmpDto dto : list) {
			System.out.println(dto.getEmpName());
		}
	}
}
