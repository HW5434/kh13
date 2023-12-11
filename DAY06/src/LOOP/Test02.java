package LOOP;

import java.util.Scanner;

public class Test02 {

	public static void main(String[] args) {
//		사용자에게 이름을 입력받아 입력받은 이름 뒤에 "님 환영합니다!" 라는 문구를 붙여 출력할 수 있도록 구현하세요
//
//		단, 문자열 입력은 다음과 같이 받습니다.
//		
		//입력
		Scanner sc = new Scanner(System.in);
			
		for(int i = 1 ; i <= 5 ; i = i + 1) { //1부터 5까지 1씩 늘어나는
			System.out.print("이름을 입력하세요 : ");
			String str = sc.next();
			System.out.println(str + "님 환영합니다!");
			
		
		}
	}
}
