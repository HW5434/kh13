package api.utill.collection3;

import java.util.HashMap;
import java.util.Map;
import java.util.Scanner;

public class Test03투표하기 {

	public static void main(String[] args) {
		
		//저장소 생성
		Map<String , Integer> votes = new HashMap<>();
		
		//더미 데이터 추가
		votes.put("피카츄", 25);
		votes.put("라이츄", 17);
		
		//사용자 입력
		Scanner sc = new Scanner(System.in);
		String input = sc.nextLine();
		
		//판정
		if(votes.containsKey(input)) {//투표 이력이 있으면
			//System.out.println("투표 기록이 있는 이름");
			//Integer count = votes.get(input);//null이 있으면 그냥 잘 모르겠어도 
			int count = votes.get(input);
			votes.put(input, count+1);
			
		}
		else {
			System.out.println("투표 기록이 없는 이름");
			votes.put(input, 1);
		}
	}
}
