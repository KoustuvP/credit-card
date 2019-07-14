package com.virtusa.card.domain;

import javax.persistence.Column;
import javax.persistence.Entity;
import javax.persistence.Id;
import javax.persistence.JoinColumn;
import javax.persistence.ManyToOne;

@Entity
public class Address {

	@Id
	long id;
	
	@Column
	String street;
	
	@Column
	String locality;
	
	@Column
	String city;
	
	@Column
	String state;
	
	@ManyToOne
	@JoinColumn
	User user;
	public Address(long id, String street, String locality, String city, String state, User user) {
		super();
		this.id = id;
		this.street = street;
		this.locality = locality;
		this.city = city;
		this.state = state;
		this.user=user;
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

	public void setUser(User user) {
		this.user = user;
	}
	@Override
	public String toString() {
		return "Address [id=" + id + ", street=" + street + ", locality=" + locality + ", city=" + city + ", state="
				+ state + ", user=" + user + "]";
	}
	
	
}
