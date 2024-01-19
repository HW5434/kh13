package com.kh.spring10integrated.controller;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.ModelAttribute;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestMapping;

import com.kh.spring10integrated.dao.MenuDao;
import com.kh.spring10integrated.dto.MenuDto;

@Controller
@RequestMapping("/menu")
public class MenuController {

	@Autowired
	private MenuDao dao;
	
	@GetMapping("/insert")
	public String insert() {
		return "/WEB-INF/views/menu/insert.jsp";
	}
	
	@PostMapping("/insert")
	public String insert(@ModelAttribute MenuDto dto) {
		dao.insert(dto);
		
		return "redirect:/menu/insertComplete";
	}
	
	@RequestMapping("/insertComplete")
	public String insert3() {
		return "/WEB-INF/views/menu/insertComplete.jsp";
	}
	
	@GetMapping("/change")
	public String change(int menuNo, Model model) {
		MenuDto dto = dao.selectOne(menuNo);
		model.addAttribute("dto", dto);
		return "/WEB-INF/views/menu/change.jsp";
	}
	
	@PostMapping("/change")
	public String change(@ModelAttribute MenuDto dto) {
		if(dao.update(dto)) {
			//return "/redirect:/menu/change"
			return "redirect:changeSuccess";
		}
		else {
			return "redirect:changeFail";
		}
	}
	
	@RequestMapping("/changeSuccess")
	public String changeSuccess() {
		return "/WEB-INF/views/menu/changeSuccess.jsp";
	}
	@RequestMapping("/changeFail")
	public String changeFail() {
		return "/WEB-INF/views/menu/changeFail.jsp";
	}
	
}
