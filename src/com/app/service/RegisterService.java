package com.app.service;

import org.hibernate.SQLQuery;
import org.hibernate.Session;
import org.hibernate.SessionFactory;
import org.hibernate.Transaction;
import org.hibernate.query.Query;

import com.app.hibernate.util.HibernateUtil;
import com.app.model.Employee;

public class RegisterService {

	
	public boolean register(Employee employee){
		 Session session = HibernateUtil.getSessionFactory().openSession();
	     //   Session sessionObj=session.openSession(); 
	//	 if(isUserExists(employee)) return false;  
	     
	     Transaction tx = null;
	     try {
	         tx = session.beginTransaction();
	         
	         
	         session.save(employee);       
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



	/*public boolean isUserExists(Employee employee){
		 Session session = HibernateUtil.getSessionFactory().openSession();
	     //   Session sessionObj=session.openSession();
		 boolean result = false;
	     Transaction tx = null;
	     try{
	         tx = session.getTransaction();
	         tx.begin();
	         Query query = session.createQuery("from emp_detail where id='"+employee.getId()+"'");
	         Employee u = (Employee)query.uniqueResult();
	       
	         
	         String hql = "from emp_detail";
	        // Session session = entityManagerFactory.openSession();
	         Query query = session.createQuery(hql);
	         Employee e = (Employee) query.list(); 
	         
	         
	         
	         
	         
	         
	         tx.commit();
	         if(e!=null) result = true;
	     }catch(Exception ex){
	         if(tx!=null){
	             tx.rollback();
	         }
	     }finally{
	         session.close();
	     }
	     return result;
	}
	}

*/