<%@ page language="java" contentType="text/html; charset=UTF-8"
    pageEncoding="UTF-8"%>
    
<h1>Simple 웹소켓 예제</h1>

<button class="btn-connect">연결</button>
<button class="btn-disconnect">종료</button>

<hr>

<!--  누르면 전송되는 버튼을 배치 -->
<button class= "btn-word">Hello</button>
<button class= "btn-word">Hi</button>
<button class= "btn-word">Goodbye</button>
<button class= "btn-word">Great</button>

<!-- JS 처리 -->
<script src="https://cdn.jsdelivr.net/npm/jquery@3.7.1/dist/jquery.min.js"></script>
   <script type="text/javascript">
 $(function(){
	//연결 버튼을 누르면 웹소켓 생성, 종료 버튼을 누르면 웹소켓 소멸
	$(".btn-connect").click(function(){
		//var socket = new WebSocket("연결주소"); //자바스크립트 기본제공
		window.socket = new WebSocket("ws://localhost:8080/ws/simple");
	});
	
	$(".btn-disconnect").click(function(){
		window.socket.close();
	});
	
	//단어 버튼을 누르면 서버로 메세지를 전송
	//window.socket.send(메세지);
	$(".btn-word").click(function(){
			var text = $(this).text(); //버튼에 써있는 글자를 불러와서
			window.socket.send(text);//서버로 전송!
	});
 });
 
 </script>