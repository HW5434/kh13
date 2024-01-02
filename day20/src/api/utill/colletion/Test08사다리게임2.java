package api.utill.colletion;

import java.util.ArrayList;
import java.util.Collections;
import java.util.List;
import java.util.Scanner;

public class Test08사다리게임2 {

	public static void main(String[] args) {
	
		//리스트 만들기
		List<String> a = new ArrayList<>();
		List<String> b = new ArrayList<>();
		Scanner sc = new Scanner(System.in);
		//사람 입력
		
		
		a.add(sc.next());
		a.add(sc.next());
		a.add(sc.next());
		
		b.add(sc.next());
		b.add(sc.next());
		b.add(sc.next());
		
		//셔플
		
		Collections.shuffle(b);
		System.out.println(b);
		
		//반복문
		
		
		//a와b를 비교 출력문
		System.out.println(a.get(0) +" = " + b.get(0));
		System.out.println(a.get(1) + " = " + b.get(1));
		System.out.println(a.get(2) + " = " + b.get(2));
		

		//a를 작성한 순서대로 정렬하고 b는 셔플을 하면? 
		
		
		
	}
}
