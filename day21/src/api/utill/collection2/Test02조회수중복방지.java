package api.utill.collection2;

import java.util.HashSet;
import java.util.Scanner;
import java.util.Set;

public class Test02조회수중복방지 {
	public static void main(String[] args) {
	
		Set<String> view = new HashSet<>();
		Scanner sc = new Scanner(System.in);
		//처음 입력
		
		while(true){
			String ment = sc.next();
			if(view.contains(ment)) {
				System.out.println("중복");
				break;
				}
			
			else {
				System.out.println("정답");
				view.add(ment); //view에 ment를 넣겠습니다
				}
		}
		
		
		
		
		
		//이걸 반복하면 돼
		
//		System.out.println("총" + ???.size + "개의 영상을 재생하셨습니다");
	}
}
