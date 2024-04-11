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
public class KakaoPayCancelResponseVO {
	private String aid;//요청 고유 번호
	private String tid;//결제 고유 번호
	private String cid;//가맹점코드
	private String status;//결제상태
	private String partnerOrderId; //가맹점 주문번호
	private String partnerUserId; //가맹점 회원 ID
	private String paymentMethodType; //결제수단
	private KakaoPayAmountVO amount;//결제금액
	private KakaoPayAmountVO approvedCancelAmount; //최소된 금액
	private KakaoPayAmountVO canceledAmount; // 누계 취소금액
	private KakaoPayAmountVO cancelAvilableAmount; // 남은 취소가능 금액
	private String itemName; //상품이름
	private String itemCode; //상품코드
	private int quantity; //상품수량
	private Date createdAt; //결제 준비요청 시각
	private Date approvedAt; //승인 시각
	private Date canceledAt; //취소시각
	private String payload; //취소요청시 전달한 값
}
