package oop.inherit8;

public abstract class Phone {
	private String number;
	private long data;
	
	public void setNumber(String number , long data) {
		this.number = number;
		this.data = data;
	}
	public void information() {
		System.out.println("번호 : " + this.number);
		System.out.println("데이터 : " + this.data);
		
	}
	public abstract void call();
	public abstract void sms();

}
