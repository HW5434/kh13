<%@ page language="java" contentType="text/html; charset=UTF-8"
    pageEncoding="UTF-8"%>
<%@ taglib prefix="c" uri="http://java.sun.com/jsp/jstl/core" %>
<jsp:include page="/WEB-INF/views/template/header.jsp"></jsp:include>

<h1>등급별 인원수 출력</h1>

<table border = "1" width = "250">
	<thead>
		<tr>
			<th>등급</th>
			<th>인원 수</th>
		</tr>
	</thead>
	
	<tbody>
		<c:forEach var="statVO" items="${list}">
			<tr>
				<th>${statVO.title}</th>
				<th>${statVO.count}</th>
			</tr>
		</c:forEach>
	</tbody>
</table>

<jsp:include page="/WEB-INF/views/template/footer.jsp"></jsp:include>