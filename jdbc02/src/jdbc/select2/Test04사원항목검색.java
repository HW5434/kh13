package jdbc.select2;

import java.util.List;

import org.springframework.jdbc.core.JdbcTemplate;

import jdbc.select.EmpDto;
import jdbc.select.EmpMapper;
import jdbc.utill.JdbcHelper;

public class Test04사원항목검색 {
public static void main(String[] args) {
	
	//입력 
	
	String column = "emp_date";
	String keyword = "피카";
	
	//처리
	JdbcTemplate jdbcTemplate = JdbcHelper.getJdbcTemplate();
	String sql = "select * from emp where instr("+column+" , ?) > 0";
	//데이터
	Object[] data = {keyword};
	//mapper
	EmpMapper mapper = new EmpMapper();
	
	//List
	List<EmpDto> list = jdbcTemplate.query(sql, mapper, data);
	
	if(list.isEmpty()) {
		System.out.println("검색 결과가 없습니다");
	}
	else{
		System.out.println("조회결과 : " + list.size());
		for(EmpDto dto : list) {
			System.out.println("[");
			System.out.println(dto.getEmpName());
			System.out.println("]");
			System.out.println(dto.getEmpDept());
			System.out.println(dto.getEmpDate());
			
			}
		}
	}
}
