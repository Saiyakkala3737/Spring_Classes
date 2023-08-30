package com.client;

import com.Dao.*;
import com.model.Bank;

public class BankClient {
	private static BankDao bDao = new BankDao();
	public static void main(String args[]) {
		Bank b = new Bank( 10,"Wells",1234321,11234455);
		insert(b);
	}
	
	public static void insert(Bank b) {
		bDao.makePersistent(b);
	}
}
