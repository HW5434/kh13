// 정수기(Purifier)를 종류별로 구현하려고 한다.
//정수기에는 업체(company)과 가격(price)을 설정할 수 있다.
//가격은 0 이상으로만 설정이 가능하다.
//얼음 정수기(IcePurifier)에는 다음 기능이 존재한다.
//normal 기능을 사용하면 정수 1잔을 따라준다.
//cold 기능을 사용하면 냉수 1잔을 따라준다.
//ice 기능을 사용하면 얼음이 나온다.
//온수 정수기(HotPurifier)에는 다음 기능이 존재한다.
//normal 기능을 사용하면 정수 1잔을 따라준다.
//hot 기능을 사용하면 온수 1잔을 따라준다.
//복합 정수기(MultiPurifier)에는 다음 기능이 존재한다.
//normal 기능을 사용하면 정수 1잔을 따라준다.
//cold 기능을 사용하면 냉수 1잔을 따라준다.
//hot 기능을 사용하면 온수 1잔을 따라준다.

//객체 생성
//업체 : 코웨이, 가격 : 50만원 , 종류 : 얼음 정수기
//업체 : SK매직, 가격 : 65만원 , 종류 : 복합 정수기
//업체 : 쿠쿠, 가격 : 45만원, 종류 : 온수 정수기 

package oop.inherit5;

public class Test01상속문제 {
	public static void main(String [] args) {	
//		purifier p = new purifier("123",5000);
	
		 Icepurifier p1 = new  Icepurifier("코웨이",5000);
	  	p1.normal();
		 p1.cold();
		 p1.ice();
	
	Hotpurifier p2 = new  Hotpurifier("코웨이",4000);
			p2.normal();
			 p2.hot();
			 

	Multipurifier p3 = new  Multipurifier("코웨이",5000);
		p3.normal();
		 p3.cold();
		 p3.hot();
	}
}
	
