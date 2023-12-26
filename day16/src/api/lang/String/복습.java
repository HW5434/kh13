package api.lang.String;

public class 복습 {
	//해야할것 검색하는 능력
	//문제에서 문서라는것은 오라클 사이트를 말함
	public static void main(String[] args) {
		
//		a라는 이름으로 비어 있는 객체 생성
//		b라는 이름으로 hello라는 글자를 저장한 객체 생성
		
		StringBuffer a = new StringBuffer();
		StringBuffer b = new StringBuffer("hello");
		
//		a와 b의 요약 정보를 출력
		
		System.out.println("a = " + a.toString());
		System.out.println("b = " + b.toString());
		
//		a와 b의 보관중인 글자수를 각각 출력
		
		System.out.println(a.length());
		System.out.println(b.length());
		
//		a와 b에 각각 java라는 글자를 추가
		
	}
}
