<%@ page language="java" contentType="text/html; charset=UTF-8"
	pageEncoding="UTF-8"%>
<%@ taglib prefix="c" uri="http://java.sun.com/jsp/jstl/core"%>
<%@ taglib prefix="fmt" uri="http://java.sun.com/jsp/jstl/fmt"%>

<%-- 템플릿 페이지를 불러오는 코드 --%>
<jsp:include page="/WEB-INF/views/template/header.jsp"></jsp:include>

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
			<h1>메뉴 목록</h1>
		</header>

		<section>
			<aside>
				<div class="cell">
					<div>
						<img src="http://via.placeholder.com/200x200?text=img">
					</div>

					<div>
						<h2>
							<a href="insert">1. 신규 메뉴 등록</a>
						</h2>
					</div>

					<div>
						<h2>2 . 목록</h2>
					</div>

				</div>
			</aside>

			<article>
				<div>
					<%-- 목록 출력 --%>
					<table class="table table-horizontal">
						<thead>
							<tr>
								<th>메뉴번호</th>
								<th>메뉴이름</th>
								<th>메뉴유형</th>
								<th>판매가격</th>
							</tr>
						</thead>
						<tbody align="center">
							<c:forEach var="dto" items="${list}">
								<tr>
									<td>${dto.menuNo}</td>
									<td><a href="detail?menuNo=${dto.menuNo}">
											${dto.menuNameKor} (${dto.menuNameEng}) </a></td>
									<td>${dto.menuType}</td>
									<%-- <td align="right">${dto.menuPrice}</td> --%>
									<td align="right"><fmt:formatNumber
											value="${dto.menuPrice}" pattern="#,##0" /> 원</td>
								</tr>
							</c:forEach>
						</tbody>
					</table>
				</div>
			</article>
		</section>

	</main>

	<footer>
		<div class="cell center">
			<%-- 검색창 --%>
			<form action="list" method="get">
				<select name="column" class="tool">
					<option value="menu_name_kor"
						${param.column == 'menu_name_kor' ? 'selected' : ''}>메뉴명(한글)</option>
					<option value="menu_name_eng"
						${param.column == 'menu_name_eng' ? 'selected' : ''}>메뉴명(영문)</option>
					<option value="menu_type"
						${param.column == 'menu_type' ? 'selected' : ''}>메뉴유형</option>
				</select> <input class="tool" type="text" name="keyword" placeholder="검색어 입력"
					required value="${param.keyword}">
				<button class="btn">검색</button>
			</form>
		</div>
	</footer>
</body>
</html>







<%-- 네비게이터 출력(구조는 복잡하지만 /board/list와 같지 않을까?) --%>
<jsp:include page="/WEB-INF/views/template/navigator.jsp"></jsp:include>

<%-- 템플릿 페이지를 불러오는 코드 --%>
<jsp:include page="/WEB-INF/views/template/footer.jsp"></jsp:include>








