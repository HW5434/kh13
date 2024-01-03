package api.utill.collection2;

import java.util.HashSet;
import java.util.Scanner;
import java.util.Set;

public class Test03팔로우 {
	public static void main(String[] args) {
	
		//저장공간
		Set<String> history = new HashSet<String>(); 
		Set<String> main = new HashSet<String>();
		
		Scanner sc = new Scanner(System.in);
		
		main.add("팔로우 설정");
		
		//반복
		while(true){
		//입력
		String ment = sc.nextLine();
			//조건
		if(ment.equals("팔로우 설정")) {//문제 팔로우
			System.out.println(main.size());
		}
			if(history.contains(ment)) {
				System.out.println("팔로우 삭제 완료");
				//remove
			}
			else {
				System.out.println("팔로우 설정 완료");
				history.add(ment); //여기에 하나만 뺴면돼 팔로우 설정만
			}
		}
	}
}
