package oop.keyword3;

public class Calculator {
	//멤버 필드
	private int width;
	private int height;
	
	//멤버 메소드
	
	//맴버 필드가 없으므로 일회성 메소드를 사용
	//static 키워드를 붙여 객체 생성 없이 접근이 가능하도록 처리(탈 객체 키워드)
	public static int rect(int width , int height) {
		return width * height;
	}
}
