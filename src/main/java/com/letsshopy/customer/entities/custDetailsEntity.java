package com.letsshopy.customer.entities;

import javax.persistence.*;

@Entity
@Table(name = "custinfo")
public class custDetailsEntity {

	@Id
	private Integer custid;
	private String username;
	private String name;
	private Integer age;
	private String gender;
	private String address;
	private Integer pincode;
	private String phonenum;
	private String email;
	
	public Integer getCustid() {
		return custid;
	}
	public void setCustid(Integer custid) {
		this.custid = custid;
	}
	public String getUsername() {
		return username;
	}
	public void setUsername(String username) {
		this.username = username;
	}
	public String getName() {
		return name;
	}
	public void setName(String name) {
		this.name = name;
	}
	public Integer getAge() {
		return age;
	}
	public void setAge(Integer age) {
		this.age = age;
	}
	public String getGender() {
		return gender;
	}
	public void setGender(String gender) {
		this.gender = gender;
	}
	public String getAddress() {
		return address;
	}
	public void setAddress(String address) {
		this.address = address;
	}
	public Integer getPincode() {
		return pincode;
	}
	public void setPincode(Integer pincode) {
		this.pincode = pincode;
	}
	public String getPhonenum() {
		return phonenum;
	}
	public void setPhonenum(String phonenum) {
		this.phonenum = phonenum;
	}
	public String getEmail() {
		return email;
	}
	public void setEmail(String email) {
		this.email = email;
	}

	
	
}
