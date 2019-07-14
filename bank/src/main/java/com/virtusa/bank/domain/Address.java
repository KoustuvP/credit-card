package com.virtusa.bank.domain;

public class Address {

	long id;
	String street;
	String locality;
	String city;
	String state;
	public Address(long id, String street, String locality, String city, String state) {
		super();
		this.id = id;
		this.street = street;
		this.locality = locality;
		this.city = city;
		this.state = state;
	}
	public Address() {
		super();
	}
	public long getId() {
		return id;
	}
	public void setId(long id) {
		this.id = id;
	}
	public String getStreet() {
		return street;
	}
	public void setStreet(String street) {
		this.street = street;
	}
	public String getLocality() {
		return locality;
	}
	public void setLocality(String locality) {
		this.locality = locality;
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
	
	
}
