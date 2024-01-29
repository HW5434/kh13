package com.kh.spring10integrated.configuration;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.context.annotation.Configuration;
import org.springframework.web.servlet.config.annotation.InterceptorRegistry;
import org.springframework.web.servlet.config.annotation.WebMvcConfigurer;

import com.kh.spring10integrated.interceptor.AdminIntersepter;
import com.kh.spring10integrated.interceptor.Memberinterceptor;
import com.kh.spring10integrated.interceptor.TestInterceptor;

//application.properties에서 하기 힘든 설정들을 이곳에서 구현할 수 있다.
//[1] 상속을 통한 자격 획득
//[2] 등록
//[3] 필요한 메소드를 재정의 하여 설정 구현 
@Configuration
public class InterceptorConfiguration implements WebMvcConfigurer{
	@Autowired
	private TestInterceptor testInterceptor;
	
	@Autowired
	private Memberinterceptor memberinterceptor;
	
	@Autowired
	private AdminIntersepter adminIntersepter;
	
	@Override
	public void addInterceptors(InterceptorRegistry registry) {
		//registry에다가 인터셉터를 주소와 함께 등록   
		//registry.addInterceptor(인터셉터객체).addPathPatterns(주소); 모든 주소에 적용
		//registry.addInterceptor(testInterceptor).addPathPatterns("/pocketmon/list", "/emp/list");
		
//	    하나씩 막자
//		registry.addInterceptor(memberinterceptor)
//				   .addPathPatterns(
//						   "/member/mypage",
//						   "member/password", "member/passwordFinish",
//						   "/member/change","/member/exit"
//						   );
		
		
		//중간 주소를 등록하고 특정 페이지를 제외
		// - 주소를 설정할 때 **와 *를 사용할 수 있다
		// - **는 하위 엔드포인트까지 모두 포함하여 설정할 때 사용 (후손)
		// - *는 동일 엔드포인트까지만 포함하여 설정할 때 사용 (자식)
		
		registry.addInterceptor(memberinterceptor).addPathPatterns("/member/**"). //다막아
		excludePathPatterns(
				//"/member/join",/member/joinFinish"
				"/student/**",
				"/member/join*",
				"/member/login","/member/exitFinish"
				); 
		//관리자 인터셉터 등록
		registry.addInterceptor(adminIntersepter).addPathPatterns("/admin/**");
	}
}







