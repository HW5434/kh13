package com.kh.spring19;

import java.nio.charset.StandardCharsets;

import javax.crypto.SecretKey;

import org.junit.jupiter.api.Test;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.boot.test.context.SpringBootTest;

import com.kh.spring19.configuration.JwtProperties;

import io.jsonwebtoken.Claims;
import io.jsonwebtoken.Jwts;
import io.jsonwebtoken.security.Keys;
import lombok.extern.slf4j.Slf4j;

@Slf4j
@SpringBootTest
public class JwtTest03 {

	@Autowired
	private JwtProperties jwtProperties;
	
	@Test
	public void test() {
		//생성된 토큰 정보
		
		//JwtTest03 토큰
		String token = "eyJhbGciOiJIUzI1NiJ9.eyJpc3MiOiJLSGFjYWRlbXkiLCJpYXQiOjE3MTM4NjAwOTEsImV4cCI6MTcxMzg4MTY5MSwibG9naW5JZCI6InRlc3R1c2VyMSIsImxvZ2luTGV2ZWwiOiLsnbzrsJjtmozsm5AifQ.FmgbV4XHldedmBsKFhSLMVQkEcSUIxzbvBAlsbsr0qM";
		
		//JwtTest01 토큰 : 발행자 정보 확인 시 오류
		//String token = "eyJhbGciOiJIUzI1NiJ9.eyJpc3MiOiJLSOygleuztOq1kOycoeybkCIsImlhdCI6MTcxMzg2MDgzMywiZXhwIjoxNzEzODgyNDMzLCJsb2dpbklkIjoidGVzdHVzZXIxIiwibG9naW5MZXZlbCI6IuydvOuwmO2ajOybkCJ9.YeaB28S2Y82eWNymmYa9SKOrGY1e6UvREXzBXi4i1zk";
		
		//1. 해석을 위한 key 생성
		String keyStr = jwtProperties.getKeyStr();
		SecretKey key = Keys.hmacShaKeyFor(keyStr.getBytes(StandardCharsets.UTF_8));
		
		//2. 토큰 해석
		Claims claims = (Claims) Jwts.parser() //해석도구(parse) 준비
				.verifyWith(key) // 열쇠 설정하고
				.requireIssuer(jwtProperties.getIssuer()) //발행자 정보를 확인하도록
				.build() // 만든 후
				.parse(token) // 토큰 해석하고
				.getPayload(); // 내용 가져오기
				
		//3. 정보 출력
		log.debug("loginId = {}", claims.get("loginId"));
		log.debug("loginLevel = {}", claims.get("loginLevel"));
		log.debug("test = {}", claims.get("test"));
	}
	
}
