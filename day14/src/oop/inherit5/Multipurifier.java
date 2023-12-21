package oop.inherit5;

public class Multipurifier extends purifier{

	protected Multipurifier(String compay, int price) {
		super(compay, price);
	} 
	public void hot() {
		System.out.println("따뜻한");
	}
	public void cold() {
		System.out.println("차가운");
	}
}

