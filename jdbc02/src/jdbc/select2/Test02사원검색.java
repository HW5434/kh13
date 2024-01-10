package jdbc.select2;

import java.util.List;
import java.util.Scanner;

import org.springframework.jdbc.core.JdbcTemplate;

import jdbc.select.EmpDto;
import jdbc.select.EmpMapper;
import jdbc.utill.JdbcHelper;

public class Test02사원검색 {
	public static void main(String[] args) {
		
		//데이터 준비 [검색어 준비]
		// 시작검색 = like연산자 , 포함검색은 instr함수
		Scanner sc = new Scanner(System.in);
		String keyword = sc.next();
		
		//처리
		JdbcTemplate jdbcTemplate = JdbcHelper.getJdbcTemplate();
		String sql = "select * from emp where emp_name like ? || '%'"
						  + "order by emp_name asc, emp_no asc";
		Object[] data = {keyword}; //홀더에 배치될 데이터
		EmpMapper mapper = new EmpMapper(); // 조회 결과 처리 방법 객체
		
		List<EmpDto> list = jdbcTemplate.query(sql, mapper, data); //mapper 는 조회한거를 이렇게 하세요~
		
//		if(list.size() == 0)
		if(list.isEmpty()) {
			System.out.println("검색 결과가 존재하지 않습니다");
		}
		else {
			System.out.println("조회 결과 : " + list.size());
//			for(int i = 0; i < list.size(); i++) {
//			같은의미
			for(EmpDto dto : list) {
				System.out.println(dto.getEmpName());
			}
		}
	}
}
