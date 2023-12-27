package api.lang.string2;

public class Test01전화번호검사 {
	public static void main(String[] args) {
		//사용자가 입력한 전화번호가 올바른 [휴대전화!!] 전화번호인지 검사하여 출력
		String nuber = "010-1234-5678";
		String nuber2 = "010-0234-5678";
		
		//String regex = "^01[016789]-[123456789][0123456789][0123456789][0123456789]-[0123456789][0123456789][0123456789][0123456789]$";
//		String regex = "^01[016-9]-[1-9][0-9][0-9][0-9]-[0-9][0-9][0-9][0-9]$";
		String regex = "^01[016-9]-[1-9][0-9]{2,3}-[0-9]{4}$";
		
//		String regex = "";
		//빼기가 싫으면 식에서 지우면 돼
		
		System.out.println(nuber.matches(regex)); //말이 되야 코드를 짤수있다
		System.out.println(nuber2.matches(regex)); //말이 되야 코드를 짤수있다
	}
}
