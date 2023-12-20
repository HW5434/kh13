package oop.constructor3;

import java.util.Scanner;

public class Test01객체선택 {

	//모두 입력으로 바꿔야함
	
	public static void main(String[] args) {
		
		Scanner sc = new Scanner(System.in);
		System.out.print("아이디 : ");
		String id = sc.next();
		System.out.print("직업(전사/도적/마법사/궁수) : ");
		String job =  sc.next();
		
		Player a = new Player(id , job);
		
//		레벨업
//		int level = a.getLevel();
//		a.setLevel(level + 1);
		a.levelUp();				
		a.information();
		
	}

}
