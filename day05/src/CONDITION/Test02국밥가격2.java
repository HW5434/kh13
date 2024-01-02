package CONDITION;

import java.time.LocalDate;
import java.util.Scanner;

public class Test02국밥가격2 {
	public static void main(String[] args) {
	/*KH국밥집에서는 국밥 한그릇을 7천원에 팔고 있습니다.
	65세 이상 어르신에게는 30% 할인된 가격으로 판매합니다.

	사용자에게 출생년도 8자리를 입력받아 한국나이 계산 후 
	주문할 수량을 입력받아 결제할 금액 출력 */  
	
		//입력
		Scanner sc = new Scanner(System.in);
		int birth = sc.nextInt();
		int count = sc.nextInt();
		
		int price = 7000;
		int rate = 30;
		
		//계산
		int year = birth / 10000;
		int age = 2023 - year + 1;
		//int age = LocalDate.now().
		
		boolean discount = age >= 65;
		
		//출력
		if(discount) {//할인대상(65세 이상)이라면
			int total = price * count * (100-rate) / 100 ;
			//int total = (int)price * count * 0.7 ;
		System.out.println("가격 : " + total + " 원");
		}
		else {//할인대상이 아니라면
			int total = price * count;
		System.out.println("가격 : " + total + " 원");
		}
	}
}