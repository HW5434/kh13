package api.util.Calendar;

import java.text.SimpleDateFormat;
import java.util.Calendar;
import java.util.Date;

public class Test02날짜변경 {
	public static void main(String[] args) {
		Calendar c = Calendar.getInstance();
	
		//시간 변경 = .set()
		c.set(Calendar.YEAR, 2024); //연도를 2024로 바꿔라
		c.set(Calendar.MONTH, 0); //월은 0부터 11일로 설정
//		c.set(Calendar.DATE, 1);
		c.set(Calendar.DAY_OF_MONTH, +1);
		
		//시간출력
		Date d = c.getTime();
		SimpleDateFormat fmt = new SimpleDateFormat("yyyy-MM-dd HH:mm:ss");
		System.out.println(fmt.format(d));
	
	}
}
