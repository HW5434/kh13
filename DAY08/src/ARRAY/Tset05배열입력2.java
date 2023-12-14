package ARRAY;

import java.util.Scanner;

public class Tset05배열입력2 {	
public static void main(String[] args) {
	
		//int[] numbers = new int[] {10, 20, 30, 40 ,50}; //정해진 데이터
		
		Scanner sc = new Scanner(System.in);
		int[] numbers = new int[5]; //데이터가 정해지지 않은 경우
		//numbers --- [0] [0] [0] [0] [0]
		
		//number = sc.nextInt();
		System.out.println("입력 : ");
		numbers [0] = sc.nextInt();
		System.out.println("입력 : ");
		numbers [1] = sc.nextInt();
		System.out.println("입력 : ");
		numbers [2] = sc.nextInt();
		System.out.println("입력 : ");
		numbers [3] = sc.nextInt();
		System.out.println("입력 : ");
		numbers [4] = sc.nextInt();
		
		for(int i=0; i < numbers.length;i++) {
			System.out.println(numbers[i]);
		}
		
		}
}



	
		
		
	

