package ARRAY4;

public class Test03이차원배열초기화4 {
	public static void main(String [] arg) {
	
		int[][] dataset = new int[5][5];
				
				
		int x = 0 , y = 0;
		for(int i = 1; i <= 25; i++) {
			dataset[x][y] = i;					
			y++;
			if( y == 5 ) {
				y = 0;
				x++;
			}
		}		
		// [1] [3] 을 뒤집어 주면 되는데
		for(int i = 0; i < dataset.length; i++) {
			for(int k = 0; k < dataset[i].length; k++) {

				System.out.print(dataset[i][k]);
				System.out.print("\t");
			}
				System.out.println();
		}				
	}
}