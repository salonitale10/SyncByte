package com.app.model;

import java.io.Serializable;
import java.util.Date;

import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.Id;
import javax.persistence.Table;

@Entity
@Table(name="attendance_record")
public class AttendanceRecord implements Serializable{

	@Id
	@GeneratedValue
	private Long sq_id;
    private String id;
   
    private Date attDate;
    private String password;
    

    public AttendanceRecord() {
		// TODO Auto-generated constructor stub
	}

 public AttendanceRecord(String id, String password,Date attDate) {
		// TODO Auto-generated constructor stub
	 super();
		this.id = id;
		this.attDate = attDate;
		this.password = password;
	 
	} 

	public Long getSq_id() {
		return sq_id;
	}

	public void setSq_id(Long sq_id) {
		this.sq_id = sq_id;
	}

	public String getId() {
		return id;
	}

	public void setId(String id) {
		this.id = id;
	}

	
	public String getPassword() {
		return password;
	}

	public void setPassword(String password) {
		this.password = password;
	}

	public Date getAttDate() {
		return attDate;
	}

	public void setAttDate(Date attDate) {
		this.attDate = attDate;
	}

	
    
    
	
	
}
