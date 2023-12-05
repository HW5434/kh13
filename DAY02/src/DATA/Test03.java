package DATA;

public class Test03 {

	public static void main(String[] args) {
		//가격
		int 성인 = 12000;
		int 학생 = 8500;
		//인원
		int 성인인원 = 2;
		int 학생인원 = 2;
		//계산
	    int 성인Total = (성인 * 성인인원);
		int 청소년Total = (학생 * 학생인원);
		int 총인원요금 = (성인Total + 청소년Total);
		//출력
		System.out.println(성인Total);
		System.out.println(청소년Total);
		System.out.println(총인원요금);
	}

}
