package com.app.model;

import java.io.Serializable;

import java.util.Date;

import javax.persistence.Column;
import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.Id;
import javax.persistence.Table;

@Entity
@Table(name="emp_detail")
public class Employee implements Serializable{
	
	
	@Id
	@GeneratedValue
	private Long sq_id;
    private String id;
    private String name;
    private Date dob;
    private String password;
    private byte[] finger_print;

    public Employee() {
    }

	public Employee(String id, String name, Date dob, String password, byte[] finger_print) {
		super();
		this.id = id;
		this.name = name;
		this.dob = dob;
		this.password = password;
		this.finger_print = finger_print;
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

	public byte[] getFinger_print() {
		return finger_print;
	}

	public void setFinger_print(byte[] finger_print) {
		this.finger_print = finger_print;
	}
 
    
    
    
}
