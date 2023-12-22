package oop.inherit8;

public class GalaxyFold5 extends Phone {
	
	@Override
	public void call() {
		System.out.println("갤럭시23Fold 전화기능");
	}

	@Override
	public void sms() {
		System.out.println("갤럭시23Fold 문자기능");
	}
	
	public void samsungPay() {
		System.out.println("갤럭시23FE 삼성페이 기능 실행");
	}
	
	public void iris() {
		System.out.println("갤럭시폴드5 홍채인식 기능 실행");
	}
	
}
