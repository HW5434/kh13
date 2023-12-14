package ARRAY2;

import java.util.Random;

public class Test03로또번호카운트3 {

	public static void main(String[] args) {

//		KH로또연구소에서는 가장 많이 나오는 로또번호가 몇번인지 알고 싶어서 시뮬레이션을 진행하려고 합니다.
//
//		로또번호를 1000번정도 추첨해서 각각 나온 횟수를 저장하려고 합니다.
//
//		번호별로 나온 횟수를 출력
//		가장 많이 나온 번호를 출력(동점이면 아무거나)
			
		Random r = new Random(); 
		
		int[] counts = new int[45];

		
		for(int i = 0;  i < 1000; i++) {
		int number = r.nextInt(45)+1;
		counts[number-1]++;
		}
		
		//최대값의 위치(index)를 찾자
		int max = 0;
		for(int i = 1; i < counts.length;i++) {
			if (counts[max] < counts[i]) {
				max = i;
			}
		}
		//1
		for(int i = 0; i <counts.length; i++) {
			System.out.println((i+1) + "나온 횟수" + counts[i]);
		}
		
		//2 - 동점까지 출력하고 싶다면
		for(int i = 0; i < counts.length; i ++)
			//if(가장 많이나온 횟수랑 같은칸이 있다면)
				if(counts[max] == counts[i]) {
		System.out.println("가장 많이 나온 수 " + (max + 1));
	}
}
}

