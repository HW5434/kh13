package DATA4;

public class Test03논리연산 {

	public static void main(String[] args) {
		//논리 연산
		//-&&(and) , ||(or) 을 이용하여 조합
		
		//ex 19살은 청소년인가요?
		//-청소년은 14살부터 19살까지 입니다,
		
		int age = 5;
		//boolean teen = 14 <= age <= 19;
		boolean teen = 14 <= age && age <= 19;
		System.out.println("청소년인가요?" + teen);
		
		//-무임승차 대상은 65세 이상 또는 8세 미만입니다
		boolean free = age >= 65 || age < 8;
		System.out.println("무임승차 대상인가요?" + free);
	}

}
