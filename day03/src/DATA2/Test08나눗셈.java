package DATA2;

public class Test08나눗셈 {

	public static void main(String[] args) {
		int number = 75;
		
		//위 숫자의 10의자리, 1의자리 숫자를 각각 출력
		System.out.println(number / 10);
		System.out.println(number % 10);
		
		
		//숫자의 100의자리, 10의자리 , 1의자리를 각각 출력
		int number2 = 139;
		
		System.out.println(number2 / 100);
		int number02 = number2 % 100;
		System.out.println(number02 / 10);
		//System.out.println(number2 / 10 % 10);
		System.out.println(number02 % 10);
		
		
	}

}
