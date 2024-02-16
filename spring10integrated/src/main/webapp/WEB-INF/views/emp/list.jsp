<%@ page language="java" contentType="text/html; charset=UTF-8"
    pageEncoding="UTF-8"%>   
<%@ taglib prefix="c" uri="http://java.sun.com/jsp/jstl/core"%>
    
 <%-- 템플릿 페이지를 불러오는 코드 --%>
<jsp:include page="/WEB-INF/views/template/header.jsp"></jsp:include>
   
    <%-- 페이지 제목 --%>
    <c:choose>
    	<c:when test="${isSearch}">
    	<h1>사원 검색</h1>
    	</c:when>
    	<c:otherwise>
    	<h1>사원 목록</h1>
    	</c:otherwise>
    </c:choose>
    
     <%-- 검색 장치 만들기 --%>
    <form action="list" method="get">
    	<select name="column">
    	
    <c:choose>
    	<c:when test="${param.column == 'emp_name'}">
    		<option value="emp_name" selected>사원명</option>
    	</c:when>
    	<c:otherwise>
   			<option value="emp_name" >사원명</option>
    	</c:otherwise>
    </c:choose>
    
    <c:choose>
    	<c:when test="${param.column == 'emp_name'}">
    		<option value="emp_dept" selected>부서명</option>
    	</c:when>
    	<c:otherwise>
   			<option value="emp_dept" >부서명</option>
    	</c:otherwise>
    </c:choose>
    
    <c:choose>
    	<c:when test="${param.column == 'emp_name'}">
    		<option value="emp_date" selected>입사일</option>
    	</c:when>
    	<c:otherwise>
   			<option value="emp_date">입사일</option>
    	</c:otherwise>
    </c:choose>
    
    <c:choose>
    	<c:when test="${param.column == 'emp_name'}">
    		<option value="emp_sal" selected>급여액</option>
    	</c:when>
    	<c:otherwise>
   			<option value="emp_sal">급여액</option>
    	</c:otherwise>
    </c:choose>
    	</select>
    	
    	<input type="search" name="keyword"  placeholder="검색어 입력" value="${param.keyword}">
    	<button>검색</button>
    </form>
    
    <%-- 표(테이블) 만들기 --%>
    <table class="table table-horizontal">
    	<thead align="center">
    		<tr>
    			<th>사원번호</th>
    			<th>사원명</th>
    			<th>부서명</th>
    			<th>입사일</th>
    			<th>급여액</th>
    		</tr>
    	</thead>
    	<tbody align="center">
    		<c:forEach var="dto" items="${list}">
    			<tr>
	    			<td>
	    			<a href="detail?empNo=${dto.empNo}">${dto.empNo}</a>
	    			</td>
	    			<td>${dto.empName}</td>
	    			<td>${dto.empDept}</td>
	    			<td>${dto.empDate}</td>
	    			<td align="right">${dto.empSal}원</a>
	    			</td>
    			</tr>
    		</c:forEach>
    	</tbody>
    </table> 

<%-- 템플릿 페이지를 불러오는 코드 --%>
<jsp:include page="/WEB-INF/views/template/footer.jsp"></jsp:include>    
    
   