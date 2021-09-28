package com.healtho.Entity;

import javax.annotation.Generated;
import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.GenerationType;
import javax.persistence.Id;
import javax.persistence.Table;

import lombok.Data;
import lombok.NoArgsConstructor;

@Data
@NoArgsConstructor
@Entity
@Table(name = "account")
public class Account {
	@Id
	@GeneratedValue(strategy = GenerationType.IDENTITY)
	private Integer AccountId;
	private String firstName;
	private String lastName;
	private String email;
	private String Department;
	private String role;
	
	
	public Account() {
		
	}
	public Integer getAccountId() {
		return AccountId;
	}
	public void setAccountId(Integer accountId) {
		AccountId = accountId;
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
	public String getEmail() {
		return email;
	}
	public void setEmail(String email) {
		this.email = email;
	}
	public String getDepartment() {
		return Department;
	}
	public void setDepartment(String department) {
		Department = department;
	}
	public String getRole() {
		return role;
	}
	public void setRole(String role) {
		this.role = role;
	}
	public Account(Integer accountId, String firstName, String lastName, String email, String department, String role) {
		super();
		AccountId = accountId;
		this.firstName = firstName;
		this.lastName = lastName;
		this.email = email;
		Department = department;
		this.role = role;
	}

	
	 
}
