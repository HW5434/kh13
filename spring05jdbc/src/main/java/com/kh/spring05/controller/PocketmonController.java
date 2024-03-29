package com.kh.spring05.controller;

import java.util.List;

import org.springframework.beans.factory.ListableBeanFactory;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.jdbc.core.JdbcTemplate;
import org.springframework.web.bind.annotation.ModelAttribute;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestParam;
import org.springframework.web.bind.annotation.RestController;
import org.springframework.web.context.annotation.RequestScope;

import com.kh.spring05.dao.PocketmonDao;
import com.kh.spring05.dto.PocketmonDto;

@RestController
@RequestMapping("/pocketmon") //공용주소
public class PocketmonController {
	
	//(중요) 등록된 것들은 "주세요~" 가 된다(DI, 의존성 주입)
	@Autowired //주세요 라는뜻
	private JdbcTemplate jdbcTemplate;
	
	//등록 페이지
	// - insert?pocketmonNo=77&pocketmonName=테스트&pocketmonType=테스트
//	@RequestMapping("/insert")
	public String insert(
			@RequestParam int pocketmonNo, 
			@RequestParam String pocketmonName, 
			@RequestParam String pocketmonType) {
		String sql = "insert into pocketmon("
				+ "pocketmon_no, "
				+ "pocketmon_name, "
				+ "pocketmon_type"
				+ ") values(?, ?, ?)";
		Object[] data = {pocketmonNo, pocketmonName, pocketmonType};
		jdbcTemplate.update(sql, data);
		return "포켓몬스터 등록 완료";
	}
	
	//업그레이드
	// - 전달되는 데이터를 낱개가 아닌 객체(DTO)로 저장
	// - (주의)RequestParam이 아니라 @ModelAttribute 사용
	@RequestMapping("/insert2")
	//public String insert2(@ModelAttribute PocketmonDto dto) {
	public String insert2(PocketmonDto dto) {
		String sql = "insert into pocketmon("
				+ "pocketmon_no, "
				+ "pocketmon_name, "
				+ "pocketmon_type"
				+ ") values(?, ?, ?)";
		Object[] data = {dto.getPocketmonNo(), dto.getPocketmonName(), dto.getPocketmonType()};
		jdbcTemplate.update(sql, data);
		return "포켓몬스터 등록 완료";
		
	}
	
	//업그레이드
	// - DB 처리를 DAO에게 전담하여 처리
	
	@Autowired
	private PocketmonDao dao;
	
	@RequestMapping("/insert3")
	public String insert3(@ModelAttribute PocketmonDto dto) {
		dao.insert(dto);
		return "포켓몬스터 등록 완료";
	}
	
	@RequestMapping("/edit")
	public String edit(@ModelAttribute PocketmonDto dto) {
		boolean result = dao.update(dto);
		if(result) {
			return "포켓몬 수정 완료";
		}
		else {
			return "존재하지 않는 포켓몬스터 번호";
		}
	}
//	@RequestParam 이름에 맞는걸 원시형 데이터
		@RequestMapping("/delete")
		public String delete(@RequestParam int pocketmonNo) {
			if(dao.delete(pocketmonNo)) {
				return "포켓몬스터 삭제 완료";
			}
			else {
				return "존재하지 않는 포켓몬스터";
			}
		}
		
	//사용자가 원하는 형태를 만들어준다 list x String o
	@RequestMapping("/list")
	public String list() {
		List<PocketmonDto> list = dao.selectList();
				
		//list를 이용하여 화면에 출력할 문자열을 생성
		StringBuffer buffer = new StringBuffer();
		for(PocketmonDto dto : list) {
			buffer.append(dto.getPocketmonNo());
			buffer.append(", ");
			buffer.append(dto.getPocketmonName());
			buffer.append(", ");
			buffer.append(dto.getPocketmonType());
			//buffer.append("\n");
			buffer.append("<br>");
		}
		return buffer.toString(); 
	}

	//목록이구나 느낌이 들어야돼		
	
	//항목 키워드 검색
	@RequestMapping("/list2")
	public String list2(
			@RequestParam String column, 
			@RequestParam String keyword) {
		List<PocketmonDto> list = dao.selectList(column, keyword);
		StringBuffer buffer = new StringBuffer();
		for(PocketmonDto dto : list) {
			buffer.append(dto.getPocketmonNo());
			buffer.append(", ");
			buffer.append(dto.getPocketmonName());
			buffer.append(", ");
			buffer.append(dto.getPocketmonType());
			//buffer.append("\n");
			buffer.append("<br>");
		}
		return buffer.toString(); 
	}
	
	// - column, keyword 파라미터 유무에 따라 검색/목록을 결정
	//(required = false) 없을수도 있다
	@RequestMapping("/list3")
	public String list3(
			@RequestParam(required = false) String column,
			@RequestParam(required = false) String keyword
			) {
		boolean isSearch = column != null && keyword != null;
		List<PocketmonDto> list;
		if(isSearch) {
			list = dao.selectList(column, keyword);
		}
		else {
			list = dao.selectList();
		}
		StringBuffer buffer = new StringBuffer();
		for(PocketmonDto dto : list) {
			buffer.append(dto.getPocketmonNo());
			buffer.append(", ");
			buffer.append(dto.getPocketmonName());
			buffer.append(", ");
			buffer.append(dto.getPocketmonType());
			//buffer.append("\n");
			buffer.append("<br>");
		}
		return buffer.toString(); 
	}

	@RequestMapping("/detail")
	public String detail(@RequestParam int pocketmonNo) {
		PocketmonDto dto = dao.selectOne(pocketmonNo);
		if(dto != null) {//있는 번호인 경우
			StringBuffer buffer = new StringBuffer();
			buffer.append(dto.getPocketmonName());
			buffer.append(", ");
			buffer.append(dto.getPocketmonType());
			buffer.append(", ");
			buffer.append("<br>"); //한줄 띄어쓰기
			return buffer.toString();
		}
		else {//없는 번호인 경우
			return "존재하지 않는 몬스터 번호";
		}
	}
}
	
	

