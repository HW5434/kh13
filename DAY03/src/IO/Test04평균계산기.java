	package IO;

	import java.util.Scanner;

	public class Test04평균계산기 {

	//	국어 점수(korean)
	//	영어 점수(english)
	//	수학 점수(math)
	
	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		
		int korean = sc.nextInt();
		int english = sc.nextInt();
		int math = sc.nextInt();
		
		int total = (korean + english + math);
		int result = total / 3;
		
		System.out.println("평균점수는 " + result + "점 이고" + " 총점은 " + total + "입니다.");
	}

}
