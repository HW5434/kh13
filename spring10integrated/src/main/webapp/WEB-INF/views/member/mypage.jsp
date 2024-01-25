<%@ page language="java" contentType="text/html; charset=UTF-8"
    pageEncoding="UTF-8"%>
<%@ taglib prefix="fmt" uri="http://java.sun.com/jsp/jstl/fmt" %>

<jsp:include page="/WEB-INF/views/template/header.jsp"></jsp:include>  

<h1>${memberDto.memberId}님의 정보</h1>

<table border="1" width = "400">
	<tr>
		<th width="30%">닉네임</th>
		<td>${memberDto.memberNick}</td>
	</tr>
	
	<tr>
		<th>비밀번호</th>
		<td>${memberDto.memberPw}</td>
	</tr>
	
	<tr>
		<th>이메일</th>
		<td>${memberDto.memberEmail}</td>
	</tr>
	
	<tr>
		<th>연락처</th>
		<td>${memberDto.memberContact}</td>
	</tr>
	
	<tr>
		<th>생년월일</th>
		<td>${memberDto.memberBirth}</td>
	</tr>
	
	<tr>
		<th>주소</th>
		<td>[${memberDto.memberPost}]
				${memberDto.memberAddress1}
				${memberDto.memberAddress2}
		</td>
	</tr>
	
	<tr>
		<th>등급</th>
		<td>${memberDto.memberLevel}</td>
	</tr>
	
	<tr>
		<th>포인트</th>
		<td>${memberDto.memberPoint} point</td>
	</tr>
	
	<tr>
		<th>가입일시</th>
			<td>
				<fmt:formatDate value= "${memberDto.memberJoin}" pattern = "Y년 M월 D일 H시 m분 s초"/>
			</td>
	</tr>
	
	<tr>
		<th>로그인일시</th>
			<td>
				<fmt:formatDate value= "${memberDto.memberLogin}" pattern = "Y년 M월 D일 H시 m분 s초"/>
			</td>
	</tr>
  
</table>

<h3><a href="/member/password">비밀번호 변경</a></h3>
<h3><a href="/member/change">개인정보 변경</a></h3>
<h3><a href="/member/exit">회원탈퇴 변경</a></h3>



<%-- 내가한것 : ${memberDto.memberId} --%>

<jsp:include page="/WEB-INF/views/template/footer.jsp"></jsp:include> 