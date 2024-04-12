package com.kh.spring18.vo;

import com.fasterxml.jackson.annotation.JsonIgnoreProperties;

import lombok.AllArgsConstructor;
import lombok.Builder;
import lombok.Data;
import lombok.NoArgsConstructor;

@JsonIgnoreProperties(ignoreUnknown = true)
@Data @Builder @NoArgsConstructor @AllArgsConstructor
//클라이언트[에게] 보내는 메세지
public class ChatResponseVO {
	private String content; //메세지 내용
	private String time; //전송 시각
}
