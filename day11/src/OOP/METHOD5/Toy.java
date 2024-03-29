package OOP.METHOD5;

public class Toy {
	//멤버 변수(필드)
	String name;
	int price;
	boolean event;
	
	//메소드 오버로딩 
	// - 같은 이름으로 여러개의 매소드를 만드는 것
	// - 뭘 좋아할지 몰라서 다 준비해봤어
	// - 매개변수가 달라서 구분이 가능한 경우만 인정한다
	
	void data(String name , int price) {
		this.name = name;
		this.price = price;
		this.event = false; // 안쓰는게 제일 좋음
	}
	void data(String name , int price , boolean event) {
		this.name = name;
		this.price = price;
		this.event = event;
		
	}
	//오버로딩이 필요하지 않은 메소드도 있다
	void information () {
		System.out.println("<장난감 정보>");
		System.out.println("이름 : " + this.name);
		System.out.println("가격 : " + this.price + "원");
		System.out.println("행사 : " + this.event);
		
	}
}
