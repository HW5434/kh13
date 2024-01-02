package LOOP3;

import java.util.Scanner;

public class Test03합계구하기3 {
	public static void main(String [] arg) { 
	
//		사용자가 0을 입력하기 전까지 입력한 숫자들의 
//		합계와 평균을 구하여 출력
		
			Scanner sc = new Scanner(System.in);
			
			int count = 0;
			int total = 0;
			
			while(true) {
				System.out.print("숫자 입력 : ");
				int number = sc.nextInt();
				
				if(number == 0) {//입력한 값이 0이라면
					break;//그만합시다
				}
				else {
					count++;
					total += number;
				}
			}
			
			//count와 total이 확정된 뒤 평균을 계산
			double average = (double)total / count;
			
			System.out.println("입력횟수 = " + count);
			System.out.println("합계 = " + total);
			System.out.println("평균 = " + average);
		}
}





