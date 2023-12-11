package LOOP;

import java.util.Scanner;

public class Test10구구단3 {
	public static void main(String[] args) {
	
		
		Scanner sc = new Scanner(System.in);
		System.out.print("구구단의 단을 입력하세요. : ");		
		int Number = sc.nextInt();
		System.out.println();
		
		//계산
		int N = Number * 9;		
		for(int i = Number; i <= N; i = i +3) {
		int count = i / Number;		
		//식 출력
		
		System.out.print(Number + "X" + count + "=");
		int chat1 = sc.nextInt();
		if(chat1 == Number * count) {
			System.out.print("정답!");		
			System.out.println();
			System.out.println();
		}
		else {
			System.out.print("오답!");
			System.out.println();
		}

		}
	}						
}
	

