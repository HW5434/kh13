package jdbc.app;

import java.util.List;

import jdbc.dao.PocketmonDao;
import jdbc.dto.PocketmonDto;

public class Test15포켓몬검색 {
	
	public static void main(String[] args) {
		
		String column = "pocketmon_type";
		String keyword = "피카";
		
		PocketmonDao dao = new PocketmonDao();
		List<PocketmonDto> list = dao.selectList(column, keyword); //항목
		
		if(list.isEmpty()) {
			System.out.println("표시할 데이터가 없습니다");
		}
		else { // 안되면 목록이 나오게
			for(PocketmonDto dto : list) {
				System.out.println(dto.getPocketmonName());
			}
		}
		
	}
}
