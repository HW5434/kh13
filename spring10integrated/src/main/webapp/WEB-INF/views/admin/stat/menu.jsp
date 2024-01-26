<%@ page language="java" contentType="text/html; charset=UTF-8"
    pageEncoding="UTF-8"%>
<%@ taglib prefix="c" uri="http://java.sun.com/jsp/jstl/core" %>

<jsp:include page="/WEB-INF/views/template/header.jsp"></jsp:include>

<h1>유형별 메뉴 개수 출력</h1>

<table border="1" width = "250" >
	<thead align="center">
		<tr>
			<td width="45%">메뉴종류</td>
			<td>종류개수</td>
		</tr>
	</thead>

	<tbody align="center">
		<c:forEach var="statVO" items="${list}">
			<tr >
				<td>${statVO.title}</td>
				<td align="right">${statVO.count}개</td>
			</tr>
		</c:forEach>
	</tbody>
</table>

<jsp:include page="/WEB-INF/views/template/footer.jsp"></jsp:include>
