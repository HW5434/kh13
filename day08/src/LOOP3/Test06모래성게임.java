package LOOP3;

import java.util.Scanner;

public class Test06모래성게임 {

	public static void main (String[] arg) {
		
//		최초에 100이라는 숫자를 정해두고 사용자에게 1~9 사이의 숫자를 입력받아 0을 만드는 사람이 패배하도록 모래성 게임을 구현하세요
//
//		남은 숫자 : 100
//		가져갈 숫자(1~9) 입력 : 5
//
//		남은 숫자 : 95
//		가져갈 숫자(1~9) 입력 : 9
//
//		남은 숫자 : 86
//		가져갈 숫자(1~9) 입력 : ?
//
//		...
//
//		남은 숫자 : 1
//		가져갈 숫자(1~9) 입력 : 1
//
//		당신은 패배했습니다
		
		Scanner sc = new Scanner(System.in);
		
		int count = 100;
		while(true) {
			System.out.println("남은 숫자 : " + count);
			System.out.print("가져갈 숫자(1 ~ 9) 입력 : ");
			
			int number = sc.nextInt();
			System.out.println();
		
			if(!(number >= 1 && number <= 9)) {
			continue;
			}
			count-=number;
				
		if(count < 0 || count == 0) {
			break;
		}
	}
		System.out.println();
		System.out.println("게임 끝");	
	}
}
