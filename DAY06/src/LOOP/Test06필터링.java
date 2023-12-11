package LOOP;

public class Test06필터링 {

	public static void main(String[] args) {
		
		//5의 배수 아님 ex 10은 5가 없음
		//입력
		for(int i = 1; i <= 99; i = i + 1) {
			boolean ten = i / 10 == 5;
			boolean one = i % 10 == 5;
			
		if(ten || one) {
		System.out.println(i);
			}
		}
	}
}

