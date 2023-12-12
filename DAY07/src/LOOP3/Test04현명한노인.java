package LOOP3;

public class Test04현명한노인 {
public static void main(String [] args) {
	
//	고대 그리스에는 현명한 노인이 살고 있습니다.
//	소문을 들은 왕이 노인에게 가서 이렇게 말했습니다.
//
//	"가지고 싶은게 있으면 무엇이든 줄터이니 한 번 말해봐라"
//
//	노인이 고민하더니 다음과 같이 말했습니다.
//
//	"저는 욕심이 없습니다. 
//	30일동안 처음에는 1골드만 주시고 그다음 날부터는 전날의 두 배를 주십시오"
//
//	이 노인이 일자별로 받게되는 골드를 구하여 출력
//	이 노인이 받게되는 총 골드를 구하여 출력
//	30일이 아니라 40일이었다면 얼마를 받는지 구하여 출력
	
	// 기간 : 첫날 1골드 30일 그 다음부터 전날의 두배
	
	long money = 1;
	long total = 0;
	
	for(int day=1 ; day <= 40; day++) {
		System.out.println(day + "일차" + money + "골드"); // 1일부터 
		total += money; // total = total + money
		money *= 2; // money = money * 2
	}

System.out.println(total); // 1일부터 
}	
}


