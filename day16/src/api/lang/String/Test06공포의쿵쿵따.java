package api.lang.String;

import java.util.Scanner;

public class Test06공포의쿵쿵따 {

	public static void main(String[] args) {

		Scanner sc = new Scanner(System.in);
		//(Q) 제시어가 변수로 있어도 검사가 되나?
		
		String given = "바나나";
		String input = "나트륨";
//		char last = given.charAt(2);
		char last = given.charAt(given.length()-1); //마지막 글자
		char first = input.charAt(0);
		System.out.println(first == last); //원시형이라서 비교연산으로 비교
		
		
			
//		boolean Text = questions.charAt(3).contentEquals(answers.charAt(1));
		
		//추출한 글자끼리 비교할수 있는 명령

		
//		if(answers.length() == 3) { // 글자가 3개일때
//			System.out.println("정답");
//			
//		}
//		else {
//			System.out.println("오답");
//		}
		//1. 바나나가 아닌 글자가 3개이며 상대방이 말한 단어의 마지막 글자 이 조건이 아니면 떙
		
		//2. 바나나 라고 했을때 대답이 바나나의 3번째 글짜와 같으면 되는조건
		//검사
	

		
			
		}
	
}

