package jdbc.app;

import jdbc.dao.MemberDao;
import jdbc.dto.MemberDto;

public class Test04비밀번호변경 {
	public static void main(String[] args) {

		//가장 중요한건 아이디와 바꿀 비밀번호를 알아야 한다
		MemberDto dto = new MemberDto();
		dto.setMemberId("student1");
		dto.setMemberPw("Student1@");
		
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

