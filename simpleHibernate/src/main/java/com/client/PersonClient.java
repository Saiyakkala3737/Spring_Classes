package com.client;

import com.Dao.*;
import com.model.*;

public class PersonClient {
	
	static PersonDao perDao= new PersonDao();
	
	public static void main(String[] args) {
		
		Person p = new Person("sai","kumar","Y","Male");
		insert(p);
		
	}

	private static void insert(Person p) {
		perDao.makePersistent(p);
	}

}
