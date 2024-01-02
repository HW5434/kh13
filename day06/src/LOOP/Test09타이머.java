package LOOP;

import java.util.Scanner;

public class Test09타이머 {

	public static void main(String[] args) {
		
		/*
		사용자에게 분과 초를 입력받아서 해당하는 시간만큼의 메세지를 출력하는 프로그램을 구현

		분 입력 : 1
		초 입력 : 30

		1분 30초 후 알람이 울립니다
		1분 29초 후 알람이 울립니다
		1분 28초 후 알람이 울립니다
		...
		0분 2초 후 알람이 울립니다
		0분 1초 후 알람이 울립니다
		0분 0초 후 알람이 울립니다
		띠링!
		*/
		
		//입력
			Scanner sc = new Scanner(System.in);
			System.out.print("\"분\"을 입력하세요 : ");
		int minute = sc.nextInt();
			System.out.print("\"초\"을 입력하세요 : ");
		int second = sc.nextInt();
		
		int minuteTotal = (minute * 60) + second;
		//초로 바꾸고 경계 나누기
		// 90 
		for(int i = minuteTotal; i >= 0; i--) {
			int M = i / 60;
			int S = i % 60;	
			
			System.out.println(M + "분 "+ S + "초");			
		}		
			System.out.println("띠링~!");			
	}
}
