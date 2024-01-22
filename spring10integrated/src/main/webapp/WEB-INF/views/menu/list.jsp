<%@ page language="java" contentType="text/html; charset=UTF-8"
    pageEncoding="UTF-8"%>

<h1>메뉴 목록</h1>
    
    <form action="list" method="get">
    <select name="column">
    	<option value="menu_name_kor" ${param.column == 'menu_name_kor' ? 'selected' : ''} }>메뉴명(한글)</option>
    	<option value="menu_name_eng" ${param.column == 'menu_name_eng' ? 'selected' : ''} }>메뉴명(영문)</option>
    	<option value="menu_type" ${param.column == 'menu_type' ? 'selected' : ''} }>메뉴유형</option>
    </select>
    <input type="text" name="keyword" placeholder="검색어 입력" required value="">
    </form>
<%@ taglib prefix="c" uri="http://java.sun.com/jsp/jstl/core"%>
<%@ taglib prefix="fmt" uri="http://java.sun.com/jsp/jstl/fmt" %>    
    
<table border="1">
    <thead>
	    <tr>
	    <th>메뉴번호</th>
	    <th>메뉴이름</th>
	    <th>메뉴유형</th>
	    <th>판매가격</th>
	    </tr>
    </thead>
    
<thead align="center">
    <c:forEach var="dto" items="${list}">
	    <tr>
	    <td>${dto.menuNo}</td>
	    <td>${dto.menuNameKor} ${dto.menuNameEng}</td>
	    <td>${dto.menuType}</td>
	    <td align="right">
	    	<fmt:formatNumber value="${dto.getPrice()}" pattern="#,##0.00"/>
	   		원
	    </td>
	    </tr>
	</c:forEach>
</thead>
    
    
    </table>