package LOOP;

public class Test07풀이박수2번 {

	public static void main(String[] args) {
		
		for(int i = 1; i <= 99; i++) {
			int ten = i / 10;
			int one = i % 10;
			
			boolean ten369 = ten ==3 || ten == 6 || ten == 9;
			boolean one369 = one == 3 || one == 6 || one == 9;
			boolean has3 = ten == 3 || one == 3;
			boolean has6 = ten == 6 || one == 6;
			
			boolean has9 = ten == 9 || one == 9;
			boolean has369 = has3 || has6 || has9;
			
			//출력
			if(ten369 && one369) {
				System.out.println("짝짝");
			}
			if(has369) {
				System.out.println("짝");	
			}
			else { // 박수x
				System.out.println(i);
			}

		}
	}
}
