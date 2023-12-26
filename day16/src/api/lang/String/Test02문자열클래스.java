package api.lang.String;

public class Test02문자열클래스 { // jvm(매니져)? 자바 가상 머신
//결론 비교연산 쓰지말라
	public static void main(String[] args) {
		//문자열(String) * 진짜 중요함 *
		// - 자바에서 제공하는 문자열 제어 클래스
		// - 정말 몇개 안되는 new 없이 객체가 생성되는 클래스
		
		String a = new String();
		String b = new String("hello");
		
		StringBuffer c = new StringBuffer("hello");
		String d = new String(c);
		
		String e = "hello";
		String f = "hello";
		//출력 지갑에 돈이 없는것
		
//		System.out.println("a = " + a.toString());
		System.out.println("a = " + a);
		
		System.out.println("b = " + b);
		System.out.println("d = " + d);
		System.out.println("e = " + e);
		System.out.println("f = " + f);
		
		//비교 연산?? 사용하기가 까다롭다 원시형 비교할때만 [int double]
		System.out.println("b랑d랑 같나요? " + (b == d));
		System.out.println("d랑e랑 같나요? " + (d == e));
		System.out.println("e랑f랑 같나요? " + (e == f));
		System.out.println("b랑f랑 같나요? " + (b == f));
		
		//비교 메소드를 써라
		System.out.println("b랑d랑 같나요? " + b.equals(d));
		System.out.println("b랑d랑 같나요? " + d.equals(e));
		System.out.println("b랑d랑 같나요? " + e.equals(f));
		//결론 비교연산 쓰지말고 비교 메소드를 써라 == 말고 equals
	}
}
