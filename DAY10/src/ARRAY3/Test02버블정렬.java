package ARRAY3;

public class Test02버블정렬 {
	public static void main(String[] arg) {
		
		int nums [] = new int [] {6,9,8,7,5};
		
		//시작
		//1사이클 [4번]
		if(nums[0] > nums[1]) {
			int temp = nums[0];
			nums[0] = nums[1];
			nums[1] = temp;
		}		
		if(nums[1] > nums[2]) { 
			int temp = nums[1];
			nums[1] = nums[2];
			nums[2] = temp;			
		}		
		if(nums[2] > nums[3]) {
			int temp = nums[2];
			nums[2] = nums[3];
			nums[3] = temp;	
		}
		if(nums[3] > nums[4]) {
			int temp = nums[3];
			nums[3] = nums[4];
			nums[4] = temp;	
		}
		
		//2사이클 [3번]
		if(nums[0] > nums[1]) {
			int temp = nums[0];
			nums[0] = nums[1];
			nums[1] = temp;
		}		
		if(nums[1] > nums[2]) { 
			int temp = nums[1];
			nums[1] = nums[2];
			nums[2] = temp;			
		}		
		if(nums[2] > nums[3]) {
			int temp = nums[2];
			nums[2] = nums[3];
			nums[3] = temp;	
		}						
		//3사이클 [2번]
		if(nums[0] > nums[1]) {
			int temp = nums[0];
			nums[0] = nums[1];
			nums[1] = temp;
		}		
		if(nums[1] > nums[2]) { 
			int temp = nums[1];
			nums[1] = nums[2];
			nums[2] = temp;			
		}		
		//4사이클 [1번]
		if(nums[0] > nums[1]) {
			int temp = nums[0];
			nums[0] = nums[1];
			nums[1] = temp;
		}										

		for(int i = 0; i < nums.length; i++) {
			System.out.print(nums[i] + " ");
		}	
	}
}


