package api.utill.collection2;

import java.util.Iterator;
import java.util.Set;

public class Test04Set출력 {

	public static void main(String[] args) {
		//(Q) Set은 전체 출력이 가능한가?
		
		//볼변 Set 생성
		Set<String> data = Set.of("자바" , "파이썬", "안드로이드", "NodeJS", "C++");
		
		System.out.println(data);
		
		//Set은 index가 없기 때문에 요소를 개별적으로 접근할 수가 없다
		// = 전체 출력용 구문 또는 도구를 사용하면 된다
		
		//[1] 확장 FOR 반복문 - 오로지 전체 출력만 가능한 반복문
		for(String name : data) {//data의 모든 항목을 매 바퀴마다 name으로 전달
			System.out.println("name = " + name);
		}
		
		//[2] Iterator로 옮겨서 출력(Scanner와 비슷)
		Iterator<String> iter = data.iterator();
		while(iter.hasNext()) {
			String name = iter.next();
			System.out.println("name = " + name);
		// 쉽게 생각해보면 있어? 응 있어 그러면 꺼내
		}
	}
}
