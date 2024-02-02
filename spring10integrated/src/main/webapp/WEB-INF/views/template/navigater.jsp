<%@ page language="java" contentType="text/html; charset=UTF-8"
    pageEncoding="UTF-8"%>
<%@ taglib prefix="c" uri="http://java.sun.com/jsp/jstl/core" %>
<%@ taglib prefix="fmt" uri="http://java.sun.com/jsp/jstl/fmt" %>

<%-- 네비게이터 --%>
<h2>
	<%-- 이전이 있을 경우만 링크를 제공 --%>
	<c:choose>
		<c:when test="${pageVO.isFirstBlock()}">&lt;이전</c:when>
		<c:otherwise>
			<a href="list?page=${pageVO.getPrevBlock()}&${pageVO.getQueryString()}">&lt;이전</a>
		</c:otherwise>
	</c:choose>
	
	<%-- for(int i=beginBlock; i <= endBlock; i++) { .. } --%>
	<c:forEach var="i" begin="${pageVO.getBegi
	
	
	
	nBlock()}" end="${pageVO.getEndBlock()}" step="1">
		<%-- 다른 페이지일 경우만 링크를 제공 --%>
		<c:choose>
			<c:when test="${pageVO.isCurrentPage(i)}">${i}</c:when>
			<c:otherwise>
				<a href="list?page=${i}&${pageVO.getQueryString()}">${i}</a>
			</c:otherwise>
		</c:choose>
	</c:forEach>
	
	<%-- 다음이 있을 경우만 링크를 제공 --%>
	<c:choose>
		<c:when test="${pageVO.isLastBlock()}">다음&gt;</c:when>
		<c:otherwise>
			<a href="list?page=${pageVO.getNextBlock()}&${pageVO.getQueryString()}">다음&gt;</a> 
		</c:otherwise>
	</c:choose>
</h2>