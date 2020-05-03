<%@ page language="java" contentType="text/html; charset=ISO-8859-1"
    pageEncoding="ISO-8859-1"%>
<!DOCTYPE html>
<html>
<head>
<meta charset="ISO-8859-1">
<title>Process Failed</title>


<style> 
     h1,a
     {
     color:black;
     text-align: center;
      margin-top: 200px;
     }
     
     
     body
  {
  background-image: url("images/failed.jpeg");
  
  height: 100%;
background-position: center;
  background-repeat: no-repeat;
  background-size: cover;
  }
     
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
  

</style>

</head>
<body>
<h1>Please Try Again!!!!</h1>
<center><a href="home.jsp"><input type="button" value="Back to Home" name="back" class="button"/></a></center>
</body>
</html>