package api.lang.string;

import java.util.Scanner;

public class Test07욕설필터링 {

//		1번
	//사용자가 띄어쓰기가 있는 문자열 입력
	public static void main(String[] args) {
		
		Scanner sc = new Scanner(System.in);
		
		//난이도 조절
		String[] words = new String[] {
				"수박", "조카", "시베리아", "개나리", "신발끈", 
				"지옥", "주옥", "십장생", "십자수", "게불"
		};
		
		String input = "이런 수박씨 신발끈같은 개나리 십장생 십자수를 보았나";
		
		
//		String filter = words[7];
//		System.out.println(input.replace(filter,  "**"));  //인풋을 리페이스 해라 인풋은 그대로 있고 새로운 명령
//		filter = words[3];
//		System.out.println(input.replace(filter,  "**"));

		//좋은 코드
		input = input.replace(words[3],  "**"); //바꾼 결과를 원본에 덮어쓰기
		input = input.replace(words[7],  "**"); //바꾼 결과를 원본에 덮어쓰기

	}
}
