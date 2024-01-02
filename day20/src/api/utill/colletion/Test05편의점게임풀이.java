package api.utill.colletion;

import java.util.ArrayList;
import java.util.List;
import java.util.Scanner;

public class Test05편의점게임풀이 {
	public static void main(String[] args) {
		//if ex a 를 핫도그 
		List<String> a = new ArrayList<>(); //리스트
		Scanner sc = new Scanner(System.in);
		
		while(true) {
			System.out.println("편의점에가면 ~");
			String b = sc.next();
			
			if(a.contains(b)) {
				break;
			}
			//else 없음
		}
		
		// 출력
		System.out.println(a);
	}
}
