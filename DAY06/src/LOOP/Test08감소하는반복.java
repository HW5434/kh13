package LOOP;

public class Test08감소하는반복 {
	public static void main(String[] args) {
		//(Q) 10부터 0까지 줄어드는 카운트 다운 출력
		// - 범위 조심
		// - 증가가 아닌 감소 처리를 해야함
		
		for(int i = 10; i >= 0; i--) { // i = i-1 // i--
			System.out.println(i);
		}
	}
}
