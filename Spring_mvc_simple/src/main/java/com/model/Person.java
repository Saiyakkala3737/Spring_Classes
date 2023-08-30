package com.model;

import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.GenerationType;
import javax.persistence.Id;

@Entity
public class Person {

	@Id
	@GeneratedValue(strategy = GenerationType.IDENTITY)
	int PersonID;
	String fName;
	String mName;
	String lName;
	String gender;
	

	public Person() {
		super();
	}

	public Person(String fName, String mName, String lName, String gender) {
		super();
		this.fName = fName;
		this.mName = mName;
		this.lName = lName;
		this.gender = gender;
	}

	public int getPersonID() {
		return PersonID;
	}

	public void setPersonID(int personID) {
		PersonID = personID;
	}

	public String getfName() {
		return fName;
	}

	public void setfName(String fName) {
		this.fName = fName;
	}

	public String getmName() {
		return mName;
	}

	public void setmName(String mName) {
		this.mName = mName;
	}

	public String getlName() {
		return lName;
	}

	public void setlName(String lName) {
		this.lName = lName;
	}

	public String getGender() {
		return gender;
	}

	public void setGender(String gender) {
		this.gender = gender;
	}

	@Override
	public String toString() {
		return "Person [PersonID=" + PersonID + ", fName=" + fName + ", mName=" + mName + ", lName=" + lName
				+ ", gender=" + gender + "]";
	}

}
