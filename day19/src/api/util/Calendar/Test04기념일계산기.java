package api.util.Calendar;

import java.text.SimpleDateFormat;
import java.util.Calendar;
import java.util.Date;
import java.util.Scanner;

public class Test04기념일계산기 {

	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		String user = sc.next();
		
		//입력한 날짜에 100일을 더해주면 되잖아
		
		Calendar c = Calendar.getInstance();
		
		String yearS = user.substring(0,4);
		String monthS = user.substring(5,7);
		String dayS = user.substring(8,10);
		
		String[] parts = user.split("-");
		
		
		int year = Integer.parseInt(parts[0]);
		int month = Integer.parseInt(parts[1]);
		int day = Integer.parseInt(parts[2]);
		
		c.set(Calendar.YEAR, year);
		c.set(Calendar.MONTH, month-1); 
		c.set(Calendar.DAY_OF_MONTH, day);
		
		//시간출력
		Date d = c.getTime();
		SimpleDateFormat fmt = new SimpleDateFormat("yyyy-MM-dd");
		System.out.println(fmt.format(d));
	
	}

}
