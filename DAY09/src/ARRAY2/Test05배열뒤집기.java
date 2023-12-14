package ARRAY2;

public class Test05배열뒤집기 {

	public static void main(String[] args) {

		//배열 준비
		int[] numbers2 = new int[] {30,50,20,10,40};
		
		//위치 교체
		//1. numbers[0]과 numbers[4]를 바꾼다
		//2. numbers[1]과 numbers[3]을 바꾼다
		
		int backup = numbers2[0];
		numbers2[0] = numbers2[4];
		numbers2[4] = backup;
		
		int backup2 = numbers2[1];
		numbers2[1] = numbers2[3];
		numbers2[3] = backup2;
		
		//출력
		for(int i = 0;  i < numbers2.length; i--) {
			
			System.out.println(numbers2[i]);		
			
			//System.out.println(1/2);
		}
	}
}
