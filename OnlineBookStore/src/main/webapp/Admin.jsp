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
String fname = (String) session.getAttribute("fname");
out.println("Welcome Admin "+fname+"..<br>");
%>
<jsp:include page="link2.html"/>
</body>
</html>