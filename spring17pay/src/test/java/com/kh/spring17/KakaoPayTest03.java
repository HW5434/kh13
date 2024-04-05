package com.kh.spring17;

import java.net.URI;
import java.net.URISyntaxException;
import java.util.Map;
import java.util.UUID;

import org.junit.jupiter.api.Test;
import org.springframework.boot.test.context.SpringBootTest;
import org.springframework.http.HttpEntity;
import org.springframework.http.HttpHeaders;
import org.springframework.util.LinkedMultiValueMap;
import org.springframework.util.MultiValueMap;
import org.springframework.web.client.RestTemplate;

import lombok.extern.slf4j.Slf4j;

@Slf4j
@SpringBootTest
public class KakaoPayTest03 {
	
	@Test
	public void test() throws URISyntaxException {
		//카카오페이 서버에 결제 준비(ready) 요청을 보내보자!
		
		//요청 전송 도구 생성(템플릿)
		RestTemplate template = new RestTemplate();
		
		//[김밥으로 비교했을때 재료준비 작업]
		//주소 생성
		//URI uri = new URI("https://open-api.kakaopay.com/online/v1/payment/ready");
		URI uri = new URI("https://kapi.kakao.com/v1/payment/ready");
		
		//헤더 생성
		HttpHeaders header = new HttpHeaders();
		//header.add("Authorization", "SECRET_KEY dd9d8966e3ef12b1a97b4b7b58b38a71");
		//header.add("Content-Type", "application/json");
		header.add("Authorization", "KakaoAK dd9d8966e3ef12b1a97b4b7b58b38a71");
		header.add("Content-type", "application/x-www-form-urlencoded;charset=utf-8");
		
		//바디 생성
		MultiValueMap<String, String> body = new LinkedMultiValueMap<>();
		body.add("cid", "TC0ONETIME");
		body.add("partner_order_id", UUID.randomUUID().toString());
		body.add("partner_user_id", "testuser1");
		body.add("item_name", "초코파이 외 1개");
		body.add("quantity", "1");
		body.add("total_amount", "4500");
		body.add("tax_free_amount", "0");
		body.add("approval_url", "http://localhost:8080/success");
		body.add("cancel_url", "http://localhost:8080/cancel");
		body.add("fail_url", "http://localhost:8080/fail");
		
		//통신 요청
		HttpEntity entity = new HttpEntity(body, header); //헤더 + 바디 [순서 지키키]
		
		Map response = template.postForObject(uri, entity, Map.class);
		log.debug("response = {}", response);
		log.debug("주소 = {}", response.get("next_redirect_pc_url"));
	}
	
}
