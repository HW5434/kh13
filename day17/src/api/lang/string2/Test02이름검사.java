package api.lang.string2;

public class Test02이름검사 {

	public static void main(String[] args) {
		
		//regex는 regular expression(정규 표현식)의 줄임 표현이다
		
//		String  first = "힣";//이름 입력
//		String firstName = "^[가-힣]{1,2}$";
//		
//		String last = "푸른달빛하";//이름 입력
//		String lastName = "^[가-힣]{1,5}$";
		
		String name = "피카츄";
		String regex = "^[가-힣]{1,2[가-힣]{1,2}}$";
		
		//참고 : 낱자까지 모두 검사하고 싶다면 ^{ㄱ-ㅎㅏ-ㅣ가-힣]{2,7}$
		
		if(name.matches(regex)) {
			System.out.println("좋은 이름이네요!");
		}
		else {
			System.out.println("올바른 한국 이름이 아닙니다.");
		}

	}

}
