package jdbc.dao;

import java.util.List;

import org.springframework.jdbc.core.JdbcTemplate;

import jdbc.dto.MemberDto;
import jdbc.mapper.MemberMapper;
import jdbc.util.JdbcHelper;

//member 테이블 데이터 처리를 담당하는 클래스
public class MemberDao {
//메소드에서 공용으로 사용하는 도구들을 생성
	private JdbcTemplate jdbcTemplate = JdbcHelper.getJdbcTemplate();
	private MemberMapper mapper = new MemberMapper();
	
	//가입(등록 , Create)
	public void insert(MemberDto dto) {
		String sql = "insert into member("
				+ "member_id, member_pw, member_nick, "
				+ "member_birth, member_contact, member_email, "
				+ "member_post, member_address1, member_address2"
				+ ") values(?, ?, ?, ?, ?, ?, ?, ?, ?)";
				Object[] data = {
						dto.getMemberId(), dto.getMemberPw(),
						dto.getMemberNick(), dto.getMemberBirth(),
						dto.getMemberContact(),
						dto.getMemberEmail(), dto.getMemberPost(),
						dto.getMemberAddress1(), dto.getMemberAddress2()
				};
				jdbcTemplate.update(sql, data);
	}
	
	//목록(조회 , Read)
	public List<MemberDto> selectList(){
		String sql = "select * from member order by member_id asc";
		return jdbcTemplate.query(sql, mapper);
	}

	//상세(조회 , )
	public MemberDto selectOne(String MemberId) {
		String sql = "select * from member where member_id = ?";
		Object[] data = {MemberId};
		List<MemberDto> list = jdbcTemplate.query(sql, mapper, data);
//		return list.isEmpty() ? null : list.get(0);
		if(list.isEmpty()) {
				return null;
			}
			else {
				return list.get(0);
			}
		}

	//비밀번호 변경(수정, Update)
	public boolean updateMemberPw(MemberDto dto) {
		String sql = "update member set member_pw=? where member_id=?";
		Object[] data = {dto.getMemberPw(), dto.getMemberId()};
		return jdbcTemplate.update(sql, data) > 0;
	}
}
