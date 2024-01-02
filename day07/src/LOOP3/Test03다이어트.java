package LOOP3;

public class Test03다이어트 {
public static void main(String[] args) {
	
	int totalA = 0;
	
	for(int i = 1; i <= 30; i ++) {
		int number = ((i + 10) * 10) -10;
		totalA += number;
			System.out.println(number);
		
	}
	
			System.out.println();
			System.out.println(totalA);
	}
}
