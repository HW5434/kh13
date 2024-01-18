<%@ page language="java" contentType="text/html; charset=UTF-8"
    pageEncoding="UTF-8"%>
<h1>사원 등록 페이지</h1>

<%--
절대경로
<form action="/emp/insert2">
상대경로
<form action="insert2">
 --%>

<form action="insert" method="post">
사원명 : <input name="empName" type="text"> <br><br>
부서명 : <input name="empDept" type="text"> <br><br>
<%-- 
	<select>를 사용하면 주어진 목록 중에서 선택시킬 수 있다
	<select name"...">
		<option value = "...">

--%>
<select name="menuType">
	<option value="커피">커피</option>
	<option value="스무디">스무디</option>
	<option value="에이드">에이드</option>
	<option value="디저트">디저트</option>
</select>

입사일 : <input name="empDate" type="date"> <br><br>
급여액 : <input name="empSal" type="number"> <br><br>
<button>등록</button>
</form>
