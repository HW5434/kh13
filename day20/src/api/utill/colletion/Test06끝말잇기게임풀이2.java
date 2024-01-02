package api.utill.colletion;

import java.util.ArrayList;
import java.util.List;
import java.util.Scanner;

public class Test06끝말잇기게임풀이2 {
	public static void main(String[] args) {
		
		//저장소 구현
		List<String> history = new ArrayList<>();
		
		//제시어 추가
		history.add("자바");
		
		//사용자 입력
		Scanner sc = new Scanner(System.in);
		System.out.println("입력 : ");
		String input = sc.nextLine();
		
		//판졍 = 처음입력한단어  + 한글2~6글자 + 이어지는단어
		boolean isKoreanWord = input.matches("^[가-힣]{2,6}$"); //한글검사
		boolean isContain = history.contains(input);
		//제시어 단어 꺼내기
		String given = history.get(history.size()-1);
		boolean isConnect = given.charAt(given.length()-1) /*글자수*/ == input.charAt(0);
		boolean isPass = isKoreanWord && !isContain && isConnect;
		if(history.contains(input)) {
			System.out.println("게임오버");
		}
		
		else {
			System.out.println("제시어 변경");
		}
		
		System.out.println(history.contains(history));
	}
}

