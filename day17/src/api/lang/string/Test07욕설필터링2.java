package api.lang.string;

import java.util.Scanner;

public class Test07욕설필터링2 {

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
		for(int i = 0; i < words.length; i++) {
			input = input.replace(words[i], "**");
		}
//		input = input.replace(words[0],  "**"); 
//		input = input.replace(words[1],  "**"); 
//		input = input.replace(words[2],  "**"); 
//		input = input.replace(words[3],  "**"); 
//		input = input.replace(words[4],  "**"); 
//		input = input.replace(words[5],  "**"); 
//		input = input.replace(words[6],  "**"); 
//		input = input.replace(words[7],  "**"); 
//		input = input.replace(words[8],  "**"); 
//		input = input.replace(words[9],  "**"); 

		System.out.println(input);
	}
}
