<%@ page language="java" contentType="text/html; charset=UTF-8"
    pageEncoding="UTF-8"%>
<!DOCTYPE html>
<html>
<head>
<style>

h1{
font-size:2rem;
margin:20px auto;
color:white;
}

</style>
<meta charset="UTF-8">
<title>Insert title here</title>
</head>
<body style="background-color:black;">

<%
HttpSession sess=request.getSession(false) ;

if(sess!=null  && sess.getAttribute("user") != null){
 
	String username=(String)sess.getAttribute("user");
%>

<h1 style="color:red" >welcome to user <%=username %> </h1>



<%} %>

</body>
</html>