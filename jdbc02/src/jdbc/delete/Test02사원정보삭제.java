package jdbc.delete;

import org.springframework.jdbc.core.JdbcTemplate;

import jdbc.utill.JdbcHelper;

public class Test02사원정보삭제 {
	public static void main(String[] args) {

		//데이터 준비
		int empNo = 1;
		
		//처리
		JdbcTemplate jdbcTemplate = JdbcHelper.getJdbcTemplate();
		String sql = "delete emp where emp_no=? ";
		Object[] data = {empNo};
		int result = jdbcTemplate.update(sql , data);
		
		//출력
		if(result > 0) {
			System.out.println("삭제완료");
		}
		else {
			System.out.println("존재하지 않는 사원 번호입니다.");
		}
	}
}
