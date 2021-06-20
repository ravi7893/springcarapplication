package com.cars.beans;

import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.GenerationType;
import javax.persistence.Id;
import javax.validation.constraints.NotBlank;

@Entity /* It is a class and mapped in the database */
public class Address {
	
	@Id /*primary key in the database */
	@GeneratedValue(strategy = GenerationType.IDENTITY) /* Automatic Id generation */
	private long aid;
	@NotBlank
	private String doorNo;
	@NotBlank
	private String street;
	@NotBlank
	private String area;
	@NotBlank
	private String city;
	@NotBlank
	private String state;
	@NotBlank
	private int pincode;
	
	
	public long getAid() {
		return aid;
	}
	public void setAid(long aid) {
		this.aid = aid;
	}
	public String getDoorNo() {
		return doorNo;
	}
	public void setDoorNo(String doorNo) {
		this.doorNo = doorNo;
	}
	public String getStreet() {
		return street;
	}
	public void setStreet(String street) {
		this.street = street;
	}
	public String getArea() {
		return area;
	}
	public void setArea(String area) {
		this.area = area;
	}
	public String getCity() {
		return city;
	}
	public void setCity(String city) {
		this.city = city;
	}
	public String getState() {
		return state;
	}
	public void setState(String state) {
		this.state = state;
	}
	public int getPincode() {
		return pincode;
	}
	public void setPincode(int pincode) {
		this.pincode = pincode;
	}
	@Override
	public String toString() {
		return "Address [aid=" + aid + ", doorNo=" + doorNo + ", street=" + street + ", area=" + area + ", city=" + city
				+ ", state=" + state + ", pincode=" + pincode + "]";
	}
	
	
}
