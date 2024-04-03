package com.kh.spring12;

import org.junit.jupiter.api.Test;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.boot.test.context.SpringBootTest;
import org.springframework.mail.javamail.JavaMailSender;
import org.springframework.mail.javamail.MimeMessageHelper;

import jakarta.mail.MessagingException;
import jakarta.mail.internet.MimeMessage;
import lombok.extern.slf4j.Slf4j;

@Slf4j
@SpringBootTest
public class MimeMessegeTest01 {

	@Autowired
	private JavaMailSender sender;
	
	@Test
	public void test() throws MessagingException {
		//MimeMessage는 여러 가지 옵션을 설정할 수 있는 메세지
		
		//메세지 객체 생성
		MimeMessage message = sender.createMimeMessage();
		
		//도우미 객체 생성 - 파일전송은 안하고 UTF-8로 변환해서 전송하겠다
		MimeMessageHelper helper = new MimeMessageHelper(message, false, "UTF-8");
	
		//헬퍼에 정보를 설정
		helper.setTo(new String[] {"l990628l@gmail.com", "hw30813@naver.com"});
		helper.setSubject("오늘의 운세");
		//helper.setText("<h1>다시 이거 가능?</h1>", true);//HTML 허용 설정
		
		//(주의) 발송되는 이메일에 들어갈 HTML 디자인은 전부다 인라인으로 작성
		StringBuffer buffer = new StringBuffer();
		buffer.append("<div style='padding:20px; box-shadow:0 0 2px 2px #ccc'>");
		buffer.append("<h1>당신의 오늘의 운세</h1>");
		buffer.append("<p>");
		buffer.append("정성스럽게 열이 받네요 ㅎ");
		buffer.append("</p>");
		buffer.append("</div>");
		
		helper.setText(buffer.toString(), true);
		
		//전송
		sender.send(message);
	}
	
}
