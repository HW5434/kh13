package OOP.METHOD4;

public class Test01커피숍메뉴 {
	public static void main(String [] arg) {
		
		//객체 생성
		
		CoffeeshopMenu a = new CoffeeshopMenu();
		CoffeeshopMenu b = new CoffeeshopMenu();
		CoffeeshopMenu c = new CoffeeshopMenu();
		CoffeeshopMenu d = new CoffeeshopMenu();
		
		//초기화
		
		a.List("아메리카노", "음료", 2500, "행사중");
		b.List("모카라떼", "음료", 3500, "");
		c.List("치즈케이크", "디저트", 5000, "행사중");
		d.List("마카롱", "디저트", 3000,"");
			
		//출력
		
		a.information();
		b.information();
		c.information();
		d.information();
		
	}	
}