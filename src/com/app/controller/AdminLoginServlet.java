package com.app.controller;

import java.io.IOException;

import javax.servlet.ServletException;
import javax.servlet.http.HttpServlet;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;

import com.app.model.Admin;

import com.app.service.AdminLoginService;


public class AdminLoginServlet extends HttpServlet{

	
	public void doPost(HttpServletRequest request, HttpServletResponse response)
            throws ServletException, IOException {
 
     String adminId = request.getParameter("adminId");   
     String password = request.getParameter("password");
     AdminLoginService loginService = new AdminLoginService();
     boolean result = loginService.authenticateUser(adminId, password);
     Admin admin = loginService.getUserByUserId(adminId);
     if(result == true){
         request.getSession().setAttribute("admin", admin);      
         response.sendRedirect("adminhome.jsp");
     }
     else{
         response.sendRedirect("adminerror.jsp");
     }
}
}
