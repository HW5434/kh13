package api.lang.string;

import java.util.Scanner;

public class Test07욕설필터링5 {

//		1번
	//사용자가 띄어쓰기가 있는 문자열 입력
	public static void main(String[] args) {
		
		Scanner sc = new Scanner(System.in);
		
		//난이도 조절 모든 단어를 마스킹 처리 해보자
		String[] words = new String[] {
				"수박", "조카", "시베리아", "개나리", "신발끈", 
				"지옥", "주옥", "십장생", "십자수", "게불"
		};
		
		String input = "이런 수박씨 신발끈같은 개나리 십장생 십자수를 보았나";
		
		
//		int total = 0;
//		for(int k = 1;k <= 10; k++) {
//			total += 1;
//		};
		
		
		String star = "";
		for(int k = 1;k <= 10; k++) {
			star += "*";
		};
		
		
		//좋은 코드
		for(int i = 0; i < words.length; i++) {
//			input = input.replace(words[i], star.repeat(2)); //i의 글자수에 따라
			int size = words[i].length(); //글자수 확인
//			input = input.replace(words[i],star[size]); // (java 11+) 다른버젼에서 쓸수 없음
		}

		System.out.println(input);
		
	}
}
