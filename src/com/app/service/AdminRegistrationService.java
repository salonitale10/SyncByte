package com.app.service;

import org.hibernate.Session;
import org.hibernate.Transaction;

import com.app.hibernate.util.HibernateUtil;
import com.app.model.Admin;
import com.app.model.Employee;

public class AdminRegistrationService {

	public boolean register(Admin admin){
		 Session session = HibernateUtil.getSessionFactory().openSession();
	     //   Session sessionObj=session.openSession(); 
	//	 if(isUserExists(employee)) return false;  
	     
	     Transaction tx = null;
	     try {
	         tx = session.beginTransaction();
	         
	         
	         session.save(admin);       
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
