package api.lang.exception;

import java.util.InputMismatchException;
import java.util.Scanner;

public class Test03통합예외처리 {
	public static void main(String[] args) {
		
		//문제 : 예외를 다 해결했는지도 모르겠고... catch가 너무 많다!
		//해결 : 올인원 캐치 만들기
		//결론 : 앞으로 모든 catch 블록은 Exception으로 만든다.끝!
		
		//Direct Known Subclasses: api에서 확인 잘하기
		
		try {//Plan A
			Scanner sc = new Scanner(System.in);
			System.out.print("귤 개수 : ");
			int mandarin = sc.nextInt(); //예외 발생 예상위치
			System.out.print("인원 수 : ");
			int people = sc.nextInt(); //예외 발생 예상위치

			int dist = mandarin / people; //예외 발생 예상위치
			int rest = mandarin % people; 
			
			System.out.println("한 사람당 " + dist + "개 씩 줄 수 있습니다");
			System.out.println("다 주면 " + rest + "개 남네요");
		}
		
		catch(Exception e) {//Plan B - 잘못된 입력
		    //Throwble e Error 까지 처리됨
			// Exception
			System.err.println("프로그램 오류 발생");
		}
		
	}
}
