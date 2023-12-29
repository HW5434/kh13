package api.util.time;

import java.util.Scanner;

public class Test02기간구하기 {
	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		
		String a = "2023-01-01";
		String b = "2023-05-08";
		
		String[] partsA = a.split("-");
		
		int A = 20230101;
		int B = 20230508;
		
		System.out.println();
		System.out.println("차이는 ?년 ?월 ?일");
		System.out.println(A-B);
	}

}
