package api.util.Calendar;

import java.text.SimpleDateFormat;
import java.util.Calendar;
import java.util.Date;

public class Test01Calendar {
	public static void main(String[] args) {
		
		//Calendar 클래스
		// - 시간 계산 특화 클래스
		// - 추상클래스이므로 직접 객체 생성불가
		
		//
		Calendar c = Calendar.getInstance();
		System.out.println("c = " + c);
		
		//Cale
		Date d = c.getTime();
		SimpleDateFormat fmt = new SimpleDateFormat("yyyy-MM-dd HH:mm:ss");
		System.out.println(fmt.format(d));
	}
}
