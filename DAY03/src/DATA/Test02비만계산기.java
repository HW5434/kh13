package DATA;

public class Test02비만계산기 {

	public static void main(String[] args) {
//BMI(체질량지수) 계산공식  체중 / 키
//180cm 몸무게가 80kg인 사람의 BMI 지수를 구하여 출력하세요

		double tall = 180;
		double weight = 80;
		double tallToMeter = tall/100;
		double bmi = weight / (tallToMeter * tallToMeter);
		System.out.println(bmi);
	}

}
