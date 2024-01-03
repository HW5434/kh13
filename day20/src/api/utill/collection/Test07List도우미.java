package api.utill.collection;

import java.util.ArrayList;
import java.util.Collections;
import java.util.List;


public class Test07List도우미 {
	public static void main(String[] args) {
		//List를 도와주는 클래스
		// - Collections 클래스 (뒤에 s가 붙은 클래스는 도우미 클래스)
		// ex Object 를 도와주는 Objects가 있음
		// - List의 순서 활용을 극대화
		
		//리스트만 된다 순서가 있어야 할 수 있으니까.
		
		
		List<Integer> list = new ArrayList<>();
		for(int i =1; i <=10; i ++) {
			list.add(i);
		}
		System.out.println(list);
		
		//뒤집기(reverse)
		Collections.reverse(list);
		System.out.println(list);
		
		//뒤섞기(shuffle)
		Collections.shuffle(list);
		System.out.println(list);
		
		//정렬(sort)
		Collections.sort(list);
		System.out.println(list);
	}
}
