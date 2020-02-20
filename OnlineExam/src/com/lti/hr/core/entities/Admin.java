package com.lti.hr.core.entities;

import javax.persistence.Column;
import javax.persistence.Entity;
import javax.persistence.Id;
import javax.persistence.Table;

@Entity
@Table(name="Admin")
public class Admin {
	
	@Id
	@Column(name="ADMIN_ID")
	private int adminId;
	
	@Column(name="EMAIL_ID")
	private String emailId;
	
	@Column(name="PASSWORD")
	private String password;

	public Admin() {
		super();
	}

	public Admin(int adminId, String emailId, String password) {
		super();
		this.adminId = adminId;
		this.emailId = emailId;
		this.password = password;
	}

	public int getAdminId() {
		return adminId;
	}

	public void setAdminId(int adminId) {
		this.adminId = adminId;
	}

	public String getEmailId() {
		return emailId;
	}

	public void setEmailId(String emailId) {
		this.emailId = emailId;
	}

	public String getPassword() {
		return password;
	}

	public void setPassword(String password) {
		this.password = password;
	}

	@Override
	public String toString() {
		return "Admin [adminId=" + adminId + ", emailId=" + emailId + ", password=" + password + "]";
	}	
}
