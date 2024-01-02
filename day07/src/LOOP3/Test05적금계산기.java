package LOOP3;

import java.util.Scanner;

public class Test05적금계산기 {
public static void main(String[] args) {
	
	//입력
	Scanner sc = new Scanner(System.in);
	System.out.println("예치기간(년)입력 : ");
	int money = sc.nextInt();
	System.out.println("월부금(원)입력 : ");
	int origin = sc.nextInt();
	
	float rate = 3f; //연복리율
	
	for(int i = 1; i <= 3; i++) {
		// 필요한 계산
		int interest = (int) (origin * rate / 100); //3%
		int balance = origin + interest; // 원금 + 이자
		System.out.println(i  + "년차");
		System.out.println("원금 : "+ origin + "," + 
									 "이자 : " + interest + "잔액 : " + balance);

		//데이터 변화
		//다음회차 원금은 현재 잔고에 연부금 (월부금 * 12)를 더한 값이다
		origin = balance + money * 12; // 원금 + 잔액

		}
	}
}

