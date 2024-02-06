package com.kh.spring10integrated.controller;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.ModelAttribute;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestParam;

import com.kh.spring10integrated.dao.EmpDao;
import com.kh.spring10integrated.dao.MemberDao;
import com.kh.spring10integrated.dao.MenuDao;
import com.kh.spring10integrated.dao.PocketmonDao;
import com.kh.spring10integrated.dto.MemberDto;
import com.kh.spring10integrated.vo.StatVO;

//관리자가 이용할 수 있는 기능을 제공하는 컨트롤러
@Controller
@RequestMapping("/admin")
public class AdminController {
	
	//주입
	@Autowired
	private PocketmonDao pocketmonDao;
	@Autowired
	private EmpDao empDao;
	@Autowired
	private MenuDao menuDao;
	@Autowired
	private MemberDao memberDao;
	
	//포켓몬스터 통계
	@RequestMapping("/stat/pocketmon")
	public String statPocketmon(Model model) {
		List<StatVO> list = pocketmonDao.statByType();
		model.addAttribute("list", list);
		return "/WEB-INF/views/admin/stat/pocketmon.jsp";
	}
	
	//사원 통계
	@RequestMapping("/stat/emp")
	public String statEmp(Model model) {
		List<StatVO> list = empDao.statByDept();
		model.addAttribute("list", list);
		return "/WEB-INF/views/admin/stat/emp.jsp";
	}
	
	//메뉴 통계
	@RequestMapping("/stat/menu")
	public String statMenu(Model model) {
		List<StatVO> list = menuDao.statByType();
		model.addAttribute("list", list);
		return "/WEB-INF/views/admin/stat/menu.jsp";
	}
	//회원 통계
	@RequestMapping("/stat/member")
	public String statMember(Model model) {
//		List<StatVO> list = memberDao.statByLevel();
//		model.addAttribute("list", list);
		return "/WEB-INF/views/admin/stat/member.jsp";
	}
	
	
	
	//회원 관리 페이지 (한줄씩 코드 비교하기)
	@RequestMapping("/member/search")
	public String memberSearch(@RequestParam(required = false) String column, 
								@RequestParam(required = false) String keyword, 
								Model model) { // 화면을 만들어야 되니까 모델 필수
		boolean isSearch = column != null && keyword != null;
		if(isSearch) {
			//지정한 항목에서만 검색이 가능하도록 구현
			switch(column) {
			//case "member_id,","memeber_nick","member_contact","member_email","member_birth"
			case "member_id":
			case "member_nick":
			case "member_contact":
			case "member_email":
			case "member_birth":
			List<MemberDto> list = memberDao.selectList(column , keyword);
			model.addAttribute("list", list);
			}
		}
		return "/WEB-INF/views/admin/member/search.jsp";
	}
	
	@RequestMapping("/member/detail")
	public String memberDetail(@RequestParam String memberId, Model model) {
		MemberDto memberDto = memberDao.selectOne(memberId);
		model.addAttribute("memberDto", memberDto);
		return "/WEB-INF/views/admin/member/detail.jsp";
	}
	
	@GetMapping("/member/delete")
	public String memberDelete(@RequestParam String memberId) {
		memberDao.delete(memberId);
		//return "redirect/admin/member/search";
		return "redirect:search";
	} 
	
	
	@GetMapping("/member/edit")
	public String edit(@RequestParam String memberId, Model model) {
		MemberDto memberDto = memberDao.selectOne(memberId);
		model.addAttribute("memberDto", memberDto);
		return "/WEB-INF/views/admin/member/edit.jsp";
	}
	
	@PostMapping("/member/edit")
	public String memberEdit(@ModelAttribute MemberDto memberDto) {
		memberDao.updateMemberByAdmin(memberDto);
		//return "redirect:/admin/member/detail?memberId="+memberDto.getMemberId();
		return "redirect:detail?memberId="+memberDto.getMemberId();
	}
	
	
}
