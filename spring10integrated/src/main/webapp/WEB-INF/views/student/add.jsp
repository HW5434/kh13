<%@ page language="java" contentType="text/html; charset=UTF-8"
    pageEncoding="UTF-8"%>

<jsp:include page="/WEB-INF/views/template/header.jsp"></jsp:include>

<h1>학생 정보 입력</h1>

<form action="add" method="post">
	학생이름 * <input type="text" name="studentName" required placeholder="한글 3글자"><br><br>
	국어점수 * <input type="text" name="koeanScore" required placeholder="입력 숫자는 1~100"><br><br>
	수학점수 * <input type="text" name="mathScore" required placeholder="입력 숫자는 1~100"><br><br>
	영어점수 * <input type="text" name="englishScore" required placeholder="입력 숫자는 1~100"><br><br>
<button>등록하기</button>
</form>

<jsp:include page="/WEB-INF/views/template/footer.jsp"></jsp:include>