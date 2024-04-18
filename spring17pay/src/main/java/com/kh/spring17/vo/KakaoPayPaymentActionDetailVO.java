package com.kh.spring17.vo;

import java.sql.Date;

import com.fasterxml.jackson.annotation.JsonIgnoreProperties;
import com.fasterxml.jackson.databind.PropertyNamingStrategies;
import com.fasterxml.jackson.databind.annotation.JsonNaming;

import lombok.AllArgsConstructor;
import lombok.Builder;
import lombok.Data;
import lombok.NoArgsConstructor;

@JsonIgnoreProperties(ignoreUnknown = true)
@JsonNaming(PropertyNamingStrategies.SnakeCaseStrategy.class)
@Data @Builder @NoArgsConstructor @AllArgsConstructor

public class KakaoPayPaymentActionDetailVO {
	private String aid;//요청 고유번호
	private Date approvedAt;//거래시각
	private int amount;//결제 취소 총액
	private int pointAmount; //할인 금액
	private int discountAmount; //할인 금액
	private int greenDeposit; //컵 보증금
	private String paymentActionType; //	결제 타입
	private String payload; //Request로 전달한 값
}