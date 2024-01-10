package jdbc.app;

import jdbc.dao.MenuDao;
import jdbc.dto.MenuDto;

public class Test06메뉴정보변경 {
	public static void main(String[] args) {
		
		MenuDto dto = new MenuDto();
		dto.setMenuNo(1);
		dto.setMenuNameKr("아메리카노");
		dto.setMenuNameEg("Americano");
		dto.setMenuType("커피");
		dto.setMenuPrice(2500);
		
		MenuDao dao = new MenuDao();
		boolean result = dao.update(dto);
		
		if(result) {
			System.out.println("메뉴 정보 변경 완료");
		}
		else {
			System.out.println("메뉴 정보 변경 실패");
		}
	}
}
