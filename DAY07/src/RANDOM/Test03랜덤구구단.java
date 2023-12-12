package RANDOM;

import java.util.Scanner;

public class Test03랜덤구구단 {
public static void main(String[] arg) {
	
	Scanner sc = new Scanner(System.in);
	//실행
	int total = 0;
	int count = 0;
	int dan = sc.nextInt();
		
	for(int i = 1; i <= 9; i++) {
		System.out.print(dan + " X " + i + " = " );
		int answer = sc.nextInt();
			
		if(answer == dan * i) {
			System.out.println("정답");
			count++;
			
			if (dan <= 11) {
			
					}
		else if (dan <= 19) {
				int scoreB = 15;

		}
		
	}

		else {
			System.out.println("오답");			
		}

	}
		System.out.println("개수 : " + count);
}
}

