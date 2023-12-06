package DATA2;

public class Test05PC방계산기 {

	public static void main(String[] args) {

	//요금 1시간당 1000원
//		분단위로 초과요금
//		10만원단위까지 받는다
//		ex 4분동안 게임을 했다면 66.6666원이 실제 요금이 됬지만 60
//		12시간 20분 15시 30분 까지 게임을 했을때 요금을 구하시오
		
//		int hourPay = 1000;
//		double minPay = hourPay / 60.0;
//		
//		int gsH = 12;
//		int gsM = 20;
//		int gfH = 15;
//		int gfM = 30;
//		
//		int gsm = gsH * 60 + gsM;
//		int gfm = gfH * 60 + gfM;
//		
//		int  total = gfm - gsm;
//		
//
//		double totalPay = (minPay *  total);
//		
//		double pay = (int) (totalPay);
//		System.out.println(minPay); 
//		System.out.println(total); 
//		System.out.println(pay); 
		
		int in = 1220;
		int out = 1530;
		
		int unitPrice = 1000;
		
		int inHour = in / 100;
		int inMinute = in % 100;
		int outHour = out / 100;
		int outMinute = out % 100;
		
		int inTime = inHour * 60 + inMinute; //들어온시간 변환
		int outTime = outHour * 60 + outMinute;//나간시간 변환
		int time = outTime - inTime; //이용시간
		
		int hour = time / 60;
		int minute = time / 60;
		
		System.out.println(hour);
		System.out.println(minute);
		double minutePrice = unitPrice / 60.0;
		//double minutePrice = unitPrice / 60d;
		System.out.println(minutePrice);
		
		int result =(int) (time * minutePrice);
		result = result / 10 * 10;
		//10원단위 버림 
		System.out.println(result);
		System.out.println(hour + "시간" + minute + "분");
		
	}

}
