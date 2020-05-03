package com.app.service;

import java.util.ArrayList;
import java.util.List;

import org.hibernate.Session;
import org.hibernate.Transaction;

import com.app.hibernate.util.HibernateUtil;
import com.app.model.Admin;
import com.app.model.AttendanceRecord;
import com.app.model.Employee;

public class AdminLoginService {

	public boolean authenticateUser(String empId, String password) {
        Admin admin = getUserByUserId(empId);         
        if(admin!=null && admin.getId().equals(empId) && admin.getPassword().equals(password)){
            return true;
        }else{
            return false;
        }
    }
 
    public Admin getUserByUserId(String empId) {
        Session session = HibernateUtil.getSessionFactory().openSession();
       // Session sessionObj=session.openSession();
        Transaction tx = null;
        Admin admin = null;
        try {
         /*   tx = session.getTransaction();
            tx.begin();
            Query query = session.createQuery("from emp_detail where id='"+empId+"'");
            employee = (Employee)query.uniqueResult();*/
            
            
            tx = session.beginTransaction();
            // get an user object
            admin = (Admin) session.createQuery("FROM Admin WHERE id = '"+empId+"'")
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
        return admin;
    }
	
	
    public List<AttendanceRecord> getListOfAttendance(){
        List<AttendanceRecord> list = new ArrayList<AttendanceRecord>();
        Session session = HibernateUtil.getSessionFactory().openSession();
      //  Session sessionObj=session.openSession();
        Transaction tx = null;       
        try {
            tx = session.getTransaction();
            tx.begin();
            list = session.createQuery("from AttendanceRecord").list();                       
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
