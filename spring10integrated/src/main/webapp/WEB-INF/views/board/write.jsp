<%@ page language="java" contentType="text/html; charset=UTF-8"
    pageEncoding="UTF-8"%>

<jsp:include page="/WEB-INF/views/template/header.jsp"></jsp:include>

<h1>게시글 작성</h1>

<form action="write" method="post">
	제목 <input type="text" name="boardTitle" size="80%"><br>
	내용 <input type="text" name="boardContent" size="80%"><br>
	작성자 <input type="hidden" name="boardWriter" value="${sessionScope.loginId}">
	<button>등록</button>
</form>

<jsp:include page="/WEB-INF/views/template/footer.jsp"></jsp:include>