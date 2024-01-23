<%@ page language="java" contentType="text/html; charset=UTF-8"
    pageEncoding="UTF-8"%>

    <%@ taglib prefix="c" uri="http://java.sun.com/jsp/jstl/core"%>
<%-- 템플릿 페이지를 불러오는 코드 --%>
<jsp:include page="/WEB-INF/views/template/header.jsp"></jsp:include>    
    <h1>사원 상세정보</h1>
    
    <h2><a href="delete?empNo=${dto.empNo}" >사원 등록 하기</a></h2>
    
    
    <c:choose>
    	<c:when test="${dto != null}">
    	
    	<table border="1" width = "400">
    	<tr>
	    	<th width = "30%">사원번호</th>
	    	<td>${dto.empNo}</td>
    	</tr>
    	<tr>
	    	<th>사원명</th>
	    	<td>${dto.empName}</td>
    	</tr>
    	<tr>
	    	<th>부서명</th>
	    	<td>${dto.empDept}</td>
    	</tr>
    	<tr>
	    	<th>입사일</th>
	    	<td>${dto.empDate}</td>
    	</tr>
    	<tr>
	    	<th>급여액</th>
	    	<td>${dto.empSal}</td>
    	</tr>
    	
    	<tfoot>
    		<tr>
	    		<th>바로가기</th>
	    		<td><a href="list">목록보기</a>,
	    		
	    		</td>
    		</tr>
  	</tfoot>
    </table>
    	</c:when>
    	
    	<c:otherwise>존재하지 않는 사원</c:otherwise>
    </c:choose>
    
<%-- 템플릿 페이지를 불러오는 코드 --%>
<jsp:include page="/WEB-INF/views/template/footer.jsp"></jsp:include>    
    
    
    
    