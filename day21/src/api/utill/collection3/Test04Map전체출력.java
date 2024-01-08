package api.utill.collection3;

import java.util.Scanner;

public class Test04Map전체출력 {

	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in); 

	/*시작*/System.out.print("이메일 : ");	
	String email = sc.next();
	String regex = "^[a-zA-Z0-9_\\-]{4,19}\\@[a-z]{3,20}\\.(com|co\\.kr|net|org|dev)$";
	
	if(email.matches(regex)) {
		System.out.println("이메일 생성완료!");	
		System.out.println("---------------");
		System.out.println("비밀번호 생성 : ");
			
		}
	else {
		System.out.println("이메일 형식을 확인해주세요");
		System.out.println("EX : qwer1234@samsung.com");
		//질문
		}
	
	String pw = sc.next();
	String regexPw = "^(?=(.*?)[0-9]+)(?=(.*?)[!@#$]+)[A-Za-z0-9!@#$]{8,16}$";
	
	
	if(pw.matches(regexPw)) {
		System.out.println("비밀번호 생성완료!");
		System.out.println("로그인 창으로 이동합니다.");
		System.out.println("---------------");
		}
	else {
		System.out.println("비밀번호 형식을 확인해주세요");
		System.out.println("Ex : 12345678@!");
		//질문
		}
	
		System.out.println("ID : ");
		String loginEmail = sc.next();
		String loginPw = sc.next();
		System.out.println("PW : ");
		
	boolean correct = pw.equals(loginPw) && email.equals(loginEmail);
		if(correct) {
			System.out.println("로그인에 성공했습니다!");
		}
		else {
			System.out.println("입력정보를 다시 확인해주세요.");
	
		}
	}
}
