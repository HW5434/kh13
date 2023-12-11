package LOOP;

import java.util.Scanner;

public class Test10구구단 {
	public static void main(String[] args) {
	
		
		Scanner sc = new Scanner(System.in);
		System.out.print("구구단의 단을 입력하세요. : ");
		
		int Number = sc.nextInt();
		int N = Number * 9;
		int mid = N / Number;
		
		for(int i = Number; i <= N; i = i + Number) {
		int count = i / Number;		
					
		System.out.println(Number + "X" + count + "="); // 정답
		
			//System.out.println(i); // 정답					
			//System.out.println(count); // 정답	
		
		
		

			}
		}
	}

