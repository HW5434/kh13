package api.utill.colletion;

import java.util.ArrayList;
import java.util.List;
import java.util.Scanner;

public class Test05편의점게임풀이2 {
	public static void main(String[] args) {
	//[3] 처음에 메모리가 비어있는 상태에서 시작하며, 겹치지 않을 경우 추가 
		
		//- 저장소 준비
		List<String> memory = new ArrayList<>();
		
		Scanner sc = new Scanner(System.in);
		
		while(true) {
			//- 사용자 입력
			System.out.print("입력 : ");
			String input = sc.nextLine();
			
			//- 저장소 검사
			if(memory.contains(input)) {//입력한 적 있는 값이면
				System.out.println("게임 오버");
				break;
			}
			else {//입력한 적 없는 값이면
				//System.out.println("계속 진행");
				memory.add(input);//단어 등록
			}
		}
		
		
	}
}

