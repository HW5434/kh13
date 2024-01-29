package com.kh.spring10integrated.interceptor;

import org.springframework.stereotype.Service;
import org.springframework.web.servlet.HandlerInterceptor;

import jakarta.servlet.http.HttpServletRequest;
import jakarta.servlet.http.HttpServletResponse;
import jakarta.servlet.http.HttpSession;

//회원 페이지에 대한 접근 허용 및 차단을 판정하여 처리하는 도구
@Service
public class AdminIntersepter implements HandlerInterceptor {
	@Override
	public boolean preHandle(
										HttpServletRequest request, 
										HttpServletResponse response, 
										Object handler)
			throws Exception {
		//세션에 있는 loginLevel을 조사하여 관리자인지 아닌지 판정
		
		HttpSession session = request.getSession();
		String loginLevel = (String)session.getAttribute("loginLevel");//사용자 ID 추출
		boolean isAdmin = loginLevel != null && loginLevel.equals("관리자");
		
		if(isAdmin) {//관리자만 통과시키는 코드
			return true;
		}
		else {
			response.sendError(403);
			return false;
		}
	}
}
