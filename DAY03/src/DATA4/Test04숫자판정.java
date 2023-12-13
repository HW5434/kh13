package DATA4;

public class Test04숫자판정 {

	public static void main(String[] args) {
		
//		어떤 두 자리 숫자가 주어졌을 때 *문제에서 최대한 활용
//		이 숫자에 7이 포함되어 있는지 검사하여 결과 출력

//		위와 같은 상황이라면 true가 나와야 합니다.
//		참고로 자바에서 같다는 ==를 사용합니다
		
		int number = 57;
		int numTens = number / 10;
		int numUnits = number % 10;
		
		boolean order = num
		Tens ==7 || numUnits == 7;
		System.out.println(order);
		// 문제 자릿수가 바뀌었을때 변환되는
		//-논리에서는 말이 되는 것이 중요하다
		// 10의자리가 7 또는 1의자리가 7
		// 70부터 79사이 또는 1의 자리가7 &&
		// &&: 둘다 7인숫자 || 둘 중 하나가 7인숫자
		// ! 는 아니다 라는 뜻
	}

}
