package com.virtusa.bank.domain;

public class User {

	long userId;
	String userName;
	long ssn;
	Address address;
	public User(long userId, String userName, long ssn, Address address) {
		super();
		this.userId = userId;
		this.userName = userName;
		this.ssn = ssn;
		this.address = address;
	}
	public User() {
		super();
	}
	public long getUserId() {
		return userId;
	}
	public void setUserId(long userId) {
		this.userId = userId;
	}
	public String getUserName() {
		return userName;
	}
	public void setUserName(String userName) {
		this.userName = userName;
	}
	public long getSsn() {
		return ssn;
	}
	public void setSsn(long ssn) {
		this.ssn = ssn;
	}
	public Address getAddress() {
		return address;
	}
	public void setAddress(Address address) {
		this.address = address;
	}
	
	
	
}
