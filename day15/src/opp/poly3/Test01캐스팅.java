package opp.poly3;

public class Test01캐스팅 {
	public static void main(String [] args) {
		//Kin의 객체를 만들어 업/다운 캐스팅 구현

		//집
		Kim k1 = new Kim();
		k1.game();
		k1.movie();
		k1.music();
		
		//출근 
		Student s = k1; // 업케스팅 (Kim Student로 업케스팅)
		s.learn(); //안보이는 기능
	
		//퇴근
		Kim k2 = (Kim)s; //다운캐스팅 (int double) 과 흡사함 
		k2.game();
		k2.movie();
		k2.music();
	}
}
