<%@ page language="java" contentType="text/html; charset=UTF-8"
	pageEncoding="UTF-8"%>
<%@ taglib prefix="c" uri="http://java.sun.com/jsp/jstl/core"%>

<jsp:include page="/WEB-INF/views/template/header.jsp"></jsp:include>

<div class="cell my-30">
	<h1>게시글 작성</h1>
</div>

<form action="write" method="post">
	<%-- (중요) 답변글일 경우 대상의 번호가 반드시 등록페이지로 전송되야함 --%>
	<c:if test="${param.boardTarget != null}">
		<input type="hidden" name="boardTarget" value="${param.boardTarget}">
	</c:if>



	<div class="cell">
		<h2>제목</h2>
		<c:choose>
			<c:when test="${param.boardTarget == null}">
				<input class="tool w-100" type="text" name="boardTitle" required>
			</c:when>
			<c:otherwise>
				<input class="tool w-100" type="text" name="boardTitle" required
					value="[Re] ${targetDto.boardTitle}">
			</c:otherwise>
		</c:choose>
	</div>

	<div class="cell">
		<h2>내용</h2>
		<%-- 
		여러 줄 입력하고 싶다면 textarea 태그를 사용한다 
		<input type="text" name="boardContent" required>
		
		textarea 태그는 종료 태그가 필요하며, type과 value를 설정할 수 없다
		 <textarea name="boardContent" required></textarea>
	--%>
		<textarea name="boardContent" required></textarea>
		<br> <br>
	</div>
	<div class="cell right">
		<button class="btn">등록</button>
		<a class="btn" href="list">글목록</a>
	</div>
</form>

<jsp:include page="/WEB-INF/views/template/footer.jsp"></jsp:include>