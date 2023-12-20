package oop.keyword4;

public class Robot {
	
	//1
	private int number;
	
	//2
	private int width;
	private int height;
	
	//3
	private int radius;
	//4
	private int age;
	
	
	//1 public(공개) static 반환형 이름(매개변수)
	public static double square(double number) {
		return number * number;
	}
	//2
		public static double triangle(double width , double height) {
			return width * height / 2;
		}
	//3
		public static double circle(double radius) {
	//	return (radius * radius) * 3.14;
			return square(radius) * 3.14;
		}
	//4 public static 요금 subway 출생년도 4자리
		public static int subway(int birth) {
			int age = 2023 - birth + 1;
			if(age < 8 || age >= 65) {
				return 0;
			}
			else if (age >= 20) {
				return 1400;
			}
			else if (age >= 14) {
				return 800;
			}
			else {
				return 500;
			}
		}
		//5 연도를 알려주면 윤년인지 판정하는 메소드 구현(leap)
		public static boolean leap(int year) {
			boolean judge = year % 400 == 0 ||(year % 4 == 0 && year % 100 != 0 );
			return judge;
		}
		//6 bmi
		//public static BMI 수치
		public static double bmi(double height , double weight) {
				double m = height / 100;
				return weight / (m*m);
			
			
			
			
			
		}		
}
		
	

