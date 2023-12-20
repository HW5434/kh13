package oop.keyword6;

import java.util.Scanner;

public class Test01screen {
	public static void main(String [] arg) {
		Scanner sc = new Scanner(System.in);
		System.out.print("타이틀 : ");
		 String title = sc.next();
		 System.out.print("폭 , 높이 순서대로 입력");
		 int width = sc.nextInt();
		 int height = sc.nextInt();

		 Gamescreen screen = new Gamescreen(title , width , height);
		screen.information();
	}
}
