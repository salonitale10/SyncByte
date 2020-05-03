package com.app.service;

//import javax.security.auth.message.callback.PrivateKeyCallback.Request;
import javax.servlet.http.HttpServlet;

import org.hibernate.Session;
import org.hibernate.Transaction;

import com.app.hibernate.util.HibernateUtil;
import com.app.model.AttendanceRecord;
import com.app.model.Employee;

public class ValidateService extends HttpServlet{

	
	public boolean authenticateUser(String empId, String password) {
        Employee employee = getUserByUserId(empId);       
		
        if(employee!=null && employee.getId().equals(empId) && employee.getPassword().equals(password)){
        	
        	
            return true;
        }else{
            return false;
        }
    }
 
    

	public Employee getUserByUserId(String empId) {
        Session session = HibernateUtil.getSessionFactory().openSession();
       // Session sessionObj=session.openSession();
        Transaction tx = null;
        Employee employee = null;
        try {
         /*   tx = session.getTransaction();
            tx.begin();
            Query query = session.createQuery("from emp_detail where id='"+empId+"'");
            employee = (Employee)query.uniqueResult();*/
           
            tx = session.beginTransaction();
            // get an user object
            employee = (Employee) session.createQuery("FROM Employee WHERE id = '"+empId+"'")
                .uniqueResult();

            
            
            tx.commit();
        } catch (Exception e) {
            if (tx != null) {
                tx.rollback();
            }
            e.printStackTrace();
        } finally {
            session.close();
        }
        return employee;
    }



	public boolean register(AttendanceRecord record) {
		
		 Session session = HibernateUtil.getSessionFactory().openSession();
	     //   Session sessionObj=session.openSession(); 
	//	 if(isUserExists(employee)) return false;  
	     
	     Transaction tx = null;
	     try {
	         tx = session.beginTransaction();
	         
	         
	         session.save(record);       
	         tx.commit();
	     } catch (Exception e) {
	         if (tx != null) {
	             tx.rollback();
	         }
	         e.printStackTrace();
	     } finally {
	         session.close();
	     } 
	     return true;
	}
		
		
	}
	
	
		

