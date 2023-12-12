package LOOP3;

public class Test03다이어트2 {
public static void main(String[] args) {
	
	int count = 100;
	int step = 10;
	int total = 0;
		
	for(int day=1; day<= 30; day++) {
		System.out.println(day + "일차" + count + "개");
		count += step; // count = count + step;
		total += count; // total = total + count;
		

	}
			System.out.println("총 개수 = " + total);
	}
}
