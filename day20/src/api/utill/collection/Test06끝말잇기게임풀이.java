package api.utill.collection;

import java.util.ArrayList;
import java.util.List;
import java.util.Scanner;

public class Test06끝말잇기게임풀이 {
	public static void main(String[] args) {
		
		//저장소 구현
		List<String> history = new ArrayList<>();
		
		//제시어 추가
		history.add("자바");
		
		//사용자 입력
		Scanner sc = new Scanner(System.in);
		System.out.println("입력 : ");
		String input = sc.nextLine();
		
		//판졍 = 처음입력한단어 + 이어지는단어 + 한글2~6글자
		if(history.contains(input)) {
			System.out.println("게임오버");
		}
		else {
			System.out.println("제시어 변경");
		}
		
		System.out.println(history.contains(history));
	}
}

