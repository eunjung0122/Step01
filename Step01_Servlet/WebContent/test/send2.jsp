<%@page import="java.io.PrintWriter"%>
<%@ page language="java" contentType="text/html; charset=UTF-8"
    pageEncoding="UTF-8"%>
<%
	request.setCharacterEncoding("utf-8");
	String str=request.getParameter("msg");
	System.out.println("전송된 문자열:"+str);
%>
<!DOCTYPE html>
<html>
<head>
<meta charset="UTF-8">
<title>Insert title here</title>
</head>
<body>
	<p>전송한 문자열 잘 받았습니다</p>
	<p><strong><%=str %></strong> 이 내용이 맞죠?</p>
</body>
</html>