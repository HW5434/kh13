package api.utill.colletion;

import java.util.ArrayList;
import java.util.List;
import java.util.Scanner;

public class Test05편의점게임 {
	public static void main(String[] args) {
		//[1] 사용자가 입력한 항목이 List에 포함되어 있는지 확인
		
		// - 저장소 준비
		List<String> memory = new ArrayList<>();
		
		memory.add("핫도그");
		memory.add("피자");
		memory.add("삼각김밥");
		
		// - 사용자 입력
		Scanner sc = new Scanner(System.in);
		System.out.println("입력 : ");
		String input = sc.next();
		//sc.close 없어도 무관 습관이 되있으면 굿
		
		// 출력
		if(memory.contains(input)) { //입력한 적 있는 값이면
			System.out.println("게임 오버");
		}
		else { // 입력한 적 없는 값이면
			System.out.println("계속 진행");
		}
	}
}

