<%@ page language="java" contentType="text/html; charset=UTF-8"
    pageEncoding="UTF-8"%>
    
    <%@ page errorPage="error.jsp" %>  <!-- this will go to error.jsp class , without this line you need to use try catch for exception --> 
<!DOCTYPE html>
<html>
<head>
<meta charset="UTF-8">
<title>exception</title>
</head>
<body>
  <%
	  int x = 100;
	  int y = 0;
	  
	  out.println(x/y);
  //here try catch if we dont want to redirect to error.jsp 
  %>

</body>
</html>