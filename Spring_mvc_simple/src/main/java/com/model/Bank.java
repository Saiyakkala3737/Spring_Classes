package com.model;

import javax.persistence.Entity;
import javax.persistence.Id;

@Entity
public class Bank {
	
	@Id
	int PersonID;
	String bank;
	int acc;
	int ssn;
	public Bank() {
		super();
	}
	
	public Bank(int personID, String bank, int acc, int ssn) {
		super();
		PersonID = personID;
		this.bank = bank;
		this.acc = acc;
		this.ssn = ssn;
	}

	public int getPersonID() {
		return PersonID;
	}
	public void setPersonID(int personID) {
		PersonID = personID;
	}
	public String getBank() {
		return bank;
	}
	public void setBank(String bank) {
		this.bank = bank;
	}
	public int getAcc() {
		return acc;
	}
	public void setAcc(int acc) {
		this.acc = acc;
	}
	public int getSsn() {
		return ssn;
	}
	public void setSsn(int ssn) {
		this.ssn = ssn;
	}
	@Override
	public String toString() {
		return "Bank [PersonID=" + PersonID + ", bank=" + bank + ", acc=" + acc + ", ssn=" + ssn + "]";
	}
	
	

}
