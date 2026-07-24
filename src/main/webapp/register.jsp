<%@ page language="java" contentType="text/html; charset=UTF-8"
    pageEncoding="UTF-8"%>
<!DOCTYPE html>
<html>
<head>
<meta charset="UTF-8">
<title>Insert title here</title>
<link rel="stylesheet" href="${pageContext.request.contextPath}/register.css">
<link rel="stylesheet"
href="https://cdnjs.cloudflare.com/ajax/libs/font-awesome/6.5.1/css/all.min.css">
<meta charset="UTF-8">
</head>
<body>
   <div class="blacker"> 
<div class="contain1">

</div>
<div class="contain2">
    <div class="c1">
    <h1 style="height:10px">Register</h1>

    <form action="register" method="post">
    
<div class="lamb">
    <label for="username" >Username</label>
    
<input type="text" placeholder="username" id="username"  name="username"/>
</div>

<div class="lamb">
 <label for="email" >EMAIL</label>
<input type="email" placeholder="email" id="email"  name="email"/>
</div>
<div class="lamb">
 <label for="password">Password</label>
<input type="password" placeholder="password" name="password" id="password" />
</div>
<input type="submit" value="Sign Up" />
</form>

<%
String err=request.getParameter("error");
		 
		 if(err !=null && err.contains("1")){
			 
		 
		 

%>
<p style="text-transform:capitalize;color:red;font-size:1.2rem">registration failed</p>
<%} %>

</div>
</div>
</div>
</div>
</body>
</html>