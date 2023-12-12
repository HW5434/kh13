package RANDOM;

import java.util.Random;

public class Test02랜덤생성 {
public static void main(String[]arg) {
	//1번
	Random r = new Random();
	
	int lottoNumber = r.nextInt(45) + 1;
		System.out.println(lottoNumber);
		
	//2번
	int tenNumber = r.nextInt(90) + 1;
	if(10 < tenNumber || tenNumber < 100) {
		System.out.println(tenNumber);
}
	//3번
	int otp = r.nextInt(900000) + 100000;
	System.out.println(otp);
	
	//4번
	int coin = r.nextInt(2) + 1;
	if(coin == 1 ) {		
		System.out.println("앞");
	}
	else {
		System.out.println("뒤");
	}
	//5번
	
	int rcp = r.nextInt(3) + 1;
	if(rcp == 1 ) {
		System.out.println("가위");
			
		}
		else if(rcp == 2) {
			System.out.println("바위");
		}
		else {
			System.out.println("보");
			//swich 로 바꿔보기
		}
	}
}
