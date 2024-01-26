<%@ page language="java" contentType="text/html; charset=UTF-8"
    pageEncoding="UTF-8"%>
<%@ taglib prefix="c" uri="http://java.sun.com/jsp/jstl/core" %>

<jsp:include page="/WEB-INF/views/template/header.jsp"></jsp:include>

<h1>포켓몬스터 종류별 개체수</h1>

<table border="1" width = "250">
	<thead align="center">
		<tr>
			<th width="30%">속성</th>
			<th>개체수</th>
		</tr>
	</thead>
	<tbody align="center">
		<c:forEach var="statVO" items="${list}">
			<tr>
				<td>${statVO.title}</td>
				<td>${statVO.count}</td>
			</tr>		
		</c:forEach>
	</tbody>
</table>

<jsp:include page="/WEB-INF/views/template/footer.jsp"></jsp:include>