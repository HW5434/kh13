package ARRAY3;

public class Test02연습 {
	public static void main(String[] arg) {
		
		
		//배열  ++ 방식일떄는 ?
		
		
		int nums[] = new int [] {30,20,10,50,40};
		
		if(nums[0] > nums[1]) {
			int temp = nums[0];
				nums[0] = nums[1];
				nums[1] = temp;
	
		}

	for(int i = 0; i < nums.length; i ++) {
		System.out.print(nums[i] + " ");
		}
	}
}
	



