package ARRAY;

import java.util.Random;
import java.util.Scanner;

public class Test07확률뽑기 {

	public static void main(String[] args) {

		Random r = new Random();
		Scanner sc = new Scanner(System.in);
		
		int choice = r.nextInt();
		
		String [] boxes = new String[] {"금" , "은", "철", "철"};
		for(int i = 0; i < boxes.length; i++)

		
		 System.out.println(boxes[choice]);
	}

}
