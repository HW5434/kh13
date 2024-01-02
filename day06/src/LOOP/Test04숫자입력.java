package LOOP;

import java.util.Scanner;

public class Test04숫자입력 {

	public static void main(String[] args) {
		/*1번째 숫자 입력 : 23
		입력하신 숫자는 "23" 입니다.

		2번째 숫자 입력 : 15
		입력하신 숫자는 "15" 입니다.

		...(반복)...*/
		//입력을 7번 받을수 있게
		
		Scanner sc = new Scanner(System.in);			
		for(int i = 1; i <= 7; i = i + 1 ) {
			
		//출력		
			System.out.print("1번째 숫자 입력 : ");
			String Number1 = sc.next();
			System.out.println("입력하신 숫자는 \"" + Number1 + "\" 입니다.");
			
			System.out.print("2번째 숫자 입력 : ");
			String Number2 = sc.next();	
			System.out.println("입력하신 숫자는 \"" + Number2 + "\" 입니다.");
		}
		
	}

}
