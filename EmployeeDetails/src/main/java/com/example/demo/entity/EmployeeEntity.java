package com.example.demo.entity;

import jakarta.persistence.Entity;
import jakarta.persistence.Id;

@Entity
public class EmployeeEntity {
	@Id
	private int id;
	private String Firstname;
	private String Lastname;
	private String email;
	private String Contact;
	private String Attendence;
	private String Dayin;
	private String Dayout;
	
	public EmployeeEntity() {
		super();
		// TODO Auto-generated constructor stub
	}
	public EmployeeEntity(int id, String firstname, String lastname, String email, String contact, String attendence,
			String dayin, String dayout) {
		super();
		this.id = id;
		Firstname = firstname;
		Lastname = lastname;
		this.email = email;
		Contact = contact;
		Attendence = attendence;
		Dayin = dayin;
		Dayout = dayout;
	}
	public int getId() {
		return id;
	}
	public void setId(int id) {
		this.id = id;
	}
	public String getFirstname() {
		return Firstname;
	}
	public void setFirstname(String firstname) {
		Firstname = firstname;
	}
	public String getLastname() {
		return Lastname;
	}
	public void setLastname(String lastname) {
		Lastname = lastname;
	}
	public String getEmail() {
		return email;
	}
	public void setEmail(String email) {
		this.email = email;
	}
	public String getContact() {
		return Contact;
	}
	public void setContact(String contact) {
		Contact = contact;
	}
	public String getAttendence() {
		return Attendence;
	}
	public void setAttendence(String attendence) {
		Attendence = attendence;
	}
	public String getDayin() {
		return Dayin;
	}
	public void setDayin(String dayin) {
		Dayin = dayin;
	}
	public String getDayout() {
		return Dayout;
	}
	public void setDayout(String dayout) {
		Dayout = dayout;
	}
	

}
