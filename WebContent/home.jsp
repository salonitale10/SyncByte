<%-- <%@ page language="java" contentType="text/html; charset=ISO-8859-1"
    pageEncoding="ISO-8859-1"%> --%>
    <%@page contentType="text/html" pageEncoding="UTF-8"%>
    <%@page import="java.util.List"%>
<%@page import="com.app.service.LoginService"%>
<%@page import="java.util.Date"%>
<%@page import="com.app.model.Employee"%>
<!DOCTYPE html>
<html>
<head>
     <meta http-equiv="Content-Type" content="text/html; charset=UTF-8">
     
     <title>Result Page</title>
     
     
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
  background-image: url("images/profileemp.jpeg");
  
  height: 100%;
background-position: center;
  background-repeat: no-repeat;
  background-size: cover;
  }
  
  </style>
  
</head>
<body>
<center>
     <div id="container">
         <h1>Result Page</h1>
             
             <%=new Date()%></br>
             <%
                 Employee employee = (Employee) session.getAttribute("employee");
             %>     
             <b>Welcome <%= employee.getId() + " " + employee.getName()%></b>     
             <br/>
             <br/>
             
             
             
            <a href="validate.jsp"><input type="button" value="Mark Your Attendance" name="markattendance" class="button"/></a>
             
             <br>
             <br>
             <a href="logout.jsp"><input type="button" value="Logout" name="logout" class="button"/></a>
         </p>
 
         
         <br/>
     </div>
    </center>
</body>
</html>