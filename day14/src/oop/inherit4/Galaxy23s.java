package oop.inherit4;

public class Galaxy23s extends Phone {
	
	//Phone 클래스가 필요로 하는 데이터를 전달하기 위해 생성자를 구현
	// = Phone 클래스는 number를 필요로 하기 때문에 해당 생성자 구현
	public Galaxy23s(String number) {
		super(number); // 슈퍼 클래스 생성자로 전달해주세요
	}

	public void information() {
		//상위 클래스를 지칭하는 표현
//		System.out.println("이 기기의 번호는" + super.number + "입니다");
//		System.out.println("이 기기의 번호는" + super.getNumber() + "입니다");
		System.out.println("이 기기의 번호는" + this.getNumber() + "입니다");
	}
		
		//상속받은 내용 중에서 마음에 들지 않는 메소드가 있다면
		// 재정의 (override)를 통해서 내용을 변경할 수 있따
		//똑같은 형태로 메소드를 한번더 만든다
		public void internet() {
			System.out.println("인터넷 기능");
	}
}
