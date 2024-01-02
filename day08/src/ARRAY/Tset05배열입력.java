package ARRAY;

import java.util.Scanner;

public class Tset05배열입력 {	

public static void main(String[] args) {
				
			Scanner sc = new Scanner(System.in);
			int[] userN = new int[5];
								
			for(int i=0; i<userN.length; i++) {
					System.out.print("숫자입력 : ");
					userN[i] = sc.nextInt();				
			}						
			sc.close();
			
			for(int i=0; i<userN.length; i++) {		
					System.out.print(userN[i] + " ");
			}
		}
}



	
		
		
	

