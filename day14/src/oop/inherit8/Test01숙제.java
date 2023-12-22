package oop.inherit8;

public class Test01숙제 {
	public static void main(String [] args) {
		
		Galaxy23FE g23 = new Galaxy23FE();
		
		g23.setNumber("010-1212-3434", 500000);
		g23.information();
		g23.call();
		g23.sms();
		g23.samsungPay();
		g23.bixby();
		
		GalaxyFold5 gF5 = new GalaxyFold5();
		
		gF5.setNumber("010-1212-3434", 50000);
		gF5.information();
		gF5.call();
		gF5.sms();
		gF5.samsungPay();
		gF5.iris();
		
		IPhone14 ip14 = new IPhone14();
		
		ip14.setNumber("010-1212-3434", 50000);
		ip14.information();
		ip14.call();
		ip14.sms();
		
		IPhone15 ip15 = new IPhone15();
		
		ip14.setNumber("010-1212-3434", 50000);
		ip14.information();
		ip14.call();
		ip14.sms();
		ip14.getClass();
	}
}
