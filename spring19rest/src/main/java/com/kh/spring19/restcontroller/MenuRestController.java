package com.kh.spring19.restcontroller;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.CrossOrigin;
import org.springframework.web.bind.annotation.DeleteMapping;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PatchMapping;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.PutMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

import com.kh.spring19.dao.MenuDao;
import com.kh.spring19.dto.MenuDto;

@CrossOrigin
@RestController
@RequestMapping("/menu")
public class MenuRestController {

	@Autowired
	private MenuDao menuDao;
	
	//등록
	@PostMapping("/")
	public MenuDto insert(@RequestBody MenuDto menuDto) {
		int sequence = menuDao.sequence();
		menuDto.setMenuNo(sequence);
		menuDao.insert(menuDto);
		return menuDao.selectOne(sequence);
  }
	
	//상세
	@GetMapping("/{menuNo}")
	public MenuDto find(@PathVariable int menuNo) {
		MenuDto menuDto = menuDao.selectOne(menuNo);
		return menuDto;
	}
	
	//목록
	@GetMapping("/")
	public List<MenuDto> list() {
		return menuDao.selectList();
	}
	
	//전체수정
	@PutMapping("/")
	public boolean editAll(@RequestBody MenuDto menuDto) {
		boolean result = menuDao.editAll(menuDto);
		return result;
	}
	//일부수정
	@PatchMapping("/")
	public boolean editUnit(@RequestBody MenuDto menuDto) {
		boolean result = menuDao.editUnit(menuDto);
		return result;
	}
	
	@DeleteMapping("/{menuNo}")
	public boolean delete(@PathVariable int menuNo) {
		return menuDao.delete(menuNo);
	}
	
}







