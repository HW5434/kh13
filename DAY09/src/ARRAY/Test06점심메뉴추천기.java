package ARRAY;

import java.util.Random;
import java.util.Scanner;

public class Test06점심메뉴추천기 {

	public static void main(String [] arg) {
		Random r = new Random();
		Scanner sc = new Scanner(System.in); 
		
		//랜덤은 위치하나만 추첨
		int position = r.nextInt(5);
		//System.out.println("position = " + position);
		//5가지 메뉴
		
		String[] menu = new String[5];
		//범위 설정
		for(int i = 0; i < menu.length;i++) {
			menu[i] = sc.next();			
		}
			System.out.println(menu[position]);
		}
		
	}

