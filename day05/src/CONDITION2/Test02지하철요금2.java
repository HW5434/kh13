package CONDITION2;

public class Test02지하철요금2 {
	public static void main(String[] args) {
		//카드 보증금
		
		//입력
		int age = 25;
		
		//출력
		if(age >= 65 || age < 8) {//어르신 또는 영유아
			System.out.println("요금 : 500원");
		}
//		else if(age >= 20 && age < 65) {
		else if(age >= 20) {
			System.out.println("요금 : 1900원");
		}
		else if(age >= 14) {
			System.out.println("요금 : 1300원");
		}
		else {
			System.out.println("요금 : 1000원");
		}
		
	}
}