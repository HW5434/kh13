package ARRAY3;

public class Test02버블정렬선생님풀이2 {
	public static void main(String[] arg) {
		
		
		//시작
		int nums [] = new int [] {50,30,20,10,40};
		
		//버블정렬(buble sort) - 인접한 두 개의 값을 비교하여 교체하는 방식
		if(nums[0] > nums[1]) {
			int backup = nums[0];
			nums[0] = nums[1];
			nums[1] = backup;// 조건부 코드
		}
		
		if(nums[1] > nums[2]) {
			int backup = nums[1];
			nums[1] = nums[2];
			nums[2] = backup;
		}
		
		if(nums[2] > nums[3]) {
			int backup = nums[2];
			nums[2] = nums[3];
			nums[3] = backup;
		}
		
		if(nums[3] > nums[4]) {
			int backup = nums[3];
			nums[3] = nums[4];
			nums[4] = backup;
		}
		//출력
		for(int i = 0; i < nums.length; i++) {
			System.out.print(nums[i] + " ");
		}	
	}
}


