package LOOP2;

import java.util.Scanner;

public class Test03등급판정 {
public static void main(String[] args) {
	
	//사용자에게 10개 시험점수를 입력받아서 A 등급과 B등급의 개수를 출력
	
	//	A 등급은 85점 이상 100점 이하
	//	B 등급은 70점 이상 85점 미만
	
	Scanner sc = new Scanner(System.in);
	int classNumber = 10;
	int countA = 0;
	int countB = 0;
	for(int i = 1; i <= classNumber; i++) {
		int number= sc.nextInt();
		
		if(85 <= number) {
			System.out.println("A등급");
			countA++;			
		}		
		else if(75 <= number){
			System.out.println("B등급");
			countB++;
			}
		}
	System.out.println("A등급 : " + countA);
	System.out.println("B등급 : " + countB);
	}	
}
