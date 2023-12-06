package DATA;

public class Test10실수 {
	public static void main(String[] args) {
		//실수 
		//-소수점이 있는 숫자
		//-손해가 좀 발생하더라도 경량 형태(부동소수점 방식)으로 저장하도록 구성
		//- float, double이 있으면 double이 기본 형태
		
		double a = 123.45671231231231231312312;
		System.out.println(a);
		
		float b = 123.45671231232321312312312312F;
		System.out.println(b);
		
		// 1+1.0 = 2.0 . 10/3 = 3, 10/3.0 = 3.33333
		//-실수가 하나라도 포함된 계산은 결과가 실수
		int s1 = 50;
		int s2 = 55;
		int s3 = (s1 + s2) / 2;
		System.out.println(s3);
		double s4 = (s1 + s2) / 2.0; //실수가 무조건 있어야함 왼쪽이던 오른쪽이던
		System.out.println(s4);
	}

}
