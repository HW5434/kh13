package oop.inherit8풀이;

public  class Galaxy23FE extends Phone{

	@Override
	public void call() {
		System.out.println("갤럭시23FE 전화기능");
	}

	@Override
	public void sms() {
		System.out.println("갤럭시23FE 문자기능");
	}
	
	public void samsungPay() {
		System.out.println("갤럭시23FE 삼성페이 기능 실행");
	}
	public void bixby() {
		System.out.println("갤럭시23FE 음성인식 기능 실행");
	}

	

}
