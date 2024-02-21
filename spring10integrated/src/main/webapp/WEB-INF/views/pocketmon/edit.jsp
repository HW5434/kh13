<%@ page language="java" contentType="text/html; charset=UTF-8"
    pageEncoding="UTF-8"%>

<%-- 템플릿 페이지를 불러오는 코드 --%>
<jsp:include page="/WEB-INF/views/template/header.jsp"></jsp:include>    


    


<form action="edit" method="post">
	<div class="container w-500">
		<div class="cell">
			<div class="cell">
				<h1>포켓몬스터 정보 수정</h1>
			</div>
		
			<label>번호</label>
			<input class="tool" type="text" name="pocketmonNo">
		</div>
		 
		<div class="cell">
			<div>
			<label>이름</label>
			</div>
			
			<input class="tool" type="text" name="pocketmonName">  
		</div>
		 
		<div class="cell">
			<label>속성</label>
			<input class="tool" type="text" name="pocketmonType">
		</div>
		
		<button>정보 수정</button>
	</div>
</form>

<%-- 템플릿 페이지를 불러오는 코드 --%>
<jsp:include page="/WEB-INF/views/template/footer.jsp"></jsp:include>