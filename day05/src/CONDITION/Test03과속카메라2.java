package CONDITION;

public class Test03과속카메라2 {

	public static void main(String[] args) {
		// 50km < 달린 차량의 속도 true or false
		// 사실이면 30000원 
		//   벌금 10000원 증가
		//Start 51 ~ 3만원 50이면 0원
		//60km 부터 4만원
		
		// 나누는거 먼저 if else 정하기
		
		//입력
		int speed = 59;
		
		//계산
		boolean over = speed > 50; // 50은 limit로 바꾸기
		// 10을 나눈거는 10km당을 나타내는거임 벌금 구간
		//출력
		if(over) { 
			int total = (speed - 50) / 10 * 10000 + 30000; // 3만원은 기본요금 1만원은 초과요금
			//int total = (속도) / 10 * 10000 - 20000;

			System.out.println("벌금" + total + "원"); //true
		}
		else {
			System.out.println("벌금 0원"); //false	
		}
		
	}
}

