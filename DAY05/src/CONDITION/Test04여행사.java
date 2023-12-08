package CONDITION;

public class Test04여행사 {

	public static void main(String[] args) {
		// 어디든 무조건 1사람 1박에 10만원
		// 여름에 여행하는 사람은 추가로 20퍼 할인 여름은 6,7,8월
		// 질문 : 사용자에게 인원수, 기간, 예정 월 을 임력받아서 금액출력
		
		int day1 = 100000;
		int person = 5;
		int pay = day1 * person;
		int season = 8; //리미트가 없음
		boolean summer = 6 <= season && season <= 8; 
		//int summerPay = 
				//여름이 아니면 10만원 * 인원
		if(summer) {
			int total = pay * (100 - 20) / 100;
				System.out.println("총 금액은 " + total + " 입니다.");// 나머지 계절
		}
			
		else {
				System.out.println("총 금액은 " + pay + " 입니다."); // 여름
		}
	}

}
