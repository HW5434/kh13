package DATA;

public class Test09만나이 {

	public static void main(String[] args) {
   /*오늘은 2023년 12월 6일입니다 2000년 1월 1일 생의 만나이를 구하여 출력하세요 
    * 단, 생년월일은 '20231206' 처럼 8자리의 숫자형태로 제공됩니다 
		단, 일은 고려하지 않고 월까지만 고려합니다.*/
		
		//20231206 = 2023년 12월
		//현제 날짜
		//20000101 = 2000년 1월 = 23*12 + 11 = 287개월
		//태어난 날짜
		// ... 현제날짜 계월수 - 태어난 날짜 계월수
		
		
//		int current = 20231206;
//		int birth = 20000101;
//		
//		int year1 = current / 10000;	
//		int year1month = ((year1 % 100) * 12);
//		int month1 = ((current % 10000) / 100);
//		int agemonth1 = year1month + month1;
//		
//		//계산
//		System.out.println(agemonth1);
//		
//		int year2 = birth / 10000;
//		int year2month = ((year2 % 100) * 12);
//		int month2 = ((birth % 10000) / 100);
//		int agemonth2 = year2month + month2;
//		
//		//계산 
//		System.out.println(agemonth2);
//		
//		int ageCal = agemonth1 - agemonth2;
//		int age = ageCal / 12;
//		int age2 = ageCal % 12;		
//		System.out.println(age);
//		System.out.println(age2);
		
		   /*오늘은 2023년 12월 6일입니다 2000년 1월 1일 생의 만나이를 구하여 출력하세요 
		    * 단, 생년월일은 '20231206' 처럼 8자리의 숫자형태로 제공됩니다 
				단, 일은 고려하지 않고 월까지만 고려합니다.*/

		int cu = 20231206;
		int bi = 20010628;
		
		int years3 = cu / 10000;
		int month3 = ((cu % 10000) / 100);
		int yearsMonth3 = years3 *12;
		int ageMonth3 = yearsMonth3 + month3;
		
		int years4 = bi / 10000;
		int month4 = ((bi % 10000) / 100);
		int yearsMonth4 = years4 *12;
		int ageMonth4 = yearsMonth4 + month4;
		
		int agecal = ageMonth3 - ageMonth4;
		int age = agecal / 12;
		
		System.out.println(age);

	    
				
	}

}
