package ARRAY2;

import java.util.Random;

public class Test03로또번호카운트4 {

	public static void main(String[] args) {

//		KH로또연구소에서는 가장 많이 나오는 로또번호가 몇번인지 알고 싶어서 시뮬레이션을 진행하려고 합니다.
//
//		로또번호를 1000번정도 추첨해서 각각 나온 횟수를 저장하려고 합니다.
//
//		번호별로 나온 횟수를 출력
//		가장 많이 나온 번호를 출력(동점이면 아무거나)
			

		Random r = new Random(); 
		
		int[] lotto = new int[45];
		
		
		
		for(int i = 1; i <= 1000; i++) {
			int R = r.nextInt();
			System.out.println(R + " 번째");
		}
		

	}
}


