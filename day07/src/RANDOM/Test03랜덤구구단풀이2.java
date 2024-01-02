package RANDOM;

import java.util.Random;
import java.util.Scanner;

public class Test03랜덤구구단풀이2 {
public static void main (String[] arg) {
	
	Random r = new Random();
	Scanner sc = new Scanner(System.in);
	
	//10번
	for(int i = 1; i <= 10; i++) {}
	for(int i = 0; i < 10; i ++) {}
	
	for(int i = 1; i <= 10; i++) {
	
	int left = r.nextInt(18) + 2; //2부터 18개 //2부터 19사이
	int right = r.nextInt(9) + 1; //1부터 9개 // 1부터 9사이
	
	System.out.println(left + " X " + right + " = ");
	int user = sc.nextInt();
	
	if(user == left * right) { //정답이라면
		System.out.println("정답");
	}
	else { //오답이라면
		System.out.println("오답!");
	}
	}
}
}
