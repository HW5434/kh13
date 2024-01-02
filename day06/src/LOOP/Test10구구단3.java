package LOOP;

import java.util.Scanner;

public class Test10구구단3 {
	public static void main(String[] args) {
		
		Scanner sc = new Scanner(System.in);
		//입력 및 계산
			System.out.println("* 어서오세요! 구구단월드에 오신 것을 환영합니다 *");
			System.out.println();
			System.out.print("공부하고 싶은 \"단\" 을 입력하세요! : ");
		    int danNumber = sc.nextInt(); //단 입력
		    System.out.println("3초 후 시작합니다.");
		//복습 [타이머] 	           	
		try     {
		        Thread.sleep(3000);} 
				
		catch (InterruptedException e){
		        e.printStackTrace();
		        }				
		
			System.out.println();
		for(int i = 1; i <=9; i = i + 1) {
			System.out.print(danNumber + " X " + i + " = " );
			int answer = sc.nextInt(); //정답 작성
			
		if(answer == danNumber * i){	
			System.out.println(answer + " 정답 입니다!");
			System.out.println();
			}
			
		else    {
			System.out.println(answer + " 오답 입니다;");
			System.out.println("[" +"정답 : " +  danNumber * i + "]");
			System.out.println();			
			}							
		}	
		
		//최종출력
		
			System.out.println(); 
			System.out.println("게임 끝!" );
			System.out.println("고생하셨습니다~!" );
		}	
	}