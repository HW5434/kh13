package api.util.scanner;

import java.util.Scanner;

public class Test02문제되는상황 {
	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		
		System.out.println("이름 : ");
		String name = sc.next();
		
		System.out.println("이름 : ");
		String intro = sc.next();
		
		sc.close();
		
		System.out.println("이름 : " + name);
		System.out.println("자기소개 : " + intro);
		
	}

}
