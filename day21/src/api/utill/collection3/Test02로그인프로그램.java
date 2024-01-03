package api.utill.collection3;

import java.util.HashMap;
import java.util.Map;
import java.util.Scanner;

public class Test02로그인프로그램 {
	public static void main(String[] args) {
		Map<String , String> peoples = new HashMap<>();
		Map<String , String> login = new HashMap<>();
		
		Scanner sc = new Scanner(System.in);
		
		peoples.put("khadmin" , "admin1234");
		peoples.put("khstudent" , "student1234");
		peoples.put("khteacher" , "teacher1234");
		peoples.put("khmanager" , "manager1234");
		
		//입력
		login.put(sc.nextLine(), sc.nextLine());
		//검사
		//아이디는 존재하고 아이디에 해당하는 비밀번호가 일치해야된다.
		if(peoples.equals(login)) {
			System.out.println("로그인 성공");
		}
		else {
			System.out.println("입력하신 정보가 일치하지 않습니다");
		}
	}
}
