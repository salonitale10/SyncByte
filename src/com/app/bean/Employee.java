package com.app.bean;

import java.util.Date;

public class Employee {

	 private Long id;
	    private String name;
	    private Date dob;
	    private String password;
	    private byte[] finger_print;
		public Long getId() {
			return id;
		}
		public void setId(Long id) {
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
