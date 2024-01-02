package ARRAY;

import java.util.Random;
import java.util.Scanner;

public class Test07확률뽑기풀이2 {

	public static void main(String[] args) {

		Random r = new Random();
		Scanner sc = new Scanner(System.in);
		
		
		String [] boxes = new String[] {
			"금상자" , "은상자" , "은상자" , "철상자" , "철상자",
			"철상자" , "철상자" , "철상자" , "철상자" , "철상자"
		};
		int choice = r.nextInt(boxes.length); // 0부터 10개
		
		System.out.println("p = " + choice);
		
		System.out.println("추첨 결과 = " + boxes[choice]);

		
		
	}

}
