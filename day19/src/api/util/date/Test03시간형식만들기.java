package api.util.date;

import java.awt.event.FocusAdapter;
import java.text.SimpleDateFormat;
import java.util.Date;

public class Test03시간형식만들기 {

	public static void main(String[] args) {
		
		Date a = new Date();
		
		SimpleDateFormat today = new SimpleDateFormat("y년 M월 d일"); //리모컨 2023년7월11일
		SimpleDateFormat timeKr = new SimpleDateFormat("a h시 m분"); //리모컨
		SimpleDateFormat time = new SimpleDateFormat("H:mm:ss"); //리모컨
		SimpleDateFormat total = new SimpleDateFormat("yyyy-MM-dd E H:mm:ss"); //리모컨
		
		System.out.println(today.format(a));
		System.out.println(timeKr.format(a));
		System.out.println(time.format(a));
		System.out.println(total.format(a));

		
	}
}
