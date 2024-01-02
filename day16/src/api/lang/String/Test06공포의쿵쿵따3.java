package api.lang.String;

import java.util.Scanner;

public class Test06공포의쿵쿵따3 {

	public static void main(String[] args) {

		//판정 추가
		Scanner sc = new Scanner(System.in);
	
		while(true) {
			
		
		String given = "바나나";
		System.out.println(given + "! 쿵쿵따! ");
		String input = sc.next();
//		char last = given.charAt(2);
		char last = given.charAt(given.length()-1); //마지막 글자
		char first = input.charAt(0);
		System.out.println(first == last); //원시형이라서 비교연산으로 비교
		
		boolean isLengthOk = input.length() == 3;
		boolean isConnect = first == last;
		boolean isOk = isLengthOk && isConnect;
		if(isOk) {
			
		}
		else {
			break;
		}
	}
		//게임오버처리
		System.out.println("게임 끝!");
	}	
}

