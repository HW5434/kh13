package DATA;

public class Test05편의점 {

	public static void main(String[] args) {
		int 삼각김밥가격 = 1200;		
		int 삼각김밥Count = 7;
		int 삼각김밥가격Total =( 삼각김밥가격 * 삼각김밥Count);
		int 원플원 = (삼각김밥Count / 2);
		int 투플원 = (삼각김밥Count / 3);
		
		System.out.println(원플원);
		System.out.println(투플원);
		System.out.println(삼각김밥가격Total);
		
		
		//풀이
		
		//개수  1 2 3 4
		//유료  1 1 2 2 묶여있는 수 /를 하는 기준
		//무료  0 1 1 2
		
		//입력 - 김밥가격, 개수
		int price = 1200;
		int count = 7;
		
		//계산 - 무료든 유료든 한 쪽 개수
		int free = count / 2;
		//System.out.println(free); 
		//무료개수 : 개수 / 2
		int pay = count - free;
	    //개수 - 무료개수
		//System.out.println(pay);
		int total = pay * price;
		//System.out.println(total);
		
		
		//출력
		System.out.println(free); 
		System.out.println(pay);
		System.out.println(total);

	}

}
