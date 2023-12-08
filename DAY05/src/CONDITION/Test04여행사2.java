package CONDITION;

import java.util.Scanner;

public class Test04여행사2 {

	public static void main(String[] args) {
		// 어디든 무조건 1사람 1박에 10만원
		// 여름에 여행하는 사람은 추가로 20퍼 할인 여름은 6,7,8월
		// 질문 : 사용자에게 인원수, 기간, 예정 월 을 임력받아서 금액출력
		
		Scanner sc = new Scanner (System.in);

		//입력
		System.out.print("* 안녕하세요!! KH여행사의 예약 프로그램 입니다. *");
		System.out.println();
		System.out.println();
		System.out.print("인원 수 입력 : ");
		int person = sc.nextInt();
		System.out.print("여행 예정(월) 입력 : ");
		int season = sc.nextInt();
		System.out.print("여행 예정(일) 입력 : ");
		int date = sc.nextInt();
		System.out.println();
		
		//계산
		int day1 = 100000;
		int pay = (day1 * person) * date;
		int sale = 20;
		
		boolean summer = 6 <= season && season <= 8; 
		//boolean summer = month == 6 || month == 7 || month == 8;
		
		//결과
		if(summer) {
		int total = pay * (100 - sale) / 100;
		System.out.println("총 금액은 " + total + " 입니다.");// 나머지 계절		
		}				
		else {
		System.out.println("총 금액은 " + pay + " 입니다."); // 여름
		}
	}
}
