<%@ page language="java" contentType="text/html; charset=UTF-8"
    pageEncoding="UTF-8"%>
<!DOCTYPE html>
<html>
<head>
<meta charset="UTF-8">
<link rel="stylesheet" href="${pageContext.request.contextPath}/login.css">
<link rel="stylesheet"
href="https://cdnjs.cloudflare.com/ajax/libs/font-awesome/6.5.1/css/all.min.css">
<meta charset="UTF-8">
<title>Insert title here</title>
</head>
<body>
   <div class="blacker"> 
<div class="contain1">
    <div class="c1">
    <h1 style="height:10px">LOGIN</h1>
    <p>How i started to create new world</p>
    <form action="login" method="post">
<input type="text" placeholder="username"  name="username"/>
<input type="password" placeholder="password" name="password" />
<input type="submit" value="Login Now" />

</form>


<% String error=request.getParameter("error");
if(error !=null && error.equals("1")){
%>
<p style="text-transform:capitalize;color:red;font-size:1.2rem">invalid user trying to access the data</p>
<%} %>

<div class="manuplate" style="display:flex"> 
<hr class="dos" style="width:30%  ;margin-top: 25px; height: 1px; font-weight: bolder;"><p Style="font-Size:1.1rem;color:black"><strong>Login</strong> with other</p><hr class="dos" style="width:30%  ;margin-top: 25px; height: 1px; font-weight: bolder;">
</div>
<div class="me">
<div class="me1">
<p><i class="fa-brands fa-google" style="color:orange"></i>Login with <strong font-weight:900>google</strong></p>
</div>
<div class="me1">
<p><i class="fa-brands fa-square-facebook" style="color:blue"></i>Login with<strong style="font-weight:900"> facebook </strong></p>
</div>
</div>
</div>
</div>
<div class="contain2">

</div>
</div>
</body>
</html>