	package IO;

	import java.util.Scanner;

	public class Test04평균계산기 {

	//	국어 점수(korean)
	//	영어 점수(english)
	//	수학 점수(math)
	
	public static void main(String[] args) {
		
		Scanner sc = new Scanner(System.in);	
		System.out.print("국어점수 : ");
		double korean = sc.nextDouble();
		System.out.print("영어점수 : ");
		double english = sc.nextDouble();
		System.out.print("수학점수 "); //println 에서 ln을 빼면 옆으로 출력됌
		double math = sc.nextDouble();
		
		double total = (korean + english + math);
		double result = total / 3;//평균은 더블쓰기 평균 : average
		
		
		System.out.println("평균점수는 " + result + "점 이고" + " 총점은 " + total + "입니다.");
	}

}
