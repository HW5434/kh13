package api.lang.String;

import java.util.Random;
import java.util.Scanner;

public class Test06공포의쿵쿵따 {
	public static void main (String[] args) {
//	요구사항
//	첫 번째 제시어를 바나나로 설정해두고 사용자에게 단어를 입력받아서 쿵쿵따 게임을 진행하세요
//	사용자가 입력한 단어는 제시어와 이어져야 합니다.
//	사용자가 입력한 단어는 반드시 3글자여야 합니다.
//	위 조건을 만족하지 않을 경우 게임오버가 되며 프로그램이 종료됩니다.
//	단어를 정상적으로 입력한 경우 제시어가 입력한 단어로 바뀝니다.
//	위 작업을 반복적으로 진행합니다.
//	아래 예시에서 ( )로 감싸진 부분이 사용자가 입력하는 부분입니다.
		
		Scanner sc = new Scanner(System.in);
		Random rd = new Random();
		
		String[] words = {"바나나", "너구리", "오징어", "산기슭", "기찻길"};
		String a = words[rd.nextInt(5)];
		
		int count = 1;
		while(true) {
			System.out.println(a + "! 쿵쿵따!");
			String user = sc.next();
			
			boolean isKorean = true;
			for (int i = 0; i < user.length(); i++) {
				if ('가' <= user.charAt(i) && user.charAt(i) <= '힣') {
					continue;
				}else {
					isKorean = false;
					break;
				}
			}
			
			boolean isLengthOk = user.length() == 3;
			boolean isWordOk = user.charAt(0) == a.charAt(2);
			 
			if (!(isLengthOk) || !(isWordOk) || !(isKorean)) {
				System.out.println("땡! 게임오버!");
				break;
			}
			a = user;
			count++;
		}
		System.out.println("진행 된 라운드 수 : " + count + "회");
	}
}

