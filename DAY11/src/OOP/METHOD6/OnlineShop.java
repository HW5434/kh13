package OOP.METHOD6;

public class OnlineShop {
	
	String name,part;
	int price;
	boolean delivery,event;
	
	void data(String name, String part , int price , boolean delivery , boolean event) {
		this.name = name;
		this.part = part;
		this.price = price;		
		this.delivery = delivery;
		this.event = event;
	}
	
	void information () {
		
		System.out.println("<상품 정보>");
		
		if(this.delivery/* == true*/) {
			System.out.println("이름 : " + this.name +" (" +  "가능" + ")");
		}
		else {
			System.out.println("이름 : " + this.name + " (" + "불가능" + ")");
		}			

		if(this.event/* == true*/) {
			int discount = this.price * 90/100;
			System.out.println("가격 : " + discount + " (" + "행사중"+ ")");
		}
		else {
			System.out.println("가격 : " + this.price + " (" + "해당없음"+ ")");
			
		}
		System.out.println();
	}
}
