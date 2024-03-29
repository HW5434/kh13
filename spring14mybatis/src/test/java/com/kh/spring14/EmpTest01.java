package com.kh.spring14;

import org.junit.jupiter.api.Test;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.boot.test.context.SpringBootTest;

import com.kh.spring14.dao.EmpDao;
import com.kh.spring14.dto.EmpDto;

import lombok.extern.slf4j.Slf4j;

@Slf4j
@SpringBootTest
public class EmpTest01 {

	@Autowired
	private EmpDao empDao;
	
	@Test
	public void test() {
		EmpDto empDto = new EmpDto();
		empDto.setEmpNo(1);
		empDto.setEmpName("이사원");
		empDto.setEmpDept("이부서");
		empDto.setEmpDate("2024-03-03");
		empDto.setEmpSal(50000);
		
		empDao.insert(empDto);
		log.debug("등록 성공!");
	}
}
