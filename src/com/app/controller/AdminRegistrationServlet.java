package com.app.controller;

import java.io.IOException;
import java.io.PrintWriter;
import java.text.DateFormat;
import java.text.ParseException;
import java.text.SimpleDateFormat;
import java.util.Date;

import javax.servlet.ServletException;
import javax.servlet.http.HttpServlet;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;

import com.app.model.Admin;
import com.app.model.Employee;
import com.app.service.AdminRegistrationService;
import com.app.service.RegisterService;

public class AdminRegistrationServlet extends HttpServlet {

	public void doPost(HttpServletRequest request, HttpServletResponse response)
            throws ServletException, IOException {
     response.setContentType("text/html;charset=UTF-8");
     PrintWriter out = response.getWriter();
	
	
String name = request.getParameter("name");
    
    // String dob1=request.getParameter("dob");
     SimpleDateFormat sdf = new SimpleDateFormat("dd-MM-yyyy");
    // Date dob2 = Date.valueOf(dob1);
     
     DateFormat formatter ;
     formatter = new SimpleDateFormat("dd-MM-yyyy");
     Date dob2=null;
	try {
	dob2 = formatter.parse(request.getParameter("dob"));
	} catch (ParseException e) {
		
		e.printStackTrace();
	}
     
     String adminId = request.getParameter("adminId");
     String password = request.getParameter("password");
     Admin admin = new Admin(adminId,name,dob2,password);
             
     try { 
         AdminRegistrationService adminregisterService = new AdminRegistrationService();
         boolean result = adminregisterService.register(admin);      
         
         if(result){
           response.sendRedirect("adminsuccess.jsp");
         }else{
             out.println("<h1>Registration Failed</h1>");
             out.println("To try again<a href=register.jsp>Click here</a>");
         }
         out.println("</center>");
         out.println("</body>");
         out.println("</html>");
     } finally {       
         out.close();
     }
}
	
}
