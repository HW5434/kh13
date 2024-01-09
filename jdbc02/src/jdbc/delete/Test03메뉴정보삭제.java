package jdbc.delete;
import org.springframework.jdbc.core.JdbcTemplate;
import jdbc.utill.JdbcHelper;

public class Test03메뉴정보삭제 {
	public static void main(String[] args) {
	
		//입력
		int menuNo = 1;
		
		//처리
		JdbcTemplate jdbcTemplate = JdbcHelper.getJdbcTemplate();
		String sql = "delete menu where menu_no=? ";
		Object[] data = {menuNo};
		
		int result = jdbcTemplate.update(sql , data);
		
		//출력
		if(result > 0) {
			System.out.println("메뉴정보 삭제완료");
		}
		else {
			System.out.println("존재하지 않는 메뉴입니다.");
		}
	}
}
