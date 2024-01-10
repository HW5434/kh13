package jdbc.app;

import org.springframework.jdbc.core.JdbcTemplate;

import jdbc.dao.PocketmonDao;
import jdbc.dto.PocketmonDto;
import jdbc.util.JdbcHelper;

public class Test04포켓몬수정 {
	public static void main(String[] args) {
		
		PocketmonDto dto = new PocketmonDto();
		dto.setPocketmonNo(4);
		dto.setPocketmonName("바꾼이름");
		dto.setPocketmonType("테스트");
		
		PocketmonDao dao = new PocketmonDao();
		boolean result = dao.update(dto);
		
		if(result) {
			System.out.println("포켓몬스터 변경 완료");
		}
		else {
			System.out.println("존재하지 않는 몬스터 번호");
		}
	}
}

