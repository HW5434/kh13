package ARRAY4;

public class Test02이차원배열생성풀이2 {

	public static void main(String[] arg) {
		
//		다음 데이터가 있을 때 이를 저장하고 출력하세요
//
//		1반 : 180.3 , 165.2 , 177.9 , 158.2
//		2반 : 168.5 , 155.3 , 172.1 , 169.7
//		3반 : 158.5 , 170.2 , 182.5 , 175.8
//
//		출력은 세로로 먼저 하시고, 표처럼 배치되어 출력되도록 변경해보세요
		
//		double[] class1 = new double [] {180.3, 165,2, 177.9, 158.2};
//		double[] class2 = new double [] {168.5, 155.3, 172.1, 169.7};
//		double[] class3 = new double [] {158.5, 170.2, 182.5, 175.8};
		
		//2차원은 엑셀이랑 유사함
		
		double[][] scores = new double[][] {
			{180.3, 165.2, 177.9, 158.2},
			{168.5, 155.3, 172.1, 169.7},
			{158.5, 170.2, 182.5, 175.8}
		};
		
		for(int i = 0; i <= 2; i++) {
			for(int k = 0; k <= 3; k++) {
				System.out.println(scores[i][k]);
			}				
		}
	}
}


