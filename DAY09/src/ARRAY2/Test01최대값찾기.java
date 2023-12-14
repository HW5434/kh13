package ARRAY2;

public class Test01최대값찾기 {
	public static void main (String [] arg) {
		
		
		//(Q) 가장 큰 데이터는 어디있어요?
		//(A) [1] 위치
		
		int[] numbers = new int[] {30,50,20,10,60};
								            //[0 , 1 , 2 , 3 , 4]] 
		
		int max = 0;//가장 크다고 생각하는 위치
		for(int i = 1; i <= numbers.length; i ++) {//1부터 마지막 까지 반복하며
		//for(int i = 1; i <= 4; i ++) {//1부터 4까지
			//numbers[max] - 현재 내가 알고 있는 가장 큰 값
			//numbers[i] - 현재 비교할 대상의 값
			if(numbers[max] < numbers[i]) { //numbers는 리모컨 리모컨 끼리 비교 x
				max = i; //위치를 갱신
			}
		}
		System.out.println("max = " + max);
		System.out.println("value = " + numbers[max]);
	}
	
}
