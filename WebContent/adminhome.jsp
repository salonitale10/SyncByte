<%@ page language="java" contentType="text/html; charset=ISO-8859-1"
    pageEncoding="ISO-8859-1"%>
<!DOCTYPE html>
<html>
<head>
<meta charset="ISO-8859-1">
<title>Admin Profile</title>

<style>

.button {
  border-radius: 4px;
  background-color: white;
  border: none;
  color: skyblue;
  text-align: center;
  font-size: 15px;
  padding: 20px;
  width: 200px;
  transition: all 0.10s;
  cursor: pointer;
  margin: 5px;
  }
  
  
  body
  {
  background-image: url("images/profileadmin1.jpeg");
  
  height: 100%;
background-position: center;
  background-repeat: no-repeat;
  background-size: cover;
  }
  
  </style>
  
  




</head>
<body>
    <center> <a href="viewemployees.jsp"><input type="button" value="View Employee List" name="viewemp" class="button"/></a></center> 
      <center> <a href="viewattendence.jsp"><input type="button" value="View Attendance List" name="viewemp" class="button"/></a></center>
       <br>
      <center><a href="adminlogout.jsp"><input type="button" value="Logout" name="logout"/></a></center>
</body>
</html>