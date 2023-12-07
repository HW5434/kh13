package IO;

import java.util.Scanner;

public class Test06분식점 {

	public static void main(String[] args) {
		/*KH분식점의 메뉴판은 다음과 같습니다.

		사용자에게 떡볶이, 튀김, 순대 개수를 입력받아 결제금액을 출력
		(단, 현재 행사중이라서 10% 할인된 가격으로 판매합니다)*/ 
		
		Scanner sc = new Scanner(System.in);
		
		int tteokbokki = 3000;
		int fried = 5000;
		int sundae = 2000;

		System.out.print("떡볶이의 수량을 입력하세요. : ");
		int Tc = sc.nextInt(); // 떡볶이 개수
		System.out.print("튀김의 수량을 입력하세요. : ");
		int Fc = sc.nextInt(); // 튀김 개수
		System.out.print("순대의 수량을 입력하세요. : ");
		int Sc = sc.nextInt(); // 순대 개수
		
		int total = (tteokbokki * Tc) + (fried * Fc) + (sundae * Sc);
		double sale = total * 1.0 / 10;
		int pay = (int) (total - sale);
		
		System.out.println();
		System.out.println("총 결제금액은 " + pay + "원 입니다.");
		
		//System.out.println(total);
		//System.out.println(sale);
		
	}

}
