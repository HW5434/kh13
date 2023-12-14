package ARRAY2;

public class Test01최대값찾기2 {
	public static void main (String [] arg) {
		
		//배열 준비
				//data ---->	[ 0.0 ][ 0.0 ][ 0.0 ][ 0.0 ][ 0.0 ]
				double[] data = new double[5];

				data[0] = 1.2;
				data[1] = 2.3;
				data[2] = 3.4;
				data[3] = 4.5;
				data[4] = 5.6;

				double total = data[0] + data[1] + data[2] + data[3] + data[4];
				double avg = total / 5;
				System.out.println("평균 = " + avg);
	
	}
}
