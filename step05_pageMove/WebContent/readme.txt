1. 실습 
	pagemove.html & OneServlet.java
	
	1. servlet의 lifecycle 학습
	
	2. html tag에 한해서만 page 이동방식 학습.
		1. a 앵커, 링크 tag
		2. 단순 button
		3. form
		
2. servlet api를 활용한 page 이동.

순서 ★★★★
	서블릿을 알면 jps 날로 머근다. 
	
	
	
	html로부터 전송된 
	요청 객체에 새로운 데이터를 setAttribute(object key, Object value) 저장
	forward를 통해 two,로 이동
				html로부터 전송된 web Query string 
		
	
	1. forward[포워드 or 디스패치]
		1. 실행 url
			http://localhost/step04_pageMove/pageMove.html
				two 클릭시
			http://localhost/step04_pageMove/one?name=~~
			
		2. 실행된 소스 순서
			pageMove.html -> one에 매핑된 OneServlet -> two에 매핑된 TwoServlet
			
		3. 원리
			1. one과 two는 서로다른 servlet이나 하나의 servlet으로 간주한다.
			2. 실제 응답하는 시점은? two에서 응답한다. 
			3. pageMove.html에서 발생된 요청으로 인해 one에서 요청객체, 응답객체 생성 및 two 유지.
				- one or two에서 request로부터 web query string 데이터 반환하는 getParameter는  다 사용 가능하다.
		4. 주요 코드
			1. RequestDispatcher
				- page이동을 forward 할 수 있는 API
			2. forward(request, response)
				- 실제 page 이동.
			3. setAttribute(Object key, Object value)
				- 다수의 servlet간 데이터 새로 저장.
			4. getAttribute(Object key)
				setAttribute()  메소드로 저장시킨 데이터만 활용 가능. 
				
				
    2. redirect[리다이렉트]
    	1. 소스 실행 순서 
    		pageMove.html ->
    	2.
    	http://localhost/step04_pageMove/pageMove.html
    	
    3. 응용된 예시 
    	1. 네이버 카페(포워딩)
    		- url 변동없이 db의 데이터들을 java 객체화하여 servlet에서 활용 
    		- page는 지속적으로 이동되었던 상황
    		- forward 방식 사용
    			특정 카페 접속시 실행 된 url이 카페 활동 내내 고정되었단 말이다. 
    		카페는 폐쇄성이 있어서, 회원들만 공유할 수 있다. 보안성 때문에 url고려했다. 
    		
    	2. 네이버 블로그(리다이렉트)
    		- 게시글 별로 url이 가변적이었는데, 이는 db데이터를 자바 객체로 활용해서 화면단까지 출력한 건데.
    			리다이렉트 방식 사용. 
    		블로그 client가 혼란스럽다. 
    		블로그에다 글 쓰면 개인적인 내용을 공유할 수 있다. 나를 어필할 수 있는 자원이 되기에
    		url 마다 가치가 있기에
    		클릭할 때마다 url이 바뀐다. 
    			
    	3. 네이버 로그인 ~ 로그아웃
    		- https://www.naver.com -> 로그인 인증 -> https://www.naver.com
    		
    	4. 네이버 메일 
    	
    	5. 카페 url 바꿈. 
    	
				
				
				
				
				
				
				
				
				
				
				
				
				
				
				