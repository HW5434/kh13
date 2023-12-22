package opp.multie2;

public class Drone implements Electronic , Transportation , Flyable{

	@Override
	public void Fly() {
		System.out.println("드론이 비행합니다.");
	}

	@Override
	public void move() {
		// TODO Auto-generated method stub
		
	}

	@Override
	public void on() {
		// TODO Auto-generated method stub
		
	}

	@Override
	public void off() {
		// TODO Auto-generated method stub
		
	}

}
