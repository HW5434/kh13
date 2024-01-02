package ARRAY2;

import java.util.Random;

public class Test03로또번호카운트 {

	public static void main(String[] args) {

//		KH로또연구소에서는 가장 많이 나오는 로또번호가 몇번인지 알고 싶어서 시뮬레이션을 진행하려고 합니다.
//
//		로또번호를 1000번정도 추첨해서 각각 나온 횟수를 저장하려고 합니다.
//
//		번호별로 나온 횟수를 출력
//		가장 많이 나온 번호를 출력(동점이면 아무거나)
			
		Random r = new Random(); 
		
		int[] counts = new int[6];

		
		for(int i = 0;  i < 10; i++) {// 로또번호 출력장치
		int number = r.nextInt(6)+1;
		System.out.println();
		
		if(number == 1) {
			counts[0]++;
		}
		else if(number ==2) {
			counts[1]++;
		}
		else if(number ==3) {
			counts[2]++;
		}
		else if(number ==4) {
			counts[3]++;
		}
	   else if(number ==5) {
		   counts[4]++;
			}
		else if(number ==6) {
			counts[5]++;
		
		}
		}
		System.out.println(counts[0]);
		System.out.println(counts[1]);
		System.out.println(counts[2]);
		System.out.println(counts[3]);
		System.out.println(counts[4]);
		System.out.println(counts[5]);
	}
}
