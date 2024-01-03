package api.utill.collection;

import java.util.ArrayList;
import java.util.Collections;
import java.util.List;
import java.util.Scanner;

public class Test08사다리게임풀이3 {

	public static void main(String[] args) {
	
		//반복문 추가하기
		Scanner sc = new Scanner(System.in);
		
		System.out.println("이름을 count개 입력하세요");
		int count = sc.nextInt();
		sc.nextLine();//다음 입력에 영향을 주는 잔여 엔터 정리
		//이상이 있을때 사용하자 제발
		
		List<String> names = new ArrayList<>();
		List<String> items = new ArrayList<>();
		

		for(int i = 0; i < count; i++) {
			names.add(sc.nextLine());
		}
		
		System.out.println("당첨항목을 count개 입력하세요");
		for(int i = 0; i < count; i++) {
			items.add(sc.nextLine());
		}
		
		Collections.shuffle(items);
		
		for(int i = 0; i < count; i++) {
			System.out.println(names.get(i) + " = " + items.get(i));
		}
	}
}
