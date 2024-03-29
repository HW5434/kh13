<%@ page language="java" contentType="text/html; charset=UTF-8"
    pageEncoding="UTF-8"%>
<%@ taglib prefix="c" uri="http://java.sun.com/jsp/jstl/core"  %>

<jsp:include page="/WEB-INF/views/template/header.jsp"></jsp:include>

<h1>부서별 사원 수 출력</h1>

<table border = "1" width = "300">
	<thead>
		<tr>
			<th>부서</th>
			<th>총 인원</th>
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