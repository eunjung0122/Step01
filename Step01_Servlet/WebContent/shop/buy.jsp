<%@ page language="java" contentType="text/html; charset=UTF-8"
    pageEncoding="UTF-8"%>
<%
	//여기는 서블릿의  service() 메소드 안쪽이라고 생각하면 된다
	
	//Get 방식 전송된 파라미터 추출하기
	String number=request.getParameter("num");
	String type=request.getParameter("type");
	int num=Integer.parseInt(number);
	
	//추출된 내용을 콘솔창에 출력해보기
	System.out.println("num: "+num+" type: "+type);
%>
<!DOCTYPE html>
<html>
<head>
<meta charset="UTF-8">
<title>Insert title here</title>
</head>
<body>
	<h1>구매정보</h1>
	<p>
		<strong><%=num %></strong> 번 상품 
		<strong><%=type %></strong>종류의 물품구매에 성공했습니다 
	</p>
	<script>
		alert("<%=num%>번 상품 구매에 성공했습니다.");
	</script>
</html>