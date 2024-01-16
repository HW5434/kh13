package com.kh.spring06menu.controller;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.ModelAttribute;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestParam;
import org.springframework.web.bind.annotation.RestController;

import com.kh.spring06menu.dao.MenuDao;
import com.kh.spring06menu.dto.MenuDto;

@RestController // 페이지 만들기
@RequestMapping("/menu")
public class MenuController {

	@Autowired
	private MenuDao dao;
	
	@RequestMapping("/insert")
	public String insert(@ModelAttribute MenuDto dto) {
		
		dao.insert(dto);
		return "메뉴 등록 완료";
	}
		
	@RequestMapping("/change")
	public String change(@ModelAttribute MenuDto dto) {
		if(dao.update(dto)) {
			return "메뉴 변경 완료";
		}
		else {
			return "메뉴를 찾을 수 없습니다";
		}
	}
		
		@RequestMapping("/delete")
		public String delete(@RequestParam int menuNo) {
			if(dao.delete(menuNo)) {
				return "메뉴 삭제 완료 ";
			}
			else {
				return "존재하지 않는 메뉴번호";
			}
			
			
			
			
		}
	}

