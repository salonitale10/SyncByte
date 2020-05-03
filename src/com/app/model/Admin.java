package com.app.model;

import java.util.Date;

import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.Id;
import javax.persistence.Table;

@Entity
@Table(name="admin_detail")
public class Admin {

	@Id
	@GeneratedValue
	private Long sq_id;
    private String id;
    private String name;
    private Date dob;
    private String password;
    
    
	public Admin() {
		super();
		
	}

	public Admin(String id, String name, Date dob, String password) {
		super();
		
		this.id = id;
		this.name = name;
		this.dob = dob;
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
	public String getName() {
		return name;
	}
	public void setName(String name) {
		this.name = name;
	}
	public Date getDob() {
		return dob;
	}
	public void setDob(Date dob) {
		this.dob = dob;
	}
	public String getPassword() {
		return password;
	}
	public void setPassword(String password) {
		this.password = password;
	}
    
}
