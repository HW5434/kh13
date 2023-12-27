package api.lang.string2;

import java.util.Scanner;

public class Test03아이디검사 {

	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
//		요구사항
//		맨 앞자리는 영문 소문자 또는 숫자로 작성
//		전체 글자수는 5~20자로 설정
//		나머지 자리는 영문 소문자,숫자,대시,언더바로 구성
		
//		앞자리	^(a-z|A-Z){1}$
//		나머지	^(a-z|1-9|-|_){4,19}$ 
//		전체글자수	
//    앞자리 - 나머지
		
		String id = sc.next();
		
//		String first = "^(a-z|A-Z){1} = 1은 기본값$";
//		String Last = "^(a-z|1-9|-|_){4,19}$";
		String regex = "^[a-z0-9][_\\-a-z0-9]{4,19}$";
		
		if(id.matches(regex)) {
			System.out.println("멋진아이디 입니다!");
		}
		if(id.matches(regex)) {
			System.out.println("5~20자의 영문 소문자, 숫자와 특수기호(_),(-)만 사용이 가능합니다");
		}
	}

}
