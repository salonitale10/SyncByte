package com.app.controller;

import java.io.IOException;

import javax.servlet.ServletException;
import javax.servlet.http.HttpServlet;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;

import com.app.model.Employee;
import com.app.service.LoginService;

public class LoginServlet extends HttpServlet{

	public void doPost(HttpServletRequest request, HttpServletResponse response)
            throws ServletException, IOException {
 
     String empId = request.getParameter("empId");   
     String password = request.getParameter("password");
     LoginService loginService = new LoginService();
     boolean result = loginService.authenticateUser(empId, password);
     Employee employee = loginService.getUserByUserId(empId);
     if(result == true){
         request.getSession().setAttribute("employee", employee);      
         response.sendRedirect("home.jsp");
     }
     else{
         response.sendRedirect("error.jsp");
     }
}
 
}




