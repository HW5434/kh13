package CONDITION3;

public class Test01스위치구문 {

	public static void main(String[] args) {
		//월을 입력받아 계절을 출력하는 프로그램
		
		//입력
		int month = 7;
		
		//출력 - break를 의도적으로 배치하여 여러 경우를 묶어서 처리
		switch(month) {//month에 있는 값에 따라 시작 지점이 달라진다
		case 3,4,5:
			System.out.println("봄");
			break; //그만하고 탈출
		case 6: case 7: case 8:
			System.out.println("여름");
			break; //그만하고 탈출
		case 9: case 10: case 11:
			System.out.println("가을");
			break; //그만하고 탈출
		//case 9: case 10: case 11:
			default: //나머지 (기본값)
			System.out.println("겨울");
			break;
		}

	}
}
