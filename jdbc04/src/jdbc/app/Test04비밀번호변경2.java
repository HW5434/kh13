package jdbc.app;

import java.util.Scanner;

import jdbc.dao.MemberDao;
import jdbc.dto.MemberDto;

public class Test04비밀번호변경2 {
	public static void main(String[] args) {

		//가장 중요한건 아이디와 바꿀 비밀번호를 알아야 한다
		Scanner sc = new Scanner(System.in);
		
		MemberDto dto = new MemberDto();
		System.out.println("아이디 : ");
		dto.setMemberId(sc.nextLine());
		System.out.println("바꿀 비밀번호 : ");
		dto.setMemberPw(sc.nextLine());
		
		MemberDao dao = new MemberDao();
		boolean result = dao.updateMemberPw(dto);
		
		if(result) {
			System.out.println("비밀번호 변경 완료");
		}
		
		else {
			System.out.println("비밀번호 변경 완료");
		}
		
		//update member set member_pw = ? where member_id = ?
		
	}
}

