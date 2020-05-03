<%@ page language="java" contentType="text/html; charset=ISO-8859-1"
    pageEncoding="ISO-8859-1"%>
<!DOCTYPE html>
<html>
<head>
     <meta http-equiv="Content-Type" content="text/html; charset=UTF-8"> 
     <link rel="stylesheet" type="text/css" href="css/style.css">
     <title>logout Page</title>
     
     <style>
     h1,a,h3
     {
     color:white;
     text-align: center;
      margin-top: 150px;
     }
     
     
     body
  {
  background-image: url("images/adminlogout.jpeg");
  
  height: 100%;
background-position: center;
  background-repeat: no-repeat;
  background-size: cover;
  }
     
    </style> 
</head>
<body>
     <%     
         session.removeAttribute("adminId");
         session.removeAttribute("password");
         session.invalidate();
     %>
<center>
     <h1>You have successfully logged out</h1>
     <h3>To login again</h3> <a href="adminlogin.jsp">click here</a>.
</center>
</body>
</html>