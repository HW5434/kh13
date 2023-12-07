package DATA2;

public class Test06페이지네비게이터 {
	public static void main(String[] args) {
		
		/* [이전] 1 2 3 4 5 6 7 8 9 10 [다음]
		페이지 네비게이터는 다음과 같은 계산 규칙을 가지고 있습니다.
		현재 내가 몇 페이지에 있느냐에 따라 첫 번호와 마지막 번호가 결정된다
		1페이지부터 10페이지 사이에서는 첫 번호는 1이다
		1페이지부터 10페이지 사이에서는 마지막 번호는 10이다
		11페이지부터 20페이지 사이에서는 첫 번호는 11이다.
		11페이지부터 20페이지 사이에서는 마지막 번호는 20이다
		
		이후에도 계속 페이지가 증가하면 그에 맞는 첫번호와 마지막번호가 계산되어야 한다.
		275페이지에 위치할 때 첫 번호와 마지막 번호를 출력하세요*/

//풀이 구해야 되는 값 출력되야할 275페이지 먼저 등록해놓고 첫번호는 나중에 뒷순이로 밀기 
// 첫번호는 1이다 1 ~ 10 까지 1이 들어가면 1과 10이되고 10이 들어가도 1과10이 되야함 11이 들어가면 11과 20이 되야하고

		
		// 선생님 계산
		//int begin = (page-1) / 10 * 10 + 1
		//int end = (page-1) / 10 * 10 + 10;
		//int end = begin + *9
		
		//계산
		//int begin = (page-1) / 10 * 10 + 1;
		//int end = (page-1) / 10 * 10 + 10;
		//int end = begin + (size - 1);
		
		
		int page = 200;
		int size = 10;
		
		int firstNumber = (page -1) / size; // 보여줄 번호 개수    //* +
		int first = firstNumber * size + 1;// + 시작페이지 //서윤씨 방법

//		int base2 = (page-1); //* -
//		int lastNumber = (base1 % 10); // 보여줄 번호 개수
//		int last = (base2 - lastNumber) + 10;// + 끝 페이지

		
		System.out.println(first); //첫 번호
//		System.out.println(last); //마지막 번호
//		System.out.println(page + "페이지에 위치할 첫 번호는 " + first + "이고 마지막 번호는 " + last + "이다");
		
	}
}

