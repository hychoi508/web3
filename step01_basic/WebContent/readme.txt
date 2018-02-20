web 학습 핵심 내용

1. 개발 및 실행 환경
	1) jdk
		- jdk 1.8
	2) web server 
		- tomcat8.5
	3) 브라우저 
		1) + 2) + 3) 필수.
	4) eclipse 는 옵션이다. 
		써도 되고, 안써도 되고. 
	
2. servlet 개발 기술
	1) java 문법은 필수.
	2) 스펙
		- 개발 명령만으로 조합된 interface로 제공. 
		- 웹 스펙에 맞게 활용.
		- (구)sun업체에서 제시한 스펙에서 server만드는 벤더사들이 스펙에 맞게 서버 개발. 
		: web app 개발 후 "tomcat" or "web 로직" or "웹스피어"에서 실행 가능하다.
	3) 결과적으로, 자바 기반 스펙에 맞게 실행 감지, 서비스 가능한 jdk and web container and 서비스 로직 필수.

3. 주요 API 함수
	1) javax.servlet.http.HttpServlet
		- http 개발 및 지원한다.
		- 제공하는 메소드가 w3c에서 제시하는 스펙에 맞게 실행되는 메소드 제공.
			(1) doGet() : get방식 처리 메소드, 방식 구분을 web container가 인식하여 호출.
			(2) doPost() : post방식 처리 메소드, 방식 구분을 web container가 인식하여 호출. 
	2) javax.servlet.http.HttpServletRequest    """"Request""""임.
		(1) 용도
			- client가 전송하는 데이터 & client 시스템 정보(ip) 보유한 API이다. 
			- 생성시점 : client가 브라우저로 요청시.(web container가 요청 감지하자마자 생성) 
		(2) String getParameter("데이터 구분자")                     ==== // String id = request.getParameter("id"); 이후 == 구분<input type="text" name="id">
			- client가 전송한 데이터 획득 메소드이다. 
		(3) 접속한 client별 1:1로 생성
	3) javax.servlet.http.httpServletResponse """""Response"""""임.
		(1) 용도
			- 접속한 client에게만 응답 지원.
		(2) 구조
			- 응답 데이터 & 형식은 서비스 로직에서 결정                                    ==== // 서비스로직은 response.setContentType("text/html;charset=utf-8");
			- 한글 데이터 응답 - charset=utf-8, charset=euc-kr
				(tip : 이클립스 개발 소스들의 인코딩도 동일하게 설정, utf-8)
			- html 형태로 응답
				- 설정 :text/html
				- 서버입장에서는 순수 문자열로 html tag들을 표현
				- 브라우저입장에서는 text/html 설정 정보를 기반으로 html 실행준비를 하고 응답받은 문자열을 html로 변환과 실행하는 담당. 

	★★★★★
	client : HttpServlet 객체 수 : httpServeletRequest 객체 수 : httpServeletResponse 객체수 
= 100명 :    1개 (클래스 수)   :           100개           			     :          100개.        === Servlet이란 클라이언트 수만큼 100개가 아니라. 객체 1개만 생성. 
	
	

4. Http 프로토콜의 요청방식 학습. // (3-3)과 연결되어 있습니다.
	1) get
		- 고객이 서버에 전송하는 데이터가 url 주소줄에 open되어 전송
		- 고객데이터가 주소줄에 open되다보니, 보완되지 않은 데이터 전송 또는 즐겨찾기용 표현식에 주로 사용한다. 
		- http://localhost/step01_basic/loginCheck?id=tester&pw=
		- get 코딩방식은 method를 생략하거나, method get을 넣어주면 된다.
			<form action="loginCheck">
			<form action="loginCheck" method ="get">
		
	2) post
		- 보안을 고려한 데이터를 서버에 전송하거나, 게시글처럼 양 많은 데이터를 서버에 전송시 사용.
		- http://localhost/step01_basic/loginCheck
		- post 코딩방식은. moethod post를 입력해주어야 한다. 
			<form action="loginCheck" method ="post">
		
		
		
5. Http의 url 표현식 ★★★★★
	1) http:// ip:port / project이름 / service파일명
	
	2) 예시
	http:// localhost:80 / step01_basic / step01.html
	
	3) post와 get의 url 차이 ★★★
		- ? 표기를 기준으로 고객이 서버에 전송하는 데이터 보인다면 get방식
		- ? 표기를 기준으로 고객이 서버에 전송하는 데이터 안 보인다면 post방식
		
	