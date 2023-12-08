package CONDITION2;

public class Test02지하철요금3 {
	public static void main(String[] args) {
		//계산 과정을 조건으로 처리
		
		//입력
		int age = 65;
		
		//계산
		int price;
		if(age >= 65 || age < 8) {//어르신 또는 영유아
			price = 0;
		}
		else if(age >= 20) {
			price = 1400;
		}
		else if(age >= 14) {
			price = 800;
		}
		else {
			price = 500;
		}
		
		int card = 500;
		int result = price + card;
		
		//출력
		System.out.println("요금 : " + price + "원");
		System.out.println("카드보증금 "+card+"원");
		System.out.println("결제금액 : " + result+"원");
		
		
	}
}



