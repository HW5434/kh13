<%@ page language="java" contentType="text/html; charset=UTF-8"
    pageEncoding="UTF-8"%>

<%-- 템플릿 페이지를 불러오는 코드 --%>
<jsp:include page="/WEB-INF/views/template/header.jsp"></jsp:include>

<%-- 자바스크립트 --%>

<script type="text/javascript">
        function checkEmpName() {
            var inputTarget = document.querySelector("[name=empName]");
            var regex = /^[가-힣]{2,7}$/;
            var isValid = regex.test(inputTarget.value);
   
            inputTarget.classList.remove("success" , "fail");
            inputTarget.classList.add(isValid ? "success" : "fail");
            return isValid;
        }
        function checkEmpDept() {
            var inputTarget = document.querySelector("[name=empDept]");

            var regex = /^[가-힣a-zA-Z0-9]+$/;
            var isValid = regex.test(inputTarget.value);

            inputTarget.classList.remove("success" , "fail");
            inputTarget.classList.add(isValid ? "success" : "fail");
            return isValid;
        }
        function checkEmpDate() {
            var inputTarget = document.querySelector("[name=empDate]");

            var regex = /^(19[0-9]{2}|20[0-9]{2})-(02-(0[1-9]|1[0-9]|2[0-8])|(0[469]|11)-(0[1-9]|1[0-9]|2[0-9]|30)|(0[13578]|1[02])-(0[1-9]|1[0-9]|2[0-9]|3[01]))$/;
            var isValid = regex.test(inputTarget.value);

            inputTarget.classList.remove("success" , "fail");
            inputTarget.classList.add(isValid ? "success" : "fail");
            return isValid;
        }
            
        function checkEmpSal() {
            var inputTarget = document.querySelector("[name=empSal]");

            var regex = /^[0-9]+$/;
            var isValid = regex.test(inputTarget.value);

            inputTarget.classList.remove("success" , "fail");
            inputTarget.classList.add(isValid ? "success" : "fail");
            return isValid;
        }

        function checkForm() {
            var isValid1 = checkEmpDept();
            var isValid2 = checkEmpDept();
            var isValid3 = checkEmpDate();
            var isValid4 = checkEmpSal();
            return isValid1 && isValid2 && isValid3 && isValid4;
        }
    </script>

<%--
	절대경로
	<form action="/emp/insert2"></form>

	상대경로
	<form action="insert2"></form>	
 --%>
 
<form action="insert" method="post" autocomplete="off" 
                            onsubmit="return checkForm();">
    <div class="container w-500">
        <div class="cell center">
            <h1>사원 등록</h1>
        </div>
        <div class="cell">
            <label>사원명</label>
            <input class="tool w-100" type="text" name="empName" 
                        placeholder="사원이름을 작성하세요." onblur="checkEmpName();">
            <div class="success-feedback">이름의 형식에 맞습니다</div>
            <div class="fail-feedback">올바른 이름을 작성하세요</div>
         </div>

         <div class="cell">
            <label>부서명</label>
            <input class="tool w-100" type="text" name="empDept" 
                        placeholder="부서이름을 작성하세요." onblur="checkEmpDept();">
            <div class="fail-feedback">부서를 반드시 설정하세요</div>
         </div>

         <div class="cell">
            <label>입사일</label>
            <input class="tool w-100" type="date" name="empDate"
                        onblur="checkEmpDate();">
            <div class="fail-feedback">잘못된 날짜 형식입니다</div>
         </div>
         <div class="cell">
            <label>급여액</label>
            <input class="tool w-100" type="number" name="empSal" 
                        placeholder="금여액을 작성하세요." onblur="checkEmpSal();">
            <div class="fail-feedback">급여는 숫자로 작성하세요</div>
         </div>

         <button class="btn positive w-100">
            <i class="fa-solid fa-save"></i>
            등록 
        </button>
    </div>
</form>
 
 
 <%-- 템플릿 페이지를 불러오는 코드 --%>
<jsp:include page="/WEB-INF/views/template/footer.jsp"></jsp:include>
 
 
 
 