package LOOP3;

public class Test02누적합계 {
	public static void main(String[] args) {
	
		int totalA = 0;
		int totalB = 0;
		
		for(int i = 1; i <= 100; i++) {
			if(i % 2 == 0) {
				totalB += i;
		}
			if(i  % 7 == 0) {
				totalA += i;
		}
}
		System.out.println("1부터 100 사이의 짝수 합계 : " + totalB);	
		System.out.println("1부터 100 사이의 7의 배수 : " + totalA);
	}
}
