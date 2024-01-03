package api.utill.collection2;

import java.util.HashSet;
import java.util.Scanner;
import java.util.Set;

public class Test02조회수중복방지2종료만들기 {
	public static void main(String[] args) {
	
		Set<String> view = new HashSet<>();
		Scanner sc = new Scanner(System.in);
		//처음 입력
		
		while(true){
			String ment = sc.next();
			if(ment.equals("종료")) {
				System.out.println("프로그램을 종료합니다.");
				break;
				}
			if(view.contains(ment)) {
				System.out.println("중복");
				}
			else {
				System.out.println("정답");
				view.add(ment); //view에 ment를 넣겠습니다
				}
			}
		System.out.println("총" + view.size() + "개"); //break가 없으면 오류남
	}
}
