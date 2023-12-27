package api.lang.string2;

public class Test07이메일검사 {

	public static void main(String[] args) {
		//PNG 올리기
		
		//반드시 '@' 한개
		// @ 앞부분과 뒷부분에 글자가 있어야 한다
		// @ 앞부분은 아이디와 동일한 형식으로 네이버 아이디 검사코드 참조
		// "5~20자의 영문 소문자, 숫자와 특수기호(_),(-)만 사용이 가능합니다"
		
		// @ 뒷부분은 기관 주소가 들어온다
		// 기관 명칭이 우선나오고 확장자가 등장한다 ex 삼성이면 ooooo@samsung.com
		// 기관 명칭은 소문자 3글자 ~ 20글자 사이로 설정가능
		// 확장자는 다음 중 하나만 가능
		// co.kr		.com		.net		.org		.dev
		//
		
		String id = "qwer1234";
				
		String regex = "^[a-z0-9][_\\-a-z0-9]{4,19}$";
		if(id.matches(regex)) {
			System.out.println("기관 명칭을 입력해주세요");
		}
		else {
			System.out.println("처음으로 돌아갑니다.");
		}
		
		String midle = "samsung";
		
		String regex2 = "^[a-z]{3,20}$";
		if(midle.matches(regex2)) {
			System.out.println("당신의 이메일은"+ regex + "@" + midle);
		}
	}
}
