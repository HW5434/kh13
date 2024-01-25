<%@ page language="java" contentType="text/html; charset=UTF-8"
    pageEncoding="UTF-8"%>
<%@ taglib prefix="c" uri="http://java.sun.com/jsp/jstl/core"%>
    
	<%--
		HTML은 여러 버전이 있었으며, 지금은 HTML 5가 표준
		- 디자인과 관련된 요소를 많이 제거하고 다른 언어들과의 화합을 고려
		- 자체적으로 제공하는 컴포넌트(화면도구)를 많이 늘렸음
		
		<!DOCTYPE html> 은 HTML5 임을 표시하는 것
		
		<html> 은 HTML 문서의 범위를 정하는 태그(없으면 자동으로 생김)
		<html> 은 <head> 와 <body>로 나뉜다
		<head>에는 문서의 정보를 작성하고 <body>에는 화면에 표시할 내용을 작성
		
		<meta>는 홈페이지의 정보를 설정하는 태그
		<title>은 문서의 제목이며 브라우저의 탭 부분에 표시됨
	--%>
    
<!DOCTYPE html>
<html>
	<head>
		<meta charset="UTF-8">
		<title>나의 홈페이지</title>
	</head>
	
	
	<body>
	<%--
		상단 영역
		- 홈페이지에서 가장 많이 보이는 부분
		- 로고, 검색창, 각종 메뉴들을 배치
		- div는 투명한 영역
	--%>
		<div>
		<%-- 템플릿 페이지는 무조건 절대경로를 써야한다 --%>
		<a href="/">홈으로</a>
		<a href="/pocketmon/list">포켓몬스터 시스템</a>
		<a href="/emp/list">사원관리 시스템</a>
		<a href="/menu/list">메뉴관리 시스템</a>
		</div>
		
		
		<div>
             <c:choose>
                 <c:when test="${sessionScope.loginId != null}">
                     <a href="/member/logout">로그아웃</a>
                     <a href="/member/mypage">내 정보</a>
                     loginId=${sessionScope.loginId}
                 </c:when>
                 <c:otherwise>
                     <a href="/member/join">회원가입</a>
                     <a href="/member/login">로그인</a>
                 </c:otherwise>
             </c:choose>
         </div>
         
         <div>
         <%--
         <c:choose>
                 <c:when test="${sessionScope.loginId==null}">
                    <a href="/member/testLogin">테스트로그인</a>
                 </c:when>
                 <c:otherwise>
                     <a href="/member/testLogout">테스트로그아웃</a>
                 </c:otherwise>
             </c:choose>
          --%>
             <%-- 
             <a href="">로그아웃</a>
             <a href="">내정보</a>
             --%>
         </div>
	<%--
		중단 영역
		- 실질적인 홈페이지의 내용이 표시되는 영역
		- 크기는 무제한으로 늘어날 수 있음
	--%>
	
		<hr>
		<div>