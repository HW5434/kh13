package api.utill.collection2;

import java.util.HashSet;
import java.util.Scanner;
import java.util.Set;

public class Test03팔로우풀이 {
	public static void main(String[] args) {
	
		//저장공간
		Set<String> history = new HashSet<String>();  // 팔로우 목록 출력이 필요
		
		Scanner sc = new Scanner(System.in);
		
		//반복
		while(true){
		//입력
			System.out.println("사용자ID : ");
			String ment = sc.nextLine();
			//조건
			if(ment.equals("종료")) {//문제 팔로우
				break;
		}
			if(history.contains(ment)) {
				System.out.println("팔로우 해제 완료");
				history.remove(ment);
			}
			else {
				System.out.println("팔로우 완료");
				history.add(ment); //여기에 하나만 뺴면돼 팔로우 설정만
			}
		}
		System.out.println("팔로우 목록 : " + history);
	}
}
