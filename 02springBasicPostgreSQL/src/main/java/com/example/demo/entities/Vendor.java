package com.example.demo.entities;

import java.util.Date;

import javax.persistence.Column;
import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.GenerationType;
import javax.persistence.Id;
import javax.persistence.Table;

import org.hibernate.annotations.GenericGenerator;
import org.springframework.stereotype.Component;

@Component
@Entity
@Table(name="vendor")
public class Vendor {

	@Id
	@Column(nullable=false, name="id")
	@GenericGenerator(name = "uuid2", strategy = "uuid2")
	@GeneratedValue(strategy = GenerationType.IDENTITY, generator = "uuid2")
	private String code;
	@Column(nullable=false, name ="company_name")
	private String companyName;
	@Column(nullable=false, name="contact_person")
	private String contactPerson;
	@Column(nullable=false, name="first_name")
	private String firstName;
	@Column(nullable=true, name="last_name")
	private String lastName;
	@Column(nullable=true,name="website")
	private String website;
	@Column(nullable=false,name="email")
	private String email;
	@Column(nullable=true, name="status")
	private String status;
	@Column(nullable=true, name="reg_date")
	private Date regDate;
	
	public Vendor() {
		super();
		this.code = "Vend1";
		this.companyName = "IBM";
		this.contactPerson = "Rverma";
		this.firstName = "Smaranika";
		this.lastName = "Sahoo";
		this.website = "www.ibm.com";
		this.email = "smasahoo@in.ibm.com";
		this.status = "A";
		this.regDate = new Date();
	}
	public String getCode() {
		return code;
	}
	public void setCode(String code) {
		this.code = code;
	}
	public String getCompanyName() {
		return companyName;
	}
	public void setCompanyName(String companyName) {
		this.companyName = companyName;
	}
	public String getContactPerson() {
		return contactPerson;
	}
	public void setContactPerson(String contactPerson) {
		this.contactPerson = contactPerson;
	}
	public String getFirstName() {
		return firstName;
	}
	public void setFirstName(String firstName) {
		this.firstName = firstName;
	}
	public String getLastName() {
		return lastName;
	}
	public void setLastName(String lastName) {
		this.lastName = lastName;
	}
	public String getWebsite() {
		return website;
	}
	public void setWebsite(String website) {
		this.website = website;
	}
	public String getEmail() {
		return email;
	}
	public void setEmail(String email) {
		this.email = email;
	}
	public String getStatus() {
		return status;
	}
	public void setStatus(String status) {
		this.status = status;
	}
	public Date getRegDate() {
		return regDate;
	}
	public void setRegDate(Date regDate) {
		this.regDate = regDate;
	}
	@Override
	public String toString() {
		return "Vendor [code=" + code + ", companyName=" + companyName + ", contactPerson=" + contactPerson
				+ ", firstName=" + firstName + ", lastName=" + lastName + ", website=" + website + ", email=" + email
				+ ", status=" + status + ", regDate=" + regDate + "]";
	}
	
 
}
