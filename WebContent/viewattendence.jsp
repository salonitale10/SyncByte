<%@ page language="java" contentType="text/html; charset=ISO-8859-1"
    pageEncoding="ISO-8859-1"%>
    
     <%@page import="java.util.List"%>
 <%@page import="com.app.service.AdminLoginService"%>
<%@page import="java.util.Date"%>
<%@page import="com.app.model.AttendanceRecord"%>
<!DOCTYPE html>
<html>
<head>
<meta charset="ISO-8859-1">
<title>Attendance Record List</title>

<style>
table {
  border-collapse: collapse;
  width: 100%;
}

th, td {
  text-align: left;
  padding: 8px;
}

tr:nth-child(even) {background-color: #f2f2f2;}


body
{
background-image: url("images/listadmin.jpeg"); 
height: 100%;
background-position: center;
  background-repeat: no-repeat;
  background-size: cover;
}


</style>


</head>
<body>

   <table>
             <thead>
                 <tr>
                     <th>Emp ID</th>
                     <th>Date</th>
                                  
                 </tr>
             </thead>
             <tbody>
                 <%
                 
                     AdminLoginService loginService = new AdminLoginService();
                     List<AttendanceRecord> list = loginService.getListOfAttendance();
                     for (AttendanceRecord ar : list) {
                 %>
                 <tr>
                     <td><%=ar.getId()%></td>
                    <td><%=ar.getAttDate()%></td>
                    
                     
                 </tr>
                 <%}%>
             <tbody>
         </table>         

</body>
</html>