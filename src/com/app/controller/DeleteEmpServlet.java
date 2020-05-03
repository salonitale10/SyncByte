package com.app.controller;

import java.io.IOException;

import javax.servlet.ServletException;
import javax.servlet.annotation.WebServlet;
import javax.servlet.http.HttpServlet;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;

import com.app.model.Employee;
import com.app.service.LoginService;
import com.app.service.RegisterService;



public class DeleteEmpServlet extends HttpServlet{

	public void doGet(HttpServletRequest request, HttpServletResponse response)
            throws ServletException, IOException {
 
		
		response.setContentType("text/html;charset=UTF-8");
		
     String id = request.getParameter("id");   
    
    LoginService loginService = new LoginService();
     boolean result = loginService.deletById(id); 
     System.out.println(result);
     if(result==true){
         
         response.sendRedirect("viewemployees.jsp");
     }
     else{
         response.sendRedirect("viewemployees.jsp");
     }
}
 
	
	
	
	
	
	
	
	
	
	
	
}
