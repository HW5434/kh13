package jdbc.update;

import java.util.Scanner;

import org.springframework.jdbc.core.JdbcTemplate;

import jdbc.utill.JdbcHelper;

public class Test03메뉴정보수정 {
	public static void main(String[] args) {

		Scanner sc = new Scanner(System.in);
		System.out.println("메뉴번호");
		int menuNo = sc.nextInt();
		System.out.println("메뉴명(한글)");
		String menuNameKor = sc.nextLine();
		System.out.println("메뉴명(영문)");
		String menuNameEng = sc.nextLine();
		System.out.println("메뉴종류");
		String menuType = sc.nextLine();
		System.out.println("메뉴가격");
		int price = sc.nextInt();
		
		
		JdbcTemplate jdbcTemplate = JdbcHelper.getJdbcTemplate();
		
		String sql = "update menu "
				+ "set menu_name_kor= ? , menu_name_eng= ? , menu_type= ? , menu_price= ? "
				+ "where menu_no= ?";
		
		Object [] datas = {menuNameKor , menuNameEng , menuType , price , menuNo};
		int result = jdbcTemplate.update(sql,datas);
		System.out.println("result = " + result);
		
		if(result > 0){
			System.out.println("메뉴 정보가 변경되었습니다");
			}
			else{
			System.out.println("존재하지 않는 메뉴 번호입니다");
			}
	
	}
}
/*

	int menuNo = 1;
	String menuNameKor = "바꾼메뉴명";
	..
	..
	..
	..

	JdbcTemplate jdbcTemplate = jdbcHelper.getjdbcTemplate();
	
	String sql = "update menu 
	set
	menu_name ..
	..
	..
	..
	.
	
	where menu_no=?";
	Object [] data = {menuName Kr ......};
	
	int result = jdbcTemplate.update(sql , data);

	//출력
	if(result > 0){
	System.out.println("메뉴 정보가 변경되었습니다");
	}
	else{
	System.out.println("존재하지 않는 메뉴 번호입니다");
	}











 **/
