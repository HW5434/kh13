package ARRAY3;

public class Test01선택정렬선생님풀이2 {
	public static void main(String[] arg) {
		
		int nums [] = new int [] {30,50,20,10,40};
		
		//선택 정렬(selection sort) - 최소값을 앞에서부터 채우는 방식
		
		//첫 번째 회차에서 발생하는 일
		// - [0]부터 [4]사이에서 최소값의 위치를 찾아 [0]과 바꾼다
 		
		//두 번쨰 회차에서 발생하는 일
		// - [2]부터 [4] 사이에서 최소값의 위치를 찾아 [1]과 바꾼다
		
		int min = 2;//[1]이 가장 작은값의 위치라고 치자
		for(int i  = 3; i < nums.length; i++) {//[3]부터 [4]사이의 범위에서
			if(nums[min] > nums[i]) { // 내 생각보다 더 작은 값
				min = i; //생각을 수정한다
		}
}
		int backup = nums[2];
			nums[2] = nums[min];
			nums[min] = backup;
			
		for(int i = 0; i < nums.length; i++) {
			System.out.print(nums[i] + " ");		
		}
	}	
}
