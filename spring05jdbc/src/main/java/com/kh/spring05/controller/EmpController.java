package com.kh.spring05.controller;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.ModelAttribute;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

import com.kh.spring05.dao.EmpDao;
import com.kh.spring05.dto.EmpDto;
import com.kh.spring05.dto.PocketmonDto;

@RestController
@RequestMapping("/emp")
public class EmpController {

	@Autowired
	//EmpDao dao = new EmpDao(); 이렇게 하면 안됌 내가 ;;실수한거
	private EmpDao dao;
	
	@RequestMapping("/insert")
	public String insert(@ModelAttribute EmpDto dto) {
		dao.insert(dto);
		return "사원 등록 완료";
	}
}
