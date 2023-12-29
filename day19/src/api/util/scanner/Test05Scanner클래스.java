package api.util.scanner;

import java.util.Scanner;

public class Test05Scanner클래스 {
	public static void main(String[] args) {

		String song = "노는게 제일좋아 친구들 모여라\n언제나 즐거워\n 뽀롱뽀롱";
		
		//.next() 는 "단어"를 읽는 명령 (공백 전까지)
		Scanner sc = new Scanner(song);
		while(sc.hasNext()) {
		//	if(sc.hasNext() == false) break;
			System.out.println(sc.next());
		}
		sc.close();//통로형 객체를 정리하는 메소드
		
	}
}
