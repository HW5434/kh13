package DATA;

public class Test06풀이2 {

	public static void main(String[] args) {

// 답지
//%는 나누었을때 나머지

//입력
	int yesterdayHour = 2*60, yesterdayMinute = 45;
	int todayHour = 3*60, todayMinute = 35;
	
	//계산
	int yesterday = yesterdayHour + yesterdayMinute;
	int today = todayMinute + todayHour;
	int total = (yesterday + today);
	int hour = total / 60;
	int minute = total % 60;
	
	//출력
	System.out.println(hour);
	System.out.println(minute);
	
	
	}
}