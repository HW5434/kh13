package CONDITION3;

import java.util.Scanner;

public class Test02학점계산기 {

	public static void main(String[] args) {
		System.out.println("당신의 과목 점수를 작성하세요. : ");
		Scanner sc = new Scanner(System.in);
		System.out.println();
		
		//계산
		
		int number = sc.nextInt();
		int numCal1 = number / 10;
			
		String numberText;
		switch (numCal1) {
			case 9 : case 10 :	
			numberText = "A+";
			break;
			
			case 8 : 	
			numberText = "A";
			break;
			
			case 7 : 
			numberText = "B";
			break;
			
			case 6 : 
			numberText = "C";
			break;	
			
			default:
			numberText = "F";
			break;
			
			//출력
			
		
			
			}
					System.out.println("당신의 학점은 " + numberText + " 입니다.");
		}						
	}
