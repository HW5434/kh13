package api.util.Calendar;

import java.text.SimpleDateFormat;
import java.util.Calendar;
import java.util.Date;
import java.util.Scanner;

public class Test04기념일계산기풀이1 {

	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		String user = sc.next();
		
		//입력한 날짜에 100일을 더해주면 되잖아
		
		Calendar c = Calendar.getInstance();
		
		int year =  Integer.parseInt(user.substring(0,4));
		int month =  Integer.parseInt(user.substring(5,7));
		int day = Integer.parseInt(user.substring(8));
					
			//구해야 하는 날짜(더해야 하는 날짜)를 미리 저장
			int[] numbers = new int[] {
				100 , 200 , 300 , 365+1 , 400 , 500 , 600 , 700 , 730+1	
			};
			
			for(int i = 0; i < numbers.length; i++) {
				c.set(year, month-1 , day + i);
				
				//시간출력
				Date d = c.getTime();
				SimpleDateFormat fmt = new SimpleDateFormat("y년 M월 d일 E요일");
				
				if(numbers[i] % 100 == 0) {
					System.out.println("y년 M월 d일 E요일");
				}
				System.out.println(numbers[i] + fmt.format(d));
			}
		}
	}

