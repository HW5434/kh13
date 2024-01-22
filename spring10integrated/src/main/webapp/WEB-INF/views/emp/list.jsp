<%@ page language="java" contentType="text/html; charset=UTF-8"
    pageEncoding="UTF-8"%>

    <h1>사원 정보 목록</h1>
    
    <%@ taglib prefix="c" uri="http://java.sun.com/jsp/jstl/core"%>
    
    
    <form action="list" method="get">
    	<select name="column">
    		<option value="emp_name">사원명</option>
    		<option value="emp_dept">부서명</option>
    		<option value="emp_date">입사일</option>
    		<option value="emp_sal">급여액</option>
    	</select>
    	<input type="search" name="keyword"  value="${param.keyword}">
    	<button>검색</button>
    </form>
    
    <c:forEach var="dto" items="${requestScope.list}">
    <h2>${dto.empNo},${dto.empName},${dto.empDept},${dto.empDate},${dto.empSal}</h2>
    </c:forEach>