package ARRAY;

import java.util.Scanner;

public class Tset05배열입력풀이2 {	
public static void main(String[] args) {
	
		//int[] numbers = new int[] {10, 20, 30, 40 ,50}; //정해진 데이터
		
		Scanner sc = new Scanner(System.in);
		int[] numbers = new int[] {
				sc.nextInt(),sc.nextInt(),sc.nextInt(),sc.nextInt(),sc.nextInt(),
		};
		
		for(int i=0; i < numbers.length;i++) {
			System.out.println(numbers[i]);
		}
		
		}
}



	
		
		
	

