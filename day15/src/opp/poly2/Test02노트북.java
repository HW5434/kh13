package opp.poly2;

import java.util.Scanner;

public class Test02노트북 {
	public static void main(String [] args) {
		
		Scanner sc = new Scanner(System.in);
		
		System.out.println(123);
		int Q1 = sc.nextInt();
		Notebook Note;
		if(Q1 == 1 ) {
			Note = new Galaxybook();
			
		int Q2 = sc.nextInt();			
		if(Q2 == 1) {
			Note.power();
			}
		if(Q2 == 2) {
			Note.playVideo();
		}
		if(Q2 == 3) {
			Note.typing();
		}
	}
		if(Q1 == 2) {
			Note = new Maxbook();
		}
		int Q2 = sc.nextInt();			
		if(Q2 == 1) {
//			Note.power();
//			}
//		if(Q2 == 2) {
//			Note.playVideo();
//		}
//		if(Q2 == 3) {
//			Note.typing();
		}
	}
		
	}

