package com.kh.spring10integrated.dto;

import lombok.Data;
import lombok.ToString;

@Data @ToString(exclude = {"replyContent"})
public class ReplyDto {
	private int replyNo;
	private String replyContent;
	private String replyTime;
	private String replyWriter;
	private int replyOrigin;
}