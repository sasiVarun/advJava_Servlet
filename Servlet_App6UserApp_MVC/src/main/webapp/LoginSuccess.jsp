<%@ page language="java" 
	contentType="text/html; charset=ISO-8859-1"
    pageEncoding="ISO-8859-1"%>
<!DOCTYPE html>
<html>
<head>
<meta charset="ISO-8859-1">
<title>Insert title here</title>
</head>
<body>
<%
String fname = (String) request.getAttribute("fname");
out.println("Welcome user "+fname+"...<br>");
%>
<jsp:include page="link.html"/>
</body>
</html>