package com.app.controller;

import java.io.IOException;
import java.io.PrintWriter;
import java.text.DateFormat;
import java.text.SimpleDateFormat;
import java.util.Date;

import javax.servlet.ServletException;
import javax.servlet.http.HttpServlet;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;

import com.app.model.AttendanceRecord;
import com.app.model.Employee;
import com.app.service.LoginService;
import com.app.service.RegisterService;
import com.app.service.ValidateService;

public class ValidateServlet extends HttpServlet{

	public void doPost(HttpServletRequest request, HttpServletResponse response)
            throws ServletException, IOException {
 
		PrintWriter out = response.getWriter();
		
		
     String empId = request.getParameter("empId");   
     String password = request.getParameter("password");
     DateFormat df = new SimpleDateFormat("dd/MM/yy");
     Date currDate = new Date();
     ValidateService validateService = new ValidateService();
     boolean result = validateService.authenticateUser(empId, password);
     AttendanceRecord record = new AttendanceRecord(empId,password,currDate);
     try { 
         ValidateService registerService = new ValidateService();
         boolean finalresult = registerService.register(record);      
         
         if(result){
        	// request.getSession().setAttribute("record", record);      
             response.sendRedirect("success.jsp");
        	 out.println("<h1>Your Attendance marked Successfully</h1>");
         }else{
             out.println("<h1>Process Failed</h1>");
             out.println("To try again<a href=failed.jsp>Click here</a>");
         }
         
     } finally {       
         out.close();
     }
     
     
    // Employee employee = loginService.getUserByUserId(empId);
    /* if(result == true){
         request.getSession().setAttribute("employee", employee);      
         response.sendRedirect("home.jsp");
         out.println("Your Attendance marked Successfully</h1>");
     }
     else{
         response.sendRedirect("error.jsp");
     }*/
}
	
	
}
