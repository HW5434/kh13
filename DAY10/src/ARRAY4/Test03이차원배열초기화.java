package ARRAY4;

public class Test03이차원배열초기화 {
	public static void main(String [] arg) {
		
		//배열 생성
		int[][] dataset = new int[5/*줄*/][5/*칸*/];
		
		//데이터 초기화
		// - 위치 기준 or 값 기준
		dataset[0][0] = 1;
		dataset[0][1] = 2;
		dataset[0][2] = 3;
		dataset[0][3] = 4;
		
		//배열 출력
		for(int i = 0; i < dataset.length; i++) {
			for(int k = 0; k < dataset[i].length; k++) {
				System.out.print(dataset[i][k]);
				System.out.print("\t");
			}
			System.out.println();
		}
		
	}
}
