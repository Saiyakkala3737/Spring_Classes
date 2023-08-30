package com.model;

import javax.persistence.Entity;
import javax.persistence.Id;

@Entity
public class Contact {

	@Id
	int PersonID;
	String address;
	String city;
	String state;
	String country;
	int phone;

	public Contact() {
		super();
	}

	public Contact(int personID, String address, String city, String state, String country, int phone) {
		super();
		PersonID = personID;
		this.address = address;
		this.city = city;
		this.state = state;
		this.country = country;
		this.phone = phone;
	}

	public int getPersonID() {
		return PersonID;
	}

	public void setPersonID(int personID) {
		PersonID = personID;
	}

	public String getAddress() {
		return address;
	}

	public void setAddress(String address) {
		this.address = address;
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

	public String getCountry() {
		return country;
	}

	public void setCountry(String country) {
		this.country = country;
	}

	public int getPhone() {
		return phone;
	}

	public void setPhone(int phone) {
		this.phone = phone;
	}

	@Override
	public String toString() {
		return "Contact [PersonID=" + PersonID + ", address=" + address + ", city=" + city + ", state=" + state
				+ ", country=" + country + ", phone=" + phone + "]";
	}

}
