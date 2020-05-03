<%@ page language="java" contentType="text/html; charset=ISO-8859-1"
    pageEncoding="ISO-8859-1"%>
<!DOCTYPE html>
<html>
<head>
     <meta http-equiv="Content-Type" content="text/html; charset=UTF-8"> 
    
     <title>logout Page</title>
    
     <style> 
     h1,a
     {
     color:white;
     text-align: center;
      margin-top: 200px;
     }
     
     
     body
  {
  background-image: url("images/emplogout.jpeg");
  
  height: 100%;
background-position: center;
  background-repeat: no-repeat;
  background-size: cover;
  }
     
    </style> 
     
</head>
<body>
     <%     
         session.removeAttribute("empId");
         session.removeAttribute("password");
         session.invalidate();
     %>
<center>
     <h1>You have successfully logged out</h1>
     To login again <a href="loginform.jsp">click here</a>.
</center>
</body>
</html>