package api.util.scanner;

import java.util.Scanner;

public class Test01Scanner클래스2 {
	public static void main(String[] args) {

		//Scanner 클래스
		String song = "노는게 제일좋아 친구들 모여라\n언제나 즐거워\n 뽀롱뽀롱뽀롱뽀롱뽀로로";
		
		//.nextLine() 는 "한줄"를 읽는 명령 (공백 전까지)
		Scanner sc = new Scanner(song);
		while(sc.hasNextLine()) {
			System.out.println(sc.nextLine());
		}
		sc.close();//통로형 객체를 정리하는 메소드
		
	}
}
