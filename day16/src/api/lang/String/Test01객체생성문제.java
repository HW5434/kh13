package api.lang.String;

public class Test01객체생성문제 {

	public static void main(String[] args) {
		//문자열 합쳐주는 능력
		StringBuffer a = new StringBuffer();
		StringBuffer b = new StringBuffer("hello");
		//오브젝트랑 다르게 나오는 이유는 그건 오브젝트니까 Stringbuffer가 아니잖아
		
		System.out.println("a = " + a.toString());//생략해도 출력시 동일한 효과
		System.out.println("b = " + b.toString());
//		System.out.println("a = " + a);//생략해도 출력시 동일한 효과
//		System.out.println("b = " + b);
		
		//글자 수 출력
		System.out.println("a의 글자수 = " + b.length());
		System.out.println("b의 글자수 = " + b.length());
		
		a.append("java");//스트링
		b.append("java");//스트링
		
		System.out.println("a = " + a.toString() + "," + a.length());
		
	}
}
