package CONDITION2;

import java.util.Scanner;

public class Test04체질량계산기 {

	public static void main(String[] args) {

		//입력
		Scanner sc = new Scanner(System.in);
		System.out.print("키를 말씀하세요 [cm기준] : ");
		double tall = sc.nextInt();
		
		System.out.print("체중을 말씀하세요 : ");
		double weight = sc.nextInt();
		double tallM = tall / 100;
		
		//계산
		double bmi = weight / (tallM * tallM);

		//출력
		System.out.println();
		System.out.print("계산중 .......... : ");
		System.out.println();
		
		System.out.print("당신의 BMI점수는 : " + (int) bmi + " ");
		
		if(bmi < 18.5d) {
		System.out.println("저체중 입니다.");
		}
		else if(bmi > 18.5d && bmi <=23) {
		System.out.println("정상 입니다.");
		}
		else if(bmi > 23 && bmi <=25) {
		System.out.println("과체중 입니다.");
		}
		else if(bmi > 25 && bmi <=30) {
		System.out.println("경도비만 입니다.");
		}
		else {
		System.out.println("중등도비만 입니다.");
		
		}
	}
}
