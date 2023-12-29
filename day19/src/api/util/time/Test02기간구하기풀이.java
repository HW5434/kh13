package api.util.time;

import java.time.LocalDate;
import java.time.Period;
import java.util.Scanner;

public class Test02기간구하기풀이 {
	public static void main(String[] args) {
		
		String str1 = "2023-05-08";
		String str2 = "2024-01-01";
		
		LocalDate a = LocalDate.parse(str1);
		LocalDate b = LocalDate.parse(str2);
		
		//a 가 b 보다 이전인지 판정
		//System.out.println(a.isBefore(b));
		//System.out.println(a.isBefore(a));
		
		if(a.isBefore(b)) {
			Period period = Period.between(a, b);
			System.out.println(period.getYears() + "년");
			System.out.println(period.getMonths() + "월");
			System.out.println(period.getDays() + "일");
		}
		else {
			System.out.println("기간을 구할 수 없습니다");
		}
	}

}
