package DATA;

public class Test02분식집 {
	public static void main(String[] args) {
		//[1] 내가 다 계산하고 결과만 출력
		//System.out.println(18000);
		
		//[2] 컴퓨터에게 식으로 계산을 시켜 결과를 출력
		//System.out.println(1400 + 4000);
		//System.out.println((3500*4)+(2000*2));

		//[3]각각의 합계와 총 금액을 출력
		//System.out.println(3500*4);
		//System.out.println(2000*2);
		//System.out.println((3500*4)+(2000*2));
		
		//[4]계산 결과를 "변수"에 저장한 뒤 출력
		//int a = 3500 * 4;
		//int b = 2000 * 2;
		//System.out.println(a);
		//System.out.println(b);
		//System.out.println(a + b);
		
		//[5] 모든 수치를 변수로 관리하여 계산 및 출력(최종)
		int ddeokboki = 3500;
		int fried = 2000;
		int ddeokbokiCount = 4;
		int friedCount = 2;
		///문제부
		int ddeobokiTotal = ddeokboki * ddeokbokiCount;
		int friedTotal = fried * friedCount;
		int total = ddeobokiTotal + friedTotal;
		///계산부
		System.out.println(ddeobokiTotal);
		System.out.println(friedTotal);
		System.out.println(total);
		///출력부
	}	
}
