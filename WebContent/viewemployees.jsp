<%@ page language="java" contentType="text/html; charset=ISO-8859-1"
    pageEncoding="ISO-8859-1"%>
    <%@page import="java.util.List"%>
<%@page import="com.app.service.LoginService"%>
<%@page import="java.util.Date"%>
<%@page import="com.app.model.Employee"%>
<!DOCTYPE html>
<html>
<head>
<meta charset="ISO-8859-1">
<title>Employee List</title>


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
background-image: url("images/listemployee.jpg"); 
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
                     <th>Name</th>
                     <th>Password</th>
                     <th>DOB</th>
                                  
                 </tr>
             </thead>
             <tbody>
                 <%
                     LoginService loginService = new LoginService();
                     List<Employee> list = loginService.getListOfEmployees();
                     for (Employee e : list) {
                 %>
                 
                
					
                 <tr>
                     <td><%=e.getId()%></td>
                     <td><%=e.getName()%></td>
                     <td><%=e.getPassword()%></td>
                     <td><%=e.getDob()%></td>
                     <td>
   <a href="DeleteEmpServlet?id=<%= e.getId() %>">Delete</a>
                     </td>
                 </tr>
                 <%}%>
             <tbody>
         </table>    
         <br/>
    
    
</body>

</html>