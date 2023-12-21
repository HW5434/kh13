package oop.inherit5;

public class Icepurifier extends purifier{

	protected Icepurifier(String compay, int price) {
		super(compay, price);
		
	}
	public void ice() {
		System.out.println("냉수 1잔 추출");
	
	}
	public void cold() {
		System.out.println("찬물");
	}
}

