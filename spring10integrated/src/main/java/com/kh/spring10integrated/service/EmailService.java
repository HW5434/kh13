package com.kh.spring10integrated.service;

import java.util.Random;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.mail.SimpleMailMessage;
import org.springframework.mail.javamail.JavaMailSender;
import org.springframework.stereotype.Service;

import com.kh.spring10integrated.dao.MemberDao;
import com.kh.spring10integrated.dto.MemberDto;

@Service
public class EmailService {

	@Autowired
	private JavaMailSender sender;
	
	@Autowired
	private MemberDao memberDao;
	
	

	// 가입 환영 이메일 발송
	public void sendWelcomeMail(String email) {
		SimpleMailMessage message = new SimpleMailMessage();
		message.setTo(email);
		message.setSubject("가입을 환영합니다!");
		message.setText("많은 활동 부탁드립니다!!");

		sender.send(message);
	}

	//아이디 발송
	public boolean sendMemberId(String memberNick) {
		MemberDto memberDto = memberDao.selectOneBytNick(memberNick); //닉네임으로 회원정보 조회
		
		if(memberDto != null) { //존재하는 닉네임이라면 [null이 아니면]
			SimpleMailMessage message = new SimpleMailMessage();
			message.setTo(memberDto.getMemberEmail());
			message.setSubject("[KH정보교육원] 아이디 찾기 결과 안내");
			message.setText("당신의 아이디는 "+memberDto.getMemberId()+" 입니다");
			sender.send(message);
			return true;
		}
		else {//존재하지 않는 닉네임이라면
			return false;
		}
		
	}
	
	
	// 임시 비밀번호 발송
	public void sendTempPassword(MemberDto memberDto) {
		String lower = "abcdefghijklmnopqrstuvwxyz"; // 3글자
		String upper = "ABCDEFGHIJKLMNOPQRSTUVWXYZ"; // 3글자
		String number = "0123456789"; // 1글자
		String special = "!@#$"; // 1글자

		Random r = new Random();
		StringBuffer buffer = new StringBuffer(); // 문자열 합성도구

		for (int i=0; i < 3; i++) {
			int pos = r.nextInt(lower.length()); // 0~글자 위치 lower에서의 랜덤위치 +0은 생략
			buffer.append(lower.charAt(pos)); //버퍼에 추가
		}
		
		for (int i=0; i < 3; i++) {
			int pos = r.nextInt(upper.length()); // 0~글자 위치 upper에서의 랜덤위치 +0은 생략
			buffer.append(upper.charAt(pos)); //버퍼에 추가
		}
		
		for (int i=0; i < 1; i++) { //글자가 바뀔 수 있으니 반복문으로
			int pos = r.nextInt(number.length()); // 0~글자 위치 number에서의 랜덤위치 +0은 생략
			buffer.append(number.charAt(pos)); //버퍼에 추가
		}
		
		for (int i=0; i < 1; i++) { //글자가 바뀔 수 있으니 반복문으로
			int pos = r.nextInt(special.length()); // 0~글자 위치 special에서의 랜덤위치 +0은 생략
			buffer.append(special.charAt(pos)); //버퍼에 추가
		}
		
		//생성한 비밀번호로 DB를 변경
		memberDto.setMemberPw(buffer.toString());
		memberDao.updateMemberPw(memberDto);
		
		//이메일 발송
		SimpleMailMessage message = new SimpleMailMessage();
		message.setTo(memberDto.getMemberEmail());
		message.setSubject("[KH정보교육원] 임시 비밀번호 안내");
		message.setText("임시 비밀번호는 "+memberDto.getMemberPw()+"입니다.");
		
		sender.send(message);
	}

	// 인증번호 발송

}
