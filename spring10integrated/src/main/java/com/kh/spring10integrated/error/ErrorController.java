package com.kh.spring10integrated.error;

import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.ControllerAdvice;
import org.springframework.web.bind.annotation.ExceptionHandler;

//이미 만들어진 컨트롤러에서 발생하는 예외에대한 처리를 수행하는 도구
// - 간섭도구이며 AOP의 구현체 중 하나 (AOP의 개념이 적용되어있는 도구라는 뜻..)
// - 등록을 @ControllerAdvice 로 하며, 옵션으로 대상을 반드시 지정해야한다 어디를 간섭할껀지 지정해줘야해
// - 클래스 내에는 @ExceptionHandler를 만들어 예외를 종류별로 처리
// - 메소드 내에서 필요한 처리를 하고 보여주고 싶은 화면을 반환
// - 컨트롤러처럼 필요한 데이터를 선언하면 자동으로 전달해줌(세션, 예외객체...)
// - 하는 짓은 컨트롤러와 비슷하지만 예는 예외처리하는거야!!! 준 컨트롤러임


//@ControllerAdvice(basePackages = {"com.kh.spring10.controller"})
//@ControllerAdvice(annotations = Controller.class)
//간섭하기 싫으면 위에 @ControllerAdvice에 주석 , 간섭할꺼면 주석 해제 설정/해제 하는게 간편한것도 굉장히 중요하다
public class ErrorController {
    
    //이 밑의 구문을 여러개 만들어도 무관...필요하다 생각하면 만들면 돼.
    @ExceptionHandler(Exception.class)
    public String handler(Exception e) {
        //에러 정보를 화면이나 파일 등에 출력하는 코드가 필요(콘솔에도 오류가 안뜨면 관리자는 어떻게 오류 찾냐 ;;)
        e.printStackTrace();
        //        return "에러페이지주소";
        return "/WEB-INF/views/error.jsp";
    }
}