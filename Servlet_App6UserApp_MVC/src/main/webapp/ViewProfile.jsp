<%@ page language="java" 
	contentType="text/html; charset=ISO-8859-1"
    pageEncoding="ISO-8859-1"
    import="test.UserBean"%>
<!DOCTYPE html>
<html>
<head>
<meta charset="ISO-8859-1">
<title>Insert title here</title>
</head>
<body>
<%
String fname = (String) request.getAttribute("fname");
out.println("Page of user "+fname+"<br>");
%>
<jsp:include page="link.html"/>
<%
UserBean ub = (UserBean)application.getAttribute("bean");
out.println("<br>"+ub.getfName()+"&nbsp&nbsp"+ub.getlName()+"&nbsp&nbsp"+ub.getAddr()+"&nbsp&nbsp"
		+ub.getmId()+"&nbsp&nbsp"+ub.getPhNo());
%>
</body>
</html>