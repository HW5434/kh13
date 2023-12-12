package LOOP3;

public class Test03다이어트3 {
public static void main(String[] args) {
	
	int step = 10;
	int total = 0;
		
	//참고 반복 변수는 한개가 아니어도 된다
	for(int day=1, count = 100; day<= 30; day++,count += step) {
		System.out.println(count);
		total += count;
		
		count += step;
	}
			System.out.println("총 개수 = " + total);
	}
}
