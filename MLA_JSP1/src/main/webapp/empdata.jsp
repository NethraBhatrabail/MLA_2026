<%@ page language="java" contentType="text/html; charset=UTF-8"
    pageEncoding="UTF-8"%>
<!DOCTYPE html>
<html>
<head>
<meta charset="UTF-8">
<title>empdata</title>
</head>
<body>
       <h1 align="center">:: Employee Data ::</h1>
       
       <jsp:useBean id="emp" class="com.test.Employee"> <!-- create object from the classes -->
       
       </jsp:useBean>
       
       <jsp:setProperty property="*" name="emp"/>
       
       ID : <jsp:getProperty property="id" name="emp"/> &nbsp 
       
       Name : <jsp:getProperty property="name" name="emp"/> &nbsp 
       
       Company : <jsp:getProperty property="cmp" name="emp"/> &nbsp   <!-- nbsp is to give the space b/w the words -->
       
       Designation : <jsp:getProperty property="dsg" name="emp"/>
       
       
</body>
</html>