package ARRAY;

public class Test03배열생성 {

	public static void main(String[] args) {
//		다음 정보를 저장할 수 있도록 배열을 만들고 데이터를 출력하세요
//
//		[1] 30, 50, 20, 10, 40
//		[2] 피카츄, 라이츄, 파이리, 꼬부기
//		[3] 177.1f, 182.3f, 160.5f, 157.9f, 180.1f, 163.6f
		
		int[] number = new int[] {30, 50, 20, 10, 40};		
		//for(int i=0; i <5; i++) {
		for(int i=0; i<number.length; i++) {
			System.out.print(number[i] + ", ");
		}
		
		System.out.println();
		//String b = "피카츄";
		String[] pcm = new String[] {"피카츄","라이츄","파이리","꼬부기"};
		
		for(int i=0; i <4; i++) {
			System.out.print(pcm[i] + ", ");
		}
		
		System.out.println();
		float[] f = new float[] {177.1f, 182.3f, 160.5f, 157.9f, 180.1f, 163.6f};
		for(int i = 0; i < f.length; i++) {
			
			System.out.print(f[i] + "F" + ", ");
		}		
	}
}
