package api.utill.collection2;

import java.util.HashSet;
import java.util.Scanner;
import java.util.Set;

public class Test02조회수중복방지풀이 {
	public static void main(String[] args) {
	
		Set<String> history = new HashSet<>();
		Scanner sc = new Scanner(System.in);
		
		
		while(true){
			String ment = sc.nextLine();
			if(ment.equals("종료")) {
				System.out.println("프로그램 종료");
				break;
			}
			
			if(history.contains(ment)) {
				System.out.println("이미 시청한 영상이므로 조회수 증가 없이 영상을 재생합니다");
			}
			else {
				System.out.println("시청 기록이 없어 조회수 증가 후 영상을 재생합니다");
				history.add(ment);
			}
		}
		System.out.println("총 조회수" + history.size());
	}
}
