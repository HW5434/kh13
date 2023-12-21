package oop.inherit5;

public class Hotpurifier extends  purifier{
	
	protected Hotpurifier(String compay, int price) {
		super(compay, price);
	}
	public void hot() {
		System.out.println("온수 1잔 추출");
	}
}
