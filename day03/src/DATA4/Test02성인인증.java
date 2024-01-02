package DATA4;

import java.time.LocalDate;

public class Test02성인인증 {

	public static void main(String[] args) {
//사용자의 생년월일 8자리를 변수에 저장한 뒤 이 사람 이 
//성인인지 판전하여 출력하도록 구현하는 프로그램을 만드세요
		
//		예시 생년월일 : 20020507
		
//		성인은 한국나이로 20세 이상일 경우를 말합니다
//		(연도만으로 나이를 계산합니다)
			    
		LocalDate current = LocalDate.now();
		int year = current.getYear();
		
		int exAge = 20020507;	
		int ageYear =  exAge / 10000;
		int age = year -  ageYear + 1;
				
				System.out.println(age);		
		
		int adult = 20040101;
		int adultYear = adult / 10000;
		
		

		System.out.println(adultYear);
		
		boolean order = exAge <= adult;
		System.out.println(order);
		System.out.println("사용자의 나이는 " + age + " 이며 성인" + order + "입니다.");
		
		
	}

}
