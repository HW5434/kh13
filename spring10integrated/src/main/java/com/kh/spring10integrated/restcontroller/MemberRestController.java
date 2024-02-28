package com.kh.spring10integrated.restcontroller;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestParam;
import org.springframework.web.bind.annotation.RestController;

import com.kh.spring10integrated.dao.MemberDao;
import com.kh.spring10integrated.dto.MemberDto;

@RestController
@RequestMapping("/rest/member")
public class MemberRestController {
	
	@Autowired
	private MemberDao memberDao;
	
	@RequestMapping("/checkId")
	public String checkId(@RequestParam String memberId) {
		MemberDto memberDto = memberDao.selectOne(memberId);
		
		if(memberDto == null) {
			return "NNNNY"; //사용 가능한 경우 (DB에 없는 경우)
		}
		else {
			return "NNNNN"; //사용 불가능한 경우(DB에 있는 경우)			
		}
	}
	
	@PostMapping("/checkMemberNick")
	public boolean checkMemberNick(@RequestParam String memberNick) {
		MemberDto memberDto = memberDao.selectOneBytNick(memberNick);
		return memberDto == null;
	}
	
}