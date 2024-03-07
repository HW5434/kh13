<%@ page language="java" contentType="text/html; charset=UTF-8"
    pageEncoding="UTF-8"%>
<%@ taglib prefix="c" uri="http://java.sun.com/jsp/jstl/core" %>    
    
<jsp:include page="/WEB-INF/views/template/header.jsp"></jsp:include> 

<style>

.title-logo{

}
.btn.positive{

}

/* floating-cell 내부의 항목들은 모두 float:left 처리 */  
.floating-cell > * {
    float: left;
}
.floating-cell.reverse > * {
    float: right;
}

.fa-envelope , .fa-lock{
    width: 11%;
    font-size: 24.5px;
    padding: 0.5em 0;
    border: 1px solid #2d3436;
    text-align: center;
}

input[name = memberId],
input[name = memberPw]
    {
        width: 89%;
        border-radius: 0%;
        border-left: none;
    }
    
.btn {
	text-decoration: none;
}
  
</style>

<form action="login" method="post">
            <div class="container w-500">
                <div class="cell center">
                    <div class="title-logo w-500">
                    	<h1>Login</h1>
                        <!-- <img src="image/coupang.png" width="45%" class="">    -->
                    </div>
                    
                    <c:if test="${param.error != null}">
						<h3 style="color: red">로그인 정보가 일치하지 않습니다</h3>
					</c:if>
                        
                        <div class="cell floating-cell">
                            <i class="fa-regular fa-envelope"></i>
                            <input type="text" name="memberId" placeholder="아이디 (이메일)"class="tool">   
                        </div>     
                        
                        <div class="cell floating-cell">
                            <i class="fa-solid fa-lock"></i>
                            <input type="password" name="memberPw" placeholder="비밀번호"class="tool ">
                        </div>

                        <!-- 자동로그인 , 아이디 비밀번호 찾기 -->
                        <div class="cell floating-cell">                                
                            <div class="w-50 left">
                                <!-- 편법 : 아이디와 for를 부여하지 않고 라벨로 입력창을 감싼다 -->
                                <label>
                                    <input type="checkbox"> 
                                    자동 로그인
                                </label>
                            </div>
                                <div class="w-50 right">
                                    <a class="link" href="findId">아이디 찾기 , </a>
                                    <a class="link" href="#">비밀번호 찾기</a>
                                </div>                               
                             </div>
                        
                        <!-- 로그인 회원가입 버튼 -->
                            <div>
                               <button class="btn positive w-100">
                               		로그인
                               </button>
                            </div >
                        <hr>
                        <div>
	                        <button class="btn w-100">
		                        <a href="/member/join">
		                       		 회원가입
		                        </a>
	                        </button>
                        </div>
                        
                    </div>
                </div>
            </form>

<jsp:include page="/WEB-INF/views/template/footer.jsp"></jsp:include> 