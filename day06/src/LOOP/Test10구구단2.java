package LOOP;

import java.util.Scanner;

public class Test10구구단2 {
	public static void main(String[] args) {
	
		
		Scanner sc = new Scanner(System.in);
		System.out.print("구구단의 단을 입력하세요. : ");
		
		int Number = sc.nextInt();
		int N = Number * 9;
		int mid = N / Number;
		
		for(int i = Number; i <= N; i = i +3) {
		int count = i / Number;		
					
		System.out.println(Number + "X" + count + "=");
		int chat1 = sc.nextInt();

		if(chat1 == i);	{
		System.out.println("정답!");
		if(chat1 != i); {
			System.out.println("오답!");
				}
			}					
		}				
	}
}

