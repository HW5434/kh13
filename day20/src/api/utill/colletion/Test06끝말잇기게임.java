package api.utill.colletion;

import java.util.ArrayList;
import java.util.List;
import java.util.Scanner;

public class Test06끝말잇기게임 {
	public static void main(String[] args) {
		
		// - 첫 번째 제시어
		System.out.println("자바");
		List<String> a = new ArrayList<>();
		Scanner sc = new Scanner(System.in);
		
		while(true) {
			System.out.println("입력 : ");

			//정규 표현식
			
			String user = sc.next();
			
			if(a.contains(user)) {//검사하자
				// user의 첫번째 글자가 마지막 글
				
				System.out.println("게임 오버");
				break;
			}
			
			else {
				System.out.println("계속 진행");
				a.add(user);
			}
		}
	}

	private static String next(int size) {
		// TODO Auto-generated method stub
		return null;
	}
}

