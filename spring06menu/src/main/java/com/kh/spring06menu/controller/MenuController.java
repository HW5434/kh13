package com.kh.spring06menu.controller;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.ModelAttribute;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

import com.kh.spring06menu.dao.MenuDao;
import com.kh.spring06menu.dto.MenuDto;

@RestController
@RequestMapping("/menu")
public class MenuController {

	@Autowired
	private MenuDao dao;
	
	@RequestMapping("/insert")
	public String insert(@ModelAttribute MenuDto dto) {
		
		dao.insert(dto);
		return "메뉴 등록 완료";
	}
}
