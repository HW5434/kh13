<%@ page language="java" contentType="text/html; charset=UTF-8"
    pageEncoding="UTF-8"%>

<jsp:include page="/WEB-INF/views/template/header.jsp"></jsp:include>

    <h1>회원가입</h1>
    
    <form action="join" method="post">
	    ID * <input name="memberId" type="text" placeholder="소문자 시작, 숫자 포함 8~20"><br><br>    
	   	PW * <input name="memberPw" type="password" placeholder="대소문자, 숫자 ,특수문자 "><br><br>    
	   	닉네임 * <input name="memberNick" type="text" required placeholder="한글숫자 2~10"><br>    <br>
	   	이메일 * <input name="memberEmail" type="email" required><br> <br>
	   	생년월일<input name="memberBirth" type="date"><br><br>
	   	휴대전화<input name="memberContact" type="tel"><br><br>
	   	주소 <br><br>
	   	<input type="text" name="memberPost" placeholder="우편번호"><br><br>
	    <input type="text" name="memberAddress1" placeholder="기본주소"><br><br>
	    <input type="text" name="memberAddress2" placeholder="상세주소"><br><br>
	   	<button>회원가입</button>
    </form>
    
<jsp:include page="/WEB-INF/views/template/footer.jsp"></jsp:include>    
