package RANDOM;

import java.util.Random;
import java.util.Scanner;

public class Test03랜덤구구단풀이 {
public static void main (String[] arg) {
	
	Random r = new Random();
	Scanner sc = new Scanner(System.in);
	
	int left = r.nextInt(18) + 2;
	int right = r.nextInt(9) + 1;
	
	System.out.println(left + " X " + right + " = ");
	int user = sc.nextInt();
	
}
}
