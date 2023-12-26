package api.lang.object;

import java.util.Random;

public class Test02최상위클래스 {
	public static void main(String[] args) {
		//Object 클래스가 최상위 클래스임을 코드로 증명
		//- 이전에 배운 다형성의 원리를 활용
		//- A를 B가 상속받았을때 B는 A로 업캐스팅이 가능함 (예시로 출근)
		
		
		Object a = "hello"; //String 을 Object로 보관 (업캐스팅) 상속관계
		Object b = 100; // int 가 Object (업캐스팅) 오브젝트가 상위 클래스인게 증명됌
		Object c = 3.14;
		Object d = new Random(); //랜덤도 업캐스팅 가능 스캐너도 동일
		Object e = new int[5]; //배열도 가능
		
		//결론 : Object가 최상위 클래스이며 "아무거나" 보관이 가능하다
		Object g = new Student();
		
		System.out.println(a instanceof String); //a의 데이터가 String 형태인가요?
		System.out.println(b instanceof String); //b의 데이터가 String 형태인가요?
		System.out.println(b instanceof Integer); //Integer(int)
		
	}

}
