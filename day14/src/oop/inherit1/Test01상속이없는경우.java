package oop.inherit1;

public class Test01상속이없는경우 {
	public static void main (String[] arg) {
		GalaxyFold5 p1 = new GalaxyFold5();
		p1.call();
		p1.sms();
		p1.bixby();
		
		IPhone15 p2 = new IPhone15();
		p2.call();
		p2.sms();
		p2.siri();
	}
}
