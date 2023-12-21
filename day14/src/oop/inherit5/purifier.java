package oop.inherit5;
//정수기 
public class purifier {

	private String company; // 
	private int price;
	//setter getter
	
	public String getCompany() {
		return company;
	}
	public void setCompany(String company) {
		this.company = company;
	}
	public int getPrice() {
		return price;
	}
	public void setPrice(int price) {
		if(price < 0) return; // 0이상이야 적용시켜
		this.price = price;
	}
	//생성자
	// 참고로 protected의 우리는 패키지 + 상속그룹이 포함
	protected purifier(String compay , int price) { // 우리만 접근 가능해 퍼블릭으로 써도 상관없어
		this.setCompany(compay);
		this.setPrice(price);
	}
	//메소드
	public void normal() {// 바꾸고 싶으면 바꿔 바꾸고 싶지 않으면 파이널 붙이고
		System.out.println("정수 1잔 추출");
	}
}
