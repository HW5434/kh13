package api.lang.string2;

import java.util.Scanner;

public class Test05날짜검사 {

	public static void main(String[] args) {
		//숫자로 생각하지 말자 [년도]
		//한번에
		Scanner sc = new Scanner(System.in);
		
		System.out.println("년도를 입력하세요");
		System.out.println("ex : YYYY-MM-DD");
		String userYear = sc.next();
		//큰달 작은달 윤년 설정 다시해보기
		
		//birth의 앞 네자리를 뽑아서 정수로 바꿔서 year에 넣을 수 있을까?
		//parseInt = 지정된 기수로 문자 ch의 숫자 값을 반환합니다.  
		String yearPart = userYear.substring(0,4);
		int year = Integer.parseInt(yearPart);
		
		//윤년 코드
		boolean isLeap = year % 400 == 0 || (year % 4 == 0 && year % 100 != 0);
		
		//윤년인지 여부에 따라 검사식의 마지막 날짜를 구해서 적용
		int number;
		if(isLeap) {
			number = 9;
		}
		else {
			number = 8;
		}
		
//		String regex = "^(19[0-9]{2}|20[0-9]{2})$";
		String regex = "^(19[0-9]{2}|20[0-9]{2})-(02-(0[1-9]|1[0-9]|2[0-\"+number+\"])|(0[469]|11)-(0[1-9]|1[0-9]|2[0-9]|30)|(0[13578]|1[02])-(0[1-9]|1[0-9]|2[0-9]|3[01]))$";
		
		if(userYear.matches(regex)) {
			System.out.println("축하합니다! (생년월일)생성이 완료되었습니다");
		}
		else {
			System.out.println("잘못된 형식이 아닙니다 [EX : 1999-06-28]");
		}
		
		
	}

}
