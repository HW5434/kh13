package com.kh.spring10integrated.controller;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestParam;

import com.kh.spring10integrated.dao.BoardDao;

@Controller
@RequestMapping("/board")
public class BoardController {

	@Autowired
	private BoardDao boardDao;
	
	@RequestMapping("/list")
	public String list(
			@RequestParam(required = false) String column, 
			@RequestParam(required = false) String keyword, Model model) {
		boolean isSearch = column != null && keyword != null;
		if(isSearch) {
			model.addAttribute("list", boardDao.selectList(column, keyword));
		}
		else {
			model.addAttribute("list", boardDao.selectList());
		}
		return "/WEB-INF/views/board/list.jsp";
	}
	
}