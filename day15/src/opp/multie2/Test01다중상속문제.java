package opp.multie2;

public class Test01다중상속문제 {

	public static void main(String[] args) {
		//생성 가능한 모든 객체의 기능 테스트
		//오늘 배운것 까지 합치면 랜덤으로 비행물체 1개를 만들어서 날려보세요
		// 비행 물체 : Drone Airplane
		Drone a = new Drone();
		
		int choice = 1;
		
		Flyable f; //상속이 되어있는것만 가능
		if(choice == 1) {
			f = new Drone();
		}
		else {
			f = new Airplane();
		}
		f.Fly();
	}

}
