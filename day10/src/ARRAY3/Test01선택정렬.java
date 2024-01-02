package ARRAY3;

public class Test01선택정렬 {
	public static void main(String[] arg) {
		
		int nums [] = new int [] {30,50,20,10,40};
		
		//선택 정렬(selection sort) - 최소값을 앞에서부터 채우는 방식
		
		//첫 번째 회차에서 발생하는 일
		// - [0]부터 [4]사이에서 최소값의 위치를 찾아 [0]과 바꾼다
 		
		
		for(int i  = 0; i < nums.length; i++) {
			
		if(nums[0] > nums[i]) {
			int temp = nums[0];
			nums[0] = nums[i];
			nums[i] = temp;			
		}
		if(nums[1] > nums[i]) {
			int temp = nums[1];
			nums[1] = nums[i];
			nums[i] = temp;		
	}
}
		for(int i = 0; i < nums.length; i++) {
		System.out.print(nums[i] + " ");		
		}
	}	
}
