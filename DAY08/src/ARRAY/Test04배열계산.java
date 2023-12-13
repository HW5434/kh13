package ARRAY;

public class Test04배열계산 {
	public static void main (String[] arg) {
		

		
		int[] A = new int[] {90, 67, 75, 88, 52, 59, 90, 92, 61, 72};
		
		for(int i = 0; i < A.length; i++) {
			if(A[i] < 60) {
			System.out.println(A[i]);
		}
	}
		
		int[] B = new int[] {90, 67, 75, 88, 52, 59, 90, 92, 61, 72};
		
		for(int i = 0; i < A.length; i++) {
			if(A[i] >= 90) {
			System.out.println(A[i]);			
			}
		}
		
		int total = 0;
		for(int i = 0; i < A.length; i++) {
			//System.out.println("점수 = " + A[i]);
			total += A[i];
			System.out.println("점수 = " + total);
		}
		
		
		int rank = 1;
		for(int i =0 ; i < A.length; i++) {
		if(A[i] > 80) {
			System.out.println("점수 = " + A[i]);
			rank++;
			}
		}
		System.out.println("80점의 예상 순위 = " + rank);
	}
}
		
		
		
	


