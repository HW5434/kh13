package api.lang.String;

public class Test04문자열검사 {
	public static void main(String[] args) {
		
		String url = "http://www.naver.com";
		
		//홈페이지 주소인가? (http로 시작하는가) htts 보안이 강화된 홈페이지
		//true or false 반환형이 뭔지파악
		System.out.println("http로 시작? " + url.startsWith("http"));
		System.out.println("http로 시작? " + url.startsWith("https"));
		
		//.com으로 끝나는가? co.kr 한국 국가 도메인 .com 회사 .org 조직 .net 네트워크 기업(제한x) go.kr 정부 ac.kr 한국 교육기관
		//회사의 주소인가?
		//.dev 개발자 사이트
		//.xyz 국가 상관없음
		// youtu.be? [be] 벨기에 국가 도메인
		System.out.println(".com으로 종료 ? " + url.endsWith(".com"));
		
		//네이버 주소 naver가 들어있는가? 
		System.out.println(".com으로 종료 ? " + url.contains("naver"));
		
		//네이버가 어디있어요? 커서위치 
		System.out.println("naver으로 종료 ? " + url.indexOf("naver"));
		System.out.println("kakao으로 종료 ? " + url.indexOf("kakao")); //-1은 위치가 없다 (부정적인 의미)
		
		//글자수
		System.out.println("글자수 = " + url.length());
		
		//특정위치의 글자를 추출하면?
		char ch = url.charAt(11);
		System.out.print("+11 위치의 글자 = " + url.charAt(11));
	}
}
