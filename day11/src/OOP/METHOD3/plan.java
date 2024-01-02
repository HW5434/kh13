package OOP.METHOD3;

public class plan {
	//멤버 변수 (필드)
	//멤버 메소드
	
	String Na , name;
	int pay ,data , call , mg;
	
	void information() {
		
		System.out.println("통신사 : " + this.Na);
		System.out.println("상품명 : " + this.name);
		System.out.println("월정액 : " + this.pay + "원" + "  데이터(GB) : " + this.data + "  통화(분) : " + this.call + "  문자(건) : " + this.mg);
		System.out.println();
		
	}
	
	void List (String Na , String name , int pay , int data , int call , int mg) {
		
		this.Na = Na;
		this.name = name;
		this.pay = pay;
		this.data = data;
		this.call = call;
		this.mg = mg;
		
	}
	
}
