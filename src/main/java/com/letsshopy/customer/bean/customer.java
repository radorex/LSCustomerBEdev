package com.letsshopy.customer.bean;

public class customer {

	private String username;
	private String name;
	private String age;
	private String gender;
	private String address;
	private Integer mobileNumber;
	private String email;
	
	public customer(String username, String name, String age, String gender, String address, Integer mobileNumber,
			String email) {
		super();
		this.username = username;
		this.name = name;
		this.age = age;
		this.gender = gender;
		this.address = address;
		this.mobileNumber = mobileNumber;
		this.email = email;
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

	public String getAge() {
		return age;
	}

	public void setAge(String age) {
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

	public Integer getMobileNumber() {
		return mobileNumber;
	}

	public void setMobileNumber(Integer mobileNumber) {
		this.mobileNumber = mobileNumber;
	}

	public String getEmail() {
		return email;
	}

	public void setEmail(String email) {
		this.email = email;
	}

	@Override
	public String toString() {
		return "customer [username=" + username + ", name=" + name + ", age=" + age + ", gender=" + gender
				+ ", address=" + address + ", mobileNumber=" + mobileNumber + ", email=" + email + "]";
	}
	
	
}
