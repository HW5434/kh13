package api.lang.etc;

public class Test02Math클래스 {
	public static void main(String[] args) {
		//MAth 클래스
		// - 프로그램 구현 시 필요한 수학적인 연산을 처리하는 클래스
		// - 객체 생성이 불가능하며 모든 필드, 메소드가 static으로 구성
		
//		int a = 100, b = 80;
//		System.out.println(a - b);
//		System.out.println(b - a);
//		System.out.println(Math.abs(a - b));//절대값
//		System.out.println(Math.abs(b - a));
//		
//		double c = 1.5;
//		
//		System.out.println(Math.round(c)); //반올림
//		System.out.println(Math.floor(c)); //버림
//		System.out.println(Math.ceil(c)); //올림
//		
//		System.out.println(Math.sqrt(9)); //루트 9
//		System.out.println(Math.pow(2, 5)); //2의 5승
//		
		int a = 3, b = 4;
		
		double powC = Math.pow(a, 2) + Math.pow(b, 2);
		System.out.println(Math.sqrt(powC));
		
		System.out.println(Math.max(a , b)); // 큰 수
		System.out.println(Math.min(a , b)); //작은 수
	}
}
