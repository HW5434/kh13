package LOOP2;

public class Test02나눗셈 {
public static void main(String[] args) {
	
	//어떤 숫자가 입력되었을 떄 이 숫자가 나누어 떨어지는 숫자인지 
	// 5가 입력될경우 5를 1,2,3,4,5로 나누어 떨어지는지 확인
	
	int number = 5;	
	int count = 0;
	
	for(int i = 1; i <= number; i++) {
		if(number % i == 0) {
		count++;
		System.out.print(i + ", ");
	}		
}
	
		System.out.println();
		System.out.println(count + "개");
		
		if (count == 2) {
		System.out.println("이 숫자는 소수입니다.");
		}
		else {
		System.out.println("이 숫자는 소수가 아닙니다");
		}
		
	}
}
