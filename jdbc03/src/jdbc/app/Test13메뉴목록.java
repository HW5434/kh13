package jdbc.app;

import java.util.List;

import jdbc.dao.MenuDao;
import jdbc.dto.MenuDto;

public class Test13메뉴목록 {
	public static void main(String[] args) {

		MenuDao dao = new MenuDao();
		List<MenuDto> list = dao.selectList();
		
//		if(list == null || list.isEmpty()) //list가 널이면 쓰지말자 이런거;
			
		if(list.isEmpty()) {
			System.out.println();
		}
		else {
			for(MenuDto dto : list) {
				System.out.print(dto.getMenuNameKr());
				System.out.print("-");
			}
		}
	}
}
