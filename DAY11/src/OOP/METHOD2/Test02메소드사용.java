package OOP.METHOD2;

public class Test02메소드사용 {

	public static void main(String[] args) {
		//멤버 변수(필드) - 이 객체가 가져야 하는 데이터를 정의
		//멤버 메소드 - 이 객체가 가지면 좋은 코드를 정의
		
		//객체 생성
		
		OrympicMedal a = new OrympicMedal();
		OrympicMedal b = new OrympicMedal();
		OrympicMedal c = new OrympicMedal();
		
		//초기화
		
		a.player("진종오","사격","하계",4,2,0);
		b.player("김수녕","양궁","하계",4,1,1);
		c.player("전이경","쇼트트랙","동계",4,0,1);
		
		//출력
		
		a.information();
		b.information();
		c.information();
		
		
	}

}
