<%@ page language="java" contentType="text/html; charset=UTF-8"
    pageEncoding="UTF-8"%>
<%@ taglib prefix="c" uri="http://java.sun.com/jsp/jstl/core" %>
<jsp:include page="/WEB-INF/views/template/header.jsp"></jsp:include>

<h1>${memberDto.memberId}님의 게시글</h1>

<table border="1" width="300">
	<tr>
    <th width="35%">게시글 번호</th>
    <td>${boardDto.boardNo}</td>
  </tr>
  
  <tr>
    <th>게시글 제목</th>
    <td>${boardDto.boardTitle}</td>
  </tr>
  
  <tr>
    <th>게시글 내용</th>
    <td>${boardDto.boardContent}</td>
  </tr>
  
  <tr>
    <th>좋아요 수</th>
    <td>${boardDto.boardReadcount}</td>
  </tr>
</table>

<h3><a href="list">목록으로</a></h3>
<h3><a href="#">수정하기</a></h3>
<h3><a href="#">삭제하기</a></h3>

<jsp:include page="/WEB-INF/views/template/footer.jsp"></jsp:include>