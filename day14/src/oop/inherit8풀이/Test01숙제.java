package oop.inherit8풀이;

public class Test01숙제 {
	public static void main(String [] args) {
	
		Galaxy23FE g23 = new Galaxy23FE();
		GalaxyFold5 gF5 = new GalaxyFold5();
		IPhone14 ip14 = new IPhone14();
		IPhone15 ip15 = new IPhone15();
		
		g23.setNumber("010-1212-3434","블랙");
		g23.information();
		g23.call();
		g23.sms();
		g23.samsungPay();
		g23.bixby();
		System.out.println();
		
		gF5.setNumber("010-1212-3434", "로즈골드");
		gF5.information();
		gF5.call();
		gF5.sms();
		gF5.samsungPay();
		gF5.iris();
		System.out.println();

		ip14.setNumber("010-1212-3434", "네츄럴티타늄");
		ip14.information();
		ip14.call();
		ip14.sms();
		System.out.println();
		
		ip14.setNumber("010-1212-3434", "화이트");
		ip14.information();
		ip14.call();
		ip14.sms();
		ip14.getClass();
		System.out.println();
	}
}
