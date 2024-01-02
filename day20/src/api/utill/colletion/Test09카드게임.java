package api.utill.colletion;

import java.util.ArrayList;
import java.util.List;

public class Test09카드게임 {

	public static void main(String[] args) {
		List<String> a = new ArrayList<>(); //숫자랑 문자가 같이 섞여있음 참고
		
		
			String ranks [] = new String [] {"A","2","3","4","5","6","7","8","9","10","J","Q","K"};
			for(int k = 0; k < 13; k++) {
				System.out.println(ranks[k]);
			}
			
			String suits [] = new String [] {"스페이드","클로버","하트","다이아몬드"};
			for(int i = 0; i < 4; i++) {
				System.out.println(suits[i]);
			}
		
			
		//ranks를 출력만 하면돼 맨앞자리 0만 출력을 해도 괜찮아
		
		//출력을 했을때 suits + ranks가 나오면 돼
		//ex 다이아몬드 2 이런식으로
		System.out.println();

	}

}
