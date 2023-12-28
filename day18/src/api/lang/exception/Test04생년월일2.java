package api.lang.exception;

import java.util.Scanner;

public class Test04생년월일2 {
	public static void main(String[] args) {
	
		try {
			//입력 String 으로 입력받고 출력은 인트
			Scanner sc = new Scanner(System.in);
			String input = sc.next();
			
			String yearS = input.substring(0,4);
			String monthS = input.substring(5,7);
			String dayS = input.substring(8,10);
			
			String[] parts = input.split("-");
			
			
			int year = Integer.parseInt(parts[0]);
			int month = Integer.parseInt(parts[1]);
			int day = Integer.parseInt(parts[2]);
			
			System.out.println("<출생일자>");
			System.out.println("출생년도 = " + year); //출생년도 2023년
			System.out.println("출생월 = " + month); // 출생월 12월
			System.out.println("출생일 = " + day); // 출생일 28일
		}
//		catch(NumberFormatException e) {
		catch(Exception e) {
			System.err.println("입력오류");
		}
	}
}
