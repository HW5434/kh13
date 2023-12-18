package OOP.METHOD4;

public class CoffeeshopMenu {

	String menu,division,sale;
	int pay;

	// 행사여부에 따른 가격변동 출력
	//if 를 어디다 써야할지 리스트? 세일 중이면 
	
	void information() {
		
		System.out.println("이름 : " + this.menu + "*행사여부* : " + this.sale);
		System.out.println( "분류 : " + this.division);
		System.out.println("가격 : " + this.pay + "원");
			
		}
	
	void List (String menu , String division ,int pay , String sale) {
		
		this.menu = menu;
		this.division = division;
		this.pay = pay - ((pay/100)*30);	
		if(sale != "행사중") {
		this.pay = pay;
		}
		this.sale = sale;
	}
}

