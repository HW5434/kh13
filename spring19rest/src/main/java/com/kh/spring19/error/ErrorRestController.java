package com.kh.spring19.error;

import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.ExceptionHandler;
import org.springframework.web.bind.annotation.RestController;
import org.springframework.web.bind.annotation.RestControllerAdvice;

import lombok.extern.slf4j.Slf4j;

@Slf4j
//RestController에서 발생한 예외에 대해 "간섭"하는 객체
@RestControllerAdvice(annotations = {RestController.class})
public class ErrorRestController {
	
	@ExceptionHandler(Exception.class)
	public ResponseEntity<String> handler(Exception e)	{
		//e.printStackTrace(); //로깅 배우기 전
		//로그 찍기 배운 후
		log.error("오류 발생", e);
		return ResponseEntity.status(500).body("server error");
	}

}
