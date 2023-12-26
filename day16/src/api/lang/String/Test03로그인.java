package api.lang.String;

import java.util.Scanner;

public class Test03로그인 {
	public static void main(String [] args) {
		
		Scanner sc = new Scanner(System.in);

		String a = sc.next();
		String b = sc.next();
		
		String c = "khacademy";
		String d = "adminuser";
		
		System.out.println(a.equals(c));
		System.out.println(b.equals(d));
		
		if(a.equals(c) && b.equals(d)) {
			System.out.println("로그인 되었습니다.");
		}
		else {
			System.out.println("입력한 정보가 잘못되었습니");
		}
	}
}
