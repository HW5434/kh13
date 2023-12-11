package LOOP;

public class Test0503 {

	public static void main (String[] args) {
		
		// 1부터 100까지 숫자 홀 짝 구분 개수
		
		for(int i = 1; i <= 100; i = i + 1) {
		if( i / 2 == 0 || i % 2 == 0)
			
			System.out.println(i);
		}
		
	}
}
