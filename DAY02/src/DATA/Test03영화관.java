package DATA;

public class Test03영화관 {

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

		
		//[필기] 입력 , 계산 , 출력 
		
	    //입력 : 문제에서 주어진 값들을 변수에 저장
		//         [테스트 할때 주어짐] 대문자 알파벳은 다른 어절을 표현
		//         [ex] adult , teen , student

		//계산 : [ex] adultPrice , adultCount

		//출력: 문제에서 요구하는 값을 화면에 출력
		
		//말 그대로 변하는 수는 변수
		//숫자인데 변하지 않는 수는 상수
		
	}

}
