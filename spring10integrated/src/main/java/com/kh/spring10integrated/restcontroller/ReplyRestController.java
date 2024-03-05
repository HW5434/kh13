package com.kh.spring10integrated.restcontroller;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.ModelAttribute;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestParam;
import org.springframework.web.bind.annotation.RestController;

import com.kh.spring10integrated.dao.ReplyDao;
import com.kh.spring10integrated.dto.ReplyDto;

import jakarta.servlet.http.HttpSession;

//@CrossOrigin
@RestController
@RequestMapping("/rest/reply")
public class ReplyRestController {
	
	@Autowired
	private ReplyDao replyDao;
	
	@PostMapping("/list")
	public List<ReplyDto> list(@RequestParam int replyOrigin) {
		return replyDao.selectList(replyOrigin);
	}
	@PostMapping("/delete")
	public void delete(@RequestParam int replyNo) {
		replyDao.delete(replyNo);
	}
	
	@PostMapping("/insert")
	public void insert(@ModelAttribute ReplyDto replyDto, HttpSession session) {
		String loginId = (String)session.getAttribute("loginId");
		int sequence = replyDao.Sequence();
		
		replyDto.setReplyWriter(loginId);
		replyDto.setReplyNo(sequence);
		
		replyDao.insert(replyDto);
	}
	@PostMapping("/edit")
	public void edit(@ModelAttribute ReplyDto replyDto) {
		replyDao.update(replyDto);
	}
}












