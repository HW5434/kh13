package oop.keyword4;

public class Test01정적메소드_함수 {
	public static void main(String [] arg) {
		//객체 x 결과없음 (매개변수)
		//static 항목들은 클래스 이름과 합쳐서 바로 사용이 가능
		System.out.println("제곱 : " + Robot.square(5));
		System.out.println("삼각형 넓이 : " + Robot.triangle(5,7));
		System.out.println("원 넓이 : " + Robot.circle(5));
		System.out.println("1999년생 지하철 요금 = " + Robot.subway(1999));
		System.out.println("윤년 = " + Robot.leap(2000));
		System.out.println("BMI = " + Robot.bmi(180,80));
	}
}
