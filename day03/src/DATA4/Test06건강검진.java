package DATA4;

import java.time.LocalDate;

public class Test06건강검진 {

	public static void main(String[] args) {
		
		/*건강검진은 30세 이상인 사람들을 대상으로 2년에 한 번씩 진행합니다.

		올해가 짝수 해라면 짝수년도 출생자들이 대상
		올해가 홀수 해라면 홀수년도 출생자들이 대상

		어떤 사람의 출생년도(ex : 1985)를 입력값으로 두고 이 사람이 올해 건강검진 대상자인지 판정하여 출력*/
		//올해 , 짝수 홀수인지 알아보기 결과 1 그럼 출생년도는?
        //나이 38살 30이상이면 건강검진을 받아야함 대상자가 맞아
		
		
		
		int personYear = 1985; 					//출생일
		
		LocalDate current = LocalDate.now();
		int year = current.getYear(); 
		
		int yearOe = year % 2; 						//오늘 날짜 홀수해		
		int pyResult = personYear % 2; 		//홀수확인 1이면 홀 0이면 짝
		
		int age = year - personYear + 1; 			//boolean finalResult = result ==0 && 30 <= age;
		boolean finalResult = yearOe == pyResult && 30 <= age;
		
		//정리 : 년도 먼저 구하고 올해 홀짝 , 어떤사람 출생일 홀짝 
		// 나이 구하기 한국나이 = +1 해줘야함
		
		
		System.out.println("건강검진 대상자 입니까? : " + finalResult);
		
		
		//		int birth = 1985;
		//		int current = 2023;
		 
		// 선생님 풀이 
		//	1 30세 이상인가?
		//	2. 올해가 짝수이고 출생년도도 짝수인가?
		//	3. 올해가 홀수이고 출생년도도 홀수인가?
		// 4. 1,2 을 만족하거나 1,3 을 만족하면 건강검진 대상자
		
		/* int age = current - birth + 1;
		    
		boolean first = age >= 30;
		boolean second = current % 2 == 0 && birth % 2 == 0;
		boolean third = current % 2 !=0 && birth % 2 !=0;
		
		boolean result = (first && second) || (first && third);
		
		
		
		
		
		
		
		*/
	}

}
