package jdbc.app;

import java.util.Scanner;

import jdbc.dao.MemberDao;
import jdbc.dto.MemberDto;

public class Test05회원탈퇴2 {
	public static void main(String[] args) {
		//비밀번호 검사 추가
		Scanner sc = new Scanner(System.in);
		
		String MemberId = sc.nextLine();
		String MemberPw = sc.nextLine();	
		sc.close();
		
		MemberDao dao = new MemberDao();
		
		//memberId에 해당하는 회원정보를 불러와서 비밀번호 검사를 수행
		MemberDto find = dao.selectOne(MemberId);
		//boolean isValid = 아이디에 대한 회원정보가 있으면 비밀번호가 일치하는 경우 
		boolean isValid = find != null && find.getMemberPw().equals(MemberPw);
		if(isValid){
			dao.delete(MemberId);
			System.out.println("회원 탈퇴 완료");
			System.out.println("그동안 이용해주셔서 감사합니다");
		}
		else {
			System.out.println("입력하신 정보가 일치하지 않습니다");
		}
		
	}
}
