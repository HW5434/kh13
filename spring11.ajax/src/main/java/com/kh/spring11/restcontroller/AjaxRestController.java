package com.kh.spring11.restcontroller;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.CrossOrigin;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestParam;
import org.springframework.web.bind.annotation.RestController;

import com.kh.spring11.dao.MemberDao;
import com.kh.spring11.dto.MemberDto;

@CrossOrigin
@RestController
public class AjaxRestController {

	@Autowired
	private MemberDao memberDao;
	
	@RequestMapping("/hello")
	public String hello() {
		return "Hello Ajax!";
	}
	
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
}
