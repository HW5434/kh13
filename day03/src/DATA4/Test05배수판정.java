package DATA4;

public class Test05배수판정 {

	public static void main(String[] args) {

		//b를a로 나눈 나머지가 0인 경우를 b는 a의 배수라 부른다 
		
		int number = 135;
		
		boolean even = number % 2 == 0;
		//2를 나누었을때 나머지가 0이냐? 라는 뜻
		System.out.println("짝수? " + even);
		//짝수가 아니다 라고 했을때 홀수라고 정정해 줄수있는 명령 찾아보기
		
		
		//boolean odd = number % 2 == 1;
		boolean odd = number % 2 != 0;
		System.out.println("홀수? " + odd);
		System.out.println("홀수? " + !even);//부정연산 
	}

}
