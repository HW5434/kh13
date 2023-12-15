package ARRAY3;

public class Test02버블정렬선생님풀이4 {
	public static void main(String[] arg) {
		
		
		//시작
		int nums [] = new int [] {50,30,20,10,40};
		
		//버블정렬(buble sort) - 인접한 두 개의 값을 비교하여 교체하는 방식
		
		// 1회차 : [0]vs[1] , [1]vs[2] , [2]vs[3] , [3]vs[4] 총 4번
		// 2회차 : [0]vs[1] , [1]vs[2] , [2]vs[3] 총 3번
		// 3회차 : [0]vs[1] , [1]vs[2]  총 2번
		// 4회차 : [0]vs[1] 총 1번
		
		for(int k = 4; k >= 1; k--) {		
		//1 회차 - 1부터 4까지 증가시키며 i와 i-1을 비교
		for(int i = 1; i <= k; i++) {
			
			if(nums[i-1] > nums[i]) {
				int backup = nums[i-1];
				nums[i-1] = nums[i];
				nums[i] = backup;// 조건부 코드
		}
	}
		//2 회차 - 1부터 3까지 증가시키며 i와 i-1을 비교
		for(int i = 1; i <= 3; i++) {
					
			if(nums[i-1] > nums[i]) {
				int backup = nums[i-1];
				nums[i-1] = nums[i];
				nums[i] = backup;// 조건부 코드
				System.out.println(k);
		}
	}
}
		//출력
		for(int i = 0; i < nums.length; i++) {
			System.out.print(nums[i] + " ");
		}	
	}
}


