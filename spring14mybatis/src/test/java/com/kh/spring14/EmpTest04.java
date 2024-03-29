package com.kh.spring14;

import org.junit.jupiter.api.Test;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.boot.test.context.SpringBootTest;

import com.kh.spring14.dao.EmpDao;
import com.kh.spring14.dto.EmpDto;

import lombok.extern.slf4j.Slf4j;

@Slf4j
@SpringBootTest
public class EmpTest04 {

	@Autowired
	private EmpDao empDao;
	
	@Test
	public void test() {
		EmpDto empDto = new EmpDto();
		empDto.setEmpNo(81);
		empDto.setEmpName("김사원");
		empDto.setEmpDept("김부서");
		empDto.setEmpDate("2024-03-03");
		empDto.setEmpSal(50000);
		
		if(empDao.update(empDto)) {
			log.debug("수정 성공");
		}
		else {
			log.debug("존재하지 않는 번호입니다");
		}
		
		
		
	}
}
