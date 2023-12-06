package DATA;

public class Test03급여계산기 {

	public static void main(String[] args) {
//월급이 주어졌을 때 각종 세금과 수령액을 계산하는 계산기
//- 급여액 : 300만원
//- 국민연금 : 급여액 4.5%
//- 건강보험료 : 급여액의 7.09%
//- 장기요양보험료 : 건강보험료의 12.81%
//- 고용보험 : 금여액의 0.9%
//
//출력순서
//1 실수령액
//2 국민연금
//3 건강보험료
//4 장기요양보험료
//5 고용보험료
		
// int money1 = 3000000 ;
// double a = money1 * 0.045;
// double b =money1 * 0.0709;
// double c = b * 0.1281;
// double d = money1 * 0.009;
// 
// System.out.println(money1);
// System.out.println(a);
// System.out.println(b);
// System.out.println(c);
// System.out.println(d);
		
		
		double pensionRate = 4.5;
		double healthRate = 7.09;
		double careRate =  12.81;
		double emp = 0.9;
		
		int salary = 3000000;
		int nationalPension =(int) (salary * pensionRate / 100);
		int healthInsurance =(int) (salary * healthRate / 100);
		int ltCare =(int) (healthInsurance * careRate / 100);
		int employment =(int) (salary * emp / 100);
		int actualSalary =(int) (salary - (nationalPension + healthInsurance + ltCare + employment));
		
		System.out.println(nationalPension);
		System.out.println(healthInsurance);
		System.out.println(ltCare);
		System.out.println(employment);
		System.out.println(actualSalary);
		//데이터 손실 ex. 1350.13 -> 1350
		//변환 연산을 사용하여 double을 int로 바꿔서 저장
		
		
		
	}

}
