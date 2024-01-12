package jdbc.app;

import java.util.Scanner;

import jdbc.dao.MemberDao;
import jdbc.dto.MemberDto;

public class Test04비밀번호변경4 {
	public static void main(String[] args) {

		//가장 중요한건 아이디와 바꿀 비밀번호를 알아야 한다
		Scanner sc = new Scanner(System.in);
		
		MemberDto dto = new MemberDto();
		System.out.println("아이디 : ");
		dto.setMemberId(sc.nextLine());
		System.out.println("현재 비밀번호 : ");
		String currentPw = sc.nextLine();
		System.out.println("바꿀 비밀번호 : ");
		dto.setMemberPw(sc.nextLine());
		
		sc.close();
		
		//현재 비밀번호 판정 추가
		
		MemberDao dao = new MemberDao();
		MemberDto find = dao.selectOne(dto.getMemberId());
		
		if(find != null && find.getMemberPw().equals(currentPw)) {
			//업데이트
			dao.updateMemberPw(dto);
			System.out.println("비밀번호 변경 완료");
		}
		else {
			System.out.println("정보가 일치하지 않습니다");
			}
		}
	}

