<%@ page language="java" contentType="text/html; charset=UTF-8"
    pageEncoding="UTF-8"%>
    
<%-- 템플릿 페이지를 불러오는 코드 --%>
<jsp:include page="/WEB-INF/views/template/header.jsp"></jsp:include>    

<h1>메뉴 수정 정보</h1>

<form action="change" method="post">
	메뉴번호 <input type="text" name="menuNo" required value="${dto.getMenuNo()}"> <br><br>
    한글메뉴 <input type="text" name="menuNameKor" required value="${dto.getMenuNameKor()}"> <br><br>
    영문메뉴 <input type="text"  name="menuNameEng" required value="${dto.getMenuNameEng()}"> <br><br>
    메뉴유형 <input type="text"  name="menuType" required value="${dto.getMenuType()}"> <br><br>
    메뉴가격 <input type="text"  name="menuPrice" required value="${dto.getPrice()}"> <br><br>
    <button>메뉴수정</button>
</form>

<%-- 템플릿 페이지를 불러오는 코드 --%>
<jsp:include page="/WEB-INF/views/template/footer.jsp"></jsp:include>