package api.lang.string;

public class Test06문자열편집 {
	public static void main(String[] args) {
		//문자열은 불변(immutable)이다.
		// - 편집 명령을 쓰면 무조건 신규 문자열이 나온다
		
		String word = "Hello Java";
		String upper  = word.toUpperCase();
		String lower  = word.toLowerCase();
//		System.out.println("대문자 = " + upper);
//		
//		System.out.println("소문자 = " + word.toLowerCase());
//		System.out.println("소문자 = " + lower);
		
		//자르기 = substring()
		System.out.println("자르기 = " + word.substring(0,4));
		System.out.println("자르기 = " + word.substring(6)); //끝까지
		
		//불필요한 공백제거
		String url = "                             www.naver.com                          ";
		System.out.println("여백제거 = " + url.trim()); //아스키코드만(구식명령)
		System.out.println("여백제거 = " + url.strip()); //유니코드도(최신명령) [ㄱ의 한자1번]
		
		//문자열 치환(찾아 바꾸기) - replace
		String text = "나는, 피자가, 좋아요";
		System.out.println("치환 = " + text.replace("피자" , "자바"));
		
		//문자열 분리 - split()
		String[] parts = text.split(" "); // 띄어쓰기로 짤라라
		System.out.println(parts);
		for(int i = 0; i < parts.length; i++) { //배열인거 주의 length에 괄호 글자수가 달라져도 상관없게
			System.out.println("분리 = " + parts[i]);
		}
		
	}
}
