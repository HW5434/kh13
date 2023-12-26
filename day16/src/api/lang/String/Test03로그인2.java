package api.lang.String;

import java.util.Scanner;

public class Test03로그인2 {
	public static void main(String [] args) {
		
		Scanner sc = new Scanner(System.in);

		String id = sc.next();
		String pw = sc.next();
		
		String c = "khacademy";
		String d = "adminuser";
		
//		System.out.println(a.equals(c));
//		System.out.println(b.equals(d));
		//비교 연상 쓰지말기 
		//equalsIgnoreCase 대소문자 구분 안함
		
		if(id.equalsIgnoreCase(c) && pw.equalsIgnoreCase(d)) {
			System.out.println("로그인 되었습니다.");
		}
		else {
			System.out.println("입력한 정보가 잘못되었습니");
		}
	}
}
