package ARRAY3;

public class Test01선택정렬선생님풀이3 {
	public static void main(String[] arg) {
		
		int nums [] = new int [] {30,50,20,10,40,80,60,70};
		
		//선택 정렬(selection sort) - 최소값을 앞에서부터 채우는 방식
		for(int k = 0; k < nums.length-1; k++) {
			int min = k;
			for(int i  = k+1; i < nums.length; i++) { //마지막까지
				if(nums[min] > nums[i]) { 
					min = i; 
				}
			}
			int backup = nums[k];
			nums[k] = nums[min];
			nums[min] = backup;
		}
		for(int i = 0; i < nums.length; i++) {
			System.out.print(nums[i] + " ");		
		}
	}	
}
