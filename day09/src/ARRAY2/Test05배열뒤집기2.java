package ARRAY2;

public class Test05배열뒤집기2 {

	public static void main(String[] args) {

		//배열 준비
		int[] numbers2 = new int[] {30,50,20,10,40};
		
		/*
		
		위치 교체
		-데이터의 개수에 따른 교체 규칙을 살펴보자!

		데이터 1개		교체0번			{30}
		데이터 2개		교체1번		    {30,50}
												numbers[0] -> numbers[1]
		데이터 3개 		교체1번		    {30,50,20}
		데이터 4개 		교체2번			{30,50,20,10}
		데이터 5개 		교체2번			{30,50,20,10,40}
		
		데이터 n개     교체 n/2번	     numbers[0] -> numbers[n-1]
												 numbers[1] -> numbers[n-2]	
		 */
		
		int left = 0;
		int right = numbers2.length-1;
		for(int i=1; i <= numbers2.length/2; i++) {
			//left위치와 right위치를 바꾸면된다
			int backup = numbers2[left];
			numbers2[left] = numbers2[right];
			numbers2[right] = backup;
			
			//다음 턴을 위해서 left는 1증가 right는 1감소처리
			left++;
			right--;
		}
		
		//출력
		for(int i = 0;  i < numbers2.length; i--) {
			
			System.out.println(numbers2[i]);		
			
			//System.out.println(1/2);
		}
	}
}
