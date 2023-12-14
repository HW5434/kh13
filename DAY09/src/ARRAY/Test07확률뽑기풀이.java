package ARRAY;

import java.util.Random;
import java.util.Scanner;

public class Test07확률뽑기풀이 {

	public static void main(String[] args) {

		Random r = new Random();
		Scanner sc = new Scanner(System.in);
		
		
		String [] boxes = new String[] {"금상자" , "은상자" , "철상자" };
		int gold = 10, silver = 20;
		
		
		int choice = r.nextInt(10); // 0부터 10개
		System.out.println("p = " + choice);
		
		int choice2;
		if(choice < gold) {
			choice2 = 0;
		}
		else if(choice < gold + silver) {
			choice2 = 1;
		}
		else {
			choice2 = 2;
		}
		
		System.out.println("추첨 결과 = " + boxes[choice]);		
	}

}
