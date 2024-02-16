<%@ page language="java" contentType="text/html; charset=UTF-8"
    pageEncoding="UTF-8"%>

<%@ taglib prefix="c" uri="http://java.sun.com/jsp/jstl/core" %>
<%-- 템플릿 페이지를 불러오는 코드 --%>
<jsp:include page="/WEB-INF/views/template/header.jsp"></jsp:include>
     
    
    
    
    
<!-- for(PocketmonDto dto : list) -->
<%-- "${requestScope.list} --%>



 <body>

        <main>
            <header>
             <h1>
		    	포켓몬 목록
		    	
   			 </h1>
            </header>
            
            <nav>메뉴</nav>
            
            <section>
                <aside>
                <div>
                	<h1>리스트</h1>
	                <span><h2><a href="insert1">신규등록</a></h2></span>
                </div>
                </aside>
                	
                <article>
 
                
<table class="table table-horizontal">
<thead>
	<tr>
		<td>번호</td>
		<td>이름</td>
		<td>속성</td>
	</tr>
</thead>

<tbody>
 <c:forEach var="dto" items="${list}">
	<tr>
		<td>${dto.pocketmonNo}</td>
		<td>${dto.pocketmonName}</td>
		<td> ${dto.pocketmonType}<a href="detail?pocketmonNo=${dto.pocketmonNo}">→</a></td>		
	</tr>
	 </c:forEach>
</tbody>
</table>
<!-- 검색창 -->
			<div class="center">
				<form action="list" method="get">
				
					<select name="column">
						<option value="pocketmon_name">이름</option>
						<option value="pocketmon_type">속성</option>
					</select>
					<input type="search" name="keyword" value="${param.keyword}">
					<button>검색</button>
				</form>
			</div>
                </article>
                
                
            </section>
            <footer>
            	<jsp:include page="/WEB-INF/views/template/navigator.jsp"></jsp:include> 
            </footer>
        </main>

    </body>
    
    <%-- 템플릿 페이지를 불러오는 코드 --%>
<jsp:include page="/WEB-INF/views/template/footer.jsp"></jsp:include>