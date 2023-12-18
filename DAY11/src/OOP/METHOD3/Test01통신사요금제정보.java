package OOP.METHOD3;

public class Test01통신사요금제정보 {
	public static void main(String [] arg) {
		
		// 객체 생성
		
		NewsAgency a = new NewsAgency();
		NewsAgency b = new NewsAgency();
		NewsAgency c = new NewsAgency();
		
		// 초기화
		
		a.List("SK" , "5G언택트 52" , 52000 , 200 , 1000 , 2000);
		b.List("KT" , "5G세이브" , 45000 , 100 , 900 , 1500);
		c.List("LG" , "5G시그니처" , 130000 , 500 , 2000 , 2500);
		
		// 출력
		
		a.information();
		b.information();
		c.information();
		
	}
	
}
