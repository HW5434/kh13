<%@ page language="java" contentType="text/html; charset=UTF-8"
    pageEncoding="UTF-8"%>

<%-- 템플릿 페이지를 불러오는 코드 --%>
<jsp:include page="/WEB-INF/views/template/header.jsp"></jsp:include>

<form action="insert" method="post">
한글메뉴 : <input type="text" name="menuNameKor" required> <br><br>
영어메뉴 : <input type="text" name="menuNameEng" required> <br><br>
메뉴종류 :  <select name="menuType" required>
<option value="">선택하세요</option>
	<option value="커피">커피</option>
	<option value="스무디">스무디</option>
	<option value="에이드">에이드</option>
	<option value="디저트">디저트</option>
</select><br><br>

메뉴가격 : <input name="menuPrice" type="text" required> <br><br>
<button>메뉴등록</button>
</form>

<%-- 템플릿 페이지를 불러오는 코드 --%>
<jsp:include page="/WEB-INF/views/template/footer.jsp"></jsp:include>