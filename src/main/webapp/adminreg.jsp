<%@ page language="java" contentType="text/html; charset=UTF-8"
    pageEncoding="UTF-8"%>
<!DOCTYPE html>
<html>
<head>
<meta charset="UTF-8">
<title>Insert title here</title>
<link rel="stylesheet" href="${pageContext.request.contextPath}/adminregcss.css">
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
    <h1 style="height:10px">Admins Registered</h1>

    <form action="adminreg" method="post">
    
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
<div class="lamb">
 <label for="password">Admin id</label>
<input type="password" placeholder="Server id" name="Adid" id="password" />
</div>
<input type="submit" value="Sign Up" />
</form>
<% String error=request.getParameter("error");
		 if(error!=null && error.equals("1")){%>
		 <p style="text-transform:capitalize;color:red;font-size:1.2rem">invalid user try to access admin port</p>
		 
		 <%} %>
</div>
</div>
</div>
</div>
</body>
</html>