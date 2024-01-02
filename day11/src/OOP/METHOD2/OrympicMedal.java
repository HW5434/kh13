package OOP.METHOD2;

public class OrympicMedal {

	String name,list,season;

	int gold ,silver , bronze;


	
	void information() {
		
		System.out.println("이름 : " + this.name);
		System.out.println("종목 : " + this.list );
		System.out.println("구분 : " + this.season);
		System.out.println("금메달 : " + this.gold + "  은메달 :  "+ this.silver + "  동메달 : " + this.bronze);
		System.out.println();
	}
	
	void player(String name , String list , String season , int gold , int silver , int bronze) {
		
		this.name = name;
		this.list = list;
		this.season = season;
		this.gold = gold;
		this.silver = silver;
		this.bronze = bronze;
	}	
}
