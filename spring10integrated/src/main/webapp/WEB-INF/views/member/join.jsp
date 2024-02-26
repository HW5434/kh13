<%@ page language="java" contentType="text/html; charset=UTF-8"
    pageEncoding="UTF-8"%>

<jsp:include page="/WEB-INF/views/template/header.jsp"></jsp:include>

<form action="join" method="post" enctype="multipart/form-data">
	
	<div class="cell container w-500">
		<h1>회원 정보 입력</h1>
		<div class="cell page">
			<!-- 아이디 비밀번호 -->
			<div>
				<label>아이디 *</label>			 
				<input class="tool w-100" type="text" name="memberId" placeholder="소문자 시작, 숫자 포함 8~20자" required> <br><br>
				<label>비밀번호 *</label>	
				<input class="tool w-100" type="password" name="memberPw" placeholder="대소문자,숫자,특수문자 포함 6~15자" required><br><br>
			</div>
			<!-- 버튼 -->
			<div class="flex-cell">
				<div class="w-100 left">
					<button type="button" class="btn btn-prev">이전</button>
				</div>
				<div class="w-100 right">
					<button type="button" class="btn btn-next">다음</button>
				</div>
			</div>
		</div>
		
		<div class="cell page">
			<!-- 닉네임 비밀번호 -->
			<div>
				<label>닉네임 *</label>			 
				<input class="tool w-100" type="text" name="memberNick" placeholder="한글숫자 2~10자" required> <br><br>	
			</div>
			
			<div class="floating-cell">
				<div class="w-50 left">
					<button type="button" class="btn btn-prev">이전</button>
				</div>
				<div class="w-50 right">
					<button type="button" class="btn btn-next">다음</button>
				</div>
			</div>
		</div>
		
		<div class="cell page">
			<div>
				<label>이메일 *</label>
				<input class="tool w-100" type="email" name="memberEmail" required> <br><br>
				
				<label>생년월일 *</label>
				<input class="tool w-100" type="date" name="memberBirth"> <br><br>
				
				<label>휴대전화 *</label>
				<input class="tool w-100" type="tel" name="memberContact"> <br><br>
			</div>
		
			<div class="floating-cell">
				<div class="w-50 left">
					<button type="button" class="btn btn-prev">이전</button>
				</div>
				<div class="w-50 right">
					<button type="button" class="btn btn-next">다음</button>
				</div>
			</div>
		</div>
		
		<div class="cell page">
			<div>
				<label>주소</label>
					<input class="tool w-100" type="text" name="memberPost" placeholder="우편번호"> <br><br>
					<input class="tool w-100" type="text" name="memberAddress1" placeholder="기본주소"> <br><br>
					<input class="tool w-100" type="text" name="memberAddress2" placeholder="상세주소"> <br><br>
			</div>
				
		
			<div class="floating-cell">
				<div class="w-50 left">
					<button type="button" class="btn btn-prev">이전</button>
				</div>
				<div class="w-50 right">
					<button type="button" class="btn btn-next">다음</button>
				</div>
			</div>
		</div>
		
		<div class="cell page">
			<label>프로필 이미지</label>
			<input class="tool w-100" type="file" name="attach"> <br><br>
		
			<div class="floating-cell">
				<div class="w-50 left">
					<button type="button" class="btn btn-prev">이전</button>
				</div>
				<div class="w-50 right">
					<button type="button" class="btn btn-next">다음</button>
					<button type="submit" class="btn">회원가입</button>
				</div>
			</div>
		</div>
	</div>
</form>

<jsp:include page="/WEB-INF/views/template/footer.jsp"></jsp:include>