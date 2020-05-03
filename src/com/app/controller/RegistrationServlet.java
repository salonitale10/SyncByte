package com.app.controller;

import java.io.IOException;
import java.io.PrintWriter;
import java.util.Date;
import java.text.DateFormat;
import java.text.ParseException;
import java.text.SimpleDateFormat;

import javax.servlet.ServletException;
import javax.servlet.Servlet;
import javax.servlet.http.HttpServlet;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;

import com.app.model.Employee;
import com.app.service.RegisterService;

public class RegistrationServlet extends HttpServlet {

	public void doPost(HttpServletRequest request, HttpServletResponse response)
            throws ServletException, IOException {
     response.setContentType("text/html;charset=UTF-8");
     PrintWriter out = response.getWriter();
     
     
     byte[] imageData = new byte[(int)request.getParameter("myimage").length()];
     
     
     
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
     
     String empId = request.getParameter("empId");
     String password = request.getParameter("password");
     Employee employee = new Employee(empId,name,dob2,password,imageData);
             
     try { 
         RegisterService registerService = new RegisterService();
         boolean result = registerService.register(employee);      
        
         if(result){
             response.sendRedirect("empsuccess.jsp");
         //    out.println("To login with new UserId and Password<a href=loginform.jsp>Click here</a>");
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
