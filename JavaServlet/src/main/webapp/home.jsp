<%@ page language="java" contentType="text/html; charset=ISO-8859-1"
    pageEncoding="ISO-8859-1" errorPage="error.jsp"%>
<!DOCTYPE html>
<html>
<head>
<meta charset="ISO-8859-1">
<title>Insert title here</title>
</head>
<body>
<% 
           pageContext.setAttribute("name","priya",pageContext.SESSION_SCOPE);
           
          int k=9/0;
    
%>
</body>
</html>