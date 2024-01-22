<%@ page language="java" contentType="text/html; charset=UTF-8"
    pageEncoding="UTF-8"%>

<%@ taglib prefix="c" uri="http://java.sun.com/jsp/jstl/core" %>

    <h1>포켓몬 목록</h1>
    
    
<!-- for(PocketmonDto dto : list) -->
<%-- "${requestScope.list} --%>

<form action="list" method="get">
	<select name="column">
		<option value="pocketmon_name">이름</option>
		<option value="pocketmon_type">속성</option>
	</select>
	<input type="search" name="keyword" value="${param.keyword}">
	<button>검색</button>
</form>

    <c:forEach var="dto" items="${list}">
    <h2>
    번호 = ${dto.pocketmonNo},
    이름 = ${dto.pocketmonName},
    속성 = ${dto.pocketmonType}
    </h2>
    </c:forEach>