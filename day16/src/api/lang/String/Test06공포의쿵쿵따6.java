package api.lang.String;

import java.util.Random;
import java.util.Scanner;

public class Test06공포의쿵쿵따6 {

	public static void main(String[] args) {

	//판정 추가
		Scanner sc = new Scanner(System.in);
	
		String[] words = new String[] {
				"바나나" , "물고기" , "초콜릿" , "이발소" , "컴퓨터"
		};
		Random r = new Random();
		
	//		String given = "바나나";//밖으로 빼고
			int position = r.nextInt(words.length);
			String given = words[position];
			int round = 1;//1라운드 시작
		while(true) {
			System.out.println(given + "! 쿵쿵따! ");
			String input = sc.next();
	//		char last = given.charAt(2);
			char last = given.charAt(given.length()-1); //마지막 글자
			char first = input.charAt(0);
	//		System.out.println(first == last); //원시형이라서 비교연산으로 비교
		
			boolean isLengthOk = input.length() == 3;
			boolean isConnect = first == last;
			boolean isOk = isLengthOk && isConnect;
			
		if(isOk) {
			given = input;
			round++;//맞추면 라운드 증가
		}
		else {
			break;
		}
	}
		//게임오버처리
		System.out.println("게임 끝!");
		System.out.println("총 라운드 = " + round);
	}	
}

