package com.kh.spring19.restcontroller;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.CrossOrigin;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

import com.kh.spring19.dao.MemberDao;
import com.kh.spring19.dto.MemberDto;
import com.kh.spring19.service.JwtService;
import com.kh.spring19.vo.MemberLoginVO;

@CrossOrigin
@RestController
@RequestMapping("/member")
public class MemberRestController {
	
	@Autowired
	private JwtService jwtService;
	
	@Autowired
	private MemberDao memberDao;
	
	
	//MemberDto를 넣으면 혼자가는데 45인승 버스타는 느낌
	@PostMapping("/login")
	public ResponseEntity<MemberLoginVO> login(@RequestBody MemberDto memberDto) {
		MemberDto findDto = memberDao.selectOne(memberDto.getMemberId());
		if(findDto == null) { //
			return ResponseEntity.notFound().build(); //404
		}
		
		//아이디로 찾아서 비밀번호비교
		boolean isValid = findDto.getMemberPw().equals(memberDto.getMemberPw()); 
		
		if(isValid) { //성공
			String token = jwtService.create(findDto);
			
			return ResponseEntity.ok().body(MemberLoginVO.builder()
						.memberId(findDto.getMemberId())//회원아이디
						.memberLevel(findDto.getMemberLevel())//회원등급
						.token(token) //JWT 토큰
					.build()); //200
		}
		else { //실패
			return ResponseEntity.status(401).build(); //401
		}
	}
	
	
}
