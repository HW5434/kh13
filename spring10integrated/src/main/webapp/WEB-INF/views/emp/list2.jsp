<%@ page language="java" contentType="text/html; charset=UTF-8"
	pageEncoding="UTF-8"%>
<%@ taglib prefix="c" uri="http://java.sun.com/jsp/jstl/core"%>

<%-- 템플릿 페이지를 불러오는 코드 --%>
<jsp:include page="/WEB-INF/views/template/header.jsp"></jsp:include>

<%-- 레이아웃 시작 --%>

<!DOCTYPE html>
<html lang="ko">
<head>
<meta charset="UTF-8">
<meta name="viewport" content="width=device-width, initial-scale=1.0">
<title>메뉴 디자인</title>

<!-- 구글 폰트 -->
<link rel="preconnect" href="https://fonts.googleapis.com">
<link rel="preconnect" href="https://fonts.gstatic.com" crossorigin>
<link
	href="https://fonts.googleapis.com/css2?family=Noto+Sans+KR:wght@100..900&display=swap"
	rel="stylesheet">

<!-- 내가 구현한 스타일 -->
<link rel="stylesheet" type="text/css" href="commons.css">
<link rel="stylesheet" type="text/css" href="test.css">

<!-- font awesome 아이콘 CDN -->
<link rel="stylesheet" type="text/css"
	href="https://cdnjs.cloudflare.com/ajax/libs/font-awesome/6.5.1/css/all.min.css">
<style>
html, body {
	margin: 0%;
	padding: 0%;
}

main {
	width: 1100px;
	margin: 0 auto;
}

header {
	padding: 10px;
}

section {
	display: flex;
	min-height: 400px;
	padding: 10px;
}

aside {
	display: flex;
	width: 200px;
}

article {
	flex-grow: 1;
	padding: 5px;
}

footer {
	padding: 10px;
}
</style>

</head>
<body>

	<main>
		<header>
			<%-- 페이지 제목 --%>
			<c:choose>
				<c:when test="${isSearch}">
					<h1>사원 검색</h1>
				</c:when>
				<c:otherwise>
					<h1>사원 목록</h1>
				</c:otherwise>
			</c:choose>
		</header>

		<section>
			<aside>
				<div class="cell">
					<div>
						<img src="http://via.placeholder.com/200x200?text=img">
					</div>

					<div>
						<h2>
							<a href="insert">1. 신규 사원 등록</a>
						</h2>
					</div>

					<div>
						<h2>2 . 목록</h2>
					</div>

				</div>
			</aside>

			<article>
				<form action="deleteAll" method="post">
					<%-- 목록 출력 --%>
					<div class="cell px-50">
						<table class="table table-horizontal">
						<thead>
							<tr>
								<c:if test="${sessionScope.loginLevel == '관리자'}">
									<th><input type="checkbox" class="check-all"></th>
								</c:if>
								<th>사원번호</th>
								<th>사원명</th>
								<th>부서명</th>
								<th>입사일</th>
								<!-- 			<th>급여액</th> -->
							</tr>
						</thead>
						<tbody align="center">
							<c:forEach var="dto" items="${list}">
								<tr>
									<td><input type="checkbox" class="check-item" name="empNo"
										value="${dto.empNo}"></td>
									<td>${dto.empNo}</td>

									<c:if test="${sessionScope.loginLevel == '관리자'}">
										<td><a href="detail?empNo=${dto.empNo}">${dto.empName}</a></td>
									</c:if>

									<td>${dto.empDept}</td>
									<td>${dto.empDate}</td>
									<%-- <td>${dto.empSal}원</td> --%>
								</tr>
							</c:forEach>
						</tbody>
					</table>
					</div>
					
			</article>
		</section>
	</main>

</body>
</html>

<%-- 레이아웃 끝 --%>










<%--삭제버튼 --%>
<c:if test="${sessionScope.loginLevel == '관리자'}">
	<div class="cell right">
		<button class="btn negative">전체삭제</button>
	</div>
</c:if>
</form>


<%-- 템플릿 페이지를 불러오는 코드 --%>
<jsp:include page="/WEB-INF/views/template/footer.jsp"></jsp:include>

