package oop.inherit8풀이;

public abstract class Phone {
	private String number;
	private String color;
	
	public void setNumber(String number , String color) {
		this.number = number;
		this.color = color;
	}
	public void information() {
		System.out.println("번호 : " + this.number);
		System.out.println("색상 : " + this.color);
		
	}
	public abstract void call();
	public abstract void sms();

}
