package CONDITION2;

import java.util.Scanner;

public class Test03여행사프로모션 {
	public static void main(String[] args) {
		//입력
		Scanner sc = new Scanner(System.in);
		System.out.print("여행갈 월(1~12) 정보 입력 : ");
		int month = sc.nextInt();
		System.out.print("인원 수 입력 : ");
		int people = sc.nextInt();
		System.out.print("기간(일) 입력 : ");
		int day = sc.nextInt();
		int price = 100000;
		
		//계산
		//int rate = 20 or 10 or 30 or 5;
		int rate;
		if(month == 3 || month == 4 || month == 5) {
			rate = 20;
		}
		else if(month == 6 || month == 7 || month == 8) {
			rate = 10;
		}
		else if(month == 9 || month == 10 || month == 1) {
			rate = 30;
		}
		else {
			rate = 5;
		}
		
		//할인금액 = 인원수 * 기간 * 하루금액 * 할인율
		int total = people * day * price;
		int discount = total * rate / 100;
		int result = total - discount;
		
		//출력
		System.out.println("총금액 : " + total + "원");
		System.out.println("할인율 : "+rate+"%");
		System.out.println("할인금액 : " + discount+"원");
		System.out.println("최종금액 : " + result+"원");
	}
}