package CONDITION2;

public class Test05시간출력 {

	public static void main(String[] args) {
		//TIP 계산이 먼저가 아님 IF 정리부터 하기
		
		//입력
		int time = 500;
		
		//계산 + 출력
		if(time < 10) { //10초가 되지 않았다면
			System.out.println("방금 전");
		}
		else if(time < 60) {
			int second = time;
			System.out.println("?초 전");
		}
			else if(time < 60 * 60) {
				int minute = time / 60;
				System.out.println("?분 전");	
			}
			else if(time < 24 * 60 * 60) {
				int hour = time / 60 / 60;
				System.out.println("?시간 전");	
			}
			else {
				int day = time / 24 /60 / 60;
				System.out.println("?일 전");	
			}
		}
	}

