package com.cars.beans;

import javax.persistence.CascadeType;
import javax.persistence.Entity;
//import javax.persistence.GeneratedValue;
//import javax.persistence.GenerationType;
import javax.persistence.Id;
import javax.persistence.OneToOne;
import javax.validation.constraints.NotBlank;


@Entity /* It is a class and mapped in the database */
public class Customer {
	
	@Id /*primary key in the database */
	//@GeneratedValue(strategy = GenerationType.IDENTITY) /* Automatic Id generation */
	@NotBlank
	private long userId;
	@NotBlank
	private String name;
	@NotBlank
	private String email;
	@NotBlank
	private String contactNo;
	@NotBlank
	private String dob;
	@OneToOne(cascade=CascadeType.ALL)
	@NotBlank
	private Address address;
	
	public long getUserId() {
		return userId;
	}

	public void setUserId(long userId) {
		this.userId = userId;
	}

	public String getName() {
		return name;
	}

	public void setName(String name) {
		this.name = name;
	}

	public String getEmail() {
		return email;
	}

	public void setEmail(String email) {
		this.email = email;
	}

	public String getContactNo() {
		return contactNo;
	}

	public void setContactNo(String contactNo) {
		this.contactNo = contactNo;
	}

	public String getDob() {
		return dob;
	}

	public void setDob(String dob) {
		this.dob = dob;
	}

	public Address getAddress() {
		return address;
	}

	public void setAddress(Address address) {
		this.address = address;
	}

	@Override
	public String toString() {
		return "Customer [userId=" + userId + ", name=" + name + ", email=" + email + ", contactNo=" + contactNo
				+ ", dob=" + dob + ", address=" + address + "]";
	}
	

}
