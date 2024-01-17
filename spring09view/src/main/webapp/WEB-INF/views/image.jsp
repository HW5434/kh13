<%@ page language="java" contentType="text/html; charset=UTF-8"
    pageEncoding="UTF-8"%>

<h1>이미지 실습</h1>

<%-- 
	img 태그
	- 페이지에 이미지를 보여줄 수 있는 효과를 부여
	- 태그만으로는 정보가 부족하므로 속성(attribute)을 통해 추가 정보를 전달
	- 속성은 key = value 형태이며, 속성과 속성 사이는 반드시 띄어쓰기가 필요
	
	-src : 이미지의 경로
	- width : 이미지의 폭(px, %)
	- height : 이미지의 높이(px, %)
	- alt : 접근성 향상을 위한 도움말
--%>

<img width="200px" src="https://images.unsplash.com/photo-1705375240087-b407ce835227?w=400&auto=format&fit=crop&q=60&ixlib=rb-4.0.3&ixid=M3wxMjA3fDB8MHxlZGl0b3JpYWwtZmVlZHwyM3x8fGVufDB8fHx8fA%3D%3D">

<hr>

<img alt="멋진 이미지" width="30%" src="https://images.unsplash.com/photo-1705375240087-b407ce835227?w=400&auto=format&fit=crop&q=60&ixlib=rb-4.0.3&ixid=M3wxMjA3fDB8MHxlZGl0b3JpYWwtZmVlZHwyM3x8fGVufDB8fHx8fA%3D%3D">

<hr>

<%-- 
	프로젝트 외부 위치에 있는 이미지는 보안상의 이유로 src에 설정할 수 없다.
	
	이미지를 프로젝트에 포함시켜야 한다(src/main/resources/static)
	이미지를 해당 위치에 포함시키면 주소가 파일명으로 자동 생성된다
	
	- 프로토콜 생략 : <img width = "400" src="http://localhost:8080/bg.jpg"> 
	- host/port 생략 : <img width = "400" src="/bg.jpg"> 엔드포인트
	위와 같은 방식은 절대경로(absolute path) 라고 부른다	
	
	한편, 다음과 같이 작성해도 된다.
	<img width = "400" src="bg.jpg">
	위와 같은 방식은 상대경로(relative path)라고 부른다
	
	절대경로는 언제나 한결같은 위치를 가리키고
	상대경로는 현재페이지에 따라 다른 위치를 기리킨다
	
--%>

<img width = "400" src="/bg.jpg">

