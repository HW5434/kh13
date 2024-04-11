<%@ page language="java" contentType="text/html; charset=UTF-8"
    pageEncoding="UTF-8"%>
    
<h1>Basic 웹소켓 예제</h1>

<button class="btn-connect">연결</button>
<button class="btn-disconnect">종료</button>

<!-- JS 처리 -->
<script src="https://cdn.jsdelivr.net/npm/jquery@3.7.1/dist/jquery.min.js"></script>
   <script type="text/javascript">
   $(function(){
       //연결 버튼을 누르면 웹소켓 생성, 종료 버튼을 누르면 웹소켓 소멸
       
       //[1]
     //  var socket; //변수를 밖에 만들면 연결 /종료 에서 다 사용가능
       $(".btn-connect").click(function(){
           
          // var socket = new WebSocket("연결 주소");  //WebSocket은 내장 주소 
        //   var socket = new WebSocket("ws://localhost:8080/ws/basic"); //앞에 프로토콜이 달라서 주소를 생략하면 안된다 
           //[2] 상위에 다가 만들어버리기
           window.socket = new WebSocket("ws://localhost:8080/ws/basic");
       });
       $(".btn-disconnect").click(function(){
           window.socket.close();
        //   socket.close();
       });
       
   });
 
 </script>