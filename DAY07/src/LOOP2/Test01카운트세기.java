package LOOP2;

public class Test01카운트세기 {

	public static void main(String[] args) {

		//(Q) 1부터 100사이의 짝수 개수 - 
		//(A) 50개
		
		//1. 일단 1부터 100사이의 범위를 만든다(for)
		//2. 조건을 추가하여 짝수만 출력하도록 구문을 만든다
		//3. 2번에서 만든 영역에 대한 개수를 카운트
		
		int count = 0;
		
		for(int i = 1; i <= 100; i++) {
			if(i % 2 == 0) {
				//System.out.println(i); 확인용
				count++;
				System.out.println(i);
			}
		}
		
		System.out.println("짝수 개수 = " + count); //최종결과
		
	}
}
