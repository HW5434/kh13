package oop.poly1;

import java.util.Random;

public class Test01다형성의장점 {
	public static void main(String[] args) {

		//(Q)랜덤으로 아이폰14나 15중 하나를 추첨
		Random r = new Random();
		//약속 : 1 - 아이폰14(0) , 아이폰15(1)

		int choice = r.nextInt(2);
		IPhone phone;
		//두개를 다 표현할 수 있는 형태를 잡자
		if(choice == 0) {
			//아이폰 14 객체 생성
			phone = new IPhone14(); //IPhone 14  → IPhone (업캐스팅)
			phone.call();
			phone.sms();
		}
		
		else {
			//아이폰 15 객체 생성
			phone = new IPhone15(); //IPhone 15  → IPhone (업캐스팅)
			phone.call();
			phone.sms();
		}
		
		//생성 후에도 phone 객체를 사용할 수 있다
			phone.call();
			phone.sms();
			
	}
}
