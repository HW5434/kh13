package com.kh.spring11.restcontroller;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.CrossOrigin;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestParam;
import org.springframework.web.bind.annotation.RestController;

import com.kh.spring11.dao.MemberDao;
import com.kh.spring11.dao.PocketmonDao;
import com.kh.spring11.dto.MemberDto;
import com.kh.spring11.dto.PocketmonDto;

@CrossOrigin
@RestController
public class AjaxRestController {

	@Autowired
	private MemberDao memberDao;
	@Autowired
	private PocketmonDao pocketmonDao;
	
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
		
		@PostMapping("/checkPocketmonNo")
		public String checkPocketmonNo(@RequestParam int pocketmonNo) {
			PocketmonDto pocketmonDto = pocketmonDao.selectOne(pocketmonNo);
			
			if(pocketmonDto == null) {
				return "YES"; // 사용가능
			}
			else {
				return "NO"; // 사용불가
			}
		}

		
	
}
