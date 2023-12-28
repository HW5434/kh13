package api.lang.exception;

public class Test07만나이계산기풀이 {

	public static void main(String[] args) {
		String input = "1999-06";
		String today = "2023-12";
		
		//년 월 추출
		String[] todayparts = today.split("-");
		String[] inputparts = input.split("-");
		
		//인트로 변환
				
		int todayYear = Integer.parseInt(todayparts[0]);
		int inputYear = Integer.parseInt(inputparts[0]);
		
		int todaymonth = Integer.parseInt(todayparts[1]);
		int inputmonth = Integer.parseInt(todayparts[1]);
		

//		int age = 
				
		System.out.println(todayYear - inputYear);		

	}

}
