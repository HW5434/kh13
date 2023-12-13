package RANDOM;

import java.util.Scanner;

public class Test03랜덤구구단 {
public static void main(String [] arg) {
	
//		10개의 랜덤 구구단 문제를 출제하는 프로그램을 구현하세요
//		2단 부터 19단 까지의 범위 내에서 출제
//		사용자에게 입력을 받아 정답, 오답 판정
//		사용자가 맞춘 문제 수를 카운트하여 출력
//		맞춘 문제 하나당 점수를 부여
//		쉬운 문제는 10점 (2~11단, x1)
//		어려운 문제는 15점 (나머지)
//		사용자가 획득한 점수를 누적합산하여 출력
	
	Scanner sc = new Scanner(System.in);
	int count = 0;
	int scoreA = 0;
	int scoreB = 0;
	int dan = sc.nextInt();
	for(int i = 1; i <= 9; i++) {
		System.out.println(dan + " X " +i + " = ");
		int answer = sc.nextInt();
		count++;
		if(answer == dan * i) {
			System.out.println("정답!");
			if(dan <= 11); {
				scoreA+=10;
			}
			if (dan <= 19){
				scoreB+=15;
			}
		}
		else {
			System.out.println("오답!");
		}
	}
		System.out.println();
	}
}

