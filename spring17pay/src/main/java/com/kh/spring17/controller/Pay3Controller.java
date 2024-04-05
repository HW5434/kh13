package com.kh.spring17.controller;

import java.net.URISyntaxException;
import java.util.UUID;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.ModelAttribute;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestParam;

import com.kh.spring17.dao.PaymentDao;
import com.kh.spring17.dao.ProductDao;
import com.kh.spring17.dto.PaymentDetailDto;
import com.kh.spring17.dto.PaymentDto;
import com.kh.spring17.dto.ProductDto;
import com.kh.spring17.service.KakaoPayService;
import com.kh.spring17.vo.KakaoPayApproveRequestVO;
import com.kh.spring17.vo.KakaoPayApproveResponseVO;
import com.kh.spring17.vo.KakaoPayReadyRequestVO;
import com.kh.spring17.vo.KakaoPayReadyResponseVO;
import com.kh.spring17.vo.PurchaseListVO;
import com.kh.spring17.vo.PurchaseVO;

import jakarta.servlet.http.HttpSession;
import lombok.extern.slf4j.Slf4j;

@Slf4j
@Controller
@RequestMapping("/pay3")
public class Pay3Controller {
	
	@Autowired
	private KakaoPayService kakaoPayService;
	
	@Autowired
	private ProductDao productDao;
	
	@Autowired
	private PaymentDao paymentDao;
	
	@GetMapping("/purchase")
	public String purchase(Model model) {
		model.addAttribute("list", productDao.selectList());
		return "pay3/purchase";
	}
	
	@PostMapping("/purchase")
	public String purchase(@ModelAttribute PurchaseListVO vo, 
						HttpSession session) throws URISyntaxException {
		log.debug("size = {}", vo.getPurchase().size());
		log.debug("vo = {}", vo);
		
		//vo의 purchase 목록을 이용하여 결제 정보를 생성하는 코드
		StringBuffer name = new StringBuffer();
		int total = 0;
		
		//이름 - OOO 외 N건
		
		
		//가격
		//for(PurchaseVO purchaseVO : vo.getPurchase()) {//구매이력을 반복하며 상품
		for(int i = 0; i < vo.getPurchase().size(); i++) {
			PurchaseVO purchaseVO = vo.getPurchase().get(i);
			ProductDto productDto = productDao.selectOne(purchaseVO.getNo());
			if(i == 0) {
				name.append(productDto.getName());//이름 (한번만, i == 0)
			}
			total += productDto.getPrice() * purchaseVO.getQty(); //가격 * 수량
		}

		//구매목록이 2개 이상이라면 "외 N건" 이라는 글자를 추가
		if(vo.getPurchase().size() >= 2) {
			name.append(" 외 ");
			name.append(vo.getPurchase().size()-1);
			name.append("건");
		}
		
		log.debug("결제이름 = {}", name);
		log.debug("결제이름 = {}", total);
		
		//결제 준비 요청 - KakaoPayReadyRequestVo, KakaoPayReadyResponse
		KakaoPayReadyRequestVO requestVO = 
				KakaoPayReadyRequestVO.builder()
				.partnerOrderId(UUID.randomUUID().toString())
				.partnerUserId("testuser1")
				.itemName(name.toString())
				.totalAmount(total)
				.build();
		
		KakaoPayReadyResponseVO responseVO = 
											kakaoPayService.ready(requestVO);
		
		//세션에 Flash Attribute를 추가
		session.setAttribute("partner_order_id", requestVO.getPartnerOrderId());
		session.setAttribute("partner_user_id", requestVO.getPartnerUserId());
		session.setAttribute("tid", responseVO.getTid());
		//(+추가) 사용자가 구매한 상품번호와 수량 목록을 결제성공페이지로 전송
		session.setAttribute("vo", vo);
		
		return "redirect:" + responseVO.getNextRedirectPcUrl(); //결제페이지 안내
	}
	
	@GetMapping("/purchase/success")
	public String success(HttpSession session, 
			@RequestParam String pg_token) throws URISyntaxException {
		
		KakaoPayApproveRequestVO requestVO = 
				KakaoPayApproveRequestVO.builder()
					.partnerOrderId((String)session.getAttribute("partner_order_id"))
					.partnerUserId((String)session.getAttribute("partner_user_id"))
					.tid((String)session.getAttribute("tid"))
					.pgToken(pg_token)
				.build();
		
		//세션의 Flash Attribute를 제거
		session.removeAttribute("partner_order_id");
		session.removeAttribute("partner_user_id");
		session.removeAttribute("tid");
		
		KakaoPayApproveResponseVO responseVO = 
										kakaoPayService.approve(requestVO);
		
		//세션에 전송된 vo(구매목록)을 꺼내서 DB에 저장할 때 황용
		PurchaseListVO vo = (PurchaseListVO) session.getAttribute("vo");
		session.removeAttribute("vo");
		
		//DB에 결제 완료된 내역을 저장
		// - 결제 대표 정보(payment) = 번호생성 후 등록
		int paymentNo = paymentDao.paymentSequence();
		PaymentDto paymentDto = PaymentDto.builder()
				.paymentNo(paymentNo)//시퀀스
				.paymentName(responseVO.getItemName())//대표 결제명
				.paymentTotal(responseVO.getAmount().getTotal())//결제총금액
				.paymentRemain(responseVO.getAmount().getTotal())//잔여금액(결제총금액과 동일)
				.build();
		paymentDao.insertPayment(paymentDto);
		
		// - 결제 상세 내역(payment_detail)
		
		return "redirect:successComplete";
	}
	
	@GetMapping("/purchase/successComplete")
	public String successComplete() {
		return "pay3/successComplete";
	}
	
//	@GetMapping("/purchase/cancel")
//	@GetMapping("/purchase/fail")
	
}