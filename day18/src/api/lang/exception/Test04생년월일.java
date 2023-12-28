package api.lang.exception;

import java.util.Scanner;

public class Test04생년월일 {
	public static void main(String[] args) {
	
		//입력 String 으로 입력받고 출력은 인트
		Scanner sc = new Scanner(System.in);
		String input = sc.next();
		
		String yearS = input.substring(0,4);
		String monthS = input.substring(5,7);
		String dayS = input.substring(8,10);
		
		int year = Integer.parseInt(yearS);
		int month = Integer.parseInt(monthS);
		int day = Integer.parseInt(dayS);
		
		System.out.println(year); //출생년도 2023년
		System.out.println(month); // 출생월 12월
		System.out.println(day); // 출생일 28일
	}
}
