<%@ page language="java" contentType="text/html; charset=UTF-8"
    pageEncoding="UTF-8"%>

<jsp:include page="/WEB-INF/views/template/header.jsp"></jsp:include>

<form action="join" method="post" enctype="multipart/form-data">

<!--  이 페이지에서만 사용할 JS 코드 -->
<script type="text/javascript">
	$(function(){
		//이전, 다음 버튼을 누르면 표시된 페이지의 순서에 맞게 진행바 변경
		calculatePercent(1);
		
		$(".page").find(".btn-prev").click(function(){
			//표시되는 페이지가 몇 번째인가?
			//-> $(대상).index(전체대상)
			//-> 대상은 :visible 이라고 붙이면 표시된 항목을 찾아준다(jQuery 전용)
			var index = $(".page:visible").index(".page") + 1;
			calculatePercent(index);
		});
		$(".page").find(".btn-next").click(function(){
			var index = $(".page:visible").index(".page") + 1;
			calculatePercent(index);
		});
		
		function calculatePercent(page) {
			var total = $(".page").length;
			var percent = page * 100 / total;
			$(".progressbar > .guage").css("width", percent+"%");
		}
	});
</script>
	
	<div class="cell container w-500">
		<h1>회원 정보 입력</h1>
		
		<!-- 진행바 -->
		<div class="cell">
			<div class=" progressbar"><div class="guage"></div></div>
		</div>
		
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