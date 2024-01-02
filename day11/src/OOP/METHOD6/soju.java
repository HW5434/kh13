package OOP.METHOD6;

public class soju {

	public static void main(String[] args) {
	
		OnlineShop a = new OnlineShop();
		OnlineShop b = new OnlineShop();
		OnlineShop c = new OnlineShop();
		OnlineShop d = new OnlineShop();
		
		a.data("참이슬후레쉬", "주류", 1200 , true , true);
		b.data("클라우드맥주" , "주류" , 3000 , false , true);
		c.data("바나나킥" , "과자" , 1500 , false , true);
		d.data("허니버터칩" , "과자" , 2000 , true , false);
		
		a.information();
		b.information();
		c.information();
		d.information();
	}
}
