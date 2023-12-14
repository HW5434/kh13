package ARRAY2;

import java.util.Scanner;

public class Test02의미있는평균 {

	public static void main(String[] args) {
//1 입력 받고 가장 큰것과 가장 작은것을 찾고 합계에서 뺀후 
		
		Scanner sc =  new Scanner(System.in);
		double[] numbers = new double[5];
		
		
		for(int i = 0; i < numbers.length; i++) {
			System.out.println("입력 : ");
			numbers[i] =sc. nextInt();
		}
		//int max = ??? 가장 큰 위치 
		int max = 0;
		for(int i = 1; i < numbers.length; i++) {
			if(numbers[max] < numbers[i]) {
			// i가 
			}
				
			
			System.out.println(numbers[i]);
		}
	}
}

