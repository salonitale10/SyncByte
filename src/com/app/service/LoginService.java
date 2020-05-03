package com.app.service;

import java.util.ArrayList;
import java.util.List;

//import org.hibernate.Query;
import org.hibernate.Session;
import org.hibernate.SessionFactory;
import org.hibernate.Transaction;
import org.hibernate.query.Query;

import com.app.hibernate.util.HibernateUtil;
import com.app.model.Employee;

public class LoginService {
   
	
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
     
    
    
    
    
    public boolean deletById(String id) {
		boolean result = true;
	Employee employee = null;
		Session session = HibernateUtil.getSessionFactory().openSession();
		Transaction transaction = null;
		try {
			
			transaction = session.beginTransaction();
		employee=getUserByUserId(id);
		 session.delete(employee);
		 
		// result = query.executeUpdate();
		 
		 
			transaction.commit();
		} catch (Exception e) {
			if (transaction != null) {
				transaction.rollback();
			}
			result = false;
		} finally {
			session.close();
		}
		return result;
    }    
    
    
   
    
    public List<Employee> getListOfEmployees(){
        List<Employee> list = new ArrayList<Employee>();
        Session session = HibernateUtil.getSessionFactory().openSession();
      //  Session sessionObj=session.openSession();
        Transaction tx = null;       
        try {
            tx = session.getTransaction();
            tx.begin();
            list = session.createQuery("from Employee").list();                       
            tx.commit();
        } catch (Exception e) {
            if (tx != null) {
                tx.rollback();
            }
            e.printStackTrace();
        } finally {
            session.close();
        }
        return list;
    }
}
