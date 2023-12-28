package api.lang.etc;

public class Test04Wrapper {
	public static void main(String[] args) {
		//Wrapper 클래스
		// - 자바에 존재하는 8개의 원시형 데이터를 클래스로 만들어 놓은것
		// - boolean , byte , short , char , int , long , float , double
		// - Boolean , Byte , Short , Character , Integer , Long , Float , Double
		
		Integer a = new Integer(10); //비추천(Java 9+)
		Integer b = new Integer("10"); //비추천(Java 9+)
		
		System.out.println("a = " + a);
		System.out.println("a = " + b);
		
		//덧셈
		Integer c = Integer.sum(a, b);
		
		int v1 = 10, v2 = 10;
		int v3 = v1 + v2;
		
		//진법변환
		
		int n = 100;
		StringBuffer buffer = new StringBuffer(); //문자열 붙일때
		for(int i = n; i > 0; i /= 2) {
//			System.out.println(i % 2);
			buffer.insert(0, i%2); //i를 2로나눈 나머지를 제일 앞(0)에 넣어라
		}
		System.out.println(buffer.toString());
		
		System.out.println(Integer.toBinaryString(n));
	}
}
