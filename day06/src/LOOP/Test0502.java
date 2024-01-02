package LOOP;

public class Test0502 {

	public static void main(String[] args) {

		//필요한것 홀수 [1 ~ 20] 짝수 만들기 3의배수 [1 ~50]
		//i % 2 != 0 i가 2로나눈 나머지가 0이 아닐때
		for(int i = 1; i <= 19; i = i +1) {
			if(i % 2 == 1) {
			System.out.println(i);
			
			//1부터 20까지 홀수 출력
			//1부터 19까지 2씩 증가
			}
		}
			System.out.println("----");
			
		for(int i = 1; i <= 50; i = i +1) { // 1부터 50까지 1씩증가
			if(i % 2 == 0) { // 조건 (1 / 2의 나머지는 0과 같다)
			System.out.println(i);
			}
		}
		
//		System.out.println("----");
//		for(int i =3; i <= 48; i = i + 3) {
//			System.out.println(i);
			
			//1부터 50까지 3의 배수 출력
			//-3,6,9  ..... 48
			//-3부터 48까지 3씩 증가
		}
	}

